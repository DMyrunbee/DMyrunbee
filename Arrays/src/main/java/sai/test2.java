package sai;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class test2 {
    public static void main(String[] args) {
        List<Integer> listOfLists = Arrays.asList(1,2,3,4,5,6,7,8,9 );

        List<Integer> flattenedList = listOfLists.stream()
                .collect(Collectors.toList());

        System.out.println(flattenedList); // Output: [1, 2, 3, 4, 5, 6, 7, 8, 9]
    }
}