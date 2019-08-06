package designpatterns.creational.composite.menu.client;

import designpatterns.creational.composite.menu.component.MenuComponent;

public class Waitress {
	MenuComponent allMenus;
 
	public Waitress(MenuComponent allMenus) {
		this.allMenus = allMenus;
	}
 
	public void printMenu() {
		allMenus.print();
	}
}
