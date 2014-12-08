package m1;

import m2.Component;
import m2.InterfaceComp;

public class Client extends Component{
	
	public Client(String name, PortSendRequest p){
		super(name);
		putInterfaceComp(p);
	}
	
	public void addPortSendRequest (PortSendRequest p){
		putInterfaceComp(p);
	}
	
	public void removePortSendRequest (String name){
		removeInterfaceComp(name);
	}
	
	public PortSendRequest getPortSendRequest (String name){
		return (PortSendRequest) getInterfaceComp(name);
	}
	
	public void sendRequest(PortSendRequest p){
		String namePort = p.getName();
		if (getPortSendRequest(namePort)==null){
			java.lang.System.out.println("The client " + getName() + " does not contain the PortSendRequest " + namePort);
		}
		java.lang.System.out.println(getName() + " is sending a request");
		sendObject("", namePort);
	}
	
	@Override
	protected void objectReceived(Object obj, String namePort) {
		String s = (String) obj;
		java.lang.System.out.println("Response received by " + getName() + " : " + s);
	}
	
	public String toString (){
		String result = "Client " + getName() + " [";
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
