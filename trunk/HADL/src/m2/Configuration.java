package m2;

import java.util.Collection;
import java.util.HashMap;

public class Configuration extends Element{
	private HashMap<String, Element> mapElement;
	private HashMap<String, Binding> mapBinding;
	private HashMap<String, InterfaceConf> mapInterfaceConf;
	private HashMap<String, Attachment> mapAttachment;
	private HashMap<String, Connector> mapConnector;
	
	public Configuration(String s){
		super(s);
		mapElement = new HashMap<String, Element>();
		mapBinding = new HashMap<String, Binding>();
		mapInterfaceConf = new HashMap<String, InterfaceConf>();
		mapAttachment = new HashMap<String, Attachment>();
		mapConnector = new HashMap<String, Connector>();
	}
	
	public void putElement(Element e){
		mapElement.put(e.getName(), e);
	}
	public void removeElement(String s){
		mapElement.remove(s);
	}
	public Element getElement(String s){
		return mapElement.get(s);
	}
	public Collection<Element> getAllElements(){
		return mapElement.values();
	}
	
	public void putBinding(Binding b){
		mapBinding.put(b.getName(), b);
	}
	public void removeBinding(String s){
		mapBinding.remove(s);
	}
	public Binding getBinding(String s){
		return mapBinding.get(s);
	}
	public Collection<Binding> getAllBindings(){
		return mapBinding.values();
	}
	
	public void putInterfaceConf(InterfaceConf ic){
		mapInterfaceConf.put(ic.getName(), ic);
	}
	public void removeInterfaceConf(String s){
		mapInterfaceConf.remove(s);
	}
	public InterfaceConf getInterfaceConf(String s){
		return mapInterfaceConf.get(s);
	}
	public Collection<InterfaceConf> getAllInterfacesConf(){
		return mapInterfaceConf.values();
	}

	public void putAttachment(Attachment a){
		mapAttachment.put(a.getName(), a);
	}
	public void removeAttachment(String s){
		mapAttachment.remove(s);
	}
	public Attachment getAttachment(String s){
		return mapAttachment.get(s);
	}
	public Collection<Attachment> getAllAttachments(){
		return mapAttachment.values();
	}
	
	public void putConnector(Connector c){
		mapConnector.put(c.getName(), c);
	}
	public void removeConnector(String s){
		mapConnector.remove(s);
	}
	public Connector getConnector(String s){
		return mapConnector.get(s);
	}
	public Collection<Connector> getAllConnectors(){
		return mapConnector.values();
	}
}
