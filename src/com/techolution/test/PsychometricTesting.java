package com.techolution.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PsychometricTesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Psychometric Testing");
		
		try {

			System.out.println(Arrays.toString(jobOffers(new int[] {4,8,7}, new int[] {2,4}, new int[] {8,4})));
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}

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

}
