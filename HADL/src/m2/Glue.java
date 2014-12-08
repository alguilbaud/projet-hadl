package m2;

public class Glue {
	private String name;

	public Glue(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
	//fonction destinée à être redéfinie dans le M1 pour faire une vraie transformation
	public Object transform(Object o){
		return o;
	}
	
}
