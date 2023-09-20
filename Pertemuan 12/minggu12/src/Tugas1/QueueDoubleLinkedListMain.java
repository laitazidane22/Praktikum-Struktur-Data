/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas1;

import java.util.Scanner;

/**
 *
 * @author E P H I N
 */
public class QueueDoubleLinkedListMain {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
          
            QueueDoubleLinkedList antri = new QueueDoubleLinkedList();
                      
            int menu = 0, z = 0; 
            while(menu != 5){
                System.out.println("+++++++++++++++++++++++++++++++");
                System.out.println("PENGANTRI VAKSIIN EXTRAVAGANZA");
                System.out.println("+++++++++++++++++++++++++++++++");
                System.out.println("1.Tambah Data Penerima Vaksin");
                System.out.println("2.Hapus Data Pengantri Vaksin");
                System.out.println("3.Daftar Penerima Vaksin");
                System.out.println("4.Keluar");
                System.out.println("++++++++++++++++++++++++++++++++");           
                System.out.print("Masukkan Pilihan: ");
                menu = sc.nextInt();
                if(menu == 1){
                    z++;
                    char pilih;
                    do{
                        System.out.println("-----------------------------");
                        System.out.println("Masukkan Data Penerima Vaksin");
                        System.out.println("-----------------------------");
                        System.out.print("Nomor Antrian: ");
                        int no = sc.nextInt();
                        System.out.print("Nama Penerima: ");
                        String nama = sc2.nextLine();
                        antri.Enqueue(no, nama);
                        System.out.println("-----------------------------");
                        antri.print();
                        System.out.print("Apakah ingin tambah data lagi? (y/n) ? ");
                        pilih = sc.next().charAt(0);
                    }while(pilih == 'y');                                                
                    

                }else if(menu == 2){
                    if( z < 1){
                        System.out.println("Data masih kosong");
                    }else{
                        antri.Dequeue();
                        antri.print();                        
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
                        antri.print();
                        System.out.print("Apakah ingin kembali ke menu (y/n) ? ");
                        char pilih = sc.next().charAt(0);
                            if(pilih == 'y'){

                            }else{
                                System.exit(0);
                            }
                            
                    }                               
                
                }else if(menu == 4){
                    System.exit(0);
                }               
            }                    
    }
}
