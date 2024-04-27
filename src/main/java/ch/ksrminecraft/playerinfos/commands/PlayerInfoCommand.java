package ch.ksrminecraft.playerinfos.commands;

import me.clip.placeholderapi.PlaceholderAPI;
import net.kyori.adventure.text.Component;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class PlayerInfoCommand implements CommandExecutor {


    @Override
    public boolean onCommand(@NotNull CommandSender commandSender, @NotNull Command command, @NotNull String s, @NotNull String[] strings) {

        if (!(commandSender instanceof Player)) {
            return true;
        }

        Player player = (Player) commandSender;

        player.sendMessage(Component.text("Deine Spielerstatistik: "
                + "\n" + ChatColor.GRAY + "Name: " + ChatColor.GREEN + PlaceholderAPI.setPlaceholders(player, "%player_name%")
                + "\n" + ChatColor.GRAY + "UUID: " + ChatColor.GREEN + PlaceholderAPI.setPlaceholders(player, "%player_uuid%")
                + "\n" + ChatColor.GRAY + "IP: " + ChatColor.GREEN + PlaceholderAPI.setPlaceholders(player, "%player_ip%")
                + "\n" + ChatColor.GRAY + "Welt: " + ChatColor.GREEN + PlaceholderAPI.setPlaceholders(player, "%player_world%")
                + "\n" + ChatColor.GRAY + "Biom: " + ChatColor.GREEN + PlaceholderAPI.setPlaceholders(player, "%player_biome%")
                + "\n" + ChatColor.GRAY + "Ping: " + PlaceholderAPI.setPlaceholders(player, "%player_colored_ping%")
                + "\n" + ChatColor.GRAY + "Gamemode: " + ChatColor.GREEN + PlaceholderAPI.setPlaceholders(player, "%player_gamemode%")
                + "\n" + ChatColor.GRAY + "Lebenspunkte: " + ChatColor.GREEN + PlaceholderAPI.setPlaceholders(player, "%player_health%")
                + "\n" + ChatColor.GRAY + "Erster Join: " + ChatColor.GREEN + PlaceholderAPI.setPlaceholders(player, "%player_first_join_date%")

        ));

        return true;
    }
}
