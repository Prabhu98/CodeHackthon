package Code;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class FindClosetElement {
	
	
	@Test
	public void td1() {
		
		int[] nums = {1,2,3,4,5};
		int k = 4;
		int x =3;
		List<Integer> containsNearbyDuplicate = findClosestElements(nums,k,x);
		System.out.println(containsNearbyDuplicate);
	}
	

	public List<Integer> findClosestElements(int[] arr, int k, int x) {
		int left = 0, right = arr.length - k;

		while (left < right) {

			int mid = (left + right) / 2;
			
			int a1 = x - arr[mid];
			int b1 = arr[mid + k] - x;

			if (x - arr[mid] > arr[mid + k] - x) {
				left = mid + 1;
			} else {
				right = mid;
			}

		}
		
		List<Integer> lst = new ArrayList<Integer>();
		
		for(int i=left;i<left +k;i++) {
			lst.add(arr[i]);
		}

		return lst;

	}

}
