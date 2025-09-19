package Prakash;

import java.util.Scanner;

public class Mergesort {
    public static void main(String[] args) {
        System.out.println("Enter the size of an array:");
        Scanner Prakash=new Scanner(System.in);
        int size=Prakash.nextInt();
        int[] arr=new int[size];
        System.out.println("Enter Elements to Array:");
        for(int i=0;i<size;i++)
        {
            arr[i]=Prakash.nextInt();
        }
        System.out.println("Original Array:");
        for(int val:arr)
        {
            System.out.print("\t"+val);
        }
    }
    
}
