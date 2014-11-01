package m2;

public class AttachmentConfPro extends Attachment {
	private ProPortConf from;
	private ProConfRole to;
	
	public AttachmentConfPro(String s, ProPortConf from, ProConfRole to) {
		super(s);
		this.from = from;
		this.to = to;
	}

	public ProPortConf getFrom() {
		return from;
	}
	public void setFrom(ProPortConf from) {
		this.from = from;
	}

	public ProConfRole getTo() {
		return to;
	}
	public void setTo(ProConfRole to) {
		this.to = to;
	}
	
}
