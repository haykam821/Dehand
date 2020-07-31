package io.github.haykam821.dehand.config;

import io.github.prospector.modmenu.api.ConfigScreenFactory;
import io.github.prospector.modmenu.api.ModMenuApi;
import me.sargunvohra.mcmods.autoconfig1u.AutoConfig;
import net.minecraft.client.gui.screen.Screen;

public class ModMenuCompatibility implements ModMenuApi {
	@Override
	public String getModId() {
		return "dehand";
	}

	@Override
	public ConfigScreenFactory<Screen> getModConfigScreenFactory() {
		return screen -> AutoConfig.getConfigScreen(DehandConfig.class, screen).get();
	}
}