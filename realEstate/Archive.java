package realEstate;

import java.util.ArrayList;

public class Archive {
	
	private ArrayList <House> Houses = new ArrayList <House>();
	
	public int averageCost (int minSurface)
	{
		int sum = 0; //sums the cost of all the houses that surpass the minimum surface inputted, used for the average calc
		int count = 0; //counts how many houses surpass the minimum surface inputted, used for the average calc
		
		for (House H : Houses) 
		{
			if (H.getSurface() > minSurface)
			{
				count ++;
				sum = sum + H.cost();
			}
		}
	
		int avg = sum / count;
		
		return avg;
	}
	
	//Test Zone
	public static void main(String[] args) {
		
		Archive V = new Archive();
		
		Apartment H = new Apartment(600, 4, 2);
		Apartment G = new Apartment(700, 6, 3);
		Apartment J = new Apartment(800, 7, 4);

		Villa B = new Villa(1000, 11, true);
		Villa N = new Villa(1200, 14, true);

		V.Houses.add(H);
		V.Houses.add(G);
		V.Houses.add(J);

		V.Houses.add(B);
		V.Houses.add(N);
		
		System.out.println (H.cost());
		System.out.println (G.cost());
		System.out.println (J.cost());
		System.out.println (B.cost());
		System.out.println (N.cost());

		System.out.println(V.averageCost(790));


	}
}
