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
public class ProsesDataSiswa {
    Siswa dataSiswa[] = new Siswa[6];
    
    int idx;
    String nis;
    Scanner sc = new Scanner(System.in);

    
    void tambah(Siswa m){
        if (idx < dataSiswa.length) {
            dataSiswa[idx] = m;
            idx++;
        }else{
            System.out.println("Data sudah penuh!!");
        }
    }
    
    void tampil(){
        for(Siswa m : dataSiswa){
            m.tampil();
            System.out.println("--------------------------");
        }
    }
   
     void cari(String n){       
        System.out.print("Masukkan NISN: ");
        nis = sc.next();
        int a =0;
        for(int i=0; i<dataSiswa.length; i++){
            if( dataSiswa[i].nisn.equalsIgnoreCase(nis)){
                
                System.out.println("NISN            : "+dataSiswa[i].nisn);                
                System.out.println("Nama            : " + dataSiswa[i].nama);
                System.out.println("Alamat          : " + dataSiswa[i].alamat);
                System.out.println("Tahun Masuk     : " + dataSiswa[i].tahun);
                System.out.println("Nilai           : " + dataSiswa[i].nilai);     
                
            a=i;
            } 
        }
         
    }
   void insertion(){
       for(int i=1; i <= dataSiswa.length-1; i++ ){
           Siswa temp = dataSiswa[i];          
           int j = i-1;
           while(j >= 0 && dataSiswa[j].nilai < temp.nilai){
               dataSiswa[j+1] = dataSiswa[j];
               j = j-1;
           }
           dataSiswa[j+1] = temp;
       }
       
   }
}
