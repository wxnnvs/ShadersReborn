function gui() {
  if (document.querySelector("#eaglerpl_gui")) {
    document.querySelector("#eaglerpl_gui").remove();
  }
  localStorage.setItem(
    "pl::plugins",
    localStorage.getItem("pl::plugins") || "[]"
  );
  try {
    localStorage.setItem(
      "pl::plugins",
      JSON.stringify(JSON.parse(localStorage.getItem("pl::plugins")))
    );
  } catch (error) {
    localStorage.setItem("pl::plugins", "[]");
  }
  var plugins = JSON.parse(localStorage.getItem("pl::plugins"));
  var container = document.createElement("div");
  container.id = "eaglerpl_gui";
  container.style = `width:100%; height: 100%; position: fixed; top: 0; left: 0; z-index: 10; backdrop-filter: blur(4px); background: rgba(0, 0, 0, 0.5); color: white; font-family: sans-serif; user-select: none; overflow-y: scroll; overflow-x: scroll;`;
  var title = document.createElement("h1");
  title.innerHTML = "Plugin Manager";
  var closeButton = document.createElement("a");
  closeButton.style = `margin-left: 2rem; color: red; text-decoration: none;`;
  closeButton.href = "javascript:void(0)";
  closeButton.addEventListener("click", () => {
    document.querySelector("#eaglerpl_gui").remove();
  });
  closeButton.innerHTML = "[X]";
  title.appendChild(closeButton);
  container.appendChild(title);

  var table = document.createElement("table");
  var headerRow = document.createElement("tr");
  headerRow.style = "background: rgb(50,50,50);";
  var urlBox = document.createElement("th");
  urlBox.innerHTML = "URL";
  headerRow.appendChild(urlBox);
  var statusBox = document.createElement("th");
  statusBox.innerHTML = "Status";
  headerRow.appendChild(statusBox);
  table.appendChild(headerRow);

  plugins.forEach((url) => {
    var row = document.createElement("tr");
    var urlBox = document.createElement("td");
    urlBox.style = "user-select: text;";
    urlBox.innerText = url;
    row.appendChild(urlBox);
    var statusBox = document.createElement("td");
    statusBox.innerHTML = ((curl) => {
      var targs = document.querySelectorAll("script[data-plugin]");
      for (let i = 0; i < targs.length; i++) {
        const elem = targs[i];
        if (elem.getAttribute("data-plugin") === curl) {
          return "LOADED";
        }
      }
      return "FAILED";
    })(url);
    switch (statusBox.innerHTML) {
      case "LOADED":
        statusBox.style = "background-color: green;";
        break;
      case "FAILED":
        statusBox.style = "background-color: orange;";
        break;
      default:
        break;
    }
    var binBtn = document.createElement("button");
    binBtn.innerHTML = "[X]";
    binBtn.addEventListener("click", () => {
      if (!window.confirm("Delete plugin?") || plugins.indexOf(url) === -1) {
        return;
      }
      plugins.splice(plugins.indexOf(url), 1);
      localStorage.setItem("pl::plugins", JSON.stringify(plugins));
      gui();
    });
    statusBox.appendChild(binBtn);
    row.appendChild(statusBox);
    table.appendChild(row);
  });

  var addBtn = document.createElement("button");
  addBtn.style = "background: rgba(15,15,15,0.5);";
  addBtn.innerHTML = "Add new";
  addBtn.style = "text-align: center;";
  addBtn.addEventListener("click", () => {
    plugins.push(
      window.prompt("URL of plugin: ", "http://example.com/example.js")
    );
    localStorage.setItem("pl::plugins", JSON.stringify(plugins));
    gui();
  });

  container.appendChild(table);
  container.appendChild(addBtn);

  var notice = document.createElement("a");
  notice.innerHTML = "Reload to use new plugins.";
  notice.href = "javascript:void(0)";
  notice.addEventListener("click", () => {
    location.reload();
  });
  notice.style =
    "color: orange; display: block; margin-top: 2rem; width: 0; white-space: nowrap;";
  container.appendChild(notice);

  document.body.appendChild(container);
}
gui();
