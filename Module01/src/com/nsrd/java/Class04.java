package com.nsrd.java;

public class Class04 {


    int a = 1, s = 1;

//        int a = 0, s = 0;
//        while (a <= 100) {
//            if (a == 50) {
////                break;
//                a++;
//                continue;
//            }
//            s = s + a;
//            a++;
//        }
//        System.out.println(s);
//        System.out.println("break结束循环");
//        int[] a = {0, 1, 2, 3, 4, 5, 6, 7, 8};
//        for (int i = 0, k; i <= a.length / 2; i++) {
//            k = a[i];
//            a[i] = a[a.length - i - 1];
//            a[a.length - i - 1] = k;
//        }
//        System.out.println(Arrays.toString(a));
//        System.out.println(a.length / 2);
//        int s = 0;
//        for (int i = 0; i <= a; i++) {
//            s = s + i;
//        }
//        System.out.println(s);

    private String student = "TOM";

    public String getStudent() {
        return student;
    }

    public void setStudent(String student) {
        this.student = student;
    }
}
