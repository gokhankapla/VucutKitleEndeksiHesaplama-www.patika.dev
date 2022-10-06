package com.gokhankaplan.vucutkitleendeksihesaplama;

import java.util.Scanner;

public class VucutKitleEndeksiHesaplama {
    public static void main(String[] args) {

        double boy;
        int kilo;

        Scanner input = new Scanner(System.in);
        System.out.println("Kilonuzu kg cinsinden giriniz: ");
        kilo = input.nextInt();
        System.out.println("Boyunuzu metre cinsinden giriniz: ");
        boy = input.nextDouble();
        double KitleEndeksi = kilo / (boy * boy);
        System.out.println("Kitle Endeksiniz: " + KitleEndeksi);




    }
}
