package ch.ksrminecraft.playerinfos;

import ch.ksrminecraft.playerinfos.commands.PlayerInfoCommand;
import org.bukkit.plugin.java.JavaPlugin;

public final class PlayerInfos extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getCommand("playerinfo").setExecutor(new PlayerInfoCommand());

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
