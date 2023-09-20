/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu5;

/**
 *
 * @author E P H I N
 */
public class DaftarMahasiswaBerprestasi {
    Mahasiswa ListMhs[] = new Mahasiswa[3];
    int idx;
    
    void tambah(Mahasiswa m){
        if (idx < ListMhs.length) {
            ListMhs[idx] = m;
            idx++;
        }else{
            System.out.println("Data sudah penuh!!");
        }
    }
    
    void tampil(){
        for(Mahasiswa m : ListMhs){
            m.tampil();
            System.out.println("--------------------------");
        }
    }
    
    void bubbleSort(){
        for(int i=0; i<ListMhs.length-1; i++){
            for(int j=1; j<ListMhs.length-i; j++){
                if(ListMhs[j].ipk > ListMhs[j-1].ipk){
                    
                    //dibawah ini proses swap atau penukaran
                    Mahasiswa tmp =  ListMhs[j];
                    ListMhs[j] = ListMhs[j-1];
                    ListMhs[j-1] = tmp;
                }
            }
        }
    }
    
    void selectionSort(){
        for(int i=0; i<ListMhs.length-1; i++ ){
            int idxMin = 1;
            for(int j=i+1; j<ListMhs.length; j++ ){
                if(ListMhs[j].ipk < ListMhs[idxMin].ipk){
                    idxMin = j;
                }
            }
            //swap
            Mahasiswa tmp = ListMhs[idxMin];
            ListMhs[idxMin] = ListMhs[i];
            ListMhs[i] = tmp;
        }
    }
    
    
    
}
