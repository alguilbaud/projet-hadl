package m2;

public class BindingPro extends Binding {

	private ProPortComp to;
	private ProPortConf from;
	
	public BindingPro(String s, ProPortConf from, ProPortComp to) {
		super(s);
		this.from = from;
		this.to = to;
	}

	public ProPortComp getTo() {
		return to;
	}

	public void setTo(ProPortComp to) {
		this.to = to;
	}

	public ProPortConf getFrom() {
		return from;
	}

	public void setFrom(ProPortConf from) {
		this.from = from;
	}

}
