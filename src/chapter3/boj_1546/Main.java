package chapter3.boj_1546;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        final int N = Integer.parseInt(br.readLine());
        int[] array = new int[N];
        final String number = br.readLine();
        final String[] split = number.split(" ");

        for (int i = 0; i < split.length; i++) {
            array[i] = Integer.parseInt(split[i]);
        }

        int max = 0;
        double sum = 0;

        for (int i : array) {
            if (i > max) {
                max = i;
            }
        }

        for (int i : array) {
            sum += (double) i / max * 100;
        }

        System.out.println(sum / array.length);
    }
}
