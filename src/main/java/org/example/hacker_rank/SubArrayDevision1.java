package org.example.hacker_rank;

import java.util.ArrayList;
import java.util.List;


//Easy level
public class SubArrayDevision1 {
    public static int birthday(List<Integer> s, int d, int m) {
        // Write your code here
        int NumberOfWays = 0;

        int sumIntInSegment = 0;

        for(int i = 0 ; i < m ; i++)
        {
            sumIntInSegment+=s.get(i);
        }

        if(sumIntInSegment == d)
        {
            NumberOfWays++;
        }

        for(int i = 1;i <= s.size() - m;i++) {

            sumIntInSegment = sumIntInSegment - s.get(i - 1) + s.get(m -1 + i);
            if(sumIntInSegment == d)
                NumberOfWays++;
        }
        return NumberOfWays;
    }

    public static void main(String[] args) {

        List<Integer> chocolatBar = new ArrayList<>(List.of(2, 2, 1, 3, 2));
        int d = 4, m = 2;

        System.out.println(birthday(chocolatBar, d, m));
    }

}
