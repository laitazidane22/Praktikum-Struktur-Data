/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Quiz2MI1F;

import java.util.Scanner;

/**
 *
 * @author E P H I N
 */
public class QueueDoubleLLMain {
    public static void main(String[] args) {
           Scanner zidan = new Scanner(System.in);
          
            QueueDoubleLL antri = new QueueDoubleLL();
        
        
            char in;
            int a, menu = 0, z = 0; 
            while(menu != 5){
                System.out.println("\n========================\n           Menu\n========================\n");                             
                System.out.println("1. Tambah Antrian");
                System.out.println("2. Cetak Antrian");
                System.out.println("3. Hapus Antrian");                
                System.out.println("4. Laporan Pengurutan pesanan by nama");
                System.out.println("5. Hitung total pendapatan");
                System.out.println("6. Keluar");                
                System.out.print("Masukkan Pilihan: ");
                menu = zidan.nextInt();
                if(menu == 1){
                    z++;                
                        System.out.println("-------------------------------------------");
                        System.out.println("Masukkan Data Pembeli");
                        System.out.println("-------------------------------------------");
                        System.out.print("Nama Pembeli: ");
                        String namaPembeli = zidan.next(); zidan.nextLine();
                        System.out.print("No Hp: ");
                        String nohp = zidan.next(); zidan.nextLine();
                        System.out.print("Kode Pesanan: ");
                        int kode = zidan.nextInt();
                        System.out.print("Nama Pesanan: ");
                        String namaPesanan = zidan.next(); zidan.nextLine();
                        System.out.print("Harga: ");
                        double harga = zidan.nextDouble();                   
                        Pesanan09 psn = new Pesanan09(kode, namaPesanan, harga);
                        Pembeli09 pbl = new  Pembeli09(namaPembeli, nohp);
                        zidan.nextLine();
                        antri.insert(psn);
                        antri.insertPembeli(pbl);
                        antri.print();
                        System.out.print("Apakah ingin kembali ke menu (y/n) ? ");
                        char pilih = zidan.next().charAt(0);
                            if(pilih == 'y'){

                            }else{
                                System.exit(0);
                            }
                    

                }else if(menu == 2){
                    if( z < 1){
                        System.out.println("Data masih kosong");
                    }else{
                        antri.print();
                        System.out.print("Apakah ingin kembali ke menu (y/n) ? ");
                        char pilih = zidan.next().charAt(0);
                            if(pilih == 'y'){

                            }else{
                                System.exit(0);
                            }
                    }

                }else if(menu == 3){
                    if( z < 1){
                        System.out.println("Data masih kosong");
                    }else{
                        antri.deleteFirst(); //hapus antiran
                        antri.print();
                        System.out.print("Apakah ingin kembali ke menu (y/n) ? ");
                        char pilih = zidan.next().charAt(0);
                            if(pilih == 'y'){

                            }else{
                                System.exit(0);
                            }
                            
                    }                

                }else if(menu == 4){
                    if( z < 1){
                        System.out.println("Data masih kosong");
                    }else{
                        antri.printPesanan();
                        System.out.print("Apakah ingin kembali ke menu (y/n) ? ");
                        char pilih = zidan.next().charAt(0);
                            if(pilih == 'y'){

                            }else{
                                System.exit(0);
                            }
                    }

                }else if(menu == 5){
                    if( z < 1){
                        System.out.println("Data masih kosong");
                    }else{
                        System.out.println(antri.size);
                        System.out.print("Apakah ingin kembali ke menu (y/n) ? ");
                        char pilih = zidan.next().charAt(0);
                            if(pilih == 'y'){
                                menu++;
                            }else{
                                System.exit(0);
                            }
                    }
                    
                
                }else if(menu == 6){
                    System.exit(0);
                }               
            }                    
    }                                    

}
