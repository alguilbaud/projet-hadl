package m1;

import m2.ReqPortComp;

public class PortReceiveRequest extends ReqPortComp{

	public PortReceiveRequest(String name){
		super(name);
	}
	
	public String toString(){
		return "PortReceiveRequest "+getName();
	}
}
