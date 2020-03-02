package main.java.com.zoran_jankov.repair_shop.data.entity;

import javax.persistence.Entity;

import main.java.com.zoran_jankov.repair_shop.data.EntityType;

@Entity
public class Service extends AbstractEntity
{
	private int price;
	private Notification notification;
	private Ticket ticket;
	private ServiceType serviceType;
	
	public double getPrice()
	{
		return price;
	}
	
	public void setPrice(int price)
	{
		this.price = price;
	}
	
	@Override
	public EntityType getType()
	{
		return EntityType.SERVICE;
	}
	
	public Notification getNotification()
	{
		return notification;
	}

	public void setNotification(Notification notification)
	{
		this.notification = notification;
	}
	
	public Ticket getTicket()
	{
		return ticket;
	}

	public void setTicket(Ticket ticket)
	{
		this.ticket = ticket;
	}

	public ServiceType getServiceType()
	{
		return serviceType;
	}

	public void setServiceType(ServiceType serviceType)
	{
		this.serviceType = serviceType;
	}
}