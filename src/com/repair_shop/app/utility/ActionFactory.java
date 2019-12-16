package com.repair_shop.app.utility;

import java.awt.event.ActionListener;

import com.repair_shop.app.action.CloseWindow;
import com.repair_shop.app.action.Login;
import com.repair_shop.app.action.OpenWindow;
import com.repair_shop.app.action.SaveData;
import com.repair_shop.app.controller.InputDialogController;
import com.repair_shop.app.controller.LoginDialogController;
import com.repair_shop.app.controller.WindowController;
import com.repair_shop.data.DataType;

/**
 * The ActionFactory class is a factory for action listeners.
 * 
 * @author Zoran Jankov
 *
 */
public class ActionFactory
{
	/**
	 * Returns new SaveData ActionListener
	 * @param controller - InputDialogController
	 * @return new SaveData ActionListener
	 */
	public static ActionListener saveData(InputDialogController controller)
	{
		return new SaveData(controller);
	}
	
	/**
	 * Returns new OpenWindow ActionListener
	 * @param owner - Window owner of the new window
	 * @param dataType - DataType enum 
	 * @return new OpenWindow ActionListener
	 */
	public static ActionListener openWindow(WindowController owner, DataType dataType)
	{
		return new OpenWindow(owner, dataType);
	}
	
	/**
	 * Returns new OpenWindow ActionListener
	 * @param window - WindowTag of the new window
	 * @return new OpenWindow ActionListener
	 */
	public static ActionListener openWindow(WindowTag window)
	{
		return new OpenWindow(window);
	}
	
	/**
	 * Returns new CloseWindow ActionListener
	 * @param controller - WindowController
	 * @return new CloseWindow ActionListener
	 */
	public static ActionListener closeWindow(WindowController controller)
	{
		return new CloseWindow(controller);
	}
	
	/**
	 * Returns new Login ActionListener
	 * @param controller - LoginDialogController
	 * @return new Login ActionListener
	 */
	public static ActionListener login(LoginDialogController controller)
	{
		return new Login(controller);
	}
}