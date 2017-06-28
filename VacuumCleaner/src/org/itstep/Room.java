package org.itstep;

public class Room {
	private String name;
	private boolean isClean;
	
	

	public boolean isClean() {
		return isClean;
	}

	public void setClean(boolean isClean) {
		this.isClean = isClean;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
		}
	public Room(String name){
		super();
		this.name=name;
	}
	
public Room(){
	
}
}


