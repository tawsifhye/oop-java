package practiceprogram;

import java.util.Scanner;

public class Array1 {

    int[] arr;
    int n, i;
    int sum = 0;
    double avg;

    Scanner input = new Scanner(System.in);

    Array1() {
        System.out.print("Set the array numbers: ");
        n = input.nextInt();
        arr = new int[n];

    }

    void setarray() {
        for (i = 0; i < n; i++) {
            arr[i] = input.nextInt();

        }

    }

    void sum() {
        for (i = 0; i < n; i++) {
            sum = sum + arr[i];
        }
        System.out.println("Sum: " + sum);
    }

    void avg() {
        System.out.println("Average:" + sum / arr.length);
    }

    void dislplay() {
        System.out.print("Array outputs: ");
        for (i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("Length of array " + arr.length);
    }

    void maxmin() {

        int max = arr[0];
        int min = arr[0];
        for (i = 0; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Maximum:" + max);

        for (i = 0; i < n; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }

        }
        System.out.println("Minimum:" + min);

    }

}
