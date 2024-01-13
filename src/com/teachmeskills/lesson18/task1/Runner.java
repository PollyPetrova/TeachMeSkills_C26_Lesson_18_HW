package com.teachmeskills.lesson18.task1;

import java.util.ArrayList;
import java.util.List;

/**
 * Task 1
 * Create a collection of the ArrayList class and fill it with elements of the random Integer type.
 * Using Streams:
 * - Remove duplicates
 * - Print all even elements in the range from 7 to 17 (inclusive)
 * - Multiply each element by 2
 * - Sort and display the first 4 items
 * - - Print the number of elements in the incentive
 * - Print the arithmetic mean of all the numbers in the stream
 */

public class Runner {

    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        for (int i = 0; i < 30; i++) {
            list.add((int) (Math.random()*30));
        }
        System.out.println("Simple collection= "+list);
        System.out.println("Transformed collections:");



        System.out.println("Remove duplicates= "+list.stream().distinct().toList());
        System.out.println("Print all even elements in the range from 7 to 17 (inclusive)= "+list.stream().filter(x -> x%2==0 && x>=7 && x<=17).toList());
        System.out.println("Multiply each element by 2= "+list.stream().map(x -> x*2).toList());
        System.out.println("Sort and display the first 4 items= "+list.stream().sorted().limit(4).toList());
        System.out.println("Print the number of elements in the incentive= "+list.stream().count());
        System.out.println("Print the arithmetic mean of all the numbers in the stream= "+list.stream().mapToDouble(Integer::doubleValue).average());


    }

}
