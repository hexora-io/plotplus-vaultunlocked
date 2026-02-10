# PlotPlus-VaultUnlocked

Economy bridge between [PlotPlus](https://www.curseforge.com/hytale/mods/plotplus) and [VaultUnlocked](https://www.curseforge.com/hytale/mods/vaultunlocked) for Hytale servers.

This plugin allows PlotPlus to use any economy system registered through VaultUnlocked for plot claim costs and refunds.

## Requirements

- PlotPlus
- VaultUnlocked
- An economy plugin registered with VaultUnlocked

## Installation

1. Install PlotPlus and VaultUnlocked on your server
2. Install an economy plugin that registers with VaultUnlocked
3. Drop `PlotPlus-VaultUnlocked-x.x.x.jar` into the mods folder
4. Restart the server

## Configuration

Configure economy settings in PlotPlus `config.yml`:

```yaml
economy:
  enabled: true
  claim_cost: 100.0
  sell_price: 75.0
```

## How It Works

PlotPlus-VaultUnlocked acts as a bridge between PlotPlus and VaultUnlocked. When PlotPlus needs to perform economy operations (checking balances, withdrawing for claims, depositing for sales), this plugin delegates those calls to whichever economy system is registered as the primary provider in VaultUnlocked.

This means you can use **any** VaultUnlocked-compatible economy plugin with PlotPlus.

## License

[MIT](https://github.com/hexora-io/plotplus-vaultunlocked/blob/main/LICENSE)
