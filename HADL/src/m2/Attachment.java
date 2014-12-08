package m2;

public abstract class Attachment {
	private String name;
	
	//variable visible uniquement dans les classes du package m2, de manière que la configuration puisse y toucher, mais pas les classes du m1
	Configuration upperConf = null;

	public Attachment(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
	//methode appelee par la configuration du dessus pour faire progresser l'envoi d'un objet (redefinie dans les sous-classes)
	void delegateSend(Object obj, String nameLastSender, String namePort){}
	
}
