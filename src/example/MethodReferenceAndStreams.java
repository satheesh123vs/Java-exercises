package example;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class MethodReferenceAndStreams {

	public static void main(String[] args) {
		List<String> names = new ArrayList<String>(); 
		names.add("Ajith"); 
		names.add("byju"); 
		names.add("Kiran"); 
		names.forEach(System.out::println);
		
		//filter
		List<String> names2 = names.stream().filter(name->name.startsWith("K")).collect(Collectors.toList());
		for(String name2:names2){
			System.out.println("\nfiltereslist2: "+name2);
		}
		
		List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
		List<String> filtered = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.toList());
		
		System.out.println("\nfiltereslist1: "+filtered);
		
		//sorted
		List<String> result = Arrays.asList("Reflection","Collection","Stream");
		List<?> result1 = (List<?>) result.stream().sorted().collect(Collectors.toList());
		
		System.out.println("\nsortedlist: "+result1);
		
		
		//map
		List<Integer> number = Arrays.asList(2,3,4,5);
		List<?> square = (List<?>) number.stream().map(x->x*x).collect(Collectors.toList());
		System.out.println("\nresult: "+square);
		
		
		//LocalDate
		LocalDate localDate = LocalDate.now();
		System.out.println("\nCurrent date:: "+localDate);
		
		 LocalTime time = LocalTime.now();
	      System.out.println("Current time: "+time);
		
		 LocalDateTime dateTime = LocalDateTime.now();
	      System.out.println("Current date-time: "+dateTime);
	  
	}

}
