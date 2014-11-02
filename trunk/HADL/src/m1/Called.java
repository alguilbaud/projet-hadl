package m1;

import m2.ReqCompRole;

public class Called extends ReqCompRole{
	
	public Called(String name){
		super(name);
	}
	
	public String toString(){
		return "Called "+getName();
	}
}
