
public class BinarySearch {
	public static void main(String[] args) {

		int[] arr = new int[100];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = i;
		}

		int target = 99;
		
		System.out.println(binary(arr, target));
	
	}

	public static int binary(int[] arr, int target) {
		int low = 0;
		int high = arr.length;

		while (low + 1 < high) {
			int test = (low + high) / 2;
			if (arr[test] > target) {
				high = test;
			} else {
				low = test;
			}
		}
		if (arr[low] == target) {
			return low;
		}
		return -1;
	}
}
