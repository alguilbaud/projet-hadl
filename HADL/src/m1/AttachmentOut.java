package m1;

import m2.AttachmentCompOut;

public class AttachmentOut extends AttachmentCompOut{

	public AttachmentOut(String name, Called c, PortReceiveRequest p){
		super(name, c, p);
	}
	
	public PortReceiveRequest getPortReceiveRequest(){
		return (PortReceiveRequest) getTo();
	}
	
	public void setPortReceiveRequest(PortReceiveRequest p){
		setTo(p);
	}
	
	public Called getCalled(){
		return (Called) getFrom();
	}
	
	public void setCalled(Called c){
		setFrom(c);
	}
	
	public String toString(){
		return "AttachmentOut "+getName()+" [from : "+getFrom()+", to : "+getTo()+"]";
	}
}
