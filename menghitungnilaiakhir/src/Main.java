package com.install;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int absen , tugas , uts , uas ;
        char ket = ' ' ;
        String nim , nama , jurusan , matkul ;
        double Nilai ;

        System.out.print ("NIM    : ");
        nim = in.nextLine();
        System.out.print ("Nama    : ");
        nama = in.nextLine();
        System.out.print ("Jurusan    : ");
        jurusan = in.nextLine();
        System.out.print ("Matkul    : ");
        matkul = in.nextLine();

        System.out.print("Masukkan Nilai Absen : ");
        absen = in.nextInt();
        System.out.print("Masukkan Nilai Tugas : ");
        tugas = in.nextInt();
        System.out.print("Masukkan Nilai UTS: ");
        uts = in.nextInt();
        System.out.print("Masukkan Nilai UAS : ");
        uas = in.nextInt();

            Nilai = (absen * 0.1) + (tugas * 0.2) + (uts * 0.3) + (uas * 0.4);

            System.out.println("NIM : " + nim);
            System.out.println("Nama : " + nama);
            System.out.println("Jurusan: " + jurusan);
            System.out.println("Matkul : " + matkul);
            System.out.println( "Nilai Akhir : " + Nilai);

    }
}