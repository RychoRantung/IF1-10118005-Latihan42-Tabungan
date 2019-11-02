/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10118005.latihan42.tabungan;

import java.util.Scanner;

/**
 *
 * @author USER
 * NAMA : Rycho Rantung
 * KELAS : IF1
 * NIM : 10118005
 * Deskripsi Program : Berisi program yang menghitung tabungan
 */
public class IF110118005Latihan42Tabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner (System.in);
        
        System.out.println("=====Program Penarikan Uang=====");
        System.out.print("Masukkan Saldo Awal : ");
        Tabungan tb = new Tabungan(sc.nextInt());
        System.out.print("Jumlah Uang Yang Diambil : ");
        int jumlah = sc.nextInt();
        System.out.println("Saldo Anda Sekarang : " + tb.ambilUang(jumlah));
        
        
        
    }
    
}
