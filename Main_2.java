import java.util.Arrays;

public class Main_2 {
// 1 задание
    public static void main(String[] args) {

        int[] z = new int[8];
        int c = 0;

        for (int i = 3; i <= 17; i += 2) {
            z[c] = i;
            c++;
        }

        System.out.println(Arrays.toString(z));

// 2 задание

        double[] x = new double[13];

        for (int i = 0; i < x.length; i++) {
            x[i] = (Math.random() * 26 - 15);
        }        /* т.к. Math.random() выдает случайное число в диапазоне [0, 1),
                                                                                        то увеличим диапазон до нужного нам(от -15 до 9) */

        System.out.println(Arrays.toString(x));

// 3 задание

        double[][] z2 = new double[8][13];
        int[] s = {7, 9, 11, 13};

        for(int i = 0; i < 8; i++) {
            for(int j = 0; j < 13; j++) {
                if (z[i] == 5) {
                    z2[i][j] = formule_1(x[j]);
                } if (Arrays.binarySearch(s, 0, s.length, z[i]) >= 0) {
                    z2[i][j] = formule_2(x[j]);
                } else {
                    z2[i][j] = formule_3(x[j]);
                }
            }
        }
        for(int i = 0; i < 8; i++) {
            for(int j = 0; j < 13; j++){
                System.out.printf("%.5f \t", z2[i][j]);
            }
            System.out.println();
        }

    }

    public static double formule_2(Double arg) {
        return Math.pow((Math.pow(Math.pow(0.25D / ((1/2D) + arg), 2), 1 / (3 * Math.log(Math.abs(arg)))) - (1/2D)) / 3, Math.pow(arg, arg / 2)); }

    public static double formule_1(Double arg) {
        return Math.atan(Math.cos(Math.pow((1 - Math.exp(arg)), 3))); }

    public static double formule_3(Double arg) {
        return Math.cos(Math.pow(Math.pow((Math.exp(arg) +2) / 0.5D, 2), Math.pow(arg, (1/4D) * arg))); }
}