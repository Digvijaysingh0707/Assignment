package com.company;
import java.util.Arrays;
import java.util.Scanner;
import java.io.IOException;
public class SortArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[10];
        System.out.println("Enter elements:-");
        for(int i=0;i<arr.length;i++){
            arr[i]= sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("After sorting:-");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    }
