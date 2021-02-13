package com.company;

public class Main {

    public static void main(String[] args) {
        int month = 4;
//  Оператор if-else-if
        if (month == 6 || month == 7 || month == 8) {
            System.out.println("Лето");
        } else if (month == 9 || month == 10 || month == 11) {
            System.out.println("Осень");
        } else if (month == 12 || month == 1 || month == 2) {
            System.out.println("Зима");
        } else if (month == 3 || month == 4 || month == 5) {
            System.out.println("Весна");
        } else if (month > 12 || month < 0) {
            System.out.println("Нету такого месяца");
        }
//  Оператор switch
        switch (month) {
            case 1:
            case 2:
            case 12:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Нету такого месяца");
                break;
        }
// Создаем и инициализируем одномерный массив (упрощенный синтаксис)
        int[] array = {1, 5, 7, 12, 5, 8, 3, 2, 11, 17};
// Выводим одномерный массив в консоль в обратном порядке
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
// Создаем и инициализируем многомерный массив
        int[][] squareArray = new int[2][3];
        squareArray[0][0] = 4;
        squareArray[0][1] = 3;
        squareArray[0][2] = 2;
        squareArray[1][0] = 1;
        squareArray[1][1] = 2;
        squareArray[1][2] = 5;
// Выводим многомерный массив в консоль в виде таблицы
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("["+i+"]["+j+"]" + squareArray[i][j]+" ");
            }
            System.out.println();
        }
    }
}
