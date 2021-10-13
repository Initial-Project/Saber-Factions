package pw.saber.corex.listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

public class AntiBoatPlacement implements Listener {

    @EventHandler
    public void onBoatPlace(PlayerInteractEvent event) {
        if (event.getAction() == Action.RIGHT_CLICK_BLOCK && event.getPlayer().getItemInHand().getType().name().contains("BOAT")) {
            event.setCancelled(true);
        }
    }
}
