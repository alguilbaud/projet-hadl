package m2;

import java.util.Collection;
import java.util.HashMap;

public abstract class SimpleConnector {
	private String name;
	private Glue glue;
	private HashMap<String, Role> mapRole;
	
	public SimpleConnector(String s, ReqCompRole roleReq, ProCompRole rolePro){
		name = s;
		mapRole = new HashMap<String, Role>();
		mapRole.put(roleReq.getName(), roleReq);
		mapRole.put(rolePro.getName(), rolePro);
		glue = null;
	}
	
	public SimpleConnector(String s, ReqConfRole roleReq, ProConfRole rolePro){
		name = s;
		mapRole = new HashMap<String, Role>();
		mapRole.put(roleReq.getName(), roleReq);
		mapRole.put(rolePro.getName(), rolePro);
		glue = null;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
