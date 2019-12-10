package spells;

import java.awt.event.ActionListener;

import javax.swing.JLabel;

public abstract class Item {
	public String name;
	
	public Item(String o) {
		this.name = o;
	}
	
	public abstract ActionListener getEventListener(Player player, JLabel mana);

	public static int size() {
		return 0;
	}
	
}