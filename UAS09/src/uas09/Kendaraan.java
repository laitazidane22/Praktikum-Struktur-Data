/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uas09;

/**
 *
 * @author E P H I N
 */
public class Kendaraan {
    int TNKB, CC, tahun, bulanBayar;
    String nama, jenis;

    public Kendaraan(int tnkb, String nm, String jns, int cc, int thn, int bln) {
        this.TNKB = tnkb;
        this.nama = nm;
        this.jenis = jns;
        this.CC = cc;
        this.tahun = thn;
        this.bulanBayar = bln;
    }
}
