package ASCIINubank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Solution2 {

	public static String decode(String encodedString) {

		String[] split  = new StringBuilder(encodedString).reverse().toString().split("");
		
		Stream<String> streamOf = Stream.of(split);
		
		streamOf.sequential().forEach(System.out::println);
		
		
		

		List<Integer> valoresASCII = new ArrayList<>();
		List<Integer> collectInteger = Arrays.asList(split).stream().map(e -> Integer.valueOf(e)).collect(Collectors.toList());
		List<String> collectIntegerString = Arrays.asList(split);
		
		//collectIntegerString.stream().filter
		

		return collectInteger.toString();


	}

	public static void main(String[] args) {
		final String ascii = "23511011501782351112179911801562340161171141148";
		final List<Integer> validos = 
				IntStream
					.rangeClosed(32, 122)
					.filter(
						numero -> numero == 32 ||
						(numero > 64 && numero < 91) ||
						(numero > 96 && numero < 123))
					.boxed()
					.collect(Collectors.toList());
		
		System.out.println(decode(new StringBuilder(ascii).reverse().toString(), 0, 2, new StringBuilder(), validos));
		
	}
	
	public static final String decode(final String stream, final int inicio, final int incremento, final StringBuilder frase, final List<Integer> caracteresValidos) {
		
		if(stream.length() > 0) {
			char[] candidato = new char[incremento + inicio];
			
			stream.getChars(inicio, incremento, candidato, 0);
			
			Integer parseInt = Integer.parseInt(String.valueOf(candidato));
			
			if(caracteresValidos.contains(parseInt)) {
				
				System.out.println(parseInt + " > " + Character.toString((char)parseInt.intValue()));
				
				frase.append(Character.toString((char)parseInt.intValue()));
				
				return decode(stream.replaceFirst(String.valueOf(candidato), ""), inicio, 2, frase, caracteresValidos);
				
			}else if(candidato.length < 3) {
				
				return decode(stream, inicio, incremento + 1, frase, caracteresValidos);
			}
			else {
				return decode(stream.replaceFirst(String.valueOf(candidato), ""), inicio, 2, frase, caracteresValidos);
			}
		}
		
		return frase.toString();
	}
}
