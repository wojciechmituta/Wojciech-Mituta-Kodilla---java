package com.kodilla.testing.Zadania;

public class Palindrom {

    public static void main(String[] args) {


        String tekst = "aaaaba";
        char arr[] = tekst.toCharArray();
        int h = tekst.length();
        int kk = 2;
        for (int i = 0; i < h/2; i++) {

            if (arr[i] != arr[h-1]) {
                kk = 1;
            } else {
                kk = 0;
            }

            h--;
        }

        if (kk == 0)
            System.out.println("Jest palindromem");
        if (kk == 1)
            System.out.println("Nie jest palindromem");
    }
}