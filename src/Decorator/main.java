package Decorator;



public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//FIRST ROW
		Beverage b = new Caramel(new Choclate(new Milk()));

		System.out.println("The cost of your order is : "+b.cost()+"$");
		System.out.println("Please change the first row in the main class if you want to change the cost");
		
	}

}
