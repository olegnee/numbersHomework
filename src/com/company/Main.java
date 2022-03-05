package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        List<Integer> newList = new ArrayList<>();
        ListIterator<Integer> iter = list.listIterator();
        while (iter.hasNext()){
            int x = iter.next();
            if (x > 0 && x % 2 == 0) {
                newList.add(x);
            }
            else {
                continue;
            }
        }
        Collections.sort(newList);
        System.out.println(newList);
    }
}