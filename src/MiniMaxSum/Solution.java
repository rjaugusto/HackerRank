package MiniMaxSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.IntStream;

public class Solution {

	
	static void miniMaxSum(int[] arr) {
		
		final List<Long> lista = new ArrayList<>();
		Long somaMaior = 0l;
		Long somaMenor = 0l;
		 
		
		for (int j = 0; j < arr.length; j++) {
			lista.add(Long.valueOf(arr[j]));
		}
		
		for (int i = 0; i < lista.size(); i++) {
			
			final List<Long> lista2 = new ArrayList<>();

			lista2.addAll(lista);			
			lista2.remove(i);
			
			Long soma = lista2.stream().mapToLong(Long::longValue).sum();
			
			if (i == 0) {
				somaMaior = soma;
				somaMenor = soma;
				
			}
			
			if(soma >= somaMaior) {
				somaMaior = soma;
			}
			
			
			if(soma < somaMenor) {
				somaMenor = soma;
			}
			
		}
		
		System.out.println(somaMenor + " " + somaMaior );
		
	}
	public static void main(String[] args) {
		
		int[] arr = new int[5];
		arr[0] = 156873294;
		arr[1] = 719583602;
		arr[2] = 581240736;
		arr[3] = 605827319;
		arr[4] = 895647130;
		
		miniMaxSum(arr);
	}
	    
}
