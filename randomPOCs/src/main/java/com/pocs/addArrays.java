package com.pocs;

import java.util.ArrayList;

public class addArrays {

	public static int addEverything (String str) {
		String split[] = str.split(",");
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		
		for (String s : split) {
			StringBuilder sb = new StringBuilder();
			char arr[] = s.toCharArray();
			
			for (char c : arr) {
				if(Character.isDigit(c))
					sb.append(c);
			}
			if(sb.length() != 0) {
				numbers.add(Integer.parseInt(sb.toString()));
			}
		}
		int result=0;
		for(Integer n : numbers) {
			result = result + n;
		}
		return result;
	}
	public static void main(String[] args) {
//		String str = "[1,3,abc,[22,4,false,0]]";
		String str = "[[[[[[[[[1]]]]]]],1]";
		
		System.out.println(addEverything(str));
	}
}
