/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas1;

/**
 *
 * @author E P H I N
 */
public class Node {
    String nama;
    int nomor;
    Node previous;
    Node next;
    
    public Node(Node prev, int no, String nm ,  Node nt) {
        this.previous = prev;
        this.nama = nm;
        this.nomor = no;
        this.next = nt;
    }
    
}
