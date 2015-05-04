package de.tuberlin.aipa.prog2.listenerPattern;

import java.util.Calendar;
import java.util.Date;
import java.util.EventObject;

public class DoorClosedEvent extends EventObject {
	
	private Date timestamp;

	public DoorClosedEvent(Object source) {
		super(source);

		// set the timestamp
		this.timestamp = Calendar.getInstance().getTime();
		
	}

}
