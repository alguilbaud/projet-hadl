package m2;

public class AttachmentConfOut extends Attachment {
	private ReqPortConf to;
	private ProConfRole from;
	
	public AttachmentConfOut(String s, ProConfRole from, ReqPortConf to) {
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

	protected ProConfRole getFrom() {
		return from;
	}
	protected void setFrom(ProConfRole from) {
		this.from = from;
	}
	
}
