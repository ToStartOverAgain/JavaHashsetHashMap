/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayhashmaphashset;
import java.util.HashSet;
/**
 *
 * @author Admin
 */
public class Hashset {
    public static void main(String args[]) {
      // tao mot hash set
      HashSet hs = new HashSet();
     // them cac phan tu toi hash set 
      hs.add("B");
      hs.add("A");
      hs.add("D");
      hs.add("E");
      hs.add("C");
      hs.add("F");
      hs.add("F");
      //them gia tri F 2 lan nhung ket qua chi xuat hien 1 lan
      System.out.println(hs);
      //hs.add("ad");
      hs.remove("B");
        System.out.println(hs);
//      hs.clear();
//        System.out.println("hiện thị danh sách sau khi clear :" + hs);
   }
}

