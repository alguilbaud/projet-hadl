package m2;

import java.util.ArrayList;

public class ComposedConnector extends Connector {
	private ArrayList<Connector> tabConnector;
	private ArrayList<Role> tabRole;
	
	public ComposedConnector(){
		tabConnector = new ArrayList<Connector>();
		tabRole = new ArrayList<Role>();
	}
	
	public void addConnector(Connector c){
		tabConnector.add(c);
	}
	public void removeConnector(int i){
		tabConnector.remove(i);
	}
	public Connector getConnector(int i){
		return tabConnector.get(i);
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
