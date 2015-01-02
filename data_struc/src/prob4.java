/* Write a method to replace all spaces in a string with '%20'. You may assume that the
string has sufficient space at the end of the string to hold the additional characters,
and that you are given the "true" length of the string. (Note: if implementing in Java,
please use a character array so that you can perform this operation in place.) */

import java.util.Scanner;
import java.util.ArrayList;

public class prob4{

	public static void main(String[] args){
	Scanner inp = new Scanner(System.in);
	String str1 = inp.nextLine();
	inp.close();
	
	ArrayList<Character> aL = new ArrayList<Character>();
	for (int i = 0; i<str1.length(); i++){
	aL.add(str1.charAt(i));	
	}
	
	int len = aL.size();

		for (int i=0; i<len; i++){
			if ((int) aL.get(i) == 32){
			len = len+2;
			aL.add('0');
			aL.add('0');
				for (int j=len-1; j>i+2; j--){
				aL.add(j, aL.get(j-2));
				}
			aL.add(i, '%');
			aL.add(i+1, '2');
			aL.add(i+2, '0');
			}
		}
		
	System.out.println(aL);	
	
	}

}

