package storage.menu;

import constant.MenusMapping;
import model.menu.ChoiceMenu;
import model.menu.Menu;

public class ChoiceMenuFactory implements MenuFactory {
	private String title;
	private String options;

	public ChoiceMenuFactory(String title, String options) {
		this.title = title;
		this.options = options;
	}

	@Override
	public Menu createMenu() {

		ChoiceMenu menu = new ChoiceMenu(MenusMapping.getMenus().get(title));

		String[] meun_str = MenusMapping.getMenus().get(options).split(";");

		for (String s : meun_str) {

			menu.getOptions().put(s.substring(0, s.indexOf(".")), s);
		}

		return menu;
	}

}
