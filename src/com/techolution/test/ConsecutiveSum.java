package com.techolution.test;

public class ConsecutiveSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Consecutive Sum");
		
		try {
			
			System.out.println(consecutive(15));
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		
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
