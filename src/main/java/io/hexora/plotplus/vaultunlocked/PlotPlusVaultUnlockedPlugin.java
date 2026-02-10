package io.hexora.plotplus.vaultunlocked;

import com.hypixel.hytale.server.core.plugin.JavaPlugin;
import com.hypixel.hytale.server.core.plugin.JavaPluginInit;
import io.hexora.plotplus.api.economy.EconomyRegistry;

import javax.annotation.Nonnull;
import java.util.logging.Level;

public class PlotPlusVaultUnlockedPlugin extends JavaPlugin {

    public PlotPlusVaultUnlockedPlugin(@Nonnull JavaPluginInit init) {
        super(init);
    }

    @Override
    protected void setup() {
        EconomyRegistry.register(new VaultUnlockedEconomyProvider());

        getLogger().at(Level.INFO).log("PlotPlus-VaultUnlocked bridge enabled");
    }

    @Override
    protected void shutdown() {
        EconomyRegistry.unregister();

        getLogger().at(Level.INFO).log("PlotPlus-VaultUnlocked bridge disabled");
    }
}
