package com.zoran_jankov.repairq.data.entity;

import java.util.Map;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.zoran_jankov.repairq.data.EntityType;
import com.zoran_jankov.repairq.data.FieldType;
import com.zoran_jankov.repairq.data.embeddable.ContactInfo;
import com.zoran_jankov.repairq.data.embeddable.PersonalInfo;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Class Client represents a client with associated information about that
 * client.
 * 
 * @author Zoran Jankov
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "customer")
public class Customer extends AbstractEntity {
    @Embedded
    private PersonalInfo personalInfo;
    
    @Embedded
    private ContactInfo contactInfo;
    
    public Customer(Map<FieldType, Object> data) {
	super(data);
	setPersonalInfo(new PersonalInfo(data));
	setContactInfo(new ContactInfo(data));
    }
    
    @Override
    public void update(Map<FieldType, Object> data) {
    	super.update(data);
    	personalInfo.update(data);
    	contactInfo.update(data);
    }
    
    @Override
    public final EntityType getType() {
	return EntityType.CUSTOMER;
    }
    
    @Override
    public String getDisplayName() {
	return super.getDisplayName() + " " + personalInfo.getDispalyName();
    }
}