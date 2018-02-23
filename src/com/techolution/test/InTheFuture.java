package com.techolution.test;

public class InTheFuture {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("In The Future");
		
		try {
			
			System.out.println(minNumOfDay(new int[] {3,5,1}));
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}

	}
	
	static int minNumOfDay(int[] num) throws Exception {
		
		return num[0] + 1 - num[1] + 1 + num[2];
		
	}

}
