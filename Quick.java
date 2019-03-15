import java.util.Random;

public class Quick{

public static void partition(int[] data, int start, int end){
	Random randomGenerator = new Random();
	int randomIndex = randomGenerator.nextInt(end - start + 1) + start;

		System.out.println(randomIndex);

}

public static void main(String[] args) {
	int[] arr = {4, 78, 23, 2, 4, 8, 0, 5, 3, 2};

	for (int x = 0; x < 20; x++) {
		Quick.partition(arr, 10, 15);
	}
}
}
