package m2;

import java.util.ArrayList;

public class Configuration extends Element{
	private ArrayList<Element> tabElement;
	private ArrayList<Binding> tabBinding;
	private ArrayList<InterfaceConf> tabInterfaceConf;
	private ArrayList<Attachment> tabAttachment;
	private ArrayList<Connector> tabConnector;
	
	public Configuration(){
		tabElement = new ArrayList<Element>();
		tabBinding = new ArrayList<Binding>();
		tabInterfaceConf = new ArrayList<InterfaceConf>();
		tabAttachment = new ArrayList<Attachment>();
		tabConnector = new ArrayList<Connector>();
	}
	
	public void addElement(Element e){
		tabElement.add(e);
	}
	public void removeElement(int i){
		tabElement.remove(i);
	}
	public Element getElement(int i){
		return tabElement.get(i);
	}
	
	public void addBinding(Binding b){
		tabBinding.add(b);
	}
	public void removeBinding(int i){
		tabBinding.remove(i);
	}
	public Binding getBinding(int i){
		return tabBinding.get(i);
	}
	
	public void addInterfaceConf(InterfaceConf ic){
		tabInterfaceConf.add(ic);
	}
	public void removeInterfaceConf(int i){
		tabInterfaceConf.remove(i);
	}
	public InterfaceConf getInterfaceConf(int i){
		return tabInterfaceConf.get(i);
	}

	public void addAttachment(Attachment a){
		tabAttachment.add(a);
	}
	public void removeAttachment(int i){
		tabAttachment.remove(i);
	}
	public Attachment getAttachment(int i){
		return tabAttachment.get(i);
	}
	
	public void addConnector(Connector c){
		tabConnector.add(c);
	}
	public void removeConnector(int i){
		tabConnector.remove(i);
	}
	public Connector getConnector(int i){
		return tabConnector.get(i);
	}
}
