package com.kiran.corepatterns.vos;

public class VeggiePizza implements Pizza{

	public void prepare()
	{
		System.out.println("creating veggie pizza");
	}
	
	public void bake()
	{
		System.out.println("baking veggie pizza");
	}
	
	public void cut()
	{
		System.out.println("cutting veggie pizza");
	}

	
}
