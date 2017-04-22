package Sorting;

public class SelectionSort {

	public static void main(String[] args) {

		int[] array = {4,83,7,47,567,2,34,56,77,45,89};
		int length = array.length;
		System.out.println("length "+length);

int iteration = 0;
			for (int i=0; i < length-1; i++){
			
				int indexMin = i;
				for (int j = i+1; j <length; j++){
					iteration++;
					if ( array[j]< array[indexMin]){
						indexMin = j;
					}
				}
				swap(array, indexMin, i);
				iteration++;
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

