package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        double[] array = new double[count];

        for (int i = 0; i < count; i++){
            array[i] = scanner.nextDouble();
        }
        for (int i = 0; i < count; i++){
            if (i == 0 || i == count - 1)
                System.out.print(array[i] + " ");
            else
                System.out.print((array[i - 1] + array[i] + array[i + 1])/3 + " ");
        }
    }
}