package com.oopjava;

public class MethodVoid {
    public static void main(String[] args) {
        // memanggil method pemWeb
        Web dasar = new Web();
        dasar.pemWeb();
        System.out.println();

        // memanggil method pemWebFw
        Web framework = new Web();
        framework.pemWebFw();
    }
}