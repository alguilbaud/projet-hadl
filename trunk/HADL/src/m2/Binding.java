package m2;

public abstract class Binding {
	private String name;
	
	public Binding(String s) {
		this.name = s;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
