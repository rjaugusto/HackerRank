package GradingStudents;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

	public static List<Integer> gradingStudents(List<Integer> grades) {
		
		List<Integer> asList = Arrays.asList(1,2,3,4);
		
		asList.stream().forEach(System.out::println);
		
		
		
		return grades;

	}

	public static void main(String[] args) {

		List<Integer> entrada = new ArrayList<>();
		entrada.add(4);
		entrada.add(73);
		entrada.add(67);
		entrada.add(39);
		entrada.add(34);

		gradingStudents(entrada);

	}

}
