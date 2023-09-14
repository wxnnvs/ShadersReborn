PluginAPI.require("player");
var GrappleHookPlugin = {
  oldXYZ: [0, 0, 0],
  prev: "NONE",
  scaleH: 0.25,
  scaleV: 0.15,
  lift: 0.4,
  crouchToCancel: true
};
PluginAPI.addEventListener("update", () => {
  if (!PluginAPI.player.fishEntity) {
    if (GrappleHookPlugin.prev === "GROUND" && (!GrappleHookPlugin.crouchToCancel || !PluginAPI.player.isSneaking())) {
      GrappleHookPlugin.prev = "NONE";
      var mx = GrappleHookPlugin.oldXYZ[0] - PluginAPI.player.x;
      var my = GrappleHookPlugin.oldXYZ[1] - PluginAPI.player.y;
      var mz = GrappleHookPlugin.oldXYZ[2] - PluginAPI.player.z;
      mx *= GrappleHookPlugin.scaleH;
      my *= GrappleHookPlugin.scaleV;
      mz *= GrappleHookPlugin.scaleH;
      PluginAPI.player.motionX += mx;
      PluginAPI.player.motionY += my + GrappleHookPlugin.lift;
      PluginAPI.player.motionZ += mz;
      PluginAPI.updateComponent("player");
    } else {
      GrappleHookPlugin.prev = "NONE";
    }
  } else if (GrappleHookPlugin.prev === "NONE") {
    GrappleHookPlugin.prev = "AIR";
  }
  if (
    PluginAPI.player.fishEntity !== undefined &&
    GrappleHookPlugin.prev === "AIR" &&
    PluginAPI.player.fishEntity.inGround
  ) {
    GrappleHookPlugin.oldXYZ = [
      PluginAPI.player.fishEntity.x,
      PluginAPI.player.fishEntity.y,
      PluginAPI.player.fishEntity.z,
    ];
    GrappleHookPlugin.prev = "GROUND";
  }
});
