public class Main {
    public static void main(String[] args) {
        System.out.println("Задача № 1!");

        int[] arrays = new int[3];
        int arrSize = arrays.length;
        arrays[0] = 1;
        arrays[1] = 2;
        arrays[2] = 3;

        double[] weightsD = {1.57, 7.654, 9.986};

        short[] weightsS = new short[] {4,5,6,7,8};
        int arrSizeS = arrays.length;
        System.out.println("Задача № 2!");

        for (int i = 0; i < 1; i++) {
            System.out.println(" " + arrays[0] + ", " + arrays[1] + ", " + arrays[2] + " " );

        for (double d = 0; d < 1; d++) {
            System.out.println(" " + weightsD[0] + ", " + weightsD[1] + ", " + weightsD[2] + " ");

            for (short s = 0; s < 1; s++) {
                System.out.println(" " + weightsS[0] + ", " + " " + weightsS[1] + ", " + " " + weightsS[2] + ", " + " "
                        + weightsS[3] + ", " + " " + weightsS[4] + " ");



        System.out.println("Задача № 3!");
        //Распечатать все элементы всех трех массивов в обратном порядке.
                for (int iNew = 0 ; iNew < arrSize ;iNew++){
                   System.out.print(arrays[arrays.length-arrays[iNew]] + ",");


                }
        }}
    }}}
