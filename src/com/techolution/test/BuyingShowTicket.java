package com.techolution.test;

public class BuyingShowTicket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Buying Show Ticket");
		
		try {
			
			System.out.println(waitingTime(new int[] {5,5,2,3}, 3));
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
	}
	
	static int waitingTime(int[] tickets, int p) throws Exception { 
		
		int maxNumPeople = 100000;
		int maxNumTicketPerPerson = 1000000000;	
		
		if(p > tickets.length -1) {
			
			throw new Exception("Jesse is large than array length exception");
			
		}
		
		if(tickets.length > maxNumPeople) {
			
			throw new Exception("Exceed maximum number of people exception");
			
		}	
		
		if(tickets.length < 1) {
			
			throw new Exception("At least 1 people must be in the queue exception");
			
		}	
		
		int totalNumOfSecToGetAllTicket = 0;
		
		for(int i = 0;i < tickets.length;i++) {
			
			if(tickets[i] > maxNumTicketPerPerson) {
				
				throw new Exception("Exceed maximum number of ticket per person exception");
				
			}				
			
			for(int j = 0;j < tickets.length;j++) {		
				
				if(tickets[j] == 0) {
					
					continue;
					
				}
				
				tickets[j] = tickets[j] - 1;			
				
				totalNumOfSecToGetAllTicket++;
				
				if(j == p && tickets[j] == 0) {
					
					return totalNumOfSecToGetAllTicket;
					
				}															
				
			}
			
		}
		
		return totalNumOfSecToGetAllTicket;
		
	}

}
