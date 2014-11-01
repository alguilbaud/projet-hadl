package m2;

public class ProServiceComp extends InterfaceComp {
	private ReqServiceComp from;
	
	public ProServiceComp(String s, ReqServiceComp rsc){
		super(s);
		from = rsc;
	}

	public ReqServiceComp getFrom() {
		return from;
	}

	public void setFrom(ReqServiceComp from) {
		this.from = from;
	}
}
