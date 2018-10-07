package com.chanse.code.arrays_as_list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        list1.add("Java");
        list1.add("Kotlin");
        list1.add("Scala");

        String[] langs = {"Java", "Kotlin", "Scala"};
        List<String> list2 = Arrays.asList(langs);

        list1.add("C");
        System.out.println(list1);
        list2.set(1, "C");
//        list2.add("C");
//        System.out.println(list2);

        List<String> list3 = ArrayUtil.asList(langs);
//        list3.add("C");
        list3.set(1, "C");
    }
}
