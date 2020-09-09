package ru.mirea.prak1_4;

import java.util.Scanner;

public class Main {
    public static long fact(int n){
        int result = 1;
        if(n >= 1){
            for(int j = 2; j <= n; j++){
                result *= j;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        long result = fact(n);
        System.out.println(result);

    }
}
