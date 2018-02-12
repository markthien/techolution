package com.techolution.test;

public class InTheFuture {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("In The Future");
		
		try {
			
			System.out.println(minNumOfDay(3,5,1));
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}

	}
	
	static int minNumOfDay(int A, int K, int P) throws Exception {
		
		return A + 1 - K + 1 + P;
		
	}

}
