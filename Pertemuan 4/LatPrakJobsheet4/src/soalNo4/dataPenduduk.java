/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soalNo4;

import java.util.Scanner;
import soalNo2.dataKelompokMain;

/**
 *
 * @author E P H I N
 */
public class dataPenduduk {
    String nama, alamat, jenisKelamin;
    int nik, nomer;
    static dataPendudukArray dd = new dataPendudukArray();
    

    public  dataPenduduk(int no, int nk, String nm, String almt, String jk ) {
        nik = nk;
        nomer = no;
        nama = nm;
        alamat = almt;
        jenisKelamin = jk;
        

    }

    public int  getNo() {
        return this.nomer;
    }

    public int getNIK() {
        return this.nik;
    }

    public String getNama() {
        return this.nama;
    }

    public String getJK() {
        return this.jenisKelamin;
    }

    public String getalamat() {
        return this.alamat;
    }

    static void tampil() {
        System.out.println("Data Penduduk");
        for (int i = 0; i < dd.arrPdk.length ; i++) {
            System.out.print("Kelompok " + (i + 1) + " : ");
            for (int j = 0; j < dd.arrPdk.length; j++) {
                System.out.print(dd.arrPdk[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
