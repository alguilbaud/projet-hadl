package m2;

import java.util.ArrayList;

public class SimpleConnector extends Connector {
	private ArrayList<Role> tabRole;
	private ArrayList<Glue> tabGlue;
	
	public SimpleConnector(){
		tabRole = new ArrayList<Role>();
		tabGlue = new ArrayList<Glue>();
	}
	
	public void addRole(Role r){
		tabRole.add(r);
	}
	public void removeRole(int i){
		tabRole.remove(i);
	}
	public Role getRole(int i){
		return tabRole.get(i);
	}
	
	public void addGlue(Glue g){
		tabGlue.add(g);
	}
	public void removeGlue(int i){
		tabGlue.remove(i);
	}
	public Glue getGlue(int i){
		return tabGlue.get(i);
	}
}
