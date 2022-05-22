package com.kiran.corepatterns.vos;

public class PizzaFactory {

	public static Pizza createPizza(String type)
	{
		Pizza p = null;
		if(type.equals("cheese"))
			p = new CheesePizza();
		else if (type.equals("chicken"))
			p = new ChickenPizza();
		else if (type.equals("veggie"))
			p = new VeggiePizza();
		return p;
	}

	
}