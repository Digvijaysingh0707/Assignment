package com.company;
import java.util.Scanner;

public class MinMaxArray {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int arr[]=new int[10];
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i=0;i< arr.length;i++)
        {
            arr[i]=s.nextInt();
            if(arr[i]<min)
            {
                min=arr[i];
            }
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        System.out.println(max);
        System.out.println(min);
    }
}
