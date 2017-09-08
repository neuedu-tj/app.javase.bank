package service;

import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

import constant.MenusMapping;
import model.menu.ChoiceMenu;
import storage.menu.ChoiceMenuFactory;
import storage.menu.MenuFactory;
import sun.security.timestamp.Timestamper;

public class MainService {
	
	public void main() {
		String title = MenusMapping.MENU_ACCOUNT_PERSONAL_TITLE;
		String choice = MenusMapping.MENU_ACCOUNT_PERSONAL_CHOICES;
		MenuFactory factory = new ChoiceMenuFactory( title , choice );
		ChoiceMenu choiceMenu = (ChoiceMenu)factory.createMenu();
		choiceMenu.showMenu();
		
		Scanner sc = new Scanner(System.in);
		
//		String choice = sc.next();
		
		
		java.util.Timer t = new Timer();
		
		t.schedule(new TimerTask() {
			
			@Override
			public void run() {
				System.out.println("-----");
			}
		}, 1000);
		
		
	}

}
