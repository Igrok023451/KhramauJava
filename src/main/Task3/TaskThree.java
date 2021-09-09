package main.Task3;

public class TaskThree {
    private static int constantNumber = 3;
    private static int[] number = {12,34,15,22,21};

    public static void main(String[] args) {
        for (int j : number) {
            if (j % constantNumber == 0) System.out.print(j + " ");
        }
    }
}