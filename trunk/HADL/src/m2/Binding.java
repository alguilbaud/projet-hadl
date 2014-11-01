package m2;

public class Binding {
	private ReqPortComp to;
	private ProPortConf from;
	
	public Binding(ReqPortComp to, ProPortConf from) {
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
	
}
