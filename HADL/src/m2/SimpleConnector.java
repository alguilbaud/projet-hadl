package m2;

import java.util.HashMap;

public class SimpleConnector extends Connector {
	private HashMap<String, Role> mapRole;
	private Glue glue;
	
	public SimpleConnector(String s, Glue g, Role r1, Role r2){
		super(s);
		mapRole = new HashMap<String, Role>();
		glue = g;
		mapRole.put(r1.getName(), r1);
		mapRole.put(r2.getName(), r2);
	}

	public Glue getGlue() {
		return glue;
	}
	public void setGlue(Glue glue) {
		this.glue = glue;
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
