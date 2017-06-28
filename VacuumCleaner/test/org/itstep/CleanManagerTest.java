package org.itstep;

import static org.junit.Assert.*;

import org.junit.Test;

public class CleanManagerTest {

	@Test
	public void testRoomIsCleanTrue() {
		CleanManager manager = new CleanManager();
		Room room = new Room("testRoom");
		room.setClean(true);
		boolean isClean = manager.roomIsClean(room);
		assertTrue(isClean);
	}
	
	@Test
	public void testRoomIsCleanFalse() {
		CleanManager manager = new CleanManager();
		Room room = new Room("testRoom");
		room.setClean(false);
		boolean isClean = manager.roomIsClean(room);
		assertFalse(isClean);
	}

	@Test
	public void testCleanFlat() {
		CleanManager manager = new CleanManager();
        Flat flat = new Flat();
		
		for(int i=0; i<3; i++){
			Room room = new Room("room"+(i+1));
			room.setClean(false);
			flat.setRoom(room);
					
		}
		long testTime = manager.cleanFlat(flat, 2);
		assertTrue(testTime>=6000 && testTime<=7000);
				
		}


	@Test
	public void testCleanFlatWithNegativeTimeout() {
		CleanManager manager = new CleanManager();
        Flat flat = new Flat();
		
		for(int i=0; i<3; i++){
			Room room = new Room("room"+(i+1));
			room.setClean(false);
			flat.setRoom(room);
					
		}
		boolean thrown = false;
		try{
			long testTime = manager.cleanFlat(flat, -1);
		}catch (IllegalArgumentException e){
			thrown = true;
			
		}
			
	
		assertTrue(thrown);

	}
	@Test
	public void testCleanFlatWithZero() {
		CleanManager manager = new CleanManager();
         Flat flat = new Flat();
		
		for(int i=0; i<2; i++){
			Room room = new Room("room"+(i+1));
			room.setClean(false);
			flat.setRoom(room);
					
		}
		boolean thrown = true;
		try{
			long testTime = manager.cleanFlat(flat, 0);
		}catch (IllegalArgumentException e){
			thrown = true;
			
		}
			
			assertTrue(thrown);
}
}

