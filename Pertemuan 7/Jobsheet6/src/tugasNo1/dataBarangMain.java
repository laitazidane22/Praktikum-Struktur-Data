/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasNo1;

import java.util.Scanner;

/**
 *
 * @author E P H I N
 */
public class dataBarangMain {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);
        dataBarang data =  new dataBarang();
        int jumBrg = 4;
        int stk, harga;
        
        for(int i=0; i<jumBrg; i++){
            System.out.print("Nama Barang = ");
            String nama = s.nextLine();
            System.out.print("Stok = ");
            stk = s1.nextInt();
            System.out.print("Harga = ");
            harga = s1.nextInt();          
            
            barang m = new barang(nama, stk, harga);
            data.tambah(m);
        }
        
        System.out.println("-------------------------------");
        System.out.println("Data barang sebelum sorting = ");
        data.tampil();
        System.out.println("");
               
        System.out.println("-------------------------------");
        System.out.println("Data barang setelah insertion desc berdasarkan stok = ");
        data.insertion();
        data.tampil();
        System.out.println("");               
        
        System.out.println("-------------------------------");
        System.out.println("Data barang setelah shell sort descending  berdasarkan stok = ");
        data.shellSort();
        data.tampil();
        System.out.println("-------------------------------");
        System.out.println("Mencari Barang ");
        data.cari(data.nm);
        
      
    }
}
