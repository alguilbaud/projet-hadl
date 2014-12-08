package m2;

public abstract class Element {
	private String name;
	
	//variable visible uniquement dans les classes du package m2, de maniere que la configuration puisse y toucher, mais pas les classes du m1
	Configuration upperConf = null;

	public Element(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
	protected void sendObject(Object obj, String namePort){
		if (upperConf == null){
			System.out.println("This Element doesn't have an upper Configuration");
		}
		else{
			upperConf.send(obj, getName(), namePort);
		}
	}
	
	//methode appelee par la configuration du dessus pour faire progresser l'envoi d'un objet (redefinie dans Component et Configuration)
	void delegateSend(Object obj, String nameLastSender, String namePort){}
	
	//methode destinee a etre redefinie dans les sous-classes du m1 pour pouvoir faire quelque chose quand un objet est recu
	protected void objectReceived(Object obj, String namePort){}
	
}
