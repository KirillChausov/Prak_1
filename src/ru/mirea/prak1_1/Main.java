package ru.mirea.prak1_1;

public class Main {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int result_1 = 0, result_2 = 0, result_3 = 0;

        for(int j = 0; j < arr.length; ++j){
            result_1 += arr[j];
        }

        int j = 0;

        while(j < arr.length){
            result_2 += arr[j];
            j++;
        }

        j = 0;

        do{
            result_3 += arr[j];
            j++;
        }while(j < arr.length);

        System.out.println("Сумма элементов целочисленного массива, полученная с помощью цикла for: " + result_1);
        System.out.println("Сумма элементов целочисленного массива, полученная с помощью цикла while: " + result_2);
        System.out.println("Сумма элементов целочисленного массива, полученная с помощью цикла do while: " + result_3);
    }
}
