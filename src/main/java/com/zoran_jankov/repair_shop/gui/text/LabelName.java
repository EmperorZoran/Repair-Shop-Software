package main.java.com.zoran_jankov.repair_shop.gui.text;

import java.util.EnumMap;
import java.util.Map;

import main.java.com.zoran_jankov.repair_shop.data.FieldType;

public class LabelName
{
	public static String REQUIRED_FIELDS = "Required Fields (*)";
	public static String NULL_ITEM = "----Not Selected----";
	
	//Personal Information
	public static String FIRST_NAME = "First Name";
	public static String LAST_NAME = "Last Name";
		
	//Contact Information
	public static String PHONE_NUMBER = "Phone Number";
	public static String EMAIL = "Email Address";
	public static String ADDRESS = "Home Address";
		
	//Company Information
	public static String COMAPNY_NAME = "Name";
	public static String TAX_ID = "Tax Identification Number";
	public static String BANK_ACCOUNT = "Bank Account";
		
	//User Information
	public static String USER = "User";
	public static String USER_TYPE = "User Type";
	public static String USERNAME = "Username";
	public static String PASSWORD = "Password";
	
	//Device Information
	public static String DEVICE_TYPE = "Device Type";
	public static String BRAND = "Brand";
	public static String MODEL = "Model";
	public static String SERIAL = "Serial Number";
	
	public static String ENTITY = "Entity";
	public static String ENTITY_DETAILS = "Entity Details";
	
	//Ticket Information
	public static String DETAILS = "Details";
	
	//Basic Information
	public static String NAME = "Name";
	public static String DESCRIPTION = "Description";
	
	//Entity names
	public static String NOTIFICATION = "Notification";
	public static String NOTIFICATION_TYPE = "Notification Type";
	public static String SERVICE = "Service";
	public static String SERVICE_TYPE = "Service Type";
	public static String TICKET = "Ticket";
	public static String STATUS = "Status";
	public static String CLIENT = "Client";
	public static String MARKETING = "Marketing";
	public static String DEVICE = "Device";
	
	private static final Map<FieldType, String> FIELD_LABELS = new EnumMap<FieldType, String>(FieldType.class)
	{
		private static final long serialVersionUID = -2039203438581475106L;
	{
		FIELD_LABELS.put(FieldType.COMMENT, "Comment");
		FIELD_LABELS.put(FieldType.DETAILS, "Details");
		FIELD_LABELS.put(FieldType.FIRST_NAME, "First Name");
		FIELD_LABELS.put(FieldType.LAST_NAME, "Last Name");
		FIELD_LABELS.put(FieldType.PHONE_NUMBER, "Phone Number");
		FIELD_LABELS.put(FieldType.EMAIL, "Email");
		FIELD_LABELS.put(FieldType.ADDRESS, "Address");
		FIELD_LABELS.put(FieldType.COMPANY_NAME, "Company Name");
		FIELD_LABELS.put(FieldType.TAX_ID, "Tax Indentification Number");
		FIELD_LABELS.put(FieldType.BANK_ACCOUNT, "Bank Accunt");
		FIELD_LABELS.put(FieldType.USERNAME, "Username");
		FIELD_LABELS.put(FieldType.PASSWORD, "Password");
		FIELD_LABELS.put(FieldType.SERIAL, "Serial");
		FIELD_LABELS.put(FieldType.NAME, "Name");
		FIELD_LABELS.put(FieldType.DESCRIPTION, "Description");
	}};
	
	public static String getFieldName(FieldType type)
	{
		return FIELD_LABELS.get(type);
	}
}