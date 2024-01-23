package chapter3.boj_11659;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        final String[] split = reader.readLine().split(" ");

        final int data = Integer.parseInt(split[0]); // 5
        final int number = Integer.parseInt(split[1]); // 3

        final long[] arr = new long[data + 1];

        // 5, 4, 3, 2, 1
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());

        for (int i = 1; i <= data; i++) {
            arr[i] = arr[i - 1] + Integer.parseInt(tokenizer.nextToken());
            // arr[1] = arr[0] + 5 -> 5
            // arr[2] = arr[1] + 4 -> 9
            // arr[3] = arr[2] + 3 -> 12
            // arr[4] = arr[3] + 2 -> 14
            // arr[5] = arr[4] + 1 -> 15
        }

        for (int i = 0; i < number; i++) {

            // 1 3, 2 4, 5 5
            tokenizer = new StringTokenizer(reader.readLine());
            final int a = Integer.parseInt(tokenizer.nextToken());
            final int b = Integer.parseInt(tokenizer.nextToken());

            // arr[3] - arr[0] = 12
            // arr[4] - arr[1] = 9
            // arr[5] - arr[4] = 1
            System.out.println(arr[b] - arr[a - 1]);
        }
    }
}
