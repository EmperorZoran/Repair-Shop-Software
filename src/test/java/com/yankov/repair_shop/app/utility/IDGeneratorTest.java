package test.java.com.yankov.repair_shop.app.utility;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

import main.java.com.yankov.repair_shop.app.utility.IDGenerator;

import main.java.com.yankov.repair_shop.data.EntityType;

class IDGeneratorTest
{
	@ParameterizedTest
	@EnumSource(EntityType.class)
	void getNewIDTest(EntityType entityType)
	{
		switch(entityType)
		{
			case TICKET:
				assertEquals(119122301, IDGenerator.getNewID(entityType));
		
			default:
				assertEquals(100000001, IDGenerator.getNewID(entityType));
		}
	}
	
	@ParameterizedTest
	@EnumSource(EntityType.class)
	void toStringTest(EntityType entityType)
	{
		switch(entityType)
		{
			case TICKET:
				assertEquals("1-191223-01", IDGenerator.toString(entityType, 119122301));
		
			default:
				assertEquals("1-19122301", IDGenerator.toString(entityType, 119122301));
		}
	}
}