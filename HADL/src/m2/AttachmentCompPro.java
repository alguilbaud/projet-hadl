package m2;

public class AttachmentCompPro extends Attachment {
	private ProPortComp from;
	private ProCompRole to;
	
	public AttachmentCompPro(String s, ProPortComp from, ProCompRole to) {
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

	protected ProCompRole getTo() {
		return to;
	}
	protected void setTo(ProCompRole to) {
		this.to = to;
	}
		
}
