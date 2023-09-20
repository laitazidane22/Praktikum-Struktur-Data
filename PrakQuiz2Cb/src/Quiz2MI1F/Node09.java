/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Quiz2MI1F;

/**
 *
 * @author E P H I N
 */
public class Node09 {  
    Pesanan09 data;
    Pembeli09 data2;
    Node09 previous;  
    Node09 next;
    Node09 previous2;  
    Node09 next2;
    Node09 harga;

    public Node09(Pesanan09 dt, Node09 nt, Node09 prev) {  
        this.data= dt;
        this.next = nt;
        this.previous = prev;
    }  
    
    public Node09 getNext(){
        return next;
    }
    
    public Node09 getPrev(){
        return previous;
    }

    public Node09(Pembeli09 dt2, Node09 nt2, Node09 prev2) {
        this.data2 = dt2;
        this.next2 = nt2;
        this.previous2 = prev2;
    }
    
    public Node09 getNext2(){
        return next2;
    }
    
    public Node09 getPrev2(){
        return previous2;
    }
     public Node09 getHarga(){
        return harga;
    }

}
