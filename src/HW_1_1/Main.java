package HW_1_1;

import com.sun.deploy.security.SessionCertStore;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //1.заменить значения массива заполненного 0 и 1 инверсивно
        int[] changeParameters = new int[7];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < changeParameters.length; i++) {
            System.out.println("Ведите значение ячейки массива " + i + " (равное 0 или 1)");
            do {
                changeParameters[i] = scanner.nextInt();
            } while (changeParameters[i] > 1);
        }
        for (int i = 0; i < changeParameters.length; i++) {
            changeParameters [i] = (changeParameters[i]== 0 ? 1 : 0);
        }
        for (int i = 0; i < changeParameters.length; i++) {
            System.out.print((changeParameters[i]) + "|");
        }
        System.out.println("");

        //2.заполнить массив данными с помощью цикла
        int[] giveParameters = new int[8];
        int a = 0;
        for (int i = 0; i < giveParameters.length; i++) {
            giveParameters[i] = a;
            System.out.println(giveParameters[i]);
            a = a + 3;
        }

        //заданный массив изменить с помощью выборки
        int selectAndChange[] = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < selectAndChange.length; i++) {
            if (selectAndChange[i] < 6) {
                selectAndChange[i] = selectAndChange[i] * 2;
                System.out.println("Значение умножено на 2: " + selectAndChange[i]);
            } else {
                System.out.println("Значение без изменений: " + selectAndChange[i]);
            }
        }
        System.out.println("");
    }

    public static void sqArr(String [] args) {
        //двумерный массив с заполнением диагонали единицами
        int arrDouble[][] = new int[4][4];
        for (int y=0; y < arrDouble.length; y++) {
            int a=6;
            for (int x=0; x < arrDouble.length; x++) {
                arrDouble[y][x] = a++;
                System.out.print(arrDouble[y][x] + " ");
            }
            System.out.println("");
        }
        System.out.println("После замены диагональных значений: ");

        for (int y=0; y < arrDouble.length; y++) {
            arrDouble[y][y] = 1;
            for (int x=0; x < arrDouble.length; x++) {
                System.out.print(arrDouble[y][x] + " ");
                }
            System.out.println("");
        }
    }

    public static void minMax(String [] args) {
        int arrMinMax[] = {1, 2, 3, 4, 3, 2, 1};
        System.out.println("Наш массив: ");
        int max = 0;
        int min=0;
        for (int y = 0; y < arrMinMax.length; y++) {
            if (arrMinMax[y] > max) {
                max = arrMinMax[y];
            }
            int a = max;
            if (arrMinMax[y] < a) {
                min = arrMinMax[y];
            }
            System.out.print(arrMinMax[y] + " ");
        }
        System.out.println();
        System.out.println("Максимальное значение в массиве: " + max);
        System.out.println("Мминимальное значение в массиве: " + min);
    }

}
