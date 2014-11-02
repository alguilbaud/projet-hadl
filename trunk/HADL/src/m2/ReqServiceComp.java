package m2;

public class ReqServiceComp extends InterfaceComp {
	private ProServiceComp from;

	public ReqServiceComp(String s, ProServiceComp from) {
		super(s);
		this.from = from;
	}

	protected ProServiceComp getFrom() {
		return from;
	}

	protected void setFrom(ProServiceComp from) {
		this.from = from;
	}
	
}
