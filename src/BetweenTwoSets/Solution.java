package BetweenTwoSets;

import java.util.*;
import java.util.stream.Collectors;

public class Solution {

    public static void main(String[] args) {
        System.out.println(getTotalX(Arrays.asList(2,4),Arrays.asList(16,32,96)));
    }

    public static int getTotalX(List<Integer> a, List<Integer> b) {

        List<List<Integer>> arrays = new ArrayList<>();

        Optional<Integer> biggerB = b.stream().max(Comparator.naturalOrder());

        for (Integer value : a) {
            arrays.add(multiplus(value, biggerB.get()) );
        }

        for (Integer integer : b) {
            arrays.add(factors(integer));
        }
        List<Integer> arrayall = new ArrayList<>();

        arrays.forEach(arrayall::addAll);

        return arrayall.stream().filter(
                i -> Collections.frequency(arrayall, i) >= a.size() + b.size())
                .collect(Collectors.toSet()).size();

    }

    public static List<Integer> multiplus(Integer number, Integer size){
        List<Integer> multiplus = new ArrayList<>();
        Integer total = 0;
        while(total < size){
            total = number + total;
            multiplus.add(total);
        }
        return multiplus;
    }

    public static List<Integer> factors(Integer numero){
        List<Integer> factors = new ArrayList<>();
        for(int i = 1; i <= numero; i++){
            if(numero % i == 0){
                factors.add(i);
            }
        }
        return factors;
    }


}
