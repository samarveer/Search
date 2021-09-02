
public class LinearSearch {
	public static void main(String[] args) {
		
		int[] arr = new int[1000];
		
		for (int i=0; i<arr.length; i++) {
			arr[i]= i;
		}
		
		int val = 47;
		
		for (int i=0; i<arr.length; i++) {
			if (arr[i]==val) {
				System.out.println("Found at place: "+i);;
			}
			else {
				System.out.println("Not found");
			}
		}
		
		
	}
}

