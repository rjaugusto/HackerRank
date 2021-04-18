package StairCase;

public class Solution {

    // Complete the staircase function below.
    static void staircase(int n) {
    	
    	for (int i = n; i >= 1; i--) {
    		
    		String simbolo = "#";
        	String linha = "";
        	String espaco = " ";
    		
    		for (int j = 1; j < i; j++) {
				linha = linha + espaco;
			}
    		
    		for (int j = 1; j < n-i+2; j++) {
    			linha = linha + simbolo;
			}
    		
    		System.out.println(linha);
		}
    	

    }


    public static void main(String[] args) {

        staircase(20);

    }
}