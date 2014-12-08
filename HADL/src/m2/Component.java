package m2;

import java.util.Collection;
import java.util.HashMap;

public class Component extends Element{
	private HashMap<String, InterfaceComp> mapInterfaceComp;
	
	public Component(String s){
		super(s);
		mapInterfaceComp = new HashMap<String, InterfaceComp>();
	}
	
	protected void putInterfaceComp(InterfaceComp ic){
		mapInterfaceComp.put(ic.getName(), ic);
	}
	protected void removeInterfaceComp(String s){
		mapInterfaceComp.remove(s);
	}
	protected InterfaceComp getInterfaceComp(String s){
		return mapInterfaceComp.get(s);
	}
	protected Collection<InterfaceComp> getAllInterfacesComp(){
		return mapInterfaceComp.values();
	}
	
	
	//redifinition de la methode
	void delegateSend(Object obj, String nameLastSender, String namePort){
		//si cet objet n'est pas le dernier a avoir envoye
		if(!getName().equals(nameLastSender)){
			//si un port de la configuration a le nom namePort, c'est qu'elle est le destinataire final, donc on recupere l'objet
			if (mapInterfaceComp.containsKey(namePort)){
				objectReceived(obj);
			}
		}
	}
}
