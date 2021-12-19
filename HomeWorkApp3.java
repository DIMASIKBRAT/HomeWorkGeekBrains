import java.util.Arrays;
import java.util.Random;

public class HomeWorkApp3 {

    public static void main(String[] args) {
        final int ARRAY_SIZE_ONE = 40;
        final int ARRAY_SIZE_TWO = 100;
        int len = 10;
        String initialValue = "Hello";
        exerciseOne(ARRAY_SIZE_ONE);
        exerciseTwo(ARRAY_SIZE_TWO);
        exerciseThree();
        exerciseFour();
        exerciseFive(len, initialValue);
        exerciseSix(10);
    }

    private static void exerciseOne(int ARRAY_SIZE_ONE) {


        int[] array = new int[ARRAY_SIZE_ONE];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(0, 2);

        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1){
                array[i] = 0;
            } else{
                array[i] = 1;
            }
        }
        System.out.println(Arrays.toString(array));
    }

    private static void exerciseTwo(int ARRAY_SIZE_TWO) {
        int[] array = new int[ARRAY_SIZE_TWO];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
        System.out.println(Arrays.toString(array));
    }

    private static void exerciseThree() {

        int[] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9 , 1};
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6){
                array[i] *= 2;
            }

        }
        System.out.println(Arrays.toString(array));
    }

    private static void exerciseFour() {

        int[][] array = new int[10][10];

        for (int i = 0; i < array.length; i++) {

            array[i][array.length - 1 - i] = 1;

            for (int j = 0; j < array.length; j++) {

                if (i == j) {

                    array[i][j] = 1;

                }
            }
        }
    }

    private static String[] exerciseFive(int len, String initialValue) {
    String[] array = new String[len];
        for (int i = 0; i < array.length; i++) {
            array[i] = initialValue;
        }
        return array;
    }

    private static void exerciseSix(int arraySize) {
        int min = 0;
        int max = 0;
        Random random = new Random();
        int[] array = new int[arraySize];
        for (int i = 0; i < array.length ; i++) {
            array[i] = random.nextInt(-100, 101);
        }
        for (int i = 0; i < array.length ; i++) {
            if (array[i] > max) {
                max = array[i];
            } if (array[i] < min) {
                min = array[i];
            }
        }

    }
}




