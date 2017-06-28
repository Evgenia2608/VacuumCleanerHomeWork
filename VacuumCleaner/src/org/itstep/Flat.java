package org.itstep;

import java.util.ArrayList;

public class Flat {
	
	private ArrayList<Room> rooms = new ArrayList<>();
	
	public void setRoom(Room room){
		this.rooms.add(room);
	}


	public ArrayList<Room> getRooms() {
		return rooms;
	}
	

}
