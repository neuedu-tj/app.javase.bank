package model.menu;

public class SimpleMenu extends Menu{
	
	public SimpleMenu(String title) {
		super(title);
	}
	
	public SimpleMenu(String title , String end) {
		super(title , end);
	}
	
	public void showTitle() {
		System.out.println(super.getTitle());
	}
	
	public void showEnd() {
		System.out.println(super.getEnd());
	}
	
}
