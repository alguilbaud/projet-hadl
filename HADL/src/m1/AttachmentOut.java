package m1;

import m2.AttachmentCompReq;

public class AttachmentOut extends AttachmentCompReq{

	public AttachmentOut(String name, PortReceiveRequest p, Called c){
		super(name, p, c);
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
