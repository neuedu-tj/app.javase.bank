package model.menu;

public abstract class Menu {

	private String title;
	private String end;

	public Menu() {

	}

	public Menu(String title) {
		this.title = title;
	}

	public Menu(String title, String end) {
		this.title = title;
		this.end = end;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getEnd() {
		return end;
	}

	public void setEnd(String end) {
		this.end = end;
	}

}
