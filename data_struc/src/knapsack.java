/* 0-1 knapsack - dynamic approach
			|0 									if i=0 || j=0;
p[i,j]  =	|p[i-1,j] 							if w[i] > j;
			|max{p[i-1,j], p[i]+p[i-1,j-w[i]]}	if w[i]<=j; 
*/

public class knapsack {

	
	public static void main(String[] args) {
		int[] val = {10,22,12,24,36};
		int[] wt = {2,7,8,4,12};
		int kcap = 20;
		val = skipByOne(val);
		wt = skipByOne(wt);
		System.out.println("maximize the value in given kcap constraint");
		int[][] P = new int[val.length][kcap+1];
		for (int i=0; i<val.length; i++){
			for (int j=0; j<=kcap; j++){
				if (i==0 || j==0){
					P[i][j] = 0;
				}
				else if(wt[i]>j){
					P[i][j] = P[i-1][j];
				}
				else{
					P[i][j]= maxOf(P[i-1][j], val[i]+P[i-1][j-wt[i]]);
				}
			}
		}
		System.out.println(P[val.length-1][kcap]);

	}

	public static int[] skipByOne(int[] a){
		int last = a.length;
		int[] temp = new int[last+1];
		temp[0]=0;
		int i=1;
		for(int x:a){
			temp[i] = x;
			i++;
		}
		return temp;
	}
	public static int maxOf(int a, int b){
		if (a>=b){
			return a;
		}
		else{
			return b;
		}
	}
}
