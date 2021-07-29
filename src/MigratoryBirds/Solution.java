package MigratoryBirds;

import java.util.*;
import java.util.stream.Collectors;

public class Solution {

    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 4, 3, 2, 1, 3, 4);
        migratoryBirds(integers);
    }

    public static int migratoryBirds(List<Integer> arr) {
        return arr.stream().collect(Collectors.groupingBy(i -> i)).values().stream().max(Comparator.comparing(List::size)).get().get(0);

    }
}
