package homework4;


import java.util.Arrays;

public class Homework {
        public static void main(String[] args) {
 int[] array = {1, 3, 4, 6, 7, 10, 15, };
 int[] arrays = {-1, -2, -3, -4, -5, -6, -7};
            System.out.println("array:" +Arrays.toString(array));
            System.out.println("arrays:" +Arrays.toString(arrays));
            System.arraycopy(array, 1, arrays, 2,  3);
            System.out.println("arrays after arraycopy:" +Arrays.toString(arrays));
        }
    }

