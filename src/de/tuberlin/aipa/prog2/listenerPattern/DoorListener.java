package de.tuberlin.aipa.prog2.listenerPattern;

import java.util.EventListener;

public interface DoorListener extends EventListener {
	
	public void doorOpens(DoorOpenedEvent event);
	
	public void doorCloses(DoorClosedEvent event);

}
