package io.github.haykam821.dehand.config;

import me.sargunvohra.mcmods.autoconfig1u.ConfigData;
import me.sargunvohra.mcmods.autoconfig1u.annotation.Config;
import me.sargunvohra.mcmods.autoconfig1u.annotation.ConfigEntry;

@Config(name = "dehand")
@Config.Gui.Background("minecraft:textures/block/cyan_wool.png")
public class DehandConfig implements ConfigData {
	@ConfigEntry.Gui.Tooltip(count = 2)
	public EmptyHandVisibility emptyHandVisibility = EmptyHandVisibility.WHILE_SWINGING;
}