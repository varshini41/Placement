package placement;
import java.util.*;
public class Difference_pair {

	        public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);
	        System.out.print("Enter the array size:");
	        int n = scan.nextInt();
	        System.out.print("Enter the array elements:");
	        HashSet<Integer> set = new HashSet<>();
	        for (int i = 0; i < n; i++) {
	            set.add(scan.nextInt());
	        }
	        System.out.print("Enter the difference:");
	        int diff = scan.nextInt();
	        int count = 0;
	        for (int num : set) {
	            if (set.contains(num + diff)) {
	                count++;
	            }
	        }
	        System.out.println("Number of pairs with difference " + diff + " is " + count);
	    }
	}
