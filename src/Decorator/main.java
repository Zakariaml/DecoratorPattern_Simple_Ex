package Decorator;



public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Beverage b = new Caramel(new Choclate(new Milk()));
		System.out.println("The cost of your order is : "+b.cost()+"$");
		
	}

}
