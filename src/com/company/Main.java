package com.company;

public class Main {

    public static void main(String[] args) {
        int[] array = new int[20];
        for (int i = 0; i < array.length; i++)
        {
            array[i] = i + 1 ;
            if(array[i] % 2 != 0)
                System.out.print(array[i] + ", ");
        }
    }
}
