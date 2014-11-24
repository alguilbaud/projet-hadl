package m1;

import m2.ReqCompRole;

public class Caller extends ReqCompRole{

	public Caller(String name){
		super(name);
	}
	
	public String toString(){
		return "Caller "+getName();
	}
}
