/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coba;

import com.bethecoder.ascii_table.ASCIITable;
import java.util.Scanner;

/**
 *
 * @author E P H I N
 */
public class met {

    static String[][] dataPenduduk;
    String nik, nama, no, alamat, jk;
    Scanner getdata = new Scanner(System.in);

    public void setdata(int a) {
        this.no = "" + a;
        dataPenduduk[a - 1][0] = "" + this.no;
        System.out.print("NIK           : ");
        this.nik = getdata.nextLine();
        dataPenduduk[a - 1][1] = "" + this.nik;
        System.out.print("Nama          : ");
        this.nama = getdata.nextLine();
        dataPenduduk[a - 1][2] = "" + this.nama;
        System.out.print("Alamat        : ");
        this.jk = getdata.nextLine();
        dataPenduduk[a - 1][3] = "" + this.jk;
        System.out.print("Jenis Kelamin : ");
        this.alamat = getdata.nextLine();
        dataPenduduk[a - 1][4] = "" + this.alamat;
    }

    public String getNo() {
        return this.no;
    }

    public String getNIK() {
        return this.nik;
    }

    public String getNama() {
        return this.nama;
    }

    public String getJK() {
        return this.jk;
    }

    public String getalamat() {
        return this.alamat;
    }

    public void tampil() {
        System.out.print(this.no + " ");
        System.out.print(this.nik + " ");
        System.out.print(this.nama + " ");
        System.out.print(this.jk + " ");
        System.out.print(this.alamat + " ");
    }
}
