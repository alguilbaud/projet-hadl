package m1;

import m2.Component;

public class Server extends Component{
	
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
}
