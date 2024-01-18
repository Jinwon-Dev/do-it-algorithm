package chapter3.boj_11720;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        final int N = Integer.parseInt(br.readLine());
        final String number = br.readLine();
        int answer = 0;

        for (int i = 0; i < N; i++) {
            answer += Integer.parseInt(String.valueOf(number.charAt(i)));
        }

        System.out.println(answer);
    }
}
