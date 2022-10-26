package com.learning.automation.learning.variables;

import org.springframework.stereotype.Component;

import java.util.HashSet;

@Component
public class HashSetExample {
    HashSet<String> set = new HashSet<String>();

    //creating hashset and adding elements ,elements are stored using hashcode
    public void addSet() {
        set.add("Ravi");
        set.add("Vijay");
        set.add("Arun");
        set.add("Sumit");
        System.out.println("An initial list of elements: "+set);//
        // removing specific element from hashset.
        set.remove("Ravi");
        System.out.println("After remove method: "+set);//vijay,arun,sumit.
        HashSet<String> set1 = new HashSet<String>();
        set1.add("Ajay");
        set1.add("Gaurav");
        set.addAll(set1);
        System.out.println("Updated list: "+set);//vijay,arun.sumit.ajay,gauarav.
        //removing all new elements from hashset
        set.removeAll(set1);
        System.out.println("After removeAll method :"+set);//vijay,arun,sumit.

    }
}

