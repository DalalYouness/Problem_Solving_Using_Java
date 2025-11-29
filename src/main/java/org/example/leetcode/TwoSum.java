package org.example.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

//Easy level
public class TwoSum {
    /*Bad solution*/
//    public static int[] twoSum(int [] sum , int target) {
//        int [] indexs = new int[2];
//
//        for (int i = 0;i < sum.length;i++) {
//            for (int j = i + 1; j < sum.length; j++) {
//                if(sum[i] + sum[j] == target)
//                {
//                    indexs[0] = i;
//                    indexs [1] = j;
//                    return indexs;
//                }
//            }
//        }
//        return null;
//    }

    public static int[] twoSum(int [] nums , int target) {
        /* j'ai declarer une hashmap pour l'utiliser
         au moment du verification parce que pour recuperer
         une valeur dans le hashmap par le clé se fait avec
         une complexité de o(1) , donc on evite de parcours
         le tableau avec nested loop ce qui donne une cemplexity de
         O(n2)
        * */
        Map<Integer,Integer> indexValue = new HashMap<>();

        /*je fais parcouris le tableau element par element
        Complexity de O(n)
        * */
        for (int i = 0;i<nums.length;i++) {

            /* valeur1 + valeur2 = targer
            c'est la contraint
            donc valeur2 = target - valeur1;
            * */
            int valueToCheck = target - nums[i];

            /*
            * au lieu de prend l'element courant
            * et de faire un parcours sur chaque element suivant
            * je vais checker dans le hashmap si y'a une valeur
            * qui egale target - valeur1 la recherche se fait d'une
            * maniere tres rapide , si il existe je retourne
            * l'indice qui reprensete la partie valeur dans le hashmap
            * si non je vais ajouter la valeur courant du tableau
            * comme clé , et son indice comme valeur
            * */
            if(indexValue.containsKey(valueToCheck)) {
                return new int[] {i,indexValue.get(valueToCheck)};
            }
            indexValue.put(nums[i],i);
        }
        return new int[] {-1,-1};
    }
    public static void main(String[] args) {

        int [] nums = new int []{3,3};
        int target = 6;

        System.out.println(Arrays.toString(twoSum(nums,target)));

    }
}
