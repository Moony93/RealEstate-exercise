package realEstate;

public abstract class House {
	
	private int surface;
	private int rooms;
	
	
	//getters - setters
	public int getSurface() {
		return surface;
	}

	public void setSurface(int surface) {
		this.surface = surface;
	}

	public int getRooms() {
		return rooms;
	}

	public void setRooms(int rooms) {
		this.rooms = rooms;
	}

	//Constructor
	public House(int surface, int rooms) {
		super();
		this.surface = surface;
		this.rooms = rooms;
	}

	//methods
	public abstract int cost();
	
}
