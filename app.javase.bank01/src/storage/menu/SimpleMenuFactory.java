package storage.menu;

import model.menu.Menu;
import model.menu.SimpleMenu;

public class SimpleMenuFactory implements MenuFactory {
	
	private String title;
	private String end;
	
	public SimpleMenuFactory(String title) {
		this.title = title;
	}
	
	public SimpleMenuFactory(String title , String end) {
		this.title = title;
		this.end = end;
	}

	@Override
	public Menu createMenu() {
		
		return new SimpleMenu(this.title , this.end);
	}

}
