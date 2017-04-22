package Sorting;

public class InsertionSort {

	public static void main(String[] args) {

		int[] array = {7,6,5,4,3,2,1};
		int length = array.length;
		System.out.println("length "+length);

int iteration = 0;
int currInd;
			for (int i=1; i < length; i++){
			
				currInd = i;
				iteration++;
				while (currInd > 0 && array[currInd] < array[currInd-1]){
					swap(array, currInd, currInd-1);
					iteration++;
					currInd = currInd -1;
				}
				
			}
			System.out.println("iteration: "+iteration);
for (int i = 0; i<length;i++){
	System.out.print(array[i]+", ");
	
}
	}

	
	public static void swap(int[] array, int x, int y) {
		int temp = array[x];
		array[x] = array[y];
		array[y] = temp;
			
		}
}
