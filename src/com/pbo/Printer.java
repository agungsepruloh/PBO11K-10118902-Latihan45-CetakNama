package com.pbo;

/*
 * #Author
 * Nama  : Agung Sepruloh
 * NIM   : 10118902
 * Kelas : IF-11K
 * Deskripsi Program : program ini berguna untuk melakukan fungsi printer atau tampil data
 *
 */

import java.util.Scanner;

public class Printer {

    private int jmlCetak;
    private String nama;

    public int getJmlCetak() {
        return jmlCetak;
    }

    public String getNama() {
        return nama;
    }

    public void setJmlCetak(int jmlCetak) {
        this.jmlCetak = jmlCetak;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void cetak(String nama) {
        System.out.println("\nNama anda\t: ".concat(nama));
    }

    public void cetak(int jmlCetak, String nama) {
        System.out.println("Hasil cetak\t: ");
        for (int i = 0; i < jmlCetak; i++) {
            System.out.println(String.format("%d. %s", i+1, nama));
        }
    }

    public static void main(String[] args) {
        Printer printer = new Printer();
        System.out.print("Masukkan nama anda\t: ");
        Scanner scanner = new Scanner(System.in);
        printer.setNama(scanner.nextLine());
        System.out.print("Mau cetak nama berapa kali?\t: ");
        Scanner scanner1 = new Scanner(System.in);
        printer.setJmlCetak(scanner1.nextInt());

        printer.cetak(printer.getNama());
        printer.cetak(printer.getJmlCetak(), printer.getNama());
    }
}
