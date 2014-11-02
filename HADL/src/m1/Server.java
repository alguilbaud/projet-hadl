package m1;

import m2.Component;
import m2.InterfaceComp;

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
	
	public String toString (){
		String result = "Server" + getName() + " [";
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
