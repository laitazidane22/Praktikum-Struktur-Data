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
public class barang {
    String nama, nm;
    int stok, harga;  
    

    public barang(String n, int stk, int hrg) {
        nama = n;
        stok = stk;
        harga = hrg;
        
    }
    
   
    
    void tampil(){
        System.out.println("Nama Barang = " +nama);
        System.out.println("Stok = "+stok);
        System.out.println("Harga = "+harga);
        
    }
}
