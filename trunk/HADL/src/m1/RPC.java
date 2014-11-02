package m1;

import m2.SimpleConnector;

public class RPC extends SimpleConnector{
	
	public RPC(String name, Caller c1, Called c2){
		super(name, c1, c2);
	}
	
	public void addCaller(Caller c){
		putRole(c);
	}
	
	public void removeCaller(String name){
		removeRole(name);
	}
	
	public Caller getCaller(String name){
		Caller caller = null;
		try{
			caller = (Caller) getRole(name);
		}
		catch (Exception e){}
		return caller;
	}
	
	public void addCalled(Caller c){
		putRole(c);
	}
	
	public void removeCalled(String name){
		removeRole(name);
	}
	
	public Called getCalled(String name){
		Called called = null;
		try{
			called = (Called) getRole(name);
		}
		catch (Exception e){}
		return called;
	}
}
