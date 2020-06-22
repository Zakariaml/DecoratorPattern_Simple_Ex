package Decorator;

public class Caramel extends AddOnDecorator{

	private Beverage b;
	
	
	public Caramel(Beverage b) {
		super();
		this.b = b;
	}


	public int cost() {
	return this.b.cost() +3;	
	}
}
