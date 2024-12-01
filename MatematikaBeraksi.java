/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Asus
 */
// Class MatematikaCanggihBeraksi
public class MatematikaBeraksi {
    public class MatematikaCanggihBerkasi {
        public static void main(String[] args) {
            //Membuat objek MatematikaCanggih
            MatematikaCanggih matematikaCanggih = new MatematikaCanggih();
            
            //Contoh operasi
            int hasiltambah = matematikaCanggih.tambah(10, 20);
            int hasilkali = matematikaCanggih.kali(10, 30);
            int hasilmodulus = matematikaCanggih.modulus(20, 30);
            
            //Menampilkan hasil
            System.out.println("Hasil Penjumlahan: " + hasiltambah);
            System.out.println("Hasil Perkalian: " + hasilkali);
            System.out.println("Hasil Modulus: " + hasilmodulus);
        }
    }
}
