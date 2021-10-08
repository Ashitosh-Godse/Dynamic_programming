package DynamicProgramming;

public class house_Robber {
	 public int rob(int[] nums) {
	        if(nums == null || nums.length==0){ //if number of houses are zero
	            return 0;
	        } 
	        if(nums.length==1){ //for only 1 house
	            return nums[0];
	        }
	        if(nums.length==2){  //if only 2 houses then maximum of two houses
	            return Math.max(nums[0],nums[1]);
	        }
	        int[] dp=new int[nums.length]; //creating dynamic array
	        dp[0]=nums[0];
	        dp[1]=Math.max(nums[0],nums[1]);
	        
	        for(int i=2;i<nums.length;i++){ 
	            dp[i]=Math.max(nums[i]+dp[i-2],dp[i-1]); //checking maximum of current house and 2 house previous of current house
	        }
	        return dp[nums.length-1];
	    }

}
