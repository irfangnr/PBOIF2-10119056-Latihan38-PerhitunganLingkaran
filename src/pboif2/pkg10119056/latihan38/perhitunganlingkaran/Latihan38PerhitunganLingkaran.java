/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119056.latihan38.perhitunganlingkaran;
import java.util.Scanner;
/**
 * @author ACER
 * NAMA     : Irfan Ginanjar
 * KELAS    : PBOIF2
 * NIM      : 10119056
 * Deskripsi Program: Program ini berisi program untuk menampilkan perhitungan lingkaran
 */

public class Latihan38PerhitunganLingkaran {

    public static void main(String[] args) {
        
        Lingkaran hitung=new Lingkaran();
        Scanner masukan=new Scanner(System.in);
        System.out.print("Masukan nilai diameter lingkaran: ");
        hitung.diameter=masukan.nextInt();
        
        System.out.println("=====Hasil Perhitungan Lingkaran=====");
        System.out.println("Jari-jari Lingkaran= "+hitung.jariJari()+" cm");
        System.out.println("Luas lingkaran = "+hitung.luas()+" cm");
        System.out.println("Keliling Lingkaran = "+hitung.keliling()+" cm");
    }
    
}
