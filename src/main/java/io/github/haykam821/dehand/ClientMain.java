package io.github.haykam821.dehand;

import io.github.haykam821.dehand.config.DehandConfig;
import me.sargunvohra.mcmods.autoconfig1u.AutoConfig;
import me.sargunvohra.mcmods.autoconfig1u.serializer.GsonConfigSerializer;
import net.fabricmc.api.ClientModInitializer;

public class ClientMain implements ClientModInitializer {
	private static final DehandConfig CONFIG = AutoConfig.register(DehandConfig.class,GsonConfigSerializer::new).getConfig();

	@Override
	public void onInitializeClient() {
		return;
	}

	public static DehandConfig getConfig() {
		return CONFIG;
	}
}