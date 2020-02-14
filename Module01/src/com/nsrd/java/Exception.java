package com.nsrd.java;

public class Exception {
    public void student() {
        try {
            int a[] = new int[2];
            System.out.println("Access element three :" + a[2]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception thrown  :" + e);
        } finally {
            System.out.println(418);
        }


    }

    @Override
    public String toString() {
        return "Exception{}";
    }
}

