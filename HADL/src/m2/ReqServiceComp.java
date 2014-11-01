package m2;

public class ReqServiceComp extends InterfaceComp {
	private ProServiceComp to;

	public ReqServiceComp(String s, ProServiceComp to) {
		super(s);
		this.to = to;
	}

	public ProServiceComp getTo() {
		return to;
	}

	public void setTo(ProServiceComp to) {
		this.to = to;
	}
	
}
