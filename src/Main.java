public class Main {
    public static void main(String[] args) {
        System.out.println("Задача № 1!");

        int[] arrays = new int[3];
        arrays[0] = 1;
        arrays[1] = 2;
        arrays[2] = 3;

        double[] weightsD = {1.57, 7.654, 9.986};

        short[] weightsS = new short[] {4,5,6,7,8};

        System.out.println("Задача № 2!");

        for (int i = 0; i < 1; i++) {
            System.out.print(" " + arrays[0] + ", " + arrays[1] + ", " + arrays[2] + " " );

        for (double d = 0; d < 1; d++) {
            System.out.print(" " + weightsD[0] + ", " + weightsD[1] + ", " + weightsD[2] + " ");

            for (short s = 0; s < 1; s++) {
                System.out.print(" " + weightsS[0] + ", " + " " + weightsS[1] + ", " + " " + weightsS[2] + ", " + " "
                        + weightsS[3] + ", " + " " + weightsS[4] + " ");
            }
        }  }
    }
}