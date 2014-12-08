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
