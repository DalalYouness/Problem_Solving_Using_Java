package org.example.hacker_rank;

import java.util.ArrayList;
import java.util.List;

public class RestructionArray {


    public static Integer getFirstInteger(List<Integer> arr) {
        return arr.get(0);
    }


    public static List<Integer> getElements(List<Integer> arr, List<List<Integer>> queries) {
        // je dois recuperer le premier entier
        Integer rowSize = getFirstInteger(arr);

        // je dois generer une array avec deux dimension basant sur le rowSize
        List<List<Integer>> my2dArray = new ArrayList<>(rowSize);

        int sizeToBased  = arr.size() - 1;
        int rowOf2d = (arr.size() - 1) / rowSize;
        int counter = 0;
        for (int i = 0; i < rowOf2d ; i++) {
            my2dArray.add(new ArrayList<>());
            for (int j = 0 ; j < rowSize ; j++) {
                my2dArray.get(i).add(arr.get(++counter));
            }
        }

        System.out.println(my2dArray);

        // second step je dois pend chaque query comme repaire vers une valeur

        List<Integer> elements = new ArrayList<>();

        Integer NumberOfRowInqueries = queries.size();

        for (int i = 0 ; i < NumberOfRowInqueries ; i++) {
            Integer i1 = my2dArray.get(queries.get(i).get(0) - 1).get(queries.get(i).get(1) - 1);
            elements.add(i1);
        }
        return elements;
    }

    public static void main(String[] args) {

       List<Integer> list = List.of(5,1,2,3,4,5,6,7,8,9,10);
       List<List<Integer>> queries = List.of(List.of(1,1),
               List.of(1,2),List.of(2,1),List.of(2,2));

        System.out.println(getElements(list,queries));
    }
}
