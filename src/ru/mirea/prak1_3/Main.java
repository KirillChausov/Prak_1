package ru.mirea.prak1_3;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] arr_1 = new int[10];
        int[] arr_2 = new int[10];
        Random r = new Random();

        for(int i = 0; i < arr_1.length; i++) {
            arr_1[i] = r.nextInt();
        }

        for(int i = 0; i < arr_2.length; i++){
            arr_2[i] = (int) (Math.random() * (1000*(i+5)));
        }
        System.out.println("Первый массив (Random): ");

        for(int i = 0; i < arr_1.length; i++){
            System.out.println(arr_1[i]);
        }
        System.out.println("Второй массив (Math): ");

        for(int i = 0; i < arr_2.length; i++){
            System.out.println(arr_2[i]);
        }

        boolean srt = true;
        while(srt){
            srt = false;
            for(int i = 1; i < arr_1.length; i++){
                if(arr_1[i] < arr_1[i-1]){
                    int tmp = arr_1[i];
                    arr_1[i] = arr_1[i-1];
                    arr_1[i-1] = tmp;
                    srt = true;
                }
            }
        }
        System.out.println("Отсортированный первый массив: ");
        for(int i = 0; i < arr_1.length; i++){
            System.out.println(arr_1[i]);
        }

        srt = true;
        while(srt){
            srt = false;
            for(int i = 1; i < arr_2.length; i++){
                if(arr_2[i] < arr_2[i-1]){
                    int tmp = arr_2[i];
                    arr_2[i] = arr_2[i-1];
                    arr_2[i-1] = tmp;
                    srt = true;
                }
            }
        }
        System.out.println("Отсортированный второй массив: ");
        for(int i = 0; i < arr_2.length; i++){
            System.out.println(arr_2[i]);
        }
    }
}
