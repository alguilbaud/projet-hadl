package m2;

public class Binding {
	private ReqPortComp to;
	private ProPortConf from;
	private String name;
	
	public Binding(String s, ReqPortComp to, ProPortConf from) {
		this.name = s;
		this.to = to;
		this.from = from;
	}

	protected ReqPortComp getTo() {
		return to;
	}

	protected void setTo(ReqPortComp to) {
		this.to = to;
	}

	protected ProPortConf getFrom() {
		return from;
	}

	protected void setFrom(ProPortConf from) {
		this.from = from;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
