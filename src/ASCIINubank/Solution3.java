package ASCIINubank;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Solution3 {

	public static String decode(String encodedString) {

		StringBuilder encodedStringReverse = new StringBuilder(encodedString).reverse();
		String[] split = encodedStringReverse.toString().split("");
		List<String> caracteresListas = Arrays.asList(split);
		
		//caracteresListas.stream().reduce(null, null, null)
		
		List<String> letters = Arrays.asList("a", "b", "c", "d", "e");
		
		String result = letters.stream() .reduce("", (partialString, element) -> partialString.toUpperCase() + element.toUpperCase());
		
		System.out.println(result);
		
		return "";


	}

	public static void main(String[] args) {

		decode("23511011501782351112179911801562340161171141148");
	}	

}
