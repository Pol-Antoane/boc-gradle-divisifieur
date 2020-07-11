package com.github.dorval.francois.business;

public class Divisifieur {

    /**
     * fait la division
     * @param dividende
     * @param diviseur
     * @return
     */
    public static int diviser(int dividende, int diviseur){
        return dividende/diviseur;
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
