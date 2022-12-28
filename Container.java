package Code;

import org.junit.Test;

public class Container {
	
	
	

	@Test
	public void testcase1() {
		int[] nums = {1,8,6,2,5,4,8,3,7};

		System.out.println(maxArea(nums));
	}

	public int maxArea(int[] height) {

		int max_area = 0;
		int left = 0;
		int right = height.length - 1;
		while (left <= right) {
			if (height[left] < height[right]) {
				max_area = Math.max(max_area, height[left] * (right - left));
				left++;
			} else {
				max_area = Math.max(max_area, height[right] * (right - left));
				right--;
			}
		}
		return max_area;
	}

}
