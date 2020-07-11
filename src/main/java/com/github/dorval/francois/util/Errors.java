package com.github.dorval.francois.util;

/**
 * de jolies erreurs
 */
public class Errors {

    public static String DEUX_ARGUMENTS_ATTENDUS = "deux arguments attendus";

    public static String PARAMETRE_NON_ENTIER = "parametre non entier";

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
