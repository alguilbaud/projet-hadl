package m2;

public class AttachmentConfPro extends Attachment {
	private ProPortConf from;
	private ProConfRole to;
	
	public AttachmentConfPro(String s, ProPortConf from, ProConfRole to) {
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

	protected ProConfRole getTo() {
		return to;
	}
	protected void setTo(ProConfRole to) {
		this.to = to;
	}
	
}
