package DivisibleSumPairs;

import java.util.Arrays;
import java.util.List;

public class Solution {

    public static void main(String[] args) {

        List<Integer> integers = Arrays.asList(1, 3, 2, 6, 1, 2);
        divisibleSumPairs(6, 3, integers);
    }

    public static int divisibleSumPairs(int n, int k, List<Integer> ar) {
        int count = 0;

        for (int i = 0; i < ar.size(); i++) {
            for (int j = 0; j < ar.size(); j++) {
                if(divisible((ar.get(i) + ar.get(j)), k) && i != j ) {
                    count++;
                }
            }
        }
        return count/2;
    }

    public static boolean divisible(int dividendo, int divisor){
        return dividendo % divisor == 0;
    }
}
