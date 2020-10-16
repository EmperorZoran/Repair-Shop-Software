package com.zoran_jankov.repairq.gui.dialog;

import java.awt.Window;

import javax.swing.JDialog;

import com.zoran_jankov.repairq.data.EntityType;
import com.zoran_jankov.repairq.gui.panel.BasicInfoPanel;
import com.zoran_jankov.repairq.gui.panel.IdPanel;
import com.zoran_jankov.repairq.gui.panel.InputButtonPanel;
import com.zoran_jankov.repairq.gui.text.WindowTitle;

import net.miginfocom.swing.MigLayout;

public class PropertyRegistrationDialog extends JDialog implements InputDialog
{
	private static final long serialVersionUID = 6674166830353586592L;
	private IdPanel idPanel = new IdPanel();
	private BasicInfoPanel propertyPanel = new BasicInfoPanel();
	private InputButtonPanel buttonPanel = new InputButtonPanel();
	
	public PropertyRegistrationDialog(Window owner, EntityType type)
	{
		super(owner);
		
		setResizable(false);
		setTitle(WindowTitle.getNewPropertyTitle(type));
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		getContentPane().setLayout(new MigLayout("", "[434px]", "[20px:n][200px,grow][]"));
		
		getContentPane().add(idPanel, "cell 0 0,grow");
		
		getContentPane().add(propertyPanel, "cell 0 1,grow");
		
		getContentPane().add(buttonPanel, "cell 0 2,grow");
		
		pack();
	}

	@Override
	public IdPanel getIdPanel()
	{
		return idPanel;
	}
	
	public BasicInfoPanel getPropertyPanel()
	{
		return propertyPanel;
	}

	@Override
	public InputButtonPanel getInputButtonPanel()
	{
		return buttonPanel;
	}
}