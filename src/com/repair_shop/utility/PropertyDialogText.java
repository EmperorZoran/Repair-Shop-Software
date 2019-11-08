package com.repair_shop.utility;

public class PropertyDialogText
{
	public static String TITLE;
	public static String ID_LABEL;
	public static String NAME_LABEL;
	public static String DESCRIPTION_LABEL;
	public static String ADD_BUTTON;
	public static String CANCEL_BUTTON;
	public static String NAME_ERROR;
	
	
	public static void loadText(DataType dataType)
	{
		if(DataType.isAMatketingType(dataType))
		{
			loadMarketingTypeText();
		}
		
		if(dataType == DataType.DEVICE_TYPE)
		{
			loadDeviceTypeText();
		}
		
	}
	private static void loadDeviceTypeText()
	{
		TITLE = "Device Type Registration Form";
		ID_LABEL =  "Device type ID";
		NAME_LABEL = "* Device type Name";
		DESCRIPTION_LABEL = "  Device type Description";
		ADD_BUTTON = "Add";
		CANCEL_BUTTON = "Cancel";
		NAME_ERROR = "<html><font size='2' color='red'>Please enter a uniqe name for new device type</font></html>";
	}
	
	private static void loadMarketingTypeText()
	{
		TITLE = "Marketing Type Registration Form";
		ID_LABEL =  "Marketing type ID";
		NAME_LABEL = "* Marketing type Name";
		DESCRIPTION_LABEL = "  Marketing type Description";
		ADD_BUTTON = "Add";
		CANCEL_BUTTON = "Cancel";
		NAME_ERROR = "<html><font size='2' color='red'>Please enter a uniqe name for new marketing type</font></html>";
	}
}