package m1;

import m2.SimpleConnector;

public class RPC extends SimpleConnector{
	
	public RPC(String name, Caller c1, Called c2){
		super(name, c1, c2);
	}
	
	public Caller getCaller(String name){
		Caller caller = null;
		try{
			caller = (Caller) getRoleReq();
		}
		catch (Exception e){}
		return caller;
	}
	
	public Called getCalled(String name){
		Called called = null;
		try{
			called = (Called) getRolePro();
		}
		catch (Exception e){}
		return called;
	}
	
	public String toString(){
		return "RPC "+getName()+" [req : "+getRoleReq()+", pro : "+getRolePro()+"]";
	}
}
