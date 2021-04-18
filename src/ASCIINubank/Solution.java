package ASCIINubank;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {

	public static String decode(String encodedString) {

		StringBuilder encodedStringReverse = new StringBuilder(encodedString).reverse();
		String[] split = encodedStringReverse.toString().split("");

		List<Integer> valoresASCII = new ArrayList<>();		

		for (int i = 0; i < split.length; i = i + 0) {

			Integer valorASCII;

			if(split[i].equals("1")) {

				valorASCII = Integer.valueOf(encodedStringReverse.toString().substring(i, i+3));

				i = i + 3;

				valoresASCII.add(valorASCII);
			}else
			
			if(!split[i].equals("1")) {
				
				valorASCII = Integer.valueOf(encodedStringReverse.toString().substring(i, i+2));
				
				i = i + 2;
				
				valoresASCII.add(valorASCII);
			}
			
		}
		
		String frase = "";
		
		for (int i = 0; i < valoresASCII.size(); i++) {
			
			int letraInt = valoresASCII.get(i);
			char letra = (char) letraInt;
			frase = frase + letra;
			
		}
		System.out.println(frase);
		
		return frase;


	}

	public static void main(String[] args) {

		decode("23511011501782351112179911801562340161171141148");

	}
	
	

}
