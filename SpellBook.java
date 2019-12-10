package spells;

import java.util.ArrayList;

public class SpellBook {
	
	private ArrayList<Spell> spells;
	
	public SpellBook() {
		this.spells = new ArrayList<Spell>();
		//-----------------------------------
		this.addSpell(new Fireball());
		this.addSpell(new Healing());
		this.addSpell(new Repair());
		
	}
	
	public void addSpell(Spell spell) {
		this.spells.add(spell);
	}
	
	public ArrayList<Spell> getSpells() {
		return spells;
	}

	public static void add(Fireball f) {
		// TODO Auto-generated method stub
		
	}

	public static void add(Healing h) {
		// TODO Auto-generated method stub
		
	}

	public static void add(Repair r) {
		// TODO Auto-generated method stub
		
	}

}
