package m2;

public class ProServiceConf extends InterfaceConf {
	private ReqServiceConf from;
	
	public ProServiceConf(String s, ReqServiceConf from) {
		super(s);
		this.from = from;
	}
	
	public ReqServiceConf getFrom() {
		return from;
	}
	public void setFrom(ReqServiceConf from) {
		this.from = from;
	}
	
}
