/* Write a method to replace all spaces in a string with '%20'. You may assume that the
string has sufficient space at the end of the string to hold the additional characters,
and that you are given the "true" length of the string. (Note: if implementing in Java,
please use a character array so that you can perform this operation in place.) */

import java.util.Scanner;
import java.util.ArrayList;

public class prob4{

	public static void main(String[] args){
	System.out.println("input string");
	Scanner inp = new Scanner(System.in);
	String str1 = inp.nextLine();
	inp.close();
	int count = 0;
	
	char[] cArr = str1.toCharArray();
	int len = cArr.length -1;
	
	ArrayList<Integer> aiL = new ArrayList<Integer>();
	
	
	for(int i=0; i<=len; i++){
		if((int)cArr[i] == 32){
			count++;
			aiL.add(i);
		}
	}
	
	int newlen = len + 2*count;
	char[] cArrN = new char[newlen+1];
	
	System.arraycopy(cArr, 0, cArrN, 0, cArr.length);
	count = 0;
	for(int x:aiL){
		if (count > 0){
			x = x+2;
		}
		for(int j=len; j>=x+1; j--){
			cArrN[j+2] = cArrN[j];
		}
		cArrN[x] = '%';
		cArrN[x+1] = '2';
		cArrN[x+2] = '0';
		len = len+2;
		count++;
	}
	
	
	String gh = new String(cArrN);
	System.out.println(gh);	
	
	}

}

