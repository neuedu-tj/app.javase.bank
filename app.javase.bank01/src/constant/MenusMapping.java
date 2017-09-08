package constant;

import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class MenusMapping {

	private static Properties prop = new Properties();
	private static Map<String, String> menus = new HashMap<String, String>();

	public static final String MENU_SYS_TITLE = "menu.sys.title";
	public static final String MENU_ACCOUNT_PERSONAL_TITLE = "menu.account.personal.title";
	public static final String MENU_ACCOUNT_PERSONAL_CHOICES = "menu.account.personal.choices";

	static {
		try {
			prop.load(MenusMapping.class.getResourceAsStream("menus.properties"));

			menus.put(MENU_SYS_TITLE, prop.getProperty(MENU_SYS_TITLE));

			menus.put(MENU_ACCOUNT_PERSONAL_TITLE, prop.getProperty(MENU_ACCOUNT_PERSONAL_TITLE));
			menus.put(MENU_ACCOUNT_PERSONAL_CHOICES, prop.getProperty(MENU_ACCOUNT_PERSONAL_CHOICES));

		} catch (Exception e) {
			System.err.println("menus : init menus error . ");
			e.printStackTrace();
		}
	}

	public static Map<String, String> getMenus() {
		return menus;
	}

	public MenusMapping() {
		
	}

}
