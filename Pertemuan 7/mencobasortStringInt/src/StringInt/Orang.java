/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StringInt;
import java.util.Comparator;
/**
 *
 * @author E P H I N
 */
public class Orang implements Comparator <Orang>{

    int berat;
    String nama;

    @Override
    public String toString() {
        return nama + " punya berat " + berat;
    }

    public Orang(int berat, String nama) {
        this.berat = berat;
        this.nama = nama;
    }

    
    public int compareTo(Orang o) {
        if (this.berat < o.berat) {
            return -1;
        } else if (this.berat == o.berat) {
            return 0;
        } else {
            return 1;
        }
    }
  public int compare(Orang t, Orang t1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    

   
    
}
