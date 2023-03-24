/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan;

import java.util.LinkedList;


public class Latihan {
     public static void main(String[] args) {
        LinkedList<String> Hewan = new LinkedList<>();
            Hewan.add("Sapi");
            Hewan.add("Kelinci");
            Hewan.add("Kambing");
            Hewan.add("Unta");
            Hewan.add("Domba");
        System.out.println("Hewan : " + Hewan);
         
         LinkedList<String> deleteHewan = new LinkedList<>();
         deleteHewan.add("Kelinci");
         deleteHewan.add("Kambing");
         deleteHewan.add("Unta");
         LinkedList<String> deletedata = new LinkedList<String>();
         
        for (String data : deleteHewan) {
            Hewan.remove(data);
        }
          
         System.out.println("Hewan yang dihapus :" + deleteHewan);
         System.out.println("Output yang dihapus :" + Hewan);
    }
}
