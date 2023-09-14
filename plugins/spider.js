PluginAPI.require("player");
PluginAPI.addEventListener("update", ()=>{ //Every client tick
  if(PluginAPI.player.isCollidedHorizontally){ //Is player walking in to a wall?
    PluginAPI.player.motionY = 0.2; //Default ladder speed
    PluginAPI.updateComponent("player");//Tell api that player needs updating
  }
});
