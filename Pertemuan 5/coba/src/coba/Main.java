/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coba;

import java.util.Scanner;
import com.bethecoder.ascii_table.ASCIITable;

/**
 *
 * @author USER
 */
public class Main {

    met mm = new met();

    public static void main(String[] args) {
        int temp1 = 0, z = 0;
        int jum = 0;
        Scanner getdata = new Scanner(System.in);
        System.out.print("Masukkan Jumlah Penduduk : ");
        jum = getdata.nextInt();
        met[] pdk = new met[jum];
        met.dataPenduduk = new String[jum][5];
        for (int i = 1; i <= jum; i++) {
            System.out.println("Penduduk ke-" + i);
            pdk[z] = new met();
            pdk[z].setdata(i);
            z++;
            System.out.println("");
        }
        System.out.println("DATA PENDUDUK");
        String[] tableJudul = {"No", "NIK", "Nama", "Alamat", "Jenis Kelamin"};
        ASCIITable.getInstance().printTable(tableJudul, met.dataPenduduk);
        System.out.print("CARI DATA PENDUDUDUK \nMasukkan data yang dicari : ");
        String car = getdata.next();
        System.out.println("");
        while (temp1 < z) {
            if (pdk[temp1].getNama().equalsIgnoreCase(car)) {
                String kk[][] = new String[1][5];
                kk[0][0] = pdk[temp1].getNo();
                kk[0][1] = pdk[temp1].getNIK();
                kk[0][2] = pdk[temp1].getNama();
                kk[0][3] = pdk[temp1].getalamat();
                kk[0][4] = pdk[temp1].getJK();       
                ASCIITable.getInstance().printTable(tableJudul, kk);
            } else {

            }
            temp1++;
        }
    }
}
