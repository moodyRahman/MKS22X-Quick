import java.util.Random;

public class Quick{

public static void swap(int[] data, int idxa, int idxb){
	int temp = data[idxa];
	data[idxa] = data[idxb];
	data[idxb] = temp;
}


public static void partition(int[] data, int start, int end){
	Random randomGenerator = new Random();
	int randomIndex = randomGenerator.nextInt(end - start + 1) + start;

	randomIndex = 5;

	int pivot = data[randomIndex];
	int indexAtLow = start - 1;

	for (int lowIncrement = start; lowIncrement < end; lowIncrement++){

        	if (data[lowIncrement] <= pivot){
			indexAtLow++;
			swap(data, indexAtLow, lowIncrement);
		}
	}
}

public static void main(String[] args) {
	int[] arr = {4, 78, 23, 2, 4, 8, 0, 5, 3, 2};

	Quick.partition(arr, 0, arr.length - 1);

	for (int x : arr) {
		System.out.print(x);
		System.out.print(", ");
	}
}
}
