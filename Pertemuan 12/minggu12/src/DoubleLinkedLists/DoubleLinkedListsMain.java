/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DoubleLinkedLists;

/**
 *
 * @author E P H I N
 */
public class DoubleLinkedListsMain {
    public static void main(String[] args) throws Exception {
        DoubleLinkedLIsts dll = new DoubleLinkedLIsts();        
        dll.print();
        System.out.println("Size:" + dll.size());
        System.out.println("======================");
        dll.addFirst(3);
        dll.addLast(4);
        dll.addFirst(7);
        dll.print();
        System.out.println("Size:" + dll.size());
        System.out.println("======================");
        dll.add(10, 1);
        dll.print();
        System.out.println("Size:" + dll.size());
        System.out.println("======================");
        System.out.println("Data Awal pada Lingked List adalah " +
        dll.getFirst());
        System.out.println("Data Akhir pada Lingked List adalah " +
        dll.getLast());
        System.out.println("Data Indeks ke-1 pada Lingked Lists adalah " +
        dll.get(1));
    }
}
