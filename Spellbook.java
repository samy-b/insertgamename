import java.util.ArrayList;
	public class Spell{
	    private ArrayList<Spell> spells = new ArrayList();

	  public void addSpell(Spell s){
	      spells.add(s);
	  }

	  public ArrayList<Spell> getSpells(){//It's a behaviour
	      return spells;
	  }
	}
