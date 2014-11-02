package m1;

import m2.Attachment;
import m2.Configuration;
import m2.Connector;
import m2.Element;

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
	
	
	public Server getServer(String s){
		Server server = null;
		try{
			server = (Server) getElement(s);
		} catch (Exception e){}
		return server;
	}
	
	public Client getClient(String c){
		Client client = null;
		try{
			client = (Client) getElement(c);
		} catch (Exception e){}
		return client;
	}
	
	public RPC getRPC(String r){
		return (RPC) getConnector(r);
	}
	
	public AttachmentIn getAttachmentIn(String a){
		AttachmentIn att = null;
		try{
			att = (AttachmentIn) getAttachment(a);
		} catch (Exception e){}
		return att;
	}
	
	public AttachmentOut getAttachmentOut(String a){
		AttachmentOut att = null;
		try{
			att = (AttachmentOut) getAttachment(a);
		} catch (Exception e){}
		return att;
	}
	
	public String toString (){
		String result = "System " + getName() + " {\nClients and Servers :\n";
		boolean premier = true;
		for(Element e : getAllElements()){
			if (premier){
				result = result + e;
				premier = false;
			}
			else{
				result = result + "\n"+ e;
			}
		}
		
		premier = true;
		for(Connector c : getAllConnectors()){
			if (premier){
				result = result + "\n\nRPCs :\n"+ c;
				premier = false;
			}
			else{
				result = result + "\n"+ c;
			}
		}
		
		premier = true;
		for(Attachment a : getAllAttachments()){
			if (premier){
				result = result + "\n\nAttachments :\n"+ a;
				premier = false;
			}
			else{
				result = result + "\n"+ a;
			}
		}
		
		return result + "}";
	}
}
