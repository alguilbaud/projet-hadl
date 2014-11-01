package m2;

import java.util.ArrayList;

public class Structure {
	private String name;
	private ArrayList<Element> tabElement;
	
	public Structure(String s){
		name = s;
		tabElement = new ArrayList<Element>();
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
