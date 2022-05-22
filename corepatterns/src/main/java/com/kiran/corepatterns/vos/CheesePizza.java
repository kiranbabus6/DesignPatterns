package com.kiran.corepatterns.vos;

public class CheesePizza implements Pizza{

	public void prepare()
	{
		System.out.println("creating cheese pizza");
	}
	
	public void bake()
	{
		System.out.println("baking cheese pizza");
	}
	
	public void cut()
	{
		System.out.println("cutting cheese pizza");
	}
}
