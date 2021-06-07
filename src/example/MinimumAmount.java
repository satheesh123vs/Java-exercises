/*	Alex has a list of items to purchase  at market.The owner offers discount to each item after the first one by the lowest marked
	price among he prior items.No of items can't be discounted below 0, and the list of items may not be reordered.Calaculate the payable amount.
	Example prices = [2,5,1,4]
	total cost=2+3+0+3=8
	reference: https://howtodoinjava.com/java8/
 */
package example;

import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;

public class MinimumAmount {

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
				System.out.println("result1:" + result);
			}

		}
		return result;

	}

	/*
	 * use min() method provided through the java.util.Stream interface. -
	 * java-8
	 */
	private static Integer findMin(List<Integer> prices, int i) {

		if (i == 0)
			return 0;

		List<Integer> prices2 = prices.subList(0, i);
		System.out.println("i:" + i);
		prices2.forEach(System.out::println);

		int minNumber = prices2.stream().mapToInt(v -> v).min().orElseThrow(NoSuchElementException::new);

		return minNumber;
	}
}
