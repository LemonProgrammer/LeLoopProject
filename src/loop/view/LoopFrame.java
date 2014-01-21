package loop.view;

import javax.swing.JFrame;

import loop.controller.LoopController;

/**
 * Main GUI framework for the Loop Project.
 * @author fernando blanco.
 *@version 1.0 11/5/2013
 */
public class LoopFrame extends JFrame
{
	/**
	 * The referenced controller object.
	 */
	private LoopController baseController;
	
	/**
	 * The applications main panel for GUI.
	 */
	private LoopPanel basePanel;
	
	
	/**
	 * Creats a LoopFrame object with a linked loopController for the MVC paradigm.
	 * @param baseController
	 */
	public LoopFrame(LoopController baseController)
	{
		this.baseController = baseController;
		basePanel = new LoopPanel(baseController);
		
		setupFrame();
	}
	
	/**
	 * sets the content, size and visibility of the frame.
	 */
	private void setupFrame()
	{
		this.setContentPane(basePanel);
		this.setSize(450, 450);
		this.setVisible(true);
	}
}
