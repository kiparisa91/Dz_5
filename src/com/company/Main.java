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
        for (int i=0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                System.out.print(arr[i]);
                break;
            }
            System.out.print(arr[i] + ", ");
        }
            System.out.print("\n");
        for (int i=0; i < doubleArr.length; i++) {
            if (i == doubleArr.length - 1) {
                System.out.print(doubleArr[i]);
                break;
            }
            System.out.print(doubleArr[i] + ", ");
        }
            System.out.print("\n");
        for (int i=0; i < numbers.length; i++) {
            if (i == numbers.length - 1) {
                System.out.print(numbers[i]);
                break;
            }
            System.out.print(numbers[i] + ", ");
        }
            System.out.print("\n");


        //Задача3
        for (int i=arr.length-1; i >= 0; i=i-1) {
            if (i == 0) {
                System.out.print(arr[i]);
                break;
            }
            System.out.print(arr[i] + ", ");
        }
            System.out.print("\n");
        for (int i=doubleArr.length-1; i >= 0; i=i-1) {
            if (i == 0) {
                System.out.print(doubleArr[i]);
                break;
            }
            System.out.print(doubleArr[i] + ", ");
        }
            System.out.print("\n");
        for (int i=numbers.length-1; i >= 0; i=i-1) {
            if (i == 0) {
                System.out.print(numbers[i]);
                break;
            }
            System.out.print(numbers[i] + ", ");
        }
            System.out.print("\n");


        //Задача4
        for (int i=0; i < arr.length; i++) {
            if (arr[i] % 2 != 0)
                arr[i] = arr[i] + 1;
            System.out.print(arr[i] + " ");
        }



    }
}
