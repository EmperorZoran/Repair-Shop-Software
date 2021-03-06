package com.zoran_jankov.repairq.data.entity;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Version;

import com.zoran_jankov.repairq.data.InputData;
import com.zoran_jankov.repairq.data.embeddable.CreationInfo;
import com.zoran_jankov.repairq.data.embeddable.UpdateInfo;

import lombok.Data;

/**
 * Abstract class AbstractEntity represents a basic data entity, and it is a
 * superclass for all other data entities in the data structure. All data
 * entities have unique ID number, an (int) field, they inherit that from this
 * class, together with getter and setter method for that field.
 * <p>
 * Field:
 * <p>
 * (int) id - must be unique
 * <p>
 *
 * @author Zoran Jankov
 */
@Data
@MappedSuperclass
public abstract class AbstractEntity implements Entity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, nullable = false)
    private int id;
    
    @Version
    @Column(name = "version", nullable = false, updatable = true)
    private short version;

    /*
     * 
     */
    @Embedded
    private CreationInfo creation;

    @Embedded
    private UpdateInfo update;
    
    @Override
    public void initialize(InputData data) {
	setCreation(new CreationInfo());
	setUpdate(new UpdateInfo());
	getCreation().initialize(data);
	getUpdate().initialize(data);
    }
    
    @Override
    public void update(InputData data) {
	getUpdate().initialize(data);
    }
    
    @Override
    public String getDisplayName() {
	return Integer.toString(id);
    }
}