package de.tuberlin.aipa.prog2.listenerPattern;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		Office office = new Office();

		Employee john = new Employee("John");
		Employee sandra = new Employee("Sandra");
		
		office.openDoor();
		
		office.addListener(sandra);
		office.addListener(john);

		

		Thread.sleep(3000);

		office.closeDoor();
		
		office.removeListener(sandra);
		office.removeListener(john);

	}

}
