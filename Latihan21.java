
package Pertemuan5;

import java.util.Scanner;

public class Latihan21 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Banyaknya Mahasiswa: ");
        int jumlahMahasiswa = input.nextInt();
        int[] nilai = new int[jumlahMahasiswa];
        int totalNilai = 0;

        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.print("Nilai Mahasiswa ke-" + (i + 1) + " : ");
            nilai[i] = input.nextInt();
            totalNilai += nilai[i];
        }

        double rataRata = (double) totalNilai / jumlahMahasiswa;
        System.out.printf("Maka, Rata-rata Nilainya adalah %.1f%n", rataRata);
    }
 }


