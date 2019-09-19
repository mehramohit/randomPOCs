package com.recursion;

import java.util.Arrays;

public class NumPalindrome {

	public static boolean palindromeCheck(int number) {
		String num = String.valueOf(number);

		return checkString(num);
	}

	public static boolean checkString(String s) {
		char numArr[] = s.toCharArray();

		if (numArr.length > 1) {
			if (numArr[0] != numArr[numArr.length - 1])
				return false;
			else {
				char temp[] = Arrays.copyOfRange(numArr, 1, (numArr.length - 1));
				if (temp.length > 1)
					return checkString(String.valueOf(temp));
			}
		}
		return true;
	}

	public static void main(String[] args) {
		System.out.println(palindromeCheck(2022456202));
	}
}
