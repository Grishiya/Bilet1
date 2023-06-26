import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arrayArray = {1, 2, 3, 4, 5, 6, 7, 11, 8, 9, 10, 11};
        System.out.println(Arrays.toString(flipTheArray(arrayArray)));
    }

    public static int[] flipTheArray(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int tmp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = tmp;
        }
        return array;
    }
}