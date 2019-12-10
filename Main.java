package spells;
import java.util.*;

public class Main {
	private static ArrayList<Items> items = new ArrayList();
	private static ArrayList<SpellBook> spells = new ArrayList();
	
		  


	public static void main(String[] args) {
		
		Player p = new Player();
		SpellBook sb = new SpellBook();
		p.giveSpellBook(sb);
		Fireball f = new Fireball();
		Healing h = new Healing();
		Repair r = new Repair();
		//-------------------------
		Sellio se = new Sellio();
		Helio he = new Helio();
		Mongo mo = new Mongo();
		items.add(se);
		items.add(he);
		items.add(mo);
		//----------------------
		SpellBook.add(f);
		SpellBook.add(h);
		SpellBook.add(r);
		
		
		ArrayList<Spell> playerSpells = p.getSpellBook().getSpells();
		for (Spell s: playerSpells) {
			System.out.println(playerSpells.indexOf(s)+1 + ". " + s); //prints out the player's personal spellbook, each numbered and you an pick which spell you want to cast
			for (int i = 0; i < 5; i++) { }
		}
		String keyboardInput  = (String) Utilities.getInput();
		int myInt = Integer.parseInt(keyboardInput);
		System.out.println("You have picked" +" "  + keyboardInput + " " +p.getSpellBook());
		for (int i = 0; i < 5; i++) { 
			
		
		
		}
	}
}
