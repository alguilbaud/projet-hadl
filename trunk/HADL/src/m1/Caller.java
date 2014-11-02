package m1;

import m2.ProCompRole;

public class Caller extends ProCompRole{

	public Caller(String name){
		super(name);
	}
	
	public String toString(){
		return "Caller "+getName();
	}
}
