/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soalNo2;
import java.util.Scanner;
/**
 *
 * @author E P H I N
 */
public class dataKelompok {
     public void tampil() {
        System.out.println("Daftar kelompok mahasiswa");
        for (int i = 0; i < dataKelompokMain.data.length; i++) {
            System.out.print("Kelompok " + (i + 1) + " : ");
            for (int j = 0; j < dataKelompokMain.data[i].length; j++) {
                System.out.print(dataKelompokMain.data[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public void input() {
        boolean found = false;
        Scanner input = new Scanner(System.in);
        System.out.print("\nMahasiswa yang dicari = ");
        String cari = input.next();
        input.nextLine();
        for (int i = 0; i < dataKelompokMain.data.length; i++) {
            for (int j = 0; j < dataKelompokMain.data[i].length; j++) {
                if (dataKelompokMain.data[i][j].equalsIgnoreCase(cari)) {
                    System.out.println("Mahasiswa bernama '" + cari + "' berada pada kelompok ke-" + (i + 1) + " dan urutan ke-" + (j + 1) + " dalam kelompok.");
                    found = true;
                }
            }
        }
        if (found == false) {
            System.out.println("Mahasiswa " + cari + " tidak ditemukan");
        } else {

        }
    }
}
