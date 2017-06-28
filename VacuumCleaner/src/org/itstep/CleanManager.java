package org.itstep;

public class CleanManager {

	public boolean roomIsClean(Room room){
		return room.isClean();
		
	}

	public long cleanFlat(Flat flat, long timeToCleanOneRoom){
		long startClean = System.currentTimeMillis();
		for(Room room : flat.getRooms()){
			if(room.isClean()){
				continue;
			} else{
				Thread thread = new Thread();
				try {
					thread.sleep(timeToCleanOneRoom*1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				room.setClean(true);
			}
			
		}
		
		long endClean = System.currentTimeMillis();
		return endClean - startClean;
		
	}
}

