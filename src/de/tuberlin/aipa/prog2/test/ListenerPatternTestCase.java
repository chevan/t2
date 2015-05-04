package de.tuberlin.aipa.prog2.test;

import java.util.ArrayList;

import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

import de.tuberlin.aipa.prog2.listenerPattern.Employee;
import de.tuberlin.aipa.prog2.listenerPattern.Office;

public class ListenerPatternTestCase {
	private static Office office;
	private static ArrayList<Employee> employees = new ArrayList<Employee>();
	
	@BeforeClass
	public static void setup(){
		office = new Office();
		employees.add(new Employee("Umair"));
		employees.add(new Employee("Georgios"));
		employees.add(new Employee("Niklas"));
		for(Employee e : employees){
			office.addListener(e);
		}
	}

	@Test
	public void testOpenDoor() {
		office.openDoor();
		for(Employee e : employees){
			assertEquals(true, e.isWorking());
		}
		}
		@Test
		public void testOpenDoor1() {
			office.openDoor();
			for(Employee e : employees){
				
				assertEquals(false, e.isPlaying());
			}
	
	}
	

}
