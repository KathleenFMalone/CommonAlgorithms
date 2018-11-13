package main;

public class CommonAlgorithmsOnArrays {
	
	public int findMax(int[] nums) {
		
		int max = 0;
		for(int i: nums) {
			if(i>max) {
				max = i;
			}
		}
		return max;
	}
	
	public int findMin(int[] nums) {
		
		int min = 0;
		for(int i: nums) {
			if(i<min) {
				min = i;
			}
		}
		return min;
	}
	
	public int findAverage(int[] nums) {
		
		int sum = 0;
		for(int i: nums) {
			sum+=i;
		}
		return sum/nums.length;
	}
}
