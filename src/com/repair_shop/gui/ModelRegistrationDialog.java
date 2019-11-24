package com.repair_shop.gui;

import java.awt.Window;
import java.awt.event.ActionListener;

import javax.swing.JDialog;

import net.miginfocom.swing.MigLayout;

public class ModelRegistrationDialog extends JDialog implements InputDialog
{
	private static final long serialVersionUID = 9140297212046754823L;
	private IdPanel idPanel = new IdPanel();
	private ModelPanel modelPanel = new ModelPanel();
	private PropertyPanel propertyPanel = new PropertyPanel();
	private InputButtonPanel buttonPanel = new InputButtonPanel();

	public ModelRegistrationDialog(Window owner)
	{
		super(owner);
		getContentPane().setLayout(new MigLayout("", "[434px]", "[20px:n][][200px:n][]"));
		getContentPane().add(idPanel, "cell 0 0,grow");
		getContentPane().add(modelPanel, "cell 0 1,grow");
		getContentPane().add(propertyPanel, "cell 0 2,grow");
		getContentPane().add(buttonPanel, "cell 0 3,grow");
	}

	@Override
	public void setIdValue(String id)
	{
		
	}

	@Override
	public void setBtnAddActionListener(ActionListener listener)
	{
		
	}

	@Override
	public void setBtnCancelActionListener(ActionListener listener)
	{
		
	}
}