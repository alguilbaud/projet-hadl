package m1;

import m2.ProCompRole;

public class Called extends ProCompRole{
	
	public Called(String name){
		super(name);
	}
	
	public String toString(){
		return "Called "+getName();
	}
}
