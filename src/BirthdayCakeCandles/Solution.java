package BirthdayCakeCandles;

import java.util.Arrays;
import java.util.List;

public class Solution {

	static int birthdayCakeCandles(int[] ar) {

		int maiorNumero = 0;
		int contador = 0;

		for (int i = 0; i < ar.length; i++) {

			if(ar[i] >= maiorNumero) {
				maiorNumero = ar[i]; 
			}
		}
		
		List<int[]> asList = Arrays.asList(ar);
		

		for (int i = 0; i < ar.length; i++) {

			if(ar[i] == maiorNumero) {
				contador++; 
			}
		}

		return contador;


	}

	public static void main(String[] args) {

		int[] ar = new int[4];

		ar[0]=3;
		ar[1]=3;
		ar[2]=2;
		ar[3]=1;

		birthdayCakeCandles(ar);

	}
}
