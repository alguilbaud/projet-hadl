package m2;

public class ReqServiceConf extends InterfaceConf {
	private ProServiceConf from;

	public ReqServiceConf(String s, ProServiceConf from) {
		super(s);
		this.from = from;
	}

	protected ProServiceConf getFrom() {
		return from;
	}
	protected void setFrom(ProServiceConf from) {
		this.from = from;
	}
	
}
