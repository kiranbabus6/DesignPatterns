package com.kiran.corepatterns.singleton;

public class SingletonPattern {

	private static SingletonPattern instance;
	private SingletonPattern()
	{}
	public static synchronized SingletonPattern getInstance()
	{
		if(instance==null)
		{
			instance=new SingletonPattern();
		}
		return instance;
	}
}
