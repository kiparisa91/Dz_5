package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        //Задача1
        int[] arr = new int[3];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        double[] doubleArr = {1.57, 7.654, 9.986};
        int[] numbers = {2, 4, 6, 8, 10};


        //Задача2
        for (int i=0; i < arr.length-1; i++) {
            System.out.print(arr[i] + ", ");
        }
            System.out.print(arr[arr.length-1]);
            System.out.print("\n");
        for (int i=0; i < doubleArr.length-1; i++) {
            System.out.print(doubleArr[i] + ", ");
        }
            System.out.print(doubleArr[doubleArr.length-1]);
            System.out.print("\n");
        for (int i=0; i < numbers.length-1; i++) {
            System.out.print(numbers[i] + ", ");
        }
            System.out.print(numbers[numbers.length-1]);
            System.out.print("\n");


        //Задача3
        for (int i=arr.length-1; i > 0; i=i-1) {
            System.out.print(arr[i] + ", ");
        }
            System.out.print(arr[0]);
            System.out.print("\n");
        for (int i=doubleArr.length-1; i > 0; i=i-1) {
            System.out.print(doubleArr[i] + ", ");
        }
            System.out.print(doubleArr[0]);
            System.out.print("\n");
        for (int i=numbers.length-1; i > 0; i=i-1) {
            System.out.print(numbers[i] + ", ");
        }
            System.out.print(numbers[0]);
            System.out.print("\n");


        //Задача4
        for (int i=0; i < arr.length; i++) {
            if (arr[i] % 2 != 0)
                arr[i] = arr[i] + 1;
            System.out.print(arr[i] + " ");
        }



    }
}
