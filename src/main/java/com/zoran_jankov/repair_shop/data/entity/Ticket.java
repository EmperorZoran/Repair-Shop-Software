package main.java.com.zoran_jankov.repair_shop.data.entity;

import javax.persistence.Entity;

import main.java.com.zoran_jankov.repair_shop.data.EntityType;
import main.java.com.zoran_jankov.repair_shop.data.Priority;

@Entity
public class Ticket extends AbstractEntity
{
	private Priority priority;
	private NotificationType status;
	private Customer customer;
	private Device device;
	
	@Override
	public final EntityType getType()
	{
		return EntityType.TICKET;
	}
	
	public Priority getPriority()
	{
		return priority;
	}

	public void setPriority(Priority priority)
	{
		this.priority = priority;
	}
	
	public NotificationType getStatus()
	{
		return status;
	}

	public void setStatus(NotificationType status)
	{
		this.status = status;
	}

	public Customer getClient()
	{
		return customer;
	}

	public void setClient(Customer customer)
	{
		this.customer = customer;
	}

	public Device getDevice()
	{
		return device;
	}

	public void setDevice(Device device)
	{
		this.device = device;
	}
}