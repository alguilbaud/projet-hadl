package m2;

import java.util.Collection;
import java.util.HashMap;

public class Configuration extends Element{
	private HashMap<String, Element> mapElement;
	private HashMap<String, Binding> mapBinding;
	private HashMap<String, InterfaceConf> mapInterfaceConf;
	private HashMap<String, Attachment> mapAttachment;
	private HashMap<String, SimpleConnector> mapConnector;
	
	public Configuration(String s){
		super(s);
		mapElement = new HashMap<String, Element>();
		mapBinding = new HashMap<String, Binding>();
		mapInterfaceConf = new HashMap<String, InterfaceConf>();
		mapAttachment = new HashMap<String, Attachment>();
		mapConnector = new HashMap<String, SimpleConnector>();
	}
	
	protected void putElement(Element e){
		mapElement.put(e.getName(), e);
		e.upperConf = this;
	}
	protected void removeElement(String s){
		mapElement.remove(s);
	}
	protected Element getElement(String s){
		return mapElement.get(s);
	}
	protected Collection<Element> getAllElements(){
		return mapElement.values();
	}
	
	protected void putBinding(Binding b){
		mapBinding.put(b.getName(), b);
		b.upperConf = this;
	}
	protected void removeBinding(String s){
		mapBinding.remove(s);
	}
	protected Binding getBinding(String s){
		return mapBinding.get(s);
	}
	protected Collection<Binding> getAllBindings(){
		return mapBinding.values();
	}
	
	protected void putInterfaceConf(InterfaceConf ic){
		mapInterfaceConf.put(ic.getName(), ic);
	}
	protected void removeInterfaceConf(String s){
		mapInterfaceConf.remove(s);
	}
	protected InterfaceConf getInterfaceConf(String s){
		return mapInterfaceConf.get(s);
	}
	protected Collection<InterfaceConf> getAllInterfacesConf(){
		return mapInterfaceConf.values();
	}

	protected void putAttachment(Attachment a){
		mapAttachment.put(a.getName(), a);
		a.upperConf = this;
	}
	protected void removeAttachment(String s){
		mapAttachment.remove(s);
	}
	protected Attachment getAttachment(String s){
		return mapAttachment.get(s);
	}
	protected Collection<Attachment> getAllAttachments(){
		return mapAttachment.values();
	}
	
	protected void putSimpleConnector(SimpleConnector c){
		mapConnector.put(c.getName(), c);
		c.upperConf = this;
	}
	protected void removeSimpleConnector(String s){
		mapConnector.remove(s);
	}
	protected SimpleConnector getSimpleConnector(String s){
		return mapConnector.get(s);
	}
	protected Collection<SimpleConnector> getAllSimpleConnectors(){
		return mapConnector.values();
	}
	
	
	//methode pour envoyer un objet d'un(e) composant/configuration vers un(e) composant/configuration
	//nameLastSender est le nom du dernier objet qui a appele cette methode et namePortOrRole est le nom du port ou du role qui fait le lien avec l'objet suivant
	protected void send(Object obj, String nameLastSender, String namePortOrRole){
		
		//on delegue aux elements, attachments, connecteurs simples et bindings
		for (Element e : getAllElements()){
			e.delegateSend(obj, nameLastSender, namePortOrRole);
		}
		for (Attachment a : getAllAttachments()){
			a.delegateSend(obj, nameLastSender, namePortOrRole);
		}
		for (SimpleConnector c : getAllSimpleConnectors()){
			c.delegateSend(obj, nameLastSender, namePortOrRole);
		}
		for (Binding b : getAllBindings()){
			b.delegateSend(obj, nameLastSender, namePortOrRole);
		}
	}
	
	//redifinition de la methode
	void delegateSend(Object obj, String nameLastSender, String namePort){
		//si cet objet n'est pas le dernier a avoir envoye
		if(!getName().equals(nameLastSender)){
			//si un port de la configuration a le nom namePort, c'est qu'elle est le destinataire final, donc on recupere l'objet
			if (mapInterfaceConf.containsKey(namePort)){
				System.out.println(getName() + " has received an object");
				objectReceived(obj, namePort);
			}
		}
	}
	
}
