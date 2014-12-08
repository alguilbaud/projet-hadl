package m2;


public abstract class SimpleConnector {
	private String name;
	private Glue glue;
	
	private Role req;
	private Role pro;
	
	//variable visible uniquement dans les classes du package m2, de manière que la configuration puisse y toucher, mais pas les classes du m1
	Configuration upperConf = null;
	
	public SimpleConnector(String s, ReqCompRole roleReq, ProCompRole rolePro){
		name = s;
		this.req = roleReq;
		this.pro = rolePro;
		glue = null;
	}
	
	public SimpleConnector(String s, ReqConfRole roleReq, ProConfRole rolePro){
		name = s;
		this.req = roleReq;
		this.pro = rolePro;
		glue = null;
	}

	public String getName() {
		return name;
	}
	
	protected Role getRoleReq(){
		return req;
	}
	protected Role getRolePro(){
		return pro;
	}

	public Glue getGlue() {
		return glue;
	}
	public void setGlue(Glue glue) {
		this.glue = glue;
	}
	
	
	//methode appelee par la configuration du dessus pour faire progresser l'envoi d'un objet
	void delegateSend(Object obj, String nameLastSender, String nameRole){
		
		//si cet objet n'est pas le dernier a avoir envoye
		if(!getName().equals(nameLastSender)){
			//si le req ou le pro a le nom nameRole, SimpleConnector renvoie a la configuration du dessus en indiquant son nom et le nom de l'autre role
			if (req.getName().equals(nameRole)){
				System.out.println("The sending is passing by " + getName());
				upperConf.send(obj, getName(), pro.getName());
			}
			else if (pro.getName().equals(nameRole)){
				System.out.println("The sending is passing by " + getName());
				upperConf.send(obj, getName(), req.getName());
			}
		}
	}
}
