package main.Task2;

import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class TaskTwo {
    private static String realName = "Вячеслав";

    public static void main(String[] args) throws UnsupportedEncodingException {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите имя: ");
        String sc = in.nextLine();
        String name = new String(sc.getBytes(), "cp866");

        if (realName.equals(name.trim())) {
            System.out.print("Привет, " + name.trim());
        } else {
            System.out.print("Нет такого имени");
        }
    }
}