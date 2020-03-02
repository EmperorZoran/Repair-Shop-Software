package main.java.com.zoran_jankov.repair_shop.data.entity;

import java.time.LocalDate;

import javax.persistence.Entity;

import main.java.com.zoran_jankov.repair_shop.data.EntityType;
import main.java.com.zoran_jankov.repair_shop.data.NotificationType;

@Entity
public class Notification extends AbstractEntity
{
	private NotificationType notificationType;
	private Ticket ticket;
	private User user;
	private LocalDate timestamp;
	private String comment;
	
	@Override
	public EntityType getType()
	{
		return EntityType.NOTIFICATION;
	}
	
	public NotificationType getNotificationType()
	{
		return notificationType;
	}
	
	public void setNotificationType(NotificationType notificationType)
	{
		this.notificationType = notificationType;
	}
	
	public Ticket getTicket()
	{
		return ticket;
	}
	
	public void setTicket(Ticket ticket)
	{
		this.ticket = ticket;
	}
	
	public User getUser()
	{
		return user;
	}
	
	public void setUser(User user)
	{
		this.user = user;
	}
	
	public LocalDate getDate()
	{
		return timestamp;
	}
	
	public void setDate(LocalDate localDate)
	{
		this.timestamp = localDate;
	}
	
	public String getComment()
	{
		return comment;
	}
	
	public void setComment(String notification)
	{
		this.comment = notification;
	}
}