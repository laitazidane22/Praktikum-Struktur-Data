/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package insertionsorttest;

/**
 *
 * @author E P H I N
 */
public class InsertionSortString {
    public static void main(String[] args) {
            String[] arr ={"Atlanta","New York","Dallas","Omaha","San Francisco"};
            int count = 0;
            String sortedArray[] = sort_sub(arr, arr.length); 
            for(int i=0;i<sortedArray.length;i++){
            System.out.println(sortedArray[i]);
            }
            }

            public static String[] sort_sub(String array[], int f){
            String temp="";
            for(int i=0;i<f;i++){
            for(int j=i+1;j<f;j++){
            if(array[i].compareToIgnoreCase(array[j])>0){
            temp = array[i];
            array[i]=array[j];
            array[j]=temp;
            }
            }
            }
            return array;
    }
    
}
