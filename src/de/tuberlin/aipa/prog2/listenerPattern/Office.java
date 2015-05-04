package de.tuberlin.aipa.prog2.listenerPattern;

import javax.swing.event.EventListenerList;


public class Office {
	
	// this is a List of all Listeners 
	private EventListenerList listeners = new EventListenerList();
	
	public Office(){
		
	}
	
	public void addListener(DoorListener listener){
		// TODO
		listener.doorOpens(null);
	}
	
	public void removeListener(DoorListener listener){
		// TODO
		listener.doorCloses(null);
	}
	
	public void openDoor(){
		this.notifyDoorOpened(new DoorOpenedEvent(this));
	}
	
	public void closeDoor(){
		this.notifyDoorClosed(new DoorClosedEvent(this));
	}
	
	protected synchronized void notifyDoorOpened( DoorOpenedEvent event )
	  {
	    // TODO
	  }
	
	protected synchronized void notifyDoorClosed( DoorClosedEvent event )
	  {
	    // TODO
		System.out.println("boss verlässt den raum");
	  }
}
