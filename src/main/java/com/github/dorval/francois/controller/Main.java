package com.github.dorval.francois.controller;

import com.github.dorval.francois.business.Divisifieur;
import com.github.dorval.francois.util.Errors;
import com.github.dorval.francois.util.MathUtils;

public class Main {

    /**
     * fonction principale du programme
     * @param args
     */
    public static void main(final String[] args) {
        if (args.length!=2){
            throw new IllegalArgumentException(Errors.DEUX_ARGUMENTS_ATTENDUS);
        }
        int dividende = MathUtils.parseIntegerString(args[0]);
        int diviseur = MathUtils.parseIntegerString(args[1]);

        int quotient = Divisifieur.diviser(dividende, diviseur);

        System.out.println(dividende+"/"+diviseur+"=" +quotient);


    }

    if (diviseur == 0){
            throw new IllegalArgumentException(Errors.PAS_DE_DIV_PAR_0);
        }
///
public static String PAS_DE_DIV_PAR_0 = "pas de division par zero";
///
@Test(expected = IllegalArgumentException.class)
    public void testQuiDiviseParZero() {
        Main.main(new String[]{"10", "0"});
    }

}

