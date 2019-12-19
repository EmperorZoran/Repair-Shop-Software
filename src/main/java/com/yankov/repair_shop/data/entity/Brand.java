package main.java.com.yankov.repair_shop.data.entity;

import main.java.com.yankov.repair_shop.data.EntityType;

/**
 * Class Brand extends abstract class Property and represents
 * a device brand.
 * 
 * @author Zoran Jankov
 */
public class Brand extends Property
{
	@Override
	public EntityType getEntityType()
	{
		return EntityType.BRAND;
	}
}