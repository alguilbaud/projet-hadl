package m1;

import m2.Configuration;

public class System extends Configuration {
	
	public System(String name){
		super(name);
	}
	
	
	public void addServer(Server s){
		putElement(s);
	}
	public void addClient(Client c){
		putElement(c);
	}
	public void addRPC(RPC r){
		putConnector(r);
	}
	public void addAttachmentIn(AttachmentIn a){
		putAttachment(a);
	}
	public void addAttachmentOut(AttachmentOut a){
		putAttachment(a);
	}
	
	
	public void removeServer(String s){
		removeElement(s);
	}
	public void removeClient(String c){
		removeElement(c);
	}
	public void removeRPC(String r){
		removeConnector(r);
	}
	public void removeAttachmentIn(String a){
		removeAttachment(a);
	}
	public void removeAttachmentOut(String a){
		removeAttachment(a);
	}
}
