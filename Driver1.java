package com.kodewala.loops;

public class Driver1 {

	public static void main(String[] args) 
	
	{
		// create an array which will store city name--> "
		String cities[] = new String[7];
		//storing the cities
		cities[0] = "Bangalore";
		cities[1] = "Chennai";
		cities[2] = "Srinagar";
		cities[3] = "Mumbai";
		cities[4] = "Delhi";
		cities[5] = "surat";
		cities[6] = "simla";
		
		for (int index=0; index < cities.length; index++)
		{
			if(cities[index].startsWith("S"))
			{
				System.out.println(" city starting with 's' : +cities[index]");
			}
		}
	}

}

