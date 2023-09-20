/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package insertionsorttest;

/**
 *
 * @author E P H I N
 */
public class Main {
    public static void main(String[] args) {
        int a[] = {73, 67, 56, 32, 52, 41, 83, 37, 32, 10};
        
        //instansiasi object dari class Insertion
        
        Insertion urut = new Insertion(a, a.length);
        System.out.println("Data sebelum urut");
        urut.tampilData();
        System.out.println("Data sesudah urut (ASC)");
        urut.insertion();
        urut.tampilData();
        
    }
}
