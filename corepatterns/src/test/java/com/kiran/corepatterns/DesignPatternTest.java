package com.kiran.corepatterns;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.kiran.corepatterns.abstractFactory.Dao;
import com.kiran.corepatterns.abstractFactory.DaoAbstractFactory;
import com.kiran.corepatterns.abstractFactory.DaoFactoryProducer;
import com.kiran.corepatterns.factory.PizzaStore;
import com.kiran.corepatterns.singleton.SingletonPattern;

public class DesignPatternTest {
	
	Logger logger = LoggerFactory.getLogger(DesignPatternTest.class);

	@Test
	void testSingleton()
	{
		SingletonPattern sp = SingletonPattern.getInstance();
		SingletonPattern sp1 = SingletonPattern.getInstance();
		logger.info("sp= "+sp);
		logger.info("sp1= "+sp1);
	}
	
	@Test
	void testFactoryPattern()
	{
		PizzaStore ps = new PizzaStore();
		ps.orderPizza("veggie");
		ps.orderPizza("cheese");
		ps.orderPizza("chicken");
	}
	
	@Test
	void testAbstractFactoryPattern()
	{
		DaoAbstractFactory daf = DaoFactoryProducer.produce("db");
		Dao dao = daf.createDao("dept");
		dao.save();
		
	}
}
