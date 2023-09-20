/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas;

import java.util.Scanner;

/**
 *
 * @author E P H I N
 */
public class QueueLinkedListMan {
    
        
           
        public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);
          
            QueueLinkedList antri = new QueueLinkedList();
        
        
            char in;
            int a, menu = 0, z = 0; 
            while(menu != 5){
                System.out.println("\n========================\n           Menu\n========================\n");                             
                System.out.println("1. Tambah Antrian");
                System.out.println("2. remove");
                System.out.println("3. peek");                
                System.out.println("4. Tampilkan Data");
                System.out.println("5. Cek banyak antrian");
                System.out.println("6. Keluar");                
                System.out.print("Masukkan Pilihan: ");
                menu = sc.nextInt();
                if(menu == 1){
                    z++;                
                    
                         System.out.print("NIM: ");
                        String nim = sc.next(); sc.nextLine();
                        System.out.print("Nama: ");
                        String nama = sc.nextLine();
                        System.out.print("No absen: ");
                        int absen = sc.nextInt();                    
                        System.out.print("Ipk: ");
                        double ipk = sc.nextDouble();                   
                        Mahasiswa mhs = new Mahasiswa(nim, nama, absen, ipk);
                        sc.nextLine();
                        antri.Enqueue(mhs);
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
                        antri.remove();
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
                        antri.peek(); //memeriksa elemen paling depan
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
                        antri.print();
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
                        System.out.println(antri.getSize());
                        System.out.print("Apakah ingin kembali ke menu (y/n) ? ");
                        char pilih = sc.next().charAt(0);
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
