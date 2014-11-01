package m2;

public class ReqServiceConf extends InterfaceConf {
	private ProServiceConf to;

	public ReqServiceConf(String s, ProServiceConf to) {
		super(s);
		this.to = to;
	}

	public ProServiceConf getTo() {
		return to;
	}
	public void setTo(ProServiceConf to) {
		this.to = to;
	}
	
}
