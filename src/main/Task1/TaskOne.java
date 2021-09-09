package main.Task1;

import java.util.Scanner;

public class TaskOne {
    private static int constantNumber = 7;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число: ");
      while (!in.hasNextDouble()) {
          System.out.println("Пожалуйста введите число!");
          in.nextLine();
      }
        double number = in.nextDouble();
        if (number> constantNumber) System.out.print("Привет");
    }
}