/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuanke4;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Walidatul Isna
 */
public class Txtfile1 {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        //Read txt file
        String Filename= "F://biodata.txt";
        String baris=null;
        
       //Class, //Objek
       FileReader filereadera
               =new FileReader(Filename);
       
       BufferedReader bufferedreadera
               =new BufferedReader(filereadera);
       
       while ((baris = bufferedreadera.readLine()) !=null){
           System.out.println(baris);
       }
       bufferedreadera.close();
    }
    
}
