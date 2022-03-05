package com.company;

import java.util.*;
import java.util.stream.*;

public class StreamMain {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        Stream<Integer> stream = list.stream();
            stream.
                filter(x -> x > 0 && x % 2 == 0).
                sorted(Comparator.naturalOrder()).
                    forEach(System.out::println);
    }
}
