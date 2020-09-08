package ru.mirea.prak1_2;

public class Main {
    public static void main(String[] args) {
        double result = 0;
        for(double j = 1; j <= 10; j++){
            System.out.print((int)j + ") ");
            System.out.format("%.3f%n", 1/j);
            result += 1/j;
        }
        System.out.print("\n" + "Сумма первых десяти чисел гармонического ряда: ");
        System.out.format("%.3f%n", result);
    }
}
