package net.thibmorozier.guicompass;

import net.fabricmc.api.ClientModInitializer;
import net.thibmorozier.guicompass.config.CompassConfigManager;

public class GuiCompass implements ClientModInitializer {
    public static final String MOD_ID = "guicompass";

	@Override
	public void onInitializeClient() {
        CompassConfigManager.initializeConfig();
    }
}
