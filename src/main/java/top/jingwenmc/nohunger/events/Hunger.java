package top.jingwenmc.nohunger.events;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.FoodLevelChangeEvent;
import top.jingwenmc.nohunger.NoHunger;


public class Hunger implements Listener {
    @EventHandler
    public void Hunger(FoodLevelChangeEvent evt)
    {
        if(!NoHunger.isEnabled)return;
        else
        {
            //evt.setFoodLevel(20);
            evt.setCancelled(true);
        }
    }
}
