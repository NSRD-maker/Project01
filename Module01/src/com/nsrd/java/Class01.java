package com.nsrd.java;
/**
 * @author YanYan
 */
public class Class01 {
    public static void main(String[] args) {
        int a = 888;
        Class02 Hi = new Class02();
        Hi.Hello(1314);
        System.out.println(Hi.p);
//        int[] s = new int[]{1, 2, 3, 4, 5, 6};
        int s = 0;
        for (int i = 0; i <= 100; i++) {
            s = s + i;
        }

    }
}