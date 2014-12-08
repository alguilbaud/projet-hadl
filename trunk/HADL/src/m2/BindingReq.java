package m2;

public class BindingReq extends Binding {

	private ReqPortComp to;
	private ReqPortConf from;
	
	public BindingReq(String s, ReqPortConf from, ReqPortComp to) {
		super(s);
		this.from = from;
		this.to = to;
	}

	public ReqPortComp getTo() {
		return to;
	}

	public void setTo(ReqPortComp to) {
		this.to = to;
	}

	public ReqPortConf getFrom() {
		return from;
	}

	public void setFrom(ReqPortConf from) {
		this.from = from;
	}
	
	//redefinition de la methode
	void delegateSend(Object obj, String nameLastSender, String namePort){
		
		//si cet objet n'est pas le dernier a avoir envoye
		if(!getName().equals(nameLastSender)){
			//si le from ou le to a le nom namePort, ce binding renvoie a la configuration du dessus en indiquant son nom et le nom de l'autre port
			if (from.getName().equals(namePort)){
				System.out.println("The sending is passing by " + getName());
				upperConf.send(obj, getName(), to.getName());
			}
			else if (to.getName().equals(namePort)){
				System.out.println("The sending is passing by " + getName());
				upperConf.send(obj, getName(), from.getName());
			}
		}
	}
}
