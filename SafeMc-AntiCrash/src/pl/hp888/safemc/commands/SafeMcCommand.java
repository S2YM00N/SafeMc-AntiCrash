package pl.hp888.safemc.commands;

import java.io.File;
import org.bukkit.command.*;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.*;
import pl.hp888.safemc.utils.*;
import pl.hp888.safemc.*;

public class SafeMcCommand implements CommandExecutor
{
    Main plugin;
    public static File config;
    public static YamlConfiguration ymlconfig;
    public boolean onCommand(final CommandSender s, final Command cmd, final String l, final String[] args) {
        final Player p = (Player)s;
        p.sendMessage(Utils.fixColor("&8\u00c2&r&8» &3This server is using &bSafeMc-AntiCrash."));
        p.sendMessage(Utils.fixColor("&8\u00c2&r&8» &3Licensed to: &9DragStrike#2137."));
        return false;
    }
}
