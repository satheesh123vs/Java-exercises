/*Bubblesort-Example
https://www.geeksforgeeks.org/java-program-for-bubble-sort/
*/
package example;


public class BubbleSortExample {

	public static void main(String[] args) {

		Integer[] intArray = new Integer[4];
		intArray[0]=2;
		intArray[1]=5;
		intArray[2]=1;
		intArray[3]=4;
		int n= intArray.length;
		for (int i = 0; i < n-1; i++) {
			for (int j = 0; j < n - i-1; j++) {
				if (intArray[j] > intArray[j+1]) {
					int temp = intArray[j];
					intArray[j] = intArray[j+1];
					intArray[j+1] = temp;
				}
			}

		}
		for (int k = 0; k < n; k++) {
			System.out.println(intArray[k]);
		}
		
	}
}
