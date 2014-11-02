package m2;

public class ProServiceComp extends InterfaceComp {
	private ReqServiceComp to;
	
	public ProServiceComp(String s, ReqServiceComp rsc){
		super(s);
		to = rsc;
	}

	protected ReqServiceComp getTo() {
		return to;
	}

	protected void setTo(ReqServiceComp to) {
		this.to = to;
	}
}
