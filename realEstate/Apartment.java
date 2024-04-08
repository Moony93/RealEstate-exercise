package realEstate;

public class Apartment extends House {

	private int energyCode;

	//getters - setters
	public int getEnergyCode() {
		return energyCode;
	}

	public void setEnergyCode(int energyCode) {
		this.energyCode = energyCode;
	}

	//constructors
	public Apartment(int surface, int rooms, int energyCode) {
		super(surface, rooms);
		this.energyCode = energyCode;
	}
	
	@Override
	public int cost() 
	{
		return (this.getSurface() * 1500) + (this.getRooms() * this.getEnergyCode());
	}
	
}
