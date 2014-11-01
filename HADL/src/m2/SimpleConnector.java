package m2;

import java.util.ArrayList;

public class SimpleConnector extends Connector {
	private ArrayList<Role> tabRole;
	private Glue glue;
	
	public SimpleConnector(String s, Glue g, Role r1, Role r2){
		super(s);
		tabRole = new ArrayList<Role>();
		glue = g;
		tabRole.add(r1);
		tabRole.add(r2);
	}

	public Glue getGlue() {
		return glue;
	}
	public void setGlue(Glue glue) {
		this.glue = glue;
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
	
}
