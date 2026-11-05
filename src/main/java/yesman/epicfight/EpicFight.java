
package yesman.epicfight;

import net.fabricmc.api.ModInitializer;
import yesman.epicfight.registry.ModRegistries;

public class EpicFight implements ModInitializer {

    public static final String MOD_ID = "epicfight";

    @Override
    public void onInitialize() {
        ModRegistries.initialize();

        System.out.println("[Epic Fight] Fabric initialized!");
    }
}
