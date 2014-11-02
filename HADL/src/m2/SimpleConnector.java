package m2;

import java.util.Collection;
import java.util.HashMap;

public class SimpleConnector extends Connector {
	private HashMap<String, Role> mapRole;
	private Glue glue;
	
	public SimpleConnector(String s, Role r1, Role r2){
		super(s);
		mapRole = new HashMap<String, Role>();
		mapRole.put(r1.getName(), r1);
		mapRole.put(r2.getName(), r2);
		glue = null;
	}

	protected Glue getGlue() {
		return glue;
	}
	protected void setGlue(Glue glue) {
		this.glue = glue;
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
