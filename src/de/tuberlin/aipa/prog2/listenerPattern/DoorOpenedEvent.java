package de.tuberlin.aipa.prog2.listenerPattern;

import java.util.EventObject;

public class DoorOpenedEvent extends EventObject {

	public DoorOpenedEvent(Object source) {
		super(source);
		// TODO Auto-generated constructor stub
		System.out.println("boss cheng enters");
	}

}
