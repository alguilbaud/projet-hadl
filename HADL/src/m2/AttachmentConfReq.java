package m2;

public class AttachmentConfReq extends Attachment {
	private ReqPortConf to;
	private ReqConfRole from;
	
	public AttachmentConfReq(String s, ReqPortConf to, ReqConfRole from) {
		super(s);
		this.to = to;
		this.from = from;
	}

	public ReqPortConf getTo() {
		return to;
	}
	public void setTo(ReqPortConf to) {
		this.to = to;
	}

	public ReqConfRole getFrom() {
		return from;
	}
	public void setFrom(ReqConfRole from) {
		this.from = from;
	}
	
}
