package m1;

import m2.AttachmentCompIn;

public class AttachmentIn extends AttachmentCompIn{

	public AttachmentIn(String name, PortSendRequest p, Caller c){
		super(name, p, c);
	}
	
	public PortSendRequest getPortSendRequest(){
		return (PortSendRequest) getFrom();
	}
	
	public void setPortSendRequest(PortSendRequest p){
		setFrom(p);
	}
	
	public Caller getCaller(){
		return (Caller) getTo();
	}
	
	public void setCaller(Caller c){
		setTo(c);
	}
	
	public String toString(){
		return "AttachmentIn "+getName()+" [from : "+getFrom()+", to : "+getTo()+"]";
	}
}
