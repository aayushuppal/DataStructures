/* 0-1 knapsack - dynamic approach
			|0 									if i=0 || j=0;
p[i,j]  =	|p[i-1,j] 							if w[i] > j;
			|max{p[i-1,j], p[i]+p[i-1,j-w[i]]}	if w[i]<=j; 
*/

public class knapsack {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] val = {10,22,12,24,36};
		int[] wt = {2,7,8,4,12};
		int kcap = 20;
		System.out.println("maximize the value in given kcap constraint");
		

	}

}
