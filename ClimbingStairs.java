package DynamicProgramming;
import java.util.*;
public class ClimbingStairs {
	private static int CountSteps(int n,int[] memorization) {   //recursive function
		if(n<=1) return 1;
		if(memorization[n]>0) return memorization[n];
		int p1=CountSteps(n-1, memorization);
		int p2=CountSteps(n-2, memorization);
		memorization[n]=p1+p2;
		return p1+p2;
		
	}
	static int climbStairs(int n) {
		int[] memorization=new int[n+1];  //array for storing info so that it will avoid duplicate calls
		int ans=CountSteps(n,memorization);
		return ans;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of Steps:");
		int n=sc.nextInt();
		int res=climbStairs(n);
		System.out.println("possible number of combination of steps count is: "+res);
		

	}

}
