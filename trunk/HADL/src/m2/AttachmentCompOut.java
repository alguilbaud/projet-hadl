package m2;

public class AttachmentCompOut extends Attachment{
	private ReqPortComp to;
	private ProCompRole from;
	
	public AttachmentCompOut(String s, ProCompRole from, ReqPortComp to) {
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

	protected ProCompRole getFrom() {
		return from;
	}
	protected void setFrom(ProCompRole from) {
		this.from = from;
	}
	
}
