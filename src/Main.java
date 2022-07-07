import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задача № 1!");

        int[] arrays = new int[3];
        arrays[0] = 1;
        arrays[1] = 2;
        arrays[2] = 3;

        double[] arraysD = {1.57, 7.654, 9.986};

        boolean[] arraysB = {false,true,false};

        System.out.println("Задача№ 2!");

        for (int i = 0; i < arrays.length; i++) {
            if (i < arrays.length - 1)
            System.out.print(arrays[i] +", ");
            else
            System.out.println(arrays[i]);
        }
        for (int i = 0; i < arraysD.length; i++) {
            if (i < arraysD.length - 1)
                System.out.print(arraysD[i] +", ");
            else
                System.out.println(arraysD[i]);
        }
        for (int i = 0; i < arraysB.length; i++) {
            if (i < arraysB.length - 1)
                System.out.print(arraysB[i] +", ");
            else
                System.out.println(arraysB[i]);
        }
        System.out.println();
        System.out.println("Задача № 3!");
        //Распечатать все элементы всех трех массивов в обратном порядке.
        for (int i = arrays.length-1; i >=0 ; i--) {
            if (i > 0)
            System.out.print(arrays[i] + ", ");
            else if (i == 0)
                System.out.println(arrays[i]);
        }
        for (int i = arraysD.length-1; i >=0 ; i--) {
            if (i > 0)
                System.out.print(arraysD[i] + ", ");
            else if (i == 0)
                System.out.println(arraysD[i]);
        }
        for (int i = arraysB.length-1; i >=0 ; i--) {
            if (i > 0)
                System.out.print(arraysB[i] + ", ");
            else if (i == 0)
                System.out.println(arraysB[i]);
        }
        System.out.println();
        System.out.println("Задача № 4!");
        /*Пройдитесь по первому целочисленному массиву и все нечетные числа в нем сделайте четными (нужно прибавить 1). */
        for (int i = 0; i< arrays.length;i++){
            if (arrays[i]%2==1)
                arrays[i]++;

                if (i < arrays.length - 1)
                    System.out.print(arrays[i] +", ");
                else
                    System.out.println(arrays[i]);
        }


    }}