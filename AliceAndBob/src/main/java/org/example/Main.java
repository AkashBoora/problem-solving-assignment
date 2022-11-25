package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n[] = {1, 1, 2, 2, 2, 3, 3, 3, 3, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5, 5, 6, 6, 6, 6, 6, 6, 6};
        int a[][] = {{1}, {2}, {1, 1}, {1, 2}, {2, 2}, {1, 1, 1}, {1, 1, 2}, {1, 2, 2}, {2, 2, 2}, {1, 1, 1, 1}, {1, 1, 1, 2}, {1, 1, 2, 2}, {1, 2, 2, 2}, {2, 2, 2, 2}, {1, 1, 1, 1, 1}, {1, 1, 1, 1, 2}, {1, 1, 1, 2, 2}, {1, 1, 2, 2, 2}, {1, 2, 2, 2, 2}, {2, 2, 2, 2, 2}, {1, 1, 1, 1, 1, 1}, {1, 1, 1, 1, 1, 2}, {1, 1, 1, 1, 2, 2}, {1, 1, 1, 2, 2, 2}, {1, 1, 2, 2, 2, 2}, {1, 2, 2, 2, 2, 2,}, {2, 2, 2, 2, 2, 2}};
        for (int i = 0; i < 27; i++) {
            System.out.println(i+1);
            findWhoWinstheGame(n[i], a[i]);
        }
    }

    private static void findWhoWinstheGame(int n, int[] a) {
        int even = 0, odd = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] % 2 == 0) even++;
            else odd++;
        }
        if (odd % 4 == 2) {
            System.out.println("Bob");
        } else if (odd % 4 == 3) {
            System.out.println("Alice");
        } else if (odd % 4 == 0) { // o+o=e 2players so 2*2=4 so %4
            System.out.println("Alice");
        } else if (odd % 4 == 1) {
            if (even % 2 == 1) { //e=e 2players 2*1=2 so %2
                System.out.println("Alice");
            } else {
                System.out.println("Bob");
            }
        }
    }
}