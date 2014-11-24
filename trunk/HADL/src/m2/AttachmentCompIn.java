package m2;

public class AttachmentCompIn extends Attachment {
	private ProPortComp from;
	private ReqCompRole to;
	
	public AttachmentCompIn(String s, ProPortComp from, ReqCompRole to) {
		super(s);
		this.from = from;
		this.to = to;
	}

	protected ProPortComp getFrom() {
		return from;
	}
	protected void setFrom(ProPortComp from) {
		this.from = from;
	}

	protected ReqCompRole getTo() {
		return to;
	}
	protected void setTo(ReqCompRole to) {
		this.to = to;
	}
		
}
