package com.company;
import java.util.Scanner;

public class ReverseArray {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int arr[]=new int[10];
        System.out.println("Enter elements of the array:-");
        for(int i=0;i<arr.length;i++){
            arr[i]=s.nextInt();
        }
        System.out.println("After reversing array");
        for(int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
    }
}
