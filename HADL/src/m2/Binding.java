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

	public ReqPortComp getTo() {
		return to;
	}

	public void setTo(ReqPortComp to) {
		this.to = to;
	}

	public ProPortConf getFrom() {
		return from;
	}

	public void setFrom(ProPortConf from) {
		this.from = from;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
