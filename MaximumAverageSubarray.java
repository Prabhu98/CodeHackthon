package Code;

import org.junit.Test;

public class MaximumAverageSubarray {
	
	@Test
	public void td1() {
		
		int[] nums = {1,12,-5,-6,50,3};
		int k = 4;
		double containsNearbyDuplicate = findMaxAverage(nums,k);
		System.out.println(containsNearbyDuplicate);
	}
	
	
	
	 /*
	  * Intialize start =0 end =nums.length and sum=0
	  * Intialize double max =0
	  * iterate while loop from 0 to k
	  * then add sum += nums[start]
	  * start increment by 1
	  * assign max =sum
	  * iterate for loop from k to end
	  * sum = sum - nums[i-k] +nums[i]
	  * max = Math.max(max,sum)
	  * return max/1.0* k
	  * 
	  * 
	  * 
	  * 
	  * 
	  * 
	  */
	
	  public double findMaxAverage(int[] nums, int k) {
		  
		  int start =0 , end =nums.length;
				  double sum =0;
		  
		  double max =0;
		  
		  while(start < k) {
			  sum += nums[start];
			  start++;
		  }
		  
		  max = sum;
		  
		  for(int i=k;i<end;i++) {
			  sum = sum - nums[i-k] +nums[i];
			  max = Math.max(max, sum);
		  }
		  
		  
		  
		return max /(1.0 * k);
		  
		  
		  
		  
		  
	  }

}
