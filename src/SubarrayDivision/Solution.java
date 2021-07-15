package SubarrayDivision;

import java.util.Arrays;
import java.util.List;

public class Solution {

    public static int birthday(List<Integer> s, int d, int m) {

        int count = 0;

        for (int i = 0; i <= s.size()-m; i++) {
            int sum = 0;
            for (int j = i; j <= i+m-1; j++) {
                sum +=s.get(j);
            }
            if(sum == d){
                count++;
            }
        }
        return count;
    }


    public static void main(String[] args) {

        var integers = Arrays.asList(1, 1, 1, 1, 1,1,1);

        birthday(integers,3,2);
    }
}
