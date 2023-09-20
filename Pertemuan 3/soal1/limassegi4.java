/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soal1;

/**
 *
 * @author E P H I N
 */
public class limassegi4 {
    public int lalas;
    public int pec;
    public int tinggi;
    
    public limassegi4(int l, int pc, int t ){
        lalas = l;
        pec = pc;
        tinggi = t;
    }
    
    public int volumeLimas(){
        return lalas/pec*tinggi;
    }
    
}
