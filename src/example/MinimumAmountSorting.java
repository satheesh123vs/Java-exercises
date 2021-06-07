/*	Alex has a list of items to purchase  at market.The owner offers discount to each item after the first one by the lowest marked
	price among he prior items.No of items can't be discounted below 0, and the list of items may not be reordered.Calaculate the payable amount.
	Example prices = [2,5,1,4]
	total cost=2+3+0+3=8
	Bubblesort - Bubble Sort is the simplest sorting algorithm that works by repeatedly swapping the adjacent elements if they are in wrong order.
  	reference:   https://www.geeksforgeeks.org/java-program-for-bubble-sort/
 */
package example;

import java.util.Arrays;
import java.util.List;

public class MinimumAmountSorting {

	public static void main(String[] args) {
		List<Integer> prices = Arrays.asList(2, 5, 1, 4);

		System.out.println("final result=" + calculateAmount(prices));
	}

	public static Long calculateAmount(List<Integer> prices) {

		long result = 0;

		if (!prices.isEmpty() && 0 != prices.size()) {

			for (int i = 0; i < prices.size(); i++) {
				Integer discount = prices.get(i) - findMin(prices, i);
				result = result + ((discount < 0) ? 0 : discount);
			}

		}
		return result;

	}

	/*
	 * Sorting - repeatedly swapping the adjacent elements(if they are in wrong
	 * order).
	 */
	private static Integer findMin(List<Integer> prices, int i) {

		if (i == 0)
			return 0;
		
		List<Integer> prices2 = prices.subList(0, i);
		System.out.println("\nsublist of i=" + i);
		prices2.forEach(System.out::println);
		
		int n = prices2.size();
		Integer[] intArray = new Integer[n];
		intArray = prices.toArray(intArray);

		for (int k = 0; k < i; k++) {
			for (int j = 0; j < i - 1; j++) {
				if (intArray[j] > intArray[j + 1]) {
					int temp = intArray[j];
					intArray[j] = intArray[j + 1];
					intArray[j + 1] = temp;
				}
			}

		}
		//returning min value from sub list.
		return intArray[0];

	}
}
