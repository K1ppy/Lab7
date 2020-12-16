package com.bsu;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int mas[] = new int[n];
        for (int i = 0; i < n; i++) {
            mas[i] = (int) (Math.random() * (10000));
        }
        System.out.println(n);
        for (int i = 0; i < n; i++) {
            System.out.print(mas[i] + " ");
        }
        System.out.println();
        int sortWay = scanner.nextInt();
        MyThread sort = new MyThread(sortWay, mas);
        sort.start();
        try {
            sort.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for(int i = 0;i<n;i++){
            System.out.print(sort.getSortMas().get(i) + " ");
        }
    }

}