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
public class Pajak {
    int kode, nominal, denda;
    int bulanBayar;

    public Pajak(int kd, int nml, int dd, int bln) {
        this.kode = kd;
        this.nominal = nml;
        this.denda = dd;
        this.bulanBayar = bln;
    }
}
