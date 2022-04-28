package baekjoon.step1;

import java.util.Scanner;

/**
 * @date 2022.04.28
 * @author DevJeong
 */
public class B18108 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        scanner.close();
        int bulgi = year - 543;

        System.out.println(bulgi);
    }
}
