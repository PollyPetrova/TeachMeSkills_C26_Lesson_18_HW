package com.teachmeskills.lesson18.task2;

import java.util.ArrayList;
import java.util.List;

/**
 * Task 2
 * Create a collection of the ArrayList class with the values of the names of all students in the group
 * Using Streams:
 * - Select all names starting with "a" (regardless of uppercase/lowercase letters)
 * - Sort and return the first element of the collection
 */

public class Runner {

    public static void main(String[] args) {

        List<String> list=new ArrayList<>();
        list.add("Dmitriy");
        list.add("Mark");
        list.add("Ivan");
        list.add("Artur");
        list.add("Sergey");
        list.add("Daniil");
        list.add("Polina");
        list.add("Liza");
        list.add("Stepan");
        list.add("Fedor");

        System.out.println("Simple collection= "+list);

        System.out.println("Select all names starting with a= "+list.stream().filter(x -> x.toUpperCase().startsWith("A")).toList());
        System.out.println("Sort and return the first element of the collection= "+list.stream().sorted().limit(1).toList());

    }

}
