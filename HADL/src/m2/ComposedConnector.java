package m2;

import java.util.Collection;
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
	
	protected void putConnector(Connector c){
		mapConnector.put(c.getName(), c);
	}
	protected void removeConnector(String s){
		mapConnector.remove(s);
	}
	protected Connector getConnector(String s){
		return mapConnector.get(s);
	}
	protected Collection<Connector> getAllConnectors(){
		return mapConnector.values();
	}
	
	protected void putRole(Role r){
		mapRole.put(r.getName(), r);
	}
	protected void removeRole(String s){
		mapRole.remove(s);
	}
	protected Role getRole(String s){
		return mapRole.get(s);
	}
	protected Collection<Role> getAllRoles(){
		return mapRole.values();
	}
}
