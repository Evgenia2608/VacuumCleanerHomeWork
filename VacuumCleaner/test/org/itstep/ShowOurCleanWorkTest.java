package org.itstep;

import static org.junit.Assert.*;

import org.junit.Test;

public class ShowOurCleanWorkTest {

	@Test
	public void testgetTimeInSeconds() {
	
		RobotCleaner robot = new RobotCleaner();
		robot.setModel("T1000");
		robot.setSpendSecondsToClean(5);
		
		Flat flat = new Flat();
		
		for(int i=0; i<5; i++){
			Room room = new Room("room"+(i+1));
			room.setClean(false);
			if(i%3==0){
				room.setClean(true);
				
			}
			flat.setRoom(room);
		}
		
		CleanManager manager = new CleanManager();
		long spendedTime = manager.cleanFlat(flat, robot.getSpendSecondsToClean());
		
		System.out.println("Robot model: "+ robot.getModel()+ " finished clean after " +getTimeInSeconds(spendedTime) + " seconds");

	}
	
	
		public static String getTimeInSeconds(long spendedTime) {
			return String.valueOf(spendedTime/1000);
		
	}
}
