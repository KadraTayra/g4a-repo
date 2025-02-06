package example;

public class Generics {
	
	public static <T> void printArray (T[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		
}
	
	
	public static void main(String[] args) {
		Integer [] intArray = {9,6,8};
		printArray(intArray);
		Double [] doubleArray = {1.0, 6.7, 8.3};
		printArray(doubleArray);
		String [] stringArray = {"Tayra", "Azra"};
		printArray (stringArray);
	}

}
