package m2;

public class AttachmentCompPro extends Attachment {
	private ProPortComp from;
	private ProCompRole to;
	
	public AttachmentCompPro(String s, ProPortComp from, ProCompRole to) {
		super(s);
		this.from = from;
		this.to = to;
	}

	public ProPortComp getFrom() {
		return from;
	}
	public void setFrom(ProPortComp from) {
		this.from = from;
	}

	public ProCompRole getTo() {
		return to;
	}
	public void setTo(ProCompRole to) {
		this.to = to;
	}
		
}
