package io.github.haykam821.dehand.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import io.github.haykam821.dehand.ClientMain;
import io.github.haykam821.dehand.config.EmptyHandVisibility;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.render.item.HeldItemRenderer;

@Mixin(HeldItemRenderer.class)
public class HeldItemRendererMixin {
	@Shadow
	private MinecraftClient client;

	@Inject(method = "renderArmHoldingItem", at = @At("HEAD"), cancellable = true)
	private void preventIdleHandRendering(CallbackInfo ci) {
		EmptyHandVisibility visibility = ClientMain.getConfig().emptyHandVisibility;
		if (visibility == EmptyHandVisibility.ALWAYS) return;

		if (visibility == EmptyHandVisibility.NEVER || !this.client.player.handSwinging) {
			ci.cancel();
		}
	}
}