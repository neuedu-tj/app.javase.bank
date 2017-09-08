package model.menu;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class ChoiceMenu extends Menu {

	private Map<String, String> options = new HashMap<String , String>();

	public ChoiceMenu() {

	}
	
	public ChoiceMenu(String title){
		super(title);
	}
	
	public ChoiceMenu(String title , String end){
		super(title, end);
	}

	public Map<String, String> getOptions() {
		return options;
	}

	public void setOptions(Map<String, String> options) {
		this.options = options;
	}
	
	@Override
	public String toString() {
		StringBuffer sbf = new StringBuffer();
		
		Collection<String> items = options.values();
		
		sbf.append(this.getTitle()).append("\n");
		
		for (String item : items) {
			sbf.append(item).append("\n");
		}
		
		sbf.append("-----------------");
		return sbf.toString();
	}
	
	public void showMenu() {
		System.out.println(this);
	}


}
