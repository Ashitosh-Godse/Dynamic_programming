package DynamicProgramming;

public class House_Robber_II {
	 public int rob(int[] nums) {
	        if(nums==null || nums.length==0){
	            return 0;
	        }
	        if(nums.length==1){
	            return nums[0];
	        }
	        if(nums.length==2){
	            return Math.max(nums[0],nums[1]);
	        }
	        int[] dp1=new int[nums.length-1];  // creating first Dynamic Array which will compulsory include first House
	        int[] dp2=new int[nums.length];  // Creating Second Dynamic Array which will not include first house 
	        dp1[0]=nums[0];
	        dp1[1]=nums[0];
	       
	        dp2[1]=nums[1];
	        dp2[2]=Math.max(nums[1],nums[2]);
	        
	        for(int i=2;i<nums.length-1;i++){
	            
	            dp1[i]=Math.max(dp1[i-1],nums[i]+dp1[i-2]); //logic same as house robber I
	            
	        }
	        
	        for(int i=3;i<nums.length;i++){
	            
	            dp2[i]=Math.max(dp2[i-1],nums[i]+dp2[i-2]); //logic same as house robber I
	            
	        }
	        
	        return Math.max(dp1[nums.length-2],dp2[nums.length-1]);  //returning max value of  obtained by both arrays
	        
	    }
}
