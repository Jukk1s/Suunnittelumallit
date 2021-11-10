
public class Main {

	public static void main(String[] args) {
		
		Pizza pizza1 = new Ham(new Tomato(new Tuna(new Crust())));
		Pizza pizza2 = new Salami(new Tomato(new Garlic(new Crust())));
		Pizza pizza3 = new Chicken(new BBQ(new Truffle(new Crust())));
		
		System.out.println(pizza1.getDescription() + pizza1.getPrice() + " € \n");
		System.out.println(pizza2.getDescription() + pizza2.getPrice() + " € \n");
		System.out.println(pizza3.getDescription() + pizza3.getPrice() + " € \n");

	}

}
