package loop.view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SpringLayout;

import loop.controller.LoopController;
import loop.model.Looper;
/**
 * Panel for the loop project.
 * @author fbla1201
 *@version 1.1 11/5/2013 Basic framework, setupPanel, setupListne
 */
public class LoopPanel extends JPanel
{
	private LoopController baseController;
	private JButton funButton;
	private SpringLayout baseLayout;
	private JTextArea loopTextArea;
	private JScrollPane textPane;
	
	/**
	 * Creates a LoopPanel object liked via the controller for the MVC paradigm.
	 * @param baseController the linked controller object.
	 */
	public LoopPanel(LoopController baseController)
	{
		this.baseController = baseController;
		
		baseLayout = new SpringLayout();
		loopTextArea = new JTextArea(10, 20);
		textPane = new JScrollPane(loopTextArea);
		funButton = new JButton("Click the fun button!");
		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	/**
	 * Adds all components to the panel, sets color and component settings.
	 */
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.setBackground(new Color(120, 180, 12));
		this.add(funButton);
		this.add(textPane);
		//		add(loopTextArea);
		loopTextArea.setWrapStyleWord(true);
		loopTextArea.setLineWrap(true);
		loopTextArea.setEditable(false);
		
	}


	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.NORTH, funButton, 32, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, funButton, 32, SpringLayout.EAST, loopTextArea);
		
		baseLayout.putConstraint(SpringLayout.WEST, loopTextArea, 10, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.EAST, loopTextArea, -203, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, loopTextArea, 10, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, loopTextArea, -122, SpringLayout.SOUTH, this);

	}
	
	private void setupListeners()
	{
		funButton.addActionListener( new ActionListener()
		{
		
			public void actionPerformed(ActionEvent click)
			{
				loopTextArea.append(baseController.getLoopResults());
			}
			
		});
		
	}
}
