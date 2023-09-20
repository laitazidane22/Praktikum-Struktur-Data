/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soal2;

/**
 *
 * @author E P H I N
 */
public class tanah {
    
    public int panjang;
    public int lebar;
    
    public tanah(int p, int l)
    {
        panjang = p;
        lebar = l;
        
    }
    
    public int hitungLuas()
    {
        return panjang*lebar;
    }
}
