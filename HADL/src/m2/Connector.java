package m2;

public abstract class Connector {
	private String name;
	
	public Connector(String s){
		name = s;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
