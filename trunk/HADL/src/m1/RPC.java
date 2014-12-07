package m1;

import m2.Role;
import m2.SimpleConnector;

public class RPC extends SimpleConnector{
	
	public RPC(String name, Caller c1, Called c2){
		super(name, c1, c2);
	}
	
	public Caller getCaller(String name){
		Caller caller = null;
		try{
			caller = (Caller) getRole(name);
		}
		catch (Exception e){}
		return caller;
	}
	
	public Called getCalled(String name){
		Called called = null;
		try{
			called = (Called) getRole(name);
		}
		catch (Exception e){}
		return called;
	}
	
	public String toString (){
		String result = "RPC " + getName() + " [";
		boolean premier = true;
		for(Role r : getAllRoles()){
			if (premier){
				result = result + r;
				premier = false;
			}
			else{
				result = result + ", " + r;
			}
		}
		return result + "]";
	}
}
