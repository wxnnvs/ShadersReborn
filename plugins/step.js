PluginAPI.require("player");
PluginAPI.addEventListener("update", ()=>{ //Every client tick, allow the player to step up over up to nine and a half blocks.
  PluginAPI.player.stepHeight = 9.5;
  PluginAPI.updateComponent("player");
});
