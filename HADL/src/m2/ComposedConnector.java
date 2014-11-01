package m2;

import java.util.HashMap;

public class ComposedConnector extends Connector {
	private HashMap<String, Connector> mapConnector;
	private HashMap<String, Role> mapRole;
	
	public ComposedConnector(String s, Role r1, Role r2){
		super(s);
		mapConnector = new HashMap<String, Connector>();
		mapRole = new HashMap<String, Role>();
		mapRole.put(r1.getName(), r1);
		mapRole.put(r2.getName(), r2);
	}
	
	public void putConnector(Connector c){
		mapConnector.put(c.getName(), c);
	}
	public void removeConnector(String s){
		mapConnector.remove(s);
	}
	public Connector getConnector(String s){
		return mapConnector.get(s);
	}
	
	public void putRole(Role r){
		mapRole.put(r.getName(), r);
	}
	public void removeRole(String s){
		mapRole.remove(s);
	}
	public Role getRole(String s){
		return mapRole.get(s);
	}
}
