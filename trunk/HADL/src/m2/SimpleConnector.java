package m2;

import java.util.Collection;
import java.util.HashMap;

public abstract class SimpleConnector {
	private String name;
	private Glue glue;
	private HashMap<String, Role> mapRole;
	
	public SimpleConnector(String s, Role role1, Role role2){
		name = s;
		mapRole = new HashMap<String, Role>();
		mapRole.put(role1.getName(), role1);
		mapRole.put(role2.getName(), role2);
		glue = null;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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

	public Glue getGlue() {
		return glue;
	}
	public void setGlue(Glue glue) {
		this.glue = glue;
	}
}
