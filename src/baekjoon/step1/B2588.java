package baekjoon.step1;

import java.util.Scanner;

/**
 * @date 2022.04.29
 * @author DevJeong
 */
public class B2588 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        scanner.close();

        int[] arrayB = String.valueOf(b).chars().map(Character::getNumericValue).toArray();
        int three = a * arrayB[arrayB.length - 1];
        int four = a * arrayB[arrayB.length - 2];
        int five = a * arrayB[arrayB.length - 3];
        int six = a * b;

        System.out.println(three);
        System.out.println(four);
        System.out.println(five);
        System.out.println(six);
    }
}
