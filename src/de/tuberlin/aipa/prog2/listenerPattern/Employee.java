package de.tuberlin.aipa.prog2.listenerPattern;

public class Employee implements DoorListener// TODO make employees Listener
{
	String name;
	
	// for testing
	private boolean working = false;
	private boolean playing = false;
	
	public Employee(String name) {
		this.name = name;
	}
	
	void isWorking(boolean isWorking) {	
		this.working = isWorking;
		if (isWorking)
			System.out.println(name +" starts working panically ..."); 
	}	
	
	void isPlayingSolitaire(boolean isPlaying) {
		playing = isPlaying;
		if (isPlaying)
			System.out.println(name +" is playing Solitaire ..."); 
	}

	public boolean isPlaying() {
		
		return playing;
	}

	public boolean isWorking(){
		return working;
	}
	
	public void doorOpens(DoorOpenedEvent event){
		isWorking(true);
		isPlayingSolitaire(false);
	}
	
	public void doorCloses(DoorClosedEvent event){
		isWorking(false);
		isPlayingSolitaire(true);
		
	}

}
