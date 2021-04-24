package AppleAndOrange;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Solution {

    public static void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {

        List<Integer> distanciaMacas = apples.stream().map(ar -> a + ar).collect(Collectors.toList());
        List<Integer> distaciaLaranjas = oranges.stream().map(o -> b + o).collect(Collectors.toList());

        Integer quantidadeMacas = 0;
        Integer quantidadeLaranjas = 0;

        for (Integer distanciaMaca :distanciaMacas) {
            if(distanciaMaca >= s && distanciaMaca <= t)
                quantidadeMacas++;
        }

        for (Integer distanciaLaranja :distaciaLaranjas) {
            if(distanciaLaranja <= t && distanciaLaranja >= s)
                quantidadeLaranjas++;
        }
        System.out.println(quantidadeMacas);
        System.out.println(quantidadeLaranjas);

    }

    public static void main(String[] args) {

        List<Integer> apples = Arrays.asList(-2, 2 ,1,20);
        List<Integer> oranges = Arrays.asList(5,-6);

        countApplesAndOranges(7,11,5,15,apples,oranges);
    }


}
