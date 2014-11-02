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
	
	protected void putElement(Element e){
		mapElement.put(e.getName(), e);
	}
	protected void removeElement(String s){
		mapElement.remove(s);
	}
	protected Element getElement(String s){
		return mapElement.get(s);
	}
	protected Collection<Element> getAllElements(){
		return mapElement.values();
	}
	
	protected void putBinding(Binding b){
		mapBinding.put(b.getName(), b);
	}
	protected void removeBinding(String s){
		mapBinding.remove(s);
	}
	protected Binding getBinding(String s){
		return mapBinding.get(s);
	}
	protected Collection<Binding> getAllBindings(){
		return mapBinding.values();
	}
	
	protected void putInterfaceConf(InterfaceConf ic){
		mapInterfaceConf.put(ic.getName(), ic);
	}
	protected void removeInterfaceConf(String s){
		mapInterfaceConf.remove(s);
	}
	protected InterfaceConf getInterfaceConf(String s){
		return mapInterfaceConf.get(s);
	}
	protected Collection<InterfaceConf> getAllInterfacesConf(){
		return mapInterfaceConf.values();
	}

	protected void putAttachment(Attachment a){
		mapAttachment.put(a.getName(), a);
	}
	protected void removeAttachment(String s){
		mapAttachment.remove(s);
	}
	protected Attachment getAttachment(String s){
		return mapAttachment.get(s);
	}
	protected Collection<Attachment> getAllAttachments(){
		return mapAttachment.values();
	}
	
	protected void putConnector(Connector c){
		mapConnector.put(c.getName(), c);
	}
	protected void removeConnector(String s){
		mapConnector.remove(s);
	}
	protected Connector getConnector(String s){
		return mapConnector.get(s);
	}
	protected Collection<Connector> getAllConnectors(){
		return mapConnector.values();
	}
}
