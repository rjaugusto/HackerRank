package ASCIINubank;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution4 {
	
	public static String decode(String encodedString) {
		final Pattern ABC = Pattern.compile("114");
		String encodedStringReverse = new StringBuilder(encodedString).reverse().toString();
		System.out.println(encodedStringReverse);
		String texto = encodedStringReverse;
        Matcher m = ABC.matcher(texto);
        while (m.find()) {
            System.out.println("Achou nas posições " + m.start() + "-" + m.end() + ": "
                    + texto.substring(m.start(), m.end()));
        }
		
		return "";
	}
	
	public static void main(String[] args) {
		decode("23511011501782351112179911801562340161171141148");
	}

}
