package m2;

public class AttachmentConfIn extends Attachment {
	private ProPortConf from;
	private ReqConfRole to;
	
	public AttachmentConfIn(String s, ProPortConf from, ReqConfRole to) {
		super(s);
		this.from = from;
		this.to = to;
	}

	protected ProPortConf getFrom() {
		return from;
	}
	protected void setFrom(ProPortConf from) {
		this.from = from;
	}

	protected ReqConfRole getTo() {
		return to;
	}
	protected void setTo(ReqConfRole to) {
		this.to = to;
	}
	
}
