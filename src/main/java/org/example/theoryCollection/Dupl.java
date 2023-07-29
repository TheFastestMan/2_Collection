package org.example.theoryCollection;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Dupl {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int size = sc.nextInt();

        int[] arr =  new int[size];


        for (int i = 0; i < size; i++) {
            arr[i] = random.nextInt(5);
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println(Arrays.toString(arr));
    }
}
