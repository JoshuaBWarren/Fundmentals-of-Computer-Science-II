import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Client {
	
	public static void main (String[] args) throws FileNotFoundException  {
		
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		Scanner input = new Scanner(new File("test"));
		while (input.hasNextInt()) {
			int n = input.nextInt();
			numbers.add(n);
			}
		input.close();
		System.out.println(numbers);
		//filterEvens(numbers);
		//System.out.println(numbers);
		
		//findLargest(numbers);
		System.out.println(findLargest(numbers));
	}
		// Removes all elements with even values from the given list.
		public static void filterEvens(ArrayList<Integer> list) {
			for (int i = list.size() - 1; i >= 0; i--) {
				int n = list.get(i);
				if (n % 2 == 0) {
					list.remove(i);
					}
				}
			}
		
		// finds the largest integer within the array list.
		public static int findLargest(ArrayList<Integer> list) {

			int answer = 0;
			
			for(int i = 0; i <= list.size() - 1; i++) {
				int current = list.get(i);
				answer = current;
				if(answer > current) {
					answer = current;
				}
			}
			return answer;
			
		}
		
		// finds the smallest integer within the array list.
		public static int findSmallest(ArrayList<Integer> list) {
			
			int answer = 0;
			
			for(int i = 0; i <= list.size(); i++) {
				int current = list.get(i);
				if(answer < current) {
					answer = current;
				}
			}
			return answer;
		}
		
		// finds the average of the integers within the array list.
		public static int average(ArrayList<Integer> list) {
			
			int average = 0;
			int sum = 0;
			int size = list.size();
			
			for(int i = 0; i <= list.size(); i++) {
				int n = list.get(i);
				sum += n;
			}
			average = sum / size;
			
			return average;
		}
}
