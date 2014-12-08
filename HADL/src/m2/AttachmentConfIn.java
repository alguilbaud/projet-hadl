package m2;

public class AttachmentConfIn extends Attachment {
	private ProPortConf from;
	private ReqConfRole to;
	
	public AttachmentConfIn(String s, ProPortConf from, ReqConfRole to) {
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

	protected ReqConfRole getTo() {
		return to;
	}
	protected void setTo(ReqConfRole to) {
		this.to = to;
	}
	
	//redefinition de la methode
	void delegateSend(Object obj, String nameLastSender, String namePortOrRole){
		
		//si cet objet n'est pas le dernier a avoir envoye
		if(!getName().equals(nameLastSender)){
			//si le from ou le to a le nom namePortOrRole, cet attachment renvoie a la configuration du dessus en indiquant son nom et le nom de l'autre port ou role
			if (from.getName().equals(namePortOrRole)){
				System.out.println("The sending is passing by " + getName());
				upperConf.send(obj, getName(), to.getName());
			}
			else if (to.getName().equals(namePortOrRole)){
				System.out.println("The sending is passing by " + getName());
				upperConf.send(obj, getName(), from.getName());
			}
		}
	}
	
}
