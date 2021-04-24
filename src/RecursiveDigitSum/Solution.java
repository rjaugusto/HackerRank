package RecursiveDigitSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

    static int superDigit(String n, int k) {

        String concatenada = concatena(n,k);

        String[] array = concatenada.split("");

        return 1;
    }

    static int somaArray(List<Integer> inteiros){

        return inteiros.stream().reduce((n1,n2)-> n1 +n2).get();
    }

    static String concatena(String n, int k){
        String concatenada = "";

        for (int i = 1; i <= k;i++){
            concatenada+=n;
        }
        return concatenada;
    }



    public static void main(String[] args) {

        superDigit("148",3);
    }
}
