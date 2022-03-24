/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pack4repaso;

import java.util.Scanner;

/**
 *
 * @author bhugo
 */
public class ex17 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String sVillage = "Small village", mCity = "Medium city", bCity = "Big ciy";
        int inHabitants;

        System.out.println("Tell me the number of inhabitants");
        inHabitants = in.nextInt();

        if (inHabitants < 2000) {
            System.out.println(sVillage);
        } else if ((inHabitants >= 2000) && (inHabitants <= 30000)) {
            System.out.println(mCity);
        } else if (inHabitants > 30000){
            System.out.println(bCity);
        }
    }
}
