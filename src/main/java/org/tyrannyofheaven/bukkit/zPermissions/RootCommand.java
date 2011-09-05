package org.tyrannyofheaven.bukkit.zPermissions;

import org.bukkit.command.CommandSender;
import org.tyrannyofheaven.bukkit.util.command.Command;
import org.tyrannyofheaven.bukkit.util.command.HelpBuilder;
import org.tyrannyofheaven.bukkit.util.command.Require;

public class RootCommand {

    private final SubCommands sc = new SubCommands();

    @Command("perm")
    @Require("zpermissions.*")
    public Object perm(HelpBuilder helpBuilder, CommandSender sender, String[] args) {
        if (args.length == 0) {
            helpBuilder.withCommandSender(sender)
                .withHandler(sc)
                .forCommand("player")
                .forCommand("group")
                .forCommand("list")
                .show();
            return null;
        }
        return sc;
    }

}
