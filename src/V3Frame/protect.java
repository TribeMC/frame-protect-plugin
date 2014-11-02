package V3Frame;

import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

import com.worldcretornica.plotme.Plot;
import com.worldcretornica.plotme.PlotManager;

public class protect implements Listener{

	
	public protect(main main) {
		// TODO Auto-generated constructor stub
		main.getServer().getPluginManager().registerEvents(this, main);

	}

	@SuppressWarnings("deprecation")
	@EventHandler
	public void onInteract(PlayerInteractEvent e){
		
		if(e.getClickedBlock().getType().equals(Material.ITEM_FRAME) && e.getAction().equals(Action.RIGHT_CLICK_BLOCK)){
			Plot p = PlotManager.getPlotById(e.getPlayer());
			if(!p.isAllowed(e.getPlayer().getName())){
				e.setCancelled(true);
			}
		}
		
	}
}
