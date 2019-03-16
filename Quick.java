import java.util.Random;

public class Quick{

public static void swap(int[] data, int idxa, int idxb){
	int temp = data[idxa];
	data[idxa] = data[idxb];
	data[idxb] = temp;
}


public static int partition(int[] data, int start, int end){
	Random randomGenerator = new Random();
	int randomIndex = randomGenerator.nextInt(end - start + 1) + start;

	randomIndex = 6;

	int pivot = data[end];
	int indexSmall= (start - 1 );

	for (int indexBig= start; indexBig<= end - 1; indexBig++){
		if (data[indexBig] <= pivot){
			indexSmall++;
			swap(data, indexSmall, indexBig);
		}
	}
	swap(data, indexSmall + 1, end);
	return (indexSmall+ 1);
}



public static void main(String[] args) {
	int[] arr = {4, 8, 3, 0, 4, 8, 0, 5, 3, 2};

	Quick.partition(arr, 3, 7);

	for (int x : arr) {
		System.out.print(x);
		System.out.print(",  ");
	}
	System.out.println();
	for (int x : new int[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9}) {
		System.out.print(x);
		System.out.print(",  ");
	}
}
}
