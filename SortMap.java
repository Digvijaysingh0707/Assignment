package com.company;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Sort {

    static void KeySort() {
        Map<String, String> map = new HashMap<>();
        map.put("Deepak", "CSI");
        map.put("Harshit","IT");
        map.put("Apurva", "ME");

        Map<String,String>  sorted=new TreeMap<>(map);
        System.out.println("Sorted Map:-");
        for(Map.Entry<String,String> entry:sorted.entrySet())
        {
            System.out.println(entry.getKey()+"  "+entry.getValue());
        }
    }

    public static void main(String[] args) {
        Sort.KeySort();
    }
}
