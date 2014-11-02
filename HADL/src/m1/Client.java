package m1;

import m2.Component;

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
}
