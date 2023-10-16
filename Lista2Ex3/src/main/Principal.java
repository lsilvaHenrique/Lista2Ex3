package main;

import java.util.ArrayList;
import java.util.List;

public class Principal {

    public static void transformList(List<Integer> L, int[] input) {
        for (int num : input) {
            if (L.contains(num)) {
                L.add(num);
            } else if (num % 2 == 0) {
                L.add(2, num);
            } else {
                L.add(0, num);
            }
        }
    }

    public static void main(String[] args) {
        List<Integer> L = new ArrayList<>();
        int[] input = {3, 3, 9, 6, 9, 8, 9, 5, 7, 10, 4, 8, 10, 8};

        transformList(L, input);

        System.out.println("Lista final L: " + L);
    }
}

