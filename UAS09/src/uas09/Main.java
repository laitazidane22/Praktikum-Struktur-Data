/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uas09;

import java.util.Scanner;

/**
 *
 * @author E P H I N
 */
public class Main {
     static Scanner sc = new Scanner(System.in);
     static Scanner sc2 = new Scanner(System.in);
        
     static QueueKendaraan kd = new QueueKendaraan(); 
     static QueuePajak pjk = new QueuePajak();
     
     static int tnkb, cc, tahun, pajak, bulanbyr, bulan, kode, nominal, denda;
     static String nama, jenis ;
                
    public static void Menu(){
        System.out.print("TNKB: ");
        tnkb = sc2.nextInt();
        System.out.print("Nama Kendaraan: ");
        nama = sc.next(); sc.nextLine();
        System.out.print("Jenis: ");
        jenis = sc.nextLine();
        System.out.print("Bulan Harus Bayar: ");
        bulan = sc.nextInt();
        System.out.print("Bulan Bayar: ");
        bulanbyr = sc.nextInt();
        System.out.print("CC: ");
        cc = sc2.nextInt();
        System.out.print("Tahun: ");
        tahun = sc2.nextInt();
        System.out.print("Nominal: ");
        nominal = sc2.nextInt();
        
        kode = 1;
        String rd2 = "roda 2";
        String rd4 = "roda 4";
        if(jenis.equalsIgnoreCase(rd2)){
            if(cc > 250){
                pajak = 500000;
                kode++;
            }else if(cc > 100 ){
                pajak = 250000;
                kode++;
            }else if(cc < 100){
                pajak = 100000;
                kode++;
            }
        }else if(jenis.equalsIgnoreCase(rd4)){
            if(cc > 2500){
                    pajak = 1500000;
                    kode++;
                }else if(cc > 1000 ){
                    pajak = 1000000;
                    kode++;
                }else if(cc < 1000){
                    pajak = 750000;
                    kode++;
                }
        }
        
        if(bulanbyr > bulan){
            int lamaTelat = (bulanbyr - bulan);
            if( lamaTelat <= 3){
                denda = 50000;                
            }else if(lamaTelat > 3){
                denda = lamaTelat * 50000;                
            }
        }
        
        Kendaraan kdn = new Kendaraan(tnkb, nama, jenis, cc, tahun, bulan);
        Pajak pj = new Pajak(kode, nominal, denda, bulanbyr);
        
        sc.nextLine();
        kd.Enqueue(kdn);
        pjk.Enqueue(pj);
    }
    
    
    
    public static void main(String[] args) throws Exception {
       
        
            char in;
            int a, menu = 0, z = 0; 
            while(menu != 5){
                System.out.println("\n========================\n           Menu\n========================\n");                             
                System.out.println("1. Input");
                System.out.println("2. remove");
                System.out.println("3. peek");                
                System.out.println("4. Tampilkan Data dan Total Pendapatan");
                System.out.println("5. Cek banyak antrian");
                System.out.println("6. Tampilkan data berdasarkan nama");
                System.out.println("7. Keluar");                
                System.out.print("Masukkan Pilihan: ");                
                menu = sc.nextInt();
                
                if(menu == 1){
                    z++;                                   
                        Menu();                        
                        System.out.print("Apakah ingin kembali ke menu (y/n) ? ");
                        char pilih = sc.next().charAt(0);
                            if(pilih == 'y'){

                            }else{
                                System.exit(0);
                            }
                    

                }else if(menu == 2){
                    if( z < 1){
                        System.out.println("Data masih kosong");
                    }else{
                        kd.remove();
                        System.out.print("Apakah ingin kembali ke menu (y/n) ? ");
                        char pilih = sc.next().charAt(0);
                            if(pilih == 'y'){

                            }else{
                                System.exit(0);
                            }
                    }

                }else if(menu == 3){
                    if( z < 1){
                        System.out.println("Data masih kosong");
                    }else{
                        kd.peek(); //memeriksa elemen paling depan
                        System.out.print("Apakah ingin kembali ke menu (y/n) ? ");
                        char pilih = sc.next().charAt(0);
                            if(pilih == 'y'){

                            }else{
                                System.exit(0);
                            }
                    }                

                }else if(menu == 4){
                    if( z < 1){
                        System.out.println("Data masih kosong");
                    }else{
                        kd.print();
                        pjk.totalPendapatan();
                        System.out.print("Apakah ingin kembali ke menu (y/n) ? ");
                        char pilih = sc.next().charAt(0);
                            if(pilih == 'y'){

                            }else{
                                System.exit(0);
                            }
                    }

                }else if(menu == 5){
                    if( z < 1){
                        System.out.println("Data masih kosong");
                    }else{
                        System.out.println(kd.size);
                        System.out.print("Apakah ingin kembali ke menu (y/n) ? ");
                        char pilih = sc.next().charAt(0);
                            if(pilih == 'y'){
                                menu++;
                            }else{
                                System.exit(0);
                            }
                    }
                    
                
                }else if(menu == 6){
                                        
                    kd.urut();
                    
                    
                }else if(menu == 7)               {
                    System.exit(0);
                }
            }                    
    }
}
