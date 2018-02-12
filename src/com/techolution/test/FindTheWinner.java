package com.techolution.test;

public class FindTheWinner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Find The Winner");
		
		try {
			
			System.out.println(winner(new int[] {1,2,3}, new int[] {2,1,3}, "odd"));
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}

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

}
