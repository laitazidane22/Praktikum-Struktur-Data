/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StringInt;
import java.util.Arrays;
/**
 *
 * @author E P H I N
 */
public class main {
    public static void main(String[] args) {
         Orang[] nOrang = { new Orang(43, "Rifqi"),
            new Orang(73, "Sony"),
            new Orang(32, "Alit")
        };
        System.out.println("Daftar Nama Anggota:");
        for(Orang x: nOrang){
            System.out.println(x.toString());
        }

        //urutkan dan tampilkan kembali
        Arrays.sort(nOrang);
        System.out.println("\nDaftar Nama Anggota:");
        for(Orang x: nOrang){
            System.out.println(x.toString());
        }
    }
}
