package V3Frame;

import org.bukkit.plugin.java.JavaPlugin;

public class main extends JavaPlugin{

	
	@Override
	public void onEnable() {
		// TODO Auto-generated method stub
		new protect(this);
		super.onEnable();
	}
	
	@Override
	public void onDisable() {
		// TODO Auto-generated method stub
		super.onDisable();
	}
}
