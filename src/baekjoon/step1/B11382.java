package baekjoon.step1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/**
 * @date 2023.10.04
 * @author JeongJinUng
 */
public class B11382 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long answer = 0;

        while (st.hasMoreTokens())  {
            answer += Long.parseLong(st.nextToken());
        }

        bw.write(String.valueOf(answer));
        bw.flush();
        bw.close();
    }
}
