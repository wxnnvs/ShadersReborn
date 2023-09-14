window.pluginLoader = function pluginLoader(pluginsArr) {
  function checkPluginsLoaded(totalLoaded, identifier) {
    console.log(
      "Checking if Plugins are finished :: " +
        totalLoaded +
        "/" +
        pluginsArr.length
    );
    if (totalLoaded >= pluginsArr.length) {
      clearInterval(identifier);
      window.pluginGracePeriod = false;
      console.log(
        "Checking if Plugins are finished :: All plugins loaded! Grace period off."
      );
    }
  }
  function methodB(currentPlugin) {
    try {
      console.log("EaglerPL: Loading " + currentPlugin + " via method B.");
      var script = document.createElement("script");
      script.src = currentPlugin;
      script.setAttribute("data-plugin", currentPlugin);
      script.setAttribute("data-isplugin", true);
      script.onerror = () => {
        console.log(
          "EaglerPL: Failed to load " + currentPlugin + " via method B!"
        );
        script.remove();
        totalLoaded++;
      };
      script.onload = () => {
        console.log(
          "EaglerPL: Successfully loaded " + currentPlugin + " via method B."
        );
        totalLoaded++;
      };
      document.body.appendChild(script);
    } catch (error) {
      console.log(
        "EaglerPL: Oh no! The plugin " + currentPlugin + " failed to load!"
      );
      totalLoaded++;
    }
  }
  window.pluginGracePeriod = true;
  var totalLoaded = 0;
  var loaderCheckInterval = null;
  pluginsArr.forEach((c) => {
    let currentPlugin = c;
    console.log("EaglerPL: Starting " + currentPlugin);
    try {
      var req = new XMLHttpRequest();
      req.open("GET", currentPlugin);
      req.onload = function xhrLoadHandler() {
        console.log("EaglerPL: Loading " + currentPlugin + " via method A.");
        var script = document.createElement("script");
        script.src = "data:text/javascript;base64," + btoa(req.responseText);
        script.setAttribute("data-plugin", currentPlugin);
        script.setAttribute("data-isplugin", true);
        script.onerror = () => {
          console.log(
            "EaglerPL: Failed to load " + currentPlugin + " via method A!"
          );
          script.remove();
          totalLoaded++;
        };
        script.onload = () => {
          console.log(
            "EaglerPL: Successfully loaded " + currentPlugin + " via method A."
          );
          totalLoaded++;
        };
        document.body.appendChild(script);
      };
      req.onerror = function xhrErrorHandler() {
        methodB(currentPlugin);
      };
      req.send();
    } catch (error) {
      methodB(currentPlugin);
    }
  });
  loaderCheckInterval = setInterval(() => {
    checkPluginsLoaded(totalLoaded, loaderCheckInterval);
  }, 500);
  console.log(
    "EaglerPL: Starting to load " + pluginsArr.length + " plugins..."
  );
};
