package m2;

public class AttachmentCompReq extends Attachment{
	private ReqPortComp to;
	private ReqCompRole from;
	
	public AttachmentCompReq(String s, ReqPortComp to, ReqCompRole from) {
		super(s);
		this.to = to;
		this.from = from;
	}

	protected ReqPortComp getTo() {
		return to;
	}
	protected void setTo(ReqPortComp to) {
		this.to = to;
	}

	protected ReqCompRole getFrom() {
		return from;
	}
	protected void setFrom(ReqCompRole from) {
		this.from = from;
	}
	
}
