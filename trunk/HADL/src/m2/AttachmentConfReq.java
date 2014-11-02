package m2;

public class AttachmentConfReq extends Attachment {
	private ReqPortConf to;
	private ReqConfRole from;
	
	public AttachmentConfReq(String s, ReqPortConf to, ReqConfRole from) {
		super(s);
		this.to = to;
		this.from = from;
	}

	protected ReqPortConf getTo() {
		return to;
	}
	protected void setTo(ReqPortConf to) {
		this.to = to;
	}

	protected ReqConfRole getFrom() {
		return from;
	}
	protected void setFrom(ReqConfRole from) {
		this.from = from;
	}
	
}
