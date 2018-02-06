package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner in = new Scanner(System.in);
        String zodis;
        boolean arZodis = false;

        System.out.print("Iveskite zodi: ");
        zodis = in.nextLine();
        //while (arZodis == false){
        try {
            if (!zodis.isEmpty()) {
                Float.parseFloat(zodis);
                System.out.println("Reik vesti tik zodi");
            } else {
                System.out.println("Reik vesti tik zodi");
            }
        } catch (Exception e) {
            //arZodis = true;
            arYraAb(zodis);
        }
        //}

    }

    public static void arYraAb(String z) {
        boolean arYra = false;
        for (int i = 0; i < z.length() - 1; i++) {
            if (z.charAt(i) == 'a' && i != (z.length() - 1) && z.charAt(i + 1) == 'b') {
                //System.out.println("Zodyje yra \"ab\" junginys");
                arYra = true;
            }
        }
        if (arYra) {
            System.out.println("Zodyje yra \"ab\" junginys");
        } else {
            System.out.println("Zodyje nera \"ab\" junginiu");
        }
    }
}
