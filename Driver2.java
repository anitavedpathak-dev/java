package com.kodewala.arrays1;

public class Driver2 {

	public static void main(String[] args) 
	{
		User user1 = new User("kodewala", "9876432153");
		User user2 = new User("Shubham", "9876432003");
		User user3 = new User("Rutuja", "9876437890");
		User user4 = new User("Pooja", "98764324567");
		User user5 = new User("Anuhya", "9876431234");
		
		//store user objects in an array.
		User users[] = new User[5];
		
		users[0] = user1;
		users[1] = user2;
		users[2] = user3;
		users[3] = user4;
		users[4] = user5;
		
		System.out.println(users);
		
	}

}
