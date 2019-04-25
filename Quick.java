import java.util.Random;

public class Quick{

public static void swap(int[] data, int idxa, int idxb){
	int temp = data[idxa];
	data[idxa] = data[idxb];
	data[idxb] = temp;
}


public static int partition(int[] data, int start, int end){
	int midPoint = data[(start+end)/2];
	int pivot = data[end];
	// if((data[start] <= data[end] && data[start] >= midPoint) || (data[start] >= data[end] && data[start] <= midPoint)){
	// 	pivot = start;
	// }
	//
	// if((data[end] <= data[start] && data[end] >= midPoint) || (data[end] >= data[start] && data[end] <= midPoint)){
      	// 	pivot = end;
    	// }
    	// if((midPoint <= data[start] && midPoint >= data[end]) || (midPoint >= data[start] && midPoint <= data[end])){
      	// 	pivot = (start+end)/2;
    	// }

	// pivot (Element to be placed at right position)
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

public static int quickselect(int[] data, int k) {
	return quickSelectHelper(data, 0, data.length - 1, k);
}

private static int quickSelectHelper(int[] data, int start, int end, int k) {
        int location = partition(data, start, end);
        if(location > k) {
		return quickSelectHelper(data, start, location - 1, k);
	}
        if(location < k) {
		return quickSelectHelper(data, location + 1, end, k);
	}
        return data[k];
}

public static void quicksortH(int[] arr, int low, int high){
	if (low < high){
		/* pi is partitioning index, arr[pi] is now
           	at right place */
        	int pi = partition(arr, low, high);

        	quicksortH(arr, low, pi - 1);  // Before pi
        	quicksortH(arr, pi + 1, high); // After pi
    }
}

public static void quicksort(int[] arr){
	quicksortH(arr, 0, arr.length - 1);
}



public static void main(String[] args) {
	Random r = new Random();
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

	int[] drr = new int[1000000];
	for (int x = 0; x < 1000000; x++) {
		drr[x] = r.nextInt();
	}
	Quick.quicksort(drr);
	// for (int x : drr) {
	// 	System.out.print(x);
	// 	System.out.print(", ");
	// }
}
}
