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
public class NodeKendaraan {
    
    Kendaraan dataKendaraan;
    NodeKendaraan next;
    
    public NodeKendaraan() {        
        next = null;
        dataKendaraan = null;        
    }

    public NodeKendaraan(Kendaraan d, NodeKendaraan n) {
        this.dataKendaraan = d;
        this.next = n;
    }
    
    public NodeKendaraan getNext(){    
        return next;
    } 
    
}
