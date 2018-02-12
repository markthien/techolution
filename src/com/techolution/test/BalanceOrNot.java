package com.techolution.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BalanceOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Balance Or Not");
		
		try {

			System.out.println(Arrays.toString(balanceOrNot(new String[] {"><","<>", ">>>", "<<<<", "><><"}, new int[] {0,0,3,4,2})));
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
	}
	
	static int[] balanceOrNot(String[] expressions, int[] maxReplacement) throws Exception {
		
		List<Integer> returnList = new ArrayList<Integer>();

		for(int x = 0;x<expressions.length;x++) {

			List<String> list = new ArrayList<String>(Arrays.asList(expressions[x].split("")));
			
			int count = 0, listSizeLessOne = list.size() - 1;
			
			for(int y = 0;y<list.size();y++) {
				
				if(list.get(y).equals("<") && (y < listSizeLessOne) && list.get(y + 1).equals(">")) {
				
					y = y + 1;

					if(y >= listSizeLessOne) {
						
						returnList.add(1);

						break;
						
					} else {
						
						continue;
					
					}
					
				}
				
				if(maxReplacement[x] == 0) {
							
					returnList.add(0);
					
					break;
					
				}
				
				count++;
				
				if(count >= maxReplacement[x] && y < listSizeLessOne) {

					returnList.add(0);
					
					break;

				}

				if((y == listSizeLessOne)) {

					if(count <= maxReplacement[x]) {
						
						returnList.add(1);
						
					} else {
						
						returnList.add(0);
						
					}
					
				}				
				
			}
			
		}
		
		return returnList.stream().mapToInt(Integer::intValue).toArray();
		
	}

}
