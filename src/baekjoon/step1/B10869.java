package baekjoon.step1;

import java.util.Scanner;

/**
 * @date 2022.03.28
 * @author DevJeong
 */
public class B10869 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        scanner.close();

        System.out.println(A+B);
        System.out.println(A-B);
        System.out.println(A*B);
        System.out.println(A/B);
        System.out.println(A%B);
    }
}
