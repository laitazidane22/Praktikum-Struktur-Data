/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soalNo4;

import java.util.Scanner;
import com.bethecoder.ascii_table.ASCIITable;

/**
 *
 * @author E P H I N
 */
public class dataPendudukArray {
       static dataPenduduk[][] arrPdk;
     
    public static void main(String[] args) {
        int temp1 = 0, z = 0;
        int jum = 0;
        Scanner getdata = new Scanner(System.in);
        System.out.print("Masukkan Jumlah Penduduk : ");
        jum = getdata.nextInt();
        arrPdk = new dataPenduduk[jum][5];
        for (int i = 0; i <= arrPdk.length; i++) {
            for(int j=0; j<arrPdk.length; j++){
                arrPdk[i][j] = new dataPenduduk(j, j, "nm", "almt", "jk");
                System.out.println("Penduduk ke-" + (i+1));
                System.out.print("Masukkan nik: ");
                arrPdk[i][j].nik = getdata.nextInt();
                System.out.print("Masukkan nama: ");
                arrPdk[i][j].nama = getdata.nextLine(); getdata.next();
                System.out.print("Masukkan alamat: ");
                arrPdk[i][j].alamat = getdata.nextLine(); getdata.next();
                System.out.print("Masukkan jenis kelamin: ");
                arrPdk[i][j].jenisKelamin = getdata.nextLine(); getdata.next();           
            }
             dataPenduduk.tampil();       
            System.out.println("");
        }
        System.out.println("DATA PENDUDUK");
        
        
    }
}
