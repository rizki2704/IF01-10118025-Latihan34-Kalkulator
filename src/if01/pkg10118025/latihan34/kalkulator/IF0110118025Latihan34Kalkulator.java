/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if01.pkg10118025.latihan34.kalkulator;

import java.util.Scanner;

/**
 * Nama     : Rizki Restu Illahi
 * NIM      : 10118025
 * Kelas    : IF-01
 */
public class IF0110118025Latihan34Kalkulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        Kalkulator hitung = new Kalkulator();
        
        System.out.println("===Aplikasi Kalkulator Bilangan===");
        System.out.print("Masukkan Angka ke-1 : ");
        hitung.value1 = scan.nextDouble();
        System.out.print("Masukkan Angka ke-2 : ");
        hitung.value2 = scan.nextDouble();
        
        System.out.printf("%nHasil Pertambahan\t: %.1f%n", hitung.tambahBilangan());
        System.out.printf("Hasil Pengurangan\t: %.1f%n", hitung.kurangBilangan());
        System.out.printf("Hasil Perkalian\t\t: %.1f%n", hitung.kaliBilangan());
        System.out.printf("Hasil Pembagian\t\t: %.1f%n", hitung.bagiBilangan());
        System.out.printf("Hasil Sisa\t\t: %.1f%n", hitung.sisaBilangan());
    }
    
}
