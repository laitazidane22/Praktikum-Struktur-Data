/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SMA;

import java.util.Scanner;

/**
 *
 * @author E P H I N
 */
public class Siswa {
    String nisn, nama, alamat;
    int tahun;
    int nilai;
    
    
    public Siswa(String nisn, String nm, String almt, int thn, int nilai){
        this.nisn = nisn;
        this.nama = nm;
        this.alamat = almt;
        this.tahun = thn;
        this.nilai = nilai;
    }
    
       
    
    public void tampil() {
        System.out.println("NISN         : " + this.nisn );
        System.out.println("Nama         : " + this.nama);
        System.out.println("Alamat       : " + this.alamat);
        System.out.println("Tahun Masuk  : " + this.tahun);
        System.out.println("Nilai        : " + this.nilai);
    }
}
