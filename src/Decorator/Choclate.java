package Decorator;

public class Choclate extends AddOnDecorator{

	private Beverage  b;
	
	public Choclate(Beverage b) {
		super();
		this.b = b;
	}



	public int cost() {
		return this.b.cost()+4;
		
	}
}
