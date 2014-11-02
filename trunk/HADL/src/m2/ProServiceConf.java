package m2;

public class ProServiceConf extends InterfaceConf {
	private ReqServiceConf to;
	
	public ProServiceConf(String s, ReqServiceConf to) {
		super(s);
		this.to = to;
	}
	
	protected ReqServiceConf getTo() {
		return to;
	}
	protected void setTo(ReqServiceConf to) {
		this.to = to;
	}
	
}
