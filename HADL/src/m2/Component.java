package m2;

import java.util.HashMap;

public class Component extends Element{
	private HashMap<String, InterfaceComp> mapInterfaceComp;
	
	public Component(String s){
		super(s);
		mapInterfaceComp = new HashMap<String, InterfaceComp>();
	}
	
	public void putInterfaceComp(InterfaceComp ic){
		mapInterfaceComp.put(ic.getName(), ic);
	}
	public void removeInterfaceComp(String s){
		mapInterfaceComp.remove(s);
	}
	public InterfaceComp getInterfaceComp(String s){
		return mapInterfaceComp.get(s);
	}
	
}
