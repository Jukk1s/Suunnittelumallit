package builder;

import java.util.ArrayList;

public class Customer {

	public static void main(String[] args) {
		Waiter waiter = new Waiter();
		IBurgerBuilder bBuilder = new HesburgerBuilder();	
		waiter.setBurgerBuilder(bBuilder);
		waiter.constructBurger();
		
		ArrayList<Object> hesBurger = (ArrayList<Object>) bBuilder.getBurger();		
		System.out.println(hesBurger.toString());
		
		bBuilder = new McDonaldsBuilder();
		waiter.setBurgerBuilder(bBuilder);
		waiter.constructBurger();
		
		StringBuilder mcBurger = (StringBuilder) bBuilder.getBurger();	
		System.out.println(mcBurger);
		
	}
}
