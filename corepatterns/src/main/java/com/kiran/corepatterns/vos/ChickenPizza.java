package com.kiran.corepatterns.vos;

public class ChickenPizza implements Pizza{

	public void prepare()
	{
		System.out.println("creating chicken pizza");
	}
	
	public void bake()
	{
		System.out.println("baking chicken pizza");
	}
	
	public void cut()
	{
		System.out.println("cutting chicken pizza");
	}

	
}
