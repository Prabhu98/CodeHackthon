package Code;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

public class example {

	/*
	 * Intialize n= nums.length Using Hashset check if hset not equal to add nums[i]
	 * return true check size >k then remove first index nums[i-k]
	 * 
	 * 
	 * 
	 * 
	 * 
	 */

	@Test
	public void td1() {
		
		int[] nums = {1,2,3,1};
		int k = 3;
		boolean containsNearbyDuplicate = containsNearbyDuplicateSliding(nums,k);
		System.out.println(containsNearbyDuplicate);
	}
	
	
	public boolean containsNearbyDuplicate(int[] nums, int k) {

		Set<Integer> hset = new HashSet<Integer>();

		for (int i = 0; i < nums.length; i++) {

			if (!hset.add(nums[i])) {
				return true;
			}
			if (hset.size() > k) {
				hset.remove(nums[i - k]);
			}
		}
		return false;

	}
	
	public boolean containsNearbyDuplicateSliding(int[] nums, int k) {

		Set<Integer> hset = new HashSet<Integer>();
        
		int start =0 , end  = nums.length;
		
		while(start < end) {
			
			if(!hset.add(nums[start])) {
				return true;
			}
			if(hset.size()>k) {
				hset.remove(nums[start-k]);
			}
			start++;
		}
	     
		return false;

	}

}
