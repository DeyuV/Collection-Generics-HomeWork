package org.endava.tmd.collections;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MainApp {
    public static void main(String[] args) {
        List<Integer> listInteger = Arrays.asList(7, 4, 5, 2, 1, 2, 4, 1);

        listInteger = listInteger
                .stream()
                .distinct()
                .collect(Collectors.toList());

        listInteger
                .stream()
                .forEach(System.out::println);

        System.out.println("-------------------");

        listInteger
                .stream()
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);

        System.out.println("-------------------");

        Set<String> listString = listInteger
                .stream()
                .map(String::valueOf)
                .collect(Collectors.toSet());

        listString
                .stream()
                .forEach(System.out::println);

        System.out.println("-------------------");


        Map<String, Integer> mapList = new HashMap<>();

        int i = 0;

        for(String s : listString){
            mapList.put(s, listInteger.get(i));
            i++;
        }

        for(String key : mapList.keySet()){
            System.out.println(key + " " + mapList.get(key));
        }
    }
}
