package com.example.model;

import java.util.Scanner;

public class Coins {
    public void LogicInfo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Tangalar soni nechta?");
        int number = scanner.nextInt();
        int[] coin = new int[number];
        for (int i = 0; i < coin.length; i++) {
            coin[i] = 2;
        }
        System.out.println("Qaysi indeksda turgan tanganing massasi yengil?");
        coin[scanner.nextInt()] = 1;
        int sum1 = 0;
        int sum11 = 0;
        int sum12 = 0;
        int sum13 = 0;
        int sum2 = 0;
        int sum21 = 0;
        int sum22 = 0;
        int sum23 = 0;
        int sum31 = 0;
        int sum32 = 0;
        int sum33 = 0;
        int count = 0;
        boolean shart = true;


        while (shart) {

            int razmer = coin.length / 3;


            for (int i = 0; i < razmer; i++) {
                sum1 += coin[i];
            }
            // sum1 ni ichki yig'indilari.
            int a = razmer / 3;
            for (int i = 0; i < a; i++) {
                sum11 += coin[i];
            }
            for (int i = a; i < 2 * a; i++) {
                sum12 += coin[i];
            }
            for (int i = 2 * a; i < razmer; i++) {
                sum13 += coin[i];
            }
            //sum2 ni ichki yig'indilari.
            for (int i = razmer; i < razmer + a; i++) {
                sum21 += coin[i];
            }
            for (int i = razmer + a; i < razmer + 2 * a; i++) {
                sum22 += coin[i];
            }
            for (int i = razmer + 2 * a; i < razmer * 2; i++) {
                sum23 += coin[i];
            }
            for (int i = razmer; i < razmer * 2; i++) {
                sum2 += coin[i];
            }
            //sum3 ni ichki yig'indilari.
            for (int i = razmer * 2; i < razmer * 2 + a; i++) {
                sum31 += coin[i];
            }
            for (int i = razmer * 2 + a; i < razmer * 2 + 2 * a; i++) {
                sum32 += coin[i];
            }
            for (int i = razmer * 2 + a; i < coin.length; i++) {
                sum33 += coin[i];
            }
            count++;
            if (sum1 == sum2) {
                count++;
                if (sum31 == sum32) {
                    if(sum33 < 2) {
                        System.out.println(count + " marta tortganda " + sum33);
                        shart = false;
                    }
                } else if (sum31 > sum32) {
                    if(sum32 < 2) {
                        System.out.println(count + " marta tortganda " + sum32);
                        shart = false;
                    }
                } else {
                    if(sum31 < 2) {
                        System.out.println(count + " marta tortganda " + sum31);
                        shart = false;
                    }
                }
            } else if (sum1 > sum2) {
                count++;
                if (sum21 == sum22) {
                    if(sum23 < 2) {
                        System.out.println(count + " marta tortganda " + sum23);
                        shart = false;
                    }
                } else if (sum21 > sum22) {
                    if(sum22 < 2) {
                        System.out.println(count + " marta tortganda " + sum22);
                        shart = false;
                    }
                } else {
                    if(sum21 < 2) {
                        System.out.println(count + " marta tortganda " + sum21);
                        shart = false;
                    }
                }
            } else {
                count++;
                if (sum11 == sum12) {
                    if(sum13 < 2) {
                        System.out.println(count + " marta tortganda " + sum13);
                        shart = false;
                    }
                } else if (sum11 > sum12) {
                    if(sum12 < 2) {
                        System.out.println(count + " marta tortganda " + sum12);
                        shart = false;
                    }
                } else {
                    if(sum11 < 2) {
                        System.out.println(count + " marta tortganda " + sum11);
                        shart = false;
                    }
                }
            }
        }
    }
}
