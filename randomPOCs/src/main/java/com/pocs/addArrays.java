package com.pocs;

import java.util.ArrayList;
import java.util.List;

public class addArrays {

	public static int addEverything(String str) {
		String split[] = str.split(",");
		ArrayList<Integer> numbers = new ArrayList<Integer>();

		for (String s : split) {
			StringBuilder sb = new StringBuilder();
			char arr[] = s.toCharArray();

			for (char c : arr) {
				if (Character.isDigit(c))
					sb.append(c);
			}
			if (sb.length() != 0) {
				numbers.add(Integer.parseInt(sb.toString()));
			}
		}
		int result = 0;
		for (Integer n : numbers) {
			result = result + n;
		}
		return result;
	}

	public static int addLists(List l) {
		int result=0;
		if (l.isEmpty())
			return -1;
		else {
			Object obj = l.get(0);
			if (obj.getClass() == ArrayList.class) {
				l.remove(0);
				for (Object n : (ArrayList<Integer>) obj) {
					if (n.getClass() == ArrayList.class) {
						addLists(l);
					}
					else if(n.getClass() == Integer.class){
						result = ((Integer) n).intValue();
						int temp = addLists(l);
						if(temp == -1)
							result += result;
					}
				}
				return result;
			} else if (obj.getClass() == Integer.class) {
				result = ((Integer) obj).intValue();
				l.remove(0);
				result += addLists(l);
				return result;
			}
		}
		return result;
	}

	public static int addListsTwo(List l) {
		int result=0;
		for(Object obj : l) {
			if(obj.getClass() == Integer.class) {
				result+= ((Integer)obj).intValue();
			}
			else if(obj.getClass() == ArrayList.class) {
				result += addListsTwo((List)obj);
			}
		}
		return result;
	}
	
	public static void main(String[] args) {
//		String str = "[1,3,abc,[22,4,false,0]]";
		String str = "[[[[[[[[[1]]]]]]],1]";

		List<Object> l = new ArrayList<Object>();
		List<Object> inner = new ArrayList<Object>();

		inner.add(1);
		inner.add(2);
		inner.add(3);

		l.add(5);
		l.add(6);
		l.add(inner);

		System.out.println(addListsTwo(l));

		// System.out.println(addEverything(str));
	}
}
