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
