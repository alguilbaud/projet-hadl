package m2;

public class BindingReq extends Binding {

	private ReqPortComp to;
	private ReqPortConf from;
	
	public BindingReq(String s, ReqPortConf from, ReqPortComp to) {
		super(s);
		this.from = from;
		this.to = to;
	}

	public ReqPortComp getTo() {
		return to;
	}

	public void setTo(ReqPortComp to) {
		this.to = to;
	}

	public ReqPortConf getFrom() {
		return from;
	}

	public void setFrom(ReqPortConf from) {
		this.from = from;
	}
}
