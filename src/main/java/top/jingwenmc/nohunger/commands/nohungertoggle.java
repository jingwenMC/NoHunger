package top.jingwenmc.nohunger.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import top.jingwenmc.nohunger.NoHunger;

public class nohungertoggle implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Boolean bl = NoHunger.isEnabled;
        if(sender instanceof Player)
        {
            Player player = (Player) sender;
            if(player.hasPermission("nohunger.admin"))
            {
                //if(args[0].equalsIgnoreCase("reset")){player.setFoodLevel(20);return true;}
                if(bl)bl=false;
                else bl=true;
                String str;
                if(bl)str="开启(将不会掉饥饿)";
                else str="关闭(将会掉饥饿)";
                if(bl)
                    for(Player p : Bukkit.getOnlinePlayers())
                    {
                        p.setFoodLevel(20);
                    }
                player.sendMessage(ChatColor.GOLD+"[NoHunger]已将插件状态切换为"+str);
                NoHunger.isEnabled=bl;
            }
            else
            {
                player.sendMessage(ChatColor.RED+"[NoHunger]权限不足.");
            }
        }
        else
        {
            if(bl)bl=false;
            else bl=true;
            String str;
            if(bl)str="开启";
            else str="关闭";
            if(bl)
                for(Player p : Bukkit.getOnlinePlayers())
                {
                    p.setFoodLevel(20);
                }
            System.out.println(ChatColor.GOLD+"[NoHunger]已将状态切换为"+str);
            NoHunger.isEnabled=bl;
        }
        return false;
    }
}
