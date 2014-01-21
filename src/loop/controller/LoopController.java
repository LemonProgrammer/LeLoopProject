package loop.controller;

import loop.model.Looper;
import loop.view.LoopFrame;

/**
 * Controller object for the loop project.
 * @author fernando blanco.
 *@version 1.0 added data members and start method.
 */
public class LoopController
{
	private LoopFrame funFrame;
	private Looper myLilLooper;
	private int clickCount;
	/**
	 * Starts the application.
	 */
	public LoopController()
	{
		this.myLilLooper = new Looper();
		
	}	
	
	/**
	 * @return the funFrame
	 */
	public LoopFrame getFunFrame()
	{
		return funFrame;
	}

	/**
	 * @param funFrame the funFrame to set
	 */
	public void setFunFrame(LoopFrame funFrame)
	{
		this.funFrame = funFrame;
	}

	public String getLoopResults()
	{
		String currentResults = loopOverList();
		clickCount--;
		loopOverList();
		return currentResults;

	}
	
	private String loopBackwardOverList()
	{
		String loopedData = "";
		
		for(int position = myLilLooper.getGraveNameList().size() -1; position >= 0; position--)
		{
			loopedData += myLilLooper.getGraveNameList().get(position) + "\n";
		}
		return loopedData;
	}
	
	private String loopOverList()
	{
		String loopedData = "";
		
		for(int position = 0; position < myLilLooper.getGraveNameList().size(); position++)
		{
			loopedData += myLilLooper.getGraveNameList().get(position) + "\n";
		}
		
		return loopedData;
	}

	public void start()
	{
		funFrame = new LoopFrame(this);
	}

	/**
	 * @return the myLilLooper
	 */
	public Looper getMyLilLooper()
	{
		return myLilLooper;
	}
	
	private String getText(int position)
	{
		String results = "";
		
		if(position > -1 && position < myLilLooper.getGraveNameList().size())
		{
			
		
		results = myLilLooper.getGraveNameList().get(position);
		}
		return results;
	}
	
	public void setMyLilLooper(Looper myLilLooper)
	{
		this.myLilLooper = myLilLooper;
	}

	/**
	 * @param myLilLooper the myLilLooper to set
	 */

	
	
}
