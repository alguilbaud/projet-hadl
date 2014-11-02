package m1;

import m2.Component;
import m2.InterfaceComp;
import m2.Role;

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
