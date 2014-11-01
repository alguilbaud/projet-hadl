package m2;

public abstract class InterfaceConf {
	private String name;
	
	public InterfaceConf(String s){
		name = s;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
