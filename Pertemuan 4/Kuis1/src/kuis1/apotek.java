/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuis1;

/**
 *
 * @author E P H I N
 */
public class apotek {
    public String nama;
    public String kategori;
    public int stok;
    public int jumlah;
    public int max;
    
    public apotek(String nm, String kt, int st, int jml){
        nama = nm;
        kategori = kt;
        stok = st;
        jumlah = jml;
    }

    public void tampilObat(){
        System.out.println("Nama obat: " +nama);
        System.out.println("Kategori obat: " +kategori);
        System.out.println("Jumlah stok: " +stok);
        System.out.println("Jumlah yang terjual: " +jumlah);
    }        
    
    public int hitungSisa(){
        return stok-jumlah;
    }
    
    public int cariObatPalingLaku(){
        if(hitungSisa() > max){
            max = hitungSisa();
        }
        return max;
    }
}

