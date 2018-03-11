/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayhashmaphashset;

import java.util.HashMap;

/**
 *
 * @author Admin
 */
public class Hashmap {

    public static void main(String[] args) {
        HashMap<Integer, String> user = new HashMap<>();
        
        // put (key, value);

        user.put(1, "Dinh Thai");
        user.put(2, "Loc");
        user.put(3, "gio");
        user.put(4, "lanh");

        System.out.println(user.get(1));
        System.out.println(user.get(2));
        System.out.println(user.get(3));
        System.out.println(user.get(4) + "\n");
// Remove
        user.remove(2); //remove(key)

        System.out.println("Values after remove: " + user);
    }

}
