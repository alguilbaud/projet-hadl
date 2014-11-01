package m2;

import java.util.ArrayList;

public class Component extends Element{
	private ArrayList<InterfaceComp> tabInterfaceComp;
	
	public Component(){
		tabInterfaceComp = new ArrayList<InterfaceComp>();
	}
	
	public void addInterface(InterfaceComp ic){
		tabInterfaceComp.add(ic);
	}
	
	public void removeInterfaceComp(int i){
		tabInterfaceComp.remove(i);
	}
	
	public InterfaceComp getInterfaceComp(int i){
		return tabInterfaceComp.get(i);
	}
	
}
