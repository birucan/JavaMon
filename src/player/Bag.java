package player;

import java.util.ArrayList;

import items.Iitem;

public class Bag {
	
	private ArrayList<itemContainer> bag;
	
	public class itemContainer{
		private Iitem item;
		private int slot;
		private int cuantity;
		
	}
	
	public void AddItem(Iitem item, int cuantity){
		//TODO: additem
	}
	public void RemoveItem(Iitem item, int cuantity){
		//TODO: removeitem
	}
}
