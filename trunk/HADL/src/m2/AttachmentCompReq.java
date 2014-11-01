package m2;

public class AttachmentCompReq extends Attachment{
	private ReqPortComp to;
	private ReqCompRole from;
	
	public AttachmentCompReq(ReqPortComp to, ReqCompRole from) {
		super();
		this.to = to;
		this.from = from;
	}

	public ReqPortComp getTo() {
		return to;
	}
	public void setTo(ReqPortComp to) {
		this.to = to;
	}

	public ReqCompRole getFrom() {
		return from;
	}
	public void setFrom(ReqCompRole from) {
		this.from = from;
	}
	
}
