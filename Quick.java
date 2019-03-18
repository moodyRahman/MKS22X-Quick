import java.util.Random;

public class Quick{

public static void swap(int[] data, int idxa, int idxb){
	int temp = data[idxa];
	data[idxa] = data[idxb];
	data[idxb] = temp;
}


public static int partition(int[] data, int start, int end){
	// pivot (Element to be placed at right position)
	int pivot = data[end];
	int i = (start - 1);  // Index of smaller element
	for (int j = start; j <= end- 1; j++){
        // If current element is smaller than or
        // equal to pivot
        	if (data[j] <= pivot){
            		i++;    // increment index of smaller element
            		// swap arr[i] and arr[j]
			swap(data, i, j);
		}
}
	// swap arr[i + 1] and arr[end])
	swap(data, i+1, end);
    	return (i + 1);
}

public static void quickSort(int[] arr, int low, int high){
	if (low < high){
		/* pi is partitioning index, arr[pi] is now
           	at right place */
        	int pi = partition(arr, low, high);

        	quickSort(arr, low, pi - 1);  // Before pi
        	quickSort(arr, pi + 1, high); // After pi
    }
}



public static void main(String[] args) {
	// int[] arr = {4, 8, 3, 0, 4, 8, 0, 5, 3, 2};
	//
	// for (int x : arr) {
	// 	System.out.print(x);
	// 	System.out.print(",  ");
	// }
	// System.out.println();
	//
	// Quick.partition(arr, 2, 7);
	//
	// for (int x : arr) {
	// 	System.out.print(x);
	// 	System.out.print(",  ");
	// }
	// System.out.println();
	// for (int x : new int[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9}) {
	// 	System.out.print(x);
	// 	System.out.print(",  ");
	// }

	int[] drr = {4, 8, 3, 0, 4, 8, 0, 5, 3, 2};
	Quick.quickSort(drr, 0, drr.length - 1);
	for (int x : drr) {
		System.out.print(x);
		System.out.print(", ");
	}
}
}
