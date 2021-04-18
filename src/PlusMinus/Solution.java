package PlusMinus;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class Solution {

    static void plusMinus(int[] arr) {
    	
    	List<Integer> positivos = new ArrayList<>();
    	List<Integer> negativos = new ArrayList<>();
    	List<Integer> zeros = new ArrayList<>();
    	

    	for (int i = 0; i < arr.length; i++) {
    		
			if(arr[i] > 0) {
				positivos.add(arr[i]);
			}
			if(arr[i] < 0) {
				negativos.add(arr[i]);
			}
			if(arr[i] == 0) {
				zeros.add(arr[i]);
			}
		}
    	
    	double totalPositivos = Double.valueOf(positivos.size())/Double.valueOf(arr.length);
    	double totalNegativos = Double.valueOf(negativos.size())/Double.valueOf(arr.length);
    	double totalZeros = Double.valueOf(zeros.size())/Double.valueOf(arr.length);
    	
    	DecimalFormat df = new DecimalFormat("0.000000");
    	
    	
			System.out.println(df.format(totalPositivos));
			System.out.println(df.format(totalNegativos));
			System.out.println(df.format(totalZeros));
    }


    public static void main(String[] args) {
    	
    	int[] arr = new int[6];
    	arr[0] = 1;
    	arr[1] = -1;
    	arr[2] = 3;
    	arr[3] = 5;
    	arr[4] = 0;
    	arr[5] = -2;

        plusMinus(arr);

      
    }
}
