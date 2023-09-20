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
public class SiswaMain {
    
    static int menu;
    static Scanner getlength = new Scanner(System.in);
    
    public static void Menu(){
        System.out.println("\n========================\n           Menu\n========================\n");                  
        System.out.println("1. Tampil Data " );
        System.out.println("2. Cari Data" );
        System.out.println("3. Sorting" );           
        System.out.println("4. Keluar" );
        System.out.print("Masukkan Pilihan: ");
        menu = getlength.nextInt();
    }
    
    public static void main(String[] args) {        
        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);
        ProsesDataSiswa data = new ProsesDataSiswa();
        int jumData = 6;
        int thn, nilai;
        String pilih;
        
        for(int i=0; i<jumData; i++){
            System.out.print("Masukkan NISN     : ");
            String nisn = s.nextLine();
            System.out.print("Masukkan Nama     : ");
            String nama = s.nextLine();
            System.out.print("Masukkan Alamat   : ");
            String alamat = s.nextLine();
            System.out.print("Tahun Masuk       : ");
            thn = s1.nextInt();
            System.out.print("Nilai             : ");
            nilai = s1.nextInt();          
            
            Siswa m = new Siswa(nisn, nama, alamat, thn, nilai);
            data.tambah(m);
            System.out.println("");
        }
        Menu();

        if(menu == 1){
            
            System.out.println("-------------------------------");
            System.out.println("Data Siswa sebelum sorting");
            data.tampil();
            System.out.println("");
            System.out.print("Kembali ke menu? ya/tidak");
            pilih = s.next();
            if(pilih.equalsIgnoreCase("ya")){
                Menu();
            }else{
                System.exit(0);
            }
            
        }else if(menu == 2){
            
           System.out.println("-------------------------------");
           System.out.println("====== Mencari NISN Siswa ======= ");        
           data.cari(data.nis);    
           System.out.print("Kembali ke menu? ya/tidak");
            pilih = s.next();
            if(pilih.equalsIgnoreCase("ya")){
                Menu();
            }else{
                System.exit(0);
            }
        }else if(menu == 3){
            
            System.out.println("-------------------------------");
            System.out.println("Data Siswa setelah insertion desc berdasarkan nilai ");
            data.insertion();
            data.tampil();
            System.out.println("");
            System.out.print("Kembali ke menu? ya/tidak");
            pilih = s.next();
            if(pilih.equalsIgnoreCase("ya")){
                Menu();
            }else{
                System.exit(0);
            }
        }else{
            System.exit(0);
     }             
        
    }
}
