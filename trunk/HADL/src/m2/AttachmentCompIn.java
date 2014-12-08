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
	
	//redefinition de la methode
	void delegateSend(Object obj, String nameLastSender, String namePortOrRole){
		
		//si cet objet n'est pas le dernier a avoir envoye
		if(!getName().equals(nameLastSender)){
			//si le from ou le to a le nom namePortOrRole, cet attachment renvoie a la configuration du dessus en indiquant son nom et le nom de l'autre port ou role
			if (from.getName().equals(namePortOrRole)){
				upperConf.sendSameType(obj, getName(), to.getName());
			}
			else if (to.getName().equals(namePortOrRole)){
				upperConf.sendSameType(obj, getName(), from.getName());
			}
		}
	}
		
}
