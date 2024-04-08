package realEstate;

public class Villa extends House {

	private boolean pool;

	//getters-setters
	public boolean hasPool() {
		return pool;
	}

	public void setPool(boolean pool) {
		this.pool = pool;
	}

	//constructor
	public Villa(int surface, int rooms, boolean pool) {
		super(surface, rooms);
		this.pool = pool;
	}
	
	@Override
	public int cost() 
	{
		int poolModifier = 0;
		int roomsModifier = 0;
		
		if (this.hasPool())
		{
			poolModifier = 20000;
		}
		
		if (this.getRooms() >= 10)
		{
			roomsModifier = 10000;
		}
		
		return this.getSurface() * 2000 + poolModifier + roomsModifier;
	}
	
}
