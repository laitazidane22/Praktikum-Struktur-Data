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
            System.out.println("1. Input Data " );       
            System.out.println("2. Tampil Data " );
            System.out.println("3. Cari Data" );
            System.out.println("4. Sorting" );           
            System.out.println("5. Keluar" );
            System.out.print("Masukkan Pilihan: ");
            menu = getlength.nextInt();
    }
    public static void main(String[] args) {        
        ProsesDataSiswa dataProses = new ProsesDataSiswa();       
            Menu();
        
             
            
            if (SiswaMain.menu == 1) {
                
                dataProses.input();
                
                
            } else if (SiswaMain.menu == 2) {

                   dataProses.tampil();              
            } else if (SiswaMain.menu == 3) {               
                    System.out.print("=============================\n      Data yang dicari\n=============================\n");
                    
            } else if (SiswaMain.menu == 4) {
               
                    System.out.print("=============================\n      Data yang di Insertion Sort Descending \n=============================\n");
                    dataProses.insertion();
                    dataProses.tampil();
                
            } else if(SiswaMain.menu == 5){
                System.exit(0);
                System.out.println("Exit");                
            }
    
   }
}
