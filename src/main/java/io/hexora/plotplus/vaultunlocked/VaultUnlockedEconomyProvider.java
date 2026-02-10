package io.hexora.plotplus.vaultunlocked;

import io.hexora.plotplus.api.economy.EconomyProvider;
import net.cfh.vault.VaultUnlocked;
import net.milkbowl.vault2.economy.Economy;

import java.math.BigDecimal;
import java.util.UUID;

public class VaultUnlockedEconomyProvider implements EconomyProvider {

    @Override
    public String getName() {
        return "VaultUnlocked";
    }

    @Override
    public boolean hasBalance(UUID player, double amount) {
        Economy economy = VaultUnlocked.economyObj();
        if (economy == null || !economy.isEnabled()) {
            return false;
        }
        return economy.has(null, player, BigDecimal.valueOf(amount));
    }

    @Override
    public boolean withdraw(UUID player, double amount) {
        Economy economy = VaultUnlocked.economyObj();
        if (economy == null || !economy.isEnabled()) {
            return false;
        }
        return economy.withdraw(null, player, BigDecimal.valueOf(amount)).transactionSuccess();
    }

    @Override
    public boolean deposit(UUID player, double amount) {
        Economy economy = VaultUnlocked.economyObj();
        if (economy == null || !economy.isEnabled()) {
            return false;
        }
        return economy.deposit(null, player, BigDecimal.valueOf(amount)).transactionSuccess();
    }

    @Override
    public double getBalance(UUID player) {
        Economy economy = VaultUnlocked.economyObj();
        if (economy == null || !economy.isEnabled()) {
            return 0.0;
        }
        return economy.getBalance(null, player).doubleValue();
    }
}
