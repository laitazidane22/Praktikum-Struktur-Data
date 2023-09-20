/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArraySegitiga;

/**
 *
 * @author E P H I N
 */
public class ArraySegitiga {
    public static void main(String[] args) {
        
        segitiga[] sgArray = new segitiga[4];
        
        sgArray[0] = new segitiga(10, 4);
        sgArray[1] = new segitiga(20, 10);
        sgArray[2] = new segitiga(15, 6);
        sgArray[3] = new segitiga(25, 10);
        
        for(int i=0; i<sgArray.length; i++){
            System.out.println("segitiga ke- " + i);
            System.out.println("Luas: " + sgArray[i].hitungLuas() + ", Keliling: " + sgArray[i].hitungKeliling());
        }
    }
}
