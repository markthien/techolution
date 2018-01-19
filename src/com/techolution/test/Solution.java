package com.techolution.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			
			System.out.println("Consecutive");
			System.out.println(consecutive(15));
			System.out.println("====================");
			
			System.out.println("WaitingTime");
			System.out.println(waitingTime(new int[] {5,5,2,3}, 3));
			System.out.println("====================");			
			
			System.out.println("Winner");
			System.out.println(winner(new int[] {1,2,3}, new int[] {2,1,3}, "odd"));
			System.out.println("====================");
			
			System.out.println("JobOffers");
			System.out.println(Arrays.toString(jobOffers(new int[] {4,8,7}, new int[] {2,4}, new int[] {8,4})));
			System.out.println("====================");	
			
			System.out.println("minNum");
			System.out.println(minNum(3,5,1));
			System.out.println("====================");				
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	static int minNum(int A, int K, int P) throws Exception {
		
		return A + 1 - K + 1 + P;
		
	}
	
	static int[] jobOffers(int[] score, int[] lowerLimits, int[] upperLimits) throws Exception {
		
		int minArrayScoreSize = 1, maxArrayScoreSize = 100000;	
		
		if(score.length < minArrayScoreSize || score.length > maxArrayScoreSize) {
			
			throw new Exception("invalid  array length exception");
			
		}
		
		List<Integer> myList = new ArrayList<Integer>();
		

		for(int j = 0;j < lowerLimits.length;j++) {
				
			int withinLimit = 0;

			for(int i = 0;i < score.length;i++) {

				if(score[i] >= lowerLimits[j] && score[i] <= upperLimits[j]) {
							
					withinLimit++;
						
				}
							
			}
				
			if(withinLimit > 0) {
					
				myList.add(withinLimit);
					
			}

		}
			
		return myList.stream().mapToInt(Integer::intValue).toArray();
		
	}
	
	static String winner(int[] andrea, int[] maria, String s) throws Exception { 
		
		int minArraySize = 2, maxArraySize = 100000;
		int andreaPoint = 0, mariaPoint = 0;
		
		if(andrea.length < minArraySize || andrea.length > maxArraySize ||
				maria.length < minArraySize || maria.length > maxArraySize) {
			
			throw new Exception("invalid  array length exception");
			
		}		
		
		for(int a = 0;a < andrea.length;a++) {
			
			if(s.toLowerCase().equals("even") && a%2 != 0) {
				
				continue;
				
			}
			
			if(s.toLowerCase().equals("odd") && a%2 != 1) {
				
				continue;
				
			}			
			
			for(int m = 0;m < maria.length;m++) {
				
				if(s.toLowerCase().equals("even") && m%2 != 0) {
					
					continue;
					
				}
				
				if(s.toLowerCase().equals("odd") && m%2 != 1) {
					
					continue;
					
				}	
				
				andreaPoint = andreaPoint + andrea[a] - maria[m];
				mariaPoint = mariaPoint + maria[a] - andrea[m];				
				
			}
			
		}
		
		return andreaPoint>mariaPoint?"Andrea":"Maria";
		
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
	
	static int consecutive(long num) throws Exception { 
		
		long constraint = 1000000000000L;
		
		if(num < 3) {
			
			throw new Exception("Number to small exception");
			
		}
		
		if(num > constraint) {
			
			throw new Exception("Number to large exception");
			
		}
		
		int numWay = 0;
		
		for(long i = 1;i < (num - 2);i++) {
			
			long res = i;
			
			for(long j = i+1;j < (num - 2);j++) {
				
				res = res + j;
				
				//System.out.println("res = "  +res);				
				
				if(res == num) {
					
					numWay++;

					break;
					
				} 
				
				if(res > num) {
					
					break;
					
				} 				
			
			}
			
		}

		return numWay;
		
	}

}
