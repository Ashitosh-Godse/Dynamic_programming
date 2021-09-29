package DynamicProgramming;
import java.util.*;
public class UniquePath {
	static int uniquePaths(int m,int n) {
		int[][] memorization=new int[m][n];
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				if(i==0 || j==0) {
					memorization[i][j]=1;
				}
				else {
					memorization[i][j]=memorization[i-1][j]+memorization[i][j-1];
				}
			}
		}
		return memorization[m-1][n-1];
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      int m=sc.nextInt();
     
      int n=sc.nextInt();
      int a=uniquePaths(m, n);
      System.out.println("Number of uniquePaths are: "+a);
	}

}
