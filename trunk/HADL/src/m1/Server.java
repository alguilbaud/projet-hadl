package m1;

import m2.Component;
import m2.InterfaceComp;

public class Server extends Component{
	
	private String message = "Here is your response";
	
	public Server(String name, PortReceiveRequest p){
		super(name);
		putInterfaceComp(p);
	}
	
	public void addPortReceiveRequest (PortReceiveRequest p){
		putInterfaceComp(p);
	}
	
	public void removePortReceiveRequest (String name){
		removeInterfaceComp(name);
	}
	
	public PortReceiveRequest getPortReceiveRequest (String name){
		return (PortReceiveRequest) getInterfaceComp(name);
	}
	
	@Override
	protected void objectReceived(Object obj, String namePort) {
		java.lang.System.out.println(getName() + " : Request received");
		java.lang.System.out.println(getName() + " is sending the response : \"" + message + "\"");
		sendObject(message, namePort);
	}
	
	public String toString (){
		String result = "Server " + getName() + " [";
		boolean premier = true;
		for(InterfaceComp i : getAllInterfacesComp()){
			if (premier){
				result = result + i;
				premier = false;
			}
			else{
				result = result + ", " + i;
			}
		}
		return result + "]";
	}
}
