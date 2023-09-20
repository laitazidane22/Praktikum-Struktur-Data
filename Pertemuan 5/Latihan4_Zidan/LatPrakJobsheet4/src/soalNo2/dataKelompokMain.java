/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soalNo2;

/**
 *
 * @author E P H I N
 */
public class dataKelompokMain {
    static String data[][]
            = {
                {"Alfi", "Safira", "Tiara", "Arif", "Erdi"},
                {"Yudha", "Nisa", "Yulia", "Fauzan", "Dwi"},
                {"Dewa", "Ana", "Abdul", "Dani", "Ammar"},};

    public static void main(String[] args) {

        dataKelompok arrDK = new dataKelompok();
        arrDK.tampil();
        arrDK.input();

    }
}
