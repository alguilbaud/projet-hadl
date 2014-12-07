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
	
	//methode appelée pour envoyer vers un autre composant
	protected void sendCompToComp(){
		
	}
}
