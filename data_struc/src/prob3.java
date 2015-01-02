/* Given two strings, write a method to decide if one is a permutation of the other
Aayush Uppal - http://uppalaayush.wordpress.com/profile */
import java.util.*;

public class prob3{
	
	public static void main(String[] args){
	prob3 pobj = new prob3();
	Scanner inp = new Scanner(System.in);	
	
	String St1 = inp.nextLine();
	String St2 = inp.nextLine();
	
	inp.close();
	System.out.println(pobj.CheckPerm(St1,St2));
	
	}
	
	public boolean CheckPerm(String a, String b){
	boolean otpt = false;	
	return otpt;	
	}
	
	
}