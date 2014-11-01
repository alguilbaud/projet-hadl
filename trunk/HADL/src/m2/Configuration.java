package m2;

import java.util.HashMap;

public class Configuration extends Element{
	private HashMap<String, Element> tabElement;
	private HashMap<String, Binding> tabBinding;
	private HashMap<String, InterfaceConf> tabInterfaceConf;
	private HashMap<String, Attachment> tabAttachment;
	private HashMap<String, Connector> tabConnector;
	
	public Configuration(String s){
		super(s);
		tabElement = new HashMap<String, Element>();
		tabBinding = new HashMap<String, Binding>();
		tabInterfaceConf = new HashMap<String, InterfaceConf>();
		tabAttachment = new HashMap<String, Attachment>();
		tabConnector = new HashMap<String, Connector>();
	}
	
	public void putElement(Element e){
		tabElement.put(e.getName(), e);
	}
	public void removeElement(String s){
		tabElement.remove(s);
	}
	public Element getElement(String s){
		return tabElement.get(s);
	}
	
	public void putBinding(Binding b){
		tabBinding.put(b.getName(), b);
	}
	public void removeBinding(String s){
		tabBinding.remove(s);
	}
	public Binding getBinding(String s){
		return tabBinding.get(s);
	}
	
	public void putInterfaceConf(InterfaceConf ic){
		tabInterfaceConf.put(ic.getName(), ic);
	}
	public void removeInterfaceConf(String s){
		tabInterfaceConf.remove(s);
	}
	public InterfaceConf getInterfaceConf(String s){
		return tabInterfaceConf.get(s);
	}

	public void putAttachment(Attachment a){
		tabAttachment.put(a.getName(), a);
	}
	public void removeAttachment(String s){
		tabAttachment.remove(s);
	}
	public Attachment getAttachment(String s){
		return tabAttachment.get(s);
	}
	
	public void putConnector(Connector c){
		tabConnector.put(c.getName(), c);
	}
	public void removeConnector(String s){
		tabConnector.remove(s);
	}
	public Connector getConnector(String s){
		return tabConnector.get(s);
	}
}
