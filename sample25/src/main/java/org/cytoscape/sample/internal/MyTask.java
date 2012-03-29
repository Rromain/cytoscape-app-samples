package org.cytoscape.sample.internal;

import org.cytoscape.work.AbstractTask;
import org.cytoscape.work.TaskMonitor;
import org.cytoscape.view.model.CyNetworkView;

public class MyTask extends AbstractTask {

	private CyNetworkView view;
	public MyTask(CyNetworkView view){
		this.view = view;
	}
	
    @Override
	public void run(final TaskMonitor taskMonitor) {
		// Give the task a title.
		taskMonitor.setTitle("My task");

		taskMonitor.setProgress(0.1);
		
		try {
			// Do something here with the view
			
			Thread.sleep(4000);
		}
		catch ( InterruptedException e){
		}
		taskMonitor.setProgress(1.0);
    }
}