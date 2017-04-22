package Sorting;
import java.util.*;
public class BuiltInSortingTest {

	public static void main(String[] args) {
		double Begin = System.currentTimeMillis();
Random random = new Random();
List<Integer> listToSort = new ArrayList<Integer>();

		for (int i = 0; i<1500; i++){
			listToSort.add(random.nextInt(10000));
		
			
		}
		System.out.println("Unsortd List: "+listToSort.toString());
		//********************************************
		// this is it: BuiltInSort
		Collections.sort(listToSort);
		System.out.println("new array after built in sort: "+listToSort.toString());
		double End = System.currentTimeMillis();
		double Delta = End - Begin;
		System.out.println(Begin);
		System.out.println(End);
		System.out.println(Delta/1000+"ms");
	}

}
