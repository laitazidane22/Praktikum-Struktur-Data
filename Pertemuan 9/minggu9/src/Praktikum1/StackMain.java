/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum1;

import java.util.Scanner;

/**
 *
 * @author E P H I N
 */
public class StackMain {  
    public static void main(String[] args) {
        //instansisasi objek dari class Stack
        Stack stk = new Stack(5);
        
        Scanner sc = new Scanner(System.in);
        
        int a, menu = 0, z = 0;              
        while(menu != 5){
            System.out.println("\n========================\n           Menu\n========================\n");                  
            System.out.println("1. Memasukkan Data(push)" );
            System.out.println("2. Pop" );
            System.out.println("3. Peek" );           
            System.out.println("4. Print" );
            System.out.println("5. getMin");
            System.out.println("6. Keluar");
            System.out.print("Masukkan Pilihan: ");
            menu = sc.nextInt();
            if(menu == 1){
                z++;
                char pilih;
                do{
                    System.out.print("Jenis : ");
                    String jenis = sc.next(); sc.nextLine();
                    System.out.print("Warna : ");
                    String warna = sc.nextLine();
                    System.out.print("Merk  : ");
                    String merk = sc.nextLine();
                    System.out.print("Ukuran: ");
                    String ukuran = sc.nextLine();
                    System.out.print("Harga : ");
                    double harga = sc.nextDouble();

                    //instansiasi objek dari class pakaian
                    Pakaian p = new Pakaian(jenis, warna, merk, ukuran, harga);

                    System.out.print("Apakah Anda akan menambahkan data baru ke stack (y/n) ? ");
                    pilih = sc.next().charAt(0);
                    sc.nextLine(); //untuk mengabaikan karakter new line
                    stk.push(p); //menambahkan isi elemen ke class pakaian 
                } while (pilih == 'y');
              
            }else if(menu == 2){
                if( z < 1){
                    System.out.println("Data masih kosong");
                }else{
                    stk.pop();//mengeluarkan elemen tumpukan paling atas pada stack
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
                    stk.peek(); //memeriksa elemen paling atas
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
                    stk.print();
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
                    stk.getMin();
                    System.out.print("Apakah ingin kembali ke menu (y/n) ? ");
                    char pilih = sc.next().charAt(0);
                        if(pilih == 'y'){
                               
                        }else{
                            System.exit(0);
                        }
                }
            }else if (menu == 6){
                System.exit(0);
            }
        }                                                                                        
        
    }           
}


