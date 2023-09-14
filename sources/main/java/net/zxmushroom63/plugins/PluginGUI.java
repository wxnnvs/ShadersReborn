package net.zxmushroom63.plugins;

import org.teavm.jso.JSBody;

public class PluginGUI {
    @JSBody(params = { }, script = "function gui() {\r\n" + //
            "  if (document.querySelector(\"#eaglerpl_gui\")) {\r\n" + //
            "    document.querySelector(\"#eaglerpl_gui\").remove();\r\n" + //
            "  }\r\n" + //
            "  localStorage.setItem(\r\n" + //
            "    \"pl::plugins\",\r\n" + //
            "    localStorage.getItem(\"pl::plugins\") || \"[]\"\r\n" + //
            "  );\r\n" + //
            "  try {\r\n" + //
            "    localStorage.setItem(\r\n" + //
            "      \"pl::plugins\",\r\n" + //
            "      JSON.stringify(JSON.parse(localStorage.getItem(\"pl::plugins\")))\r\n" + //
            "    );\r\n" + //
            "  } catch (error) {\r\n" + //
            "    localStorage.setItem(\"pl::plugins\", \"[]\");\r\n" + //
            "  }\r\n" + //
            "  var plugins = JSON.parse(localStorage.getItem(\"pl::plugins\"));\r\n" + //
            "  var container = document.createElement(\"div\");\r\n" + //
            "  container.id = \"eaglerpl_gui\";\r\n" + //
            "  container.style = `width:100%; height: 100%; position: fixed; top: 0; left: 0; z-index: 10; backdrop-filter: blur(4px); background: rgba(0, 0, 0, 0.5); color: white; font-family: sans-serif; user-select: none; overflow-y: scroll; overflow-x: scroll;`;\r\n" + //
            "  var title = document.createElement(\"h1\");\r\n" + //
            "  title.innerHTML = \"Plugin Manager\";\r\n" + //
            "  var closeButton = document.createElement(\"a\");\r\n" + //
            "  closeButton.style = `margin-left: 2rem; color: red; text-decoration: none;`;\r\n" + //
            "  closeButton.href = \"javascript:void(0)\";\r\n" + //
            "  closeButton.addEventListener(\"click\", () => {\r\n" + //
            "    document.querySelector(\"#eaglerpl_gui\").remove();\r\n" + //
            "  });\r\n" + //
            "  closeButton.innerHTML = \"[X]\";\r\n" + //
            "  title.appendChild(closeButton);\r\n" + //
            "  container.appendChild(title);\r\n" + //
            "\r\n" + //
            "  var table = document.createElement(\"table\");\r\n" + //
            "  var headerRow = document.createElement(\"tr\");\r\n" + //
            "  headerRow.style = \"background: rgb(50,50,50);\";\r\n" + //
            "  var urlBox = document.createElement(\"th\");\r\n" + //
            "  urlBox.innerHTML = \"URL\";\r\n" + //
            "  headerRow.appendChild(urlBox);\r\n" + //
            "  var statusBox = document.createElement(\"th\");\r\n" + //
            "  statusBox.innerHTML = \"Status\";\r\n" + //
            "  headerRow.appendChild(statusBox);\r\n" + //
            "  table.appendChild(headerRow);\r\n" + //
            "\r\n" + //
            "  plugins.forEach((url) => {\r\n" + //
            "    var row = document.createElement(\"tr\");\r\n" + //
            "    var urlBox = document.createElement(\"td\");\r\n" + //
            "    urlBox.style = \"user-select: text;\";\r\n" + //
            "    urlBox.innerText = url;\r\n" + //
            "    row.appendChild(urlBox);\r\n" + //
            "    var statusBox = document.createElement(\"td\");\r\n" + //
            "    statusBox.innerHTML = ((curl) => {\r\n" + //
            "      var targs = document.querySelectorAll(\"script[data-plugin]\");\r\n" + //
            "      for (let i = 0; i < targs.length; i++) {\r\n" + //
            "        const elem = targs[i];\r\n" + //
            "        if (elem.getAttribute(\"data-plugin\") === curl) {\r\n" + //
            "          return \"LOADED\";\r\n" + //
            "        }\r\n" + //
            "      }\r\n" + //
            "      return \"FAILED\";\r\n" + //
            "    })(url);\r\n" + //
            "    switch (statusBox.innerHTML) {\r\n" + //
            "      case \"LOADED\":\r\n" + //
            "        statusBox.style = \"background-color: green;\";\r\n" + //
            "        break;\r\n" + //
            "      case \"FAILED\":\r\n" + //
            "        statusBox.style = \"background-color: orange;\";\r\n" + //
            "        break;\r\n" + //
            "      default:\r\n" + //
            "        break;\r\n" + //
            "    }\r\n" + //
            "    var binBtn = document.createElement(\"button\");\r\n" + //
            "    binBtn.innerHTML = \"[X]\";\r\n" + //
            "    binBtn.addEventListener(\"click\", () => {\r\n" + //
            "      if (!window.confirm(\"Delete plugin?\") || plugins.indexOf(url) === -1) {\r\n" + //
            "        return;\r\n" + //
            "      }\r\n" + //
            "      plugins.splice(plugins.indexOf(url), 1);\r\n" + //
            "      localStorage.setItem(\"pl::plugins\", JSON.stringify(plugins));\r\n" + //
            "      gui();\r\n" + //
            "    });\r\n" + //
            "    statusBox.appendChild(binBtn);\r\n" + //
            "    row.appendChild(statusBox);\r\n" + //
            "    table.appendChild(row);\r\n" + //
            "  });\r\n" + //
            "\r\n" + //
            "  var addBtn = document.createElement(\"button\");\r\n" + //
            "  addBtn.style = \"background: rgba(15,15,15,0.5);\";\r\n" + //
            "  addBtn.innerHTML = \"Add new\";\r\n" + //
            "  addBtn.style = \"text-align: center;\";\r\n" + //
            "  addBtn.addEventListener(\"click\", () => {\r\n" + //
            "    plugins.push(\r\n" + //
            "      window.prompt(\"URL of plugin: \", \"http://example.com/example.js\")\r\n" + //
            "    );\r\n" + //
            "    localStorage.setItem(\"pl::plugins\", JSON.stringify(plugins));\r\n" + //
            "    gui();\r\n" + //
            "  });\r\n" + //
            "\r\n" + //
            "  container.appendChild(table);\r\n" + //
            "  container.appendChild(addBtn);\r\n" + //
            "\r\n" + //
            "  var notice = document.createElement(\"a\");\r\n" + //
            "  notice.innerHTML = \"Reload to use new plugins.\";\r\n" + //
            "  notice.href = \"javascript:void(0)\";\r\n" + //
            "  notice.addEventListener(\"click\", () => {\r\n" + //
            "    location.reload();\r\n" + //
            "  });\r\n" + //
            "  notice.style =\r\n" + //
            "    \"color: orange; display: block; margin-top: 2rem; width: 0; white-space: nowrap;\";\r\n" + //
            "  container.appendChild(notice);\r\n" + //
            "\r\n" + //
            "  document.body.appendChild(container);\r\n" + //
            "}\r\n" + //
            "gui();\r\n" + //
            "")
    public static native void displayGui();


    @JSBody(params = {}, script = "if (document.querySelector(\"#eaglerpl_gui\")) {\r\n" + //
            "    document.querySelector(\"#eaglerpl_gui\").remove();\r\n" + //
            "  }")
    public static native void closeGui();

    @JSBody(params = {}, script = "return !!document.querySelector(\"#eaglerpl_gui\")")
    public static native boolean isGuiOpen();

    @JSBody(params = {}, script = "console.log('closed a screen')")
    public static native void qlog();
}