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
    Siswa dataSiswa[] =  new Siswa[3];
    SiswaMain ret = new SiswaMain();    
    int idx;
    String nisn, nama, alamat, menu;
    int tahun, z = 0;
    int nilai1;
        
    Scanner getData = new Scanner(System.in);
    
    Scanner input = new Scanner(System.in);
    
     void tambah( Siswa m){
        if (idx < dataSiswa.length) {
            dataSiswa[idx] = m;
            idx++;
        }else{
            System.out.println("Data sudah penuh!!");
        }
    }
     
     void input(){
         for(int i = 0; i < dataSiswa.length; i++){
                    System.out.print("Masukkan NISN         : " );
                    nisn = getData.next();
                    System.out.print("Masukkan Nama         : " );
                    nama =  getData.next();
                    System.out.print("Masukkan Alamat       : " );
                    alamat = getData.next(); 
                    System.out.print("Masukkan Tahun Masuk  : " );
                    tahun = getData.nextInt();
                    System.out.print("Masukkan Nilai        : " );
                    nilai1 = getData.nextInt();
                    Siswa m = new Siswa(nisn, nama, alamat, tahun, nilai1);
                    tambah(m);
                    System.out.println("");
                }
         
         System.out.println("Apakah ingin kembali ke menu? ya/tidak");
         menu = input.next();
         if(menu.equalsIgnoreCase("ya")){
            ret.Menu();
         }else{
             
         }
     }
     
     void tampil(){
        for(Siswa m : dataSiswa){
            m.tampil();
            System.out.println("--------------------------");
        }
         System.out.println("Apakah ingin kembali ke menu? ya/tidak");
         menu = input.next();
         if(menu.equalsIgnoreCase("ya")){
            ret.Menu();
         }else{
             
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
        System.out.println("Apakah ingin kembali ke menu? ya/tidak");
         menu = input.next();
         if(menu.equalsIgnoreCase("ya")){
            ret.Menu();
         }else{
             
         }
       
   }
}
