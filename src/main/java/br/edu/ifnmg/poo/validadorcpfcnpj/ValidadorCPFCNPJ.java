package br.edu.ifnmg.poo.validadorcpfcnpj;

/**
 *
 * @author analu
 */
public class ValidadorCPFCNPJ {

    private static long numero;
    private static String numeroString;

    //<editor-fold defaultstate="collapsed" desc="Getters e Setters">
    public static long getNumero() {
        return numero;
    }

    public static void setNumero(long numero) {
        ValidadorCPFCNPJ.numero = numero;
    }

    public static String getNumeroString() {
        return numeroString;
    }

    public static void setNumeroString(String numeroString) {
        ValidadorCPFCNPJ.numeroString = numeroString;
    }

//</editor-fold>


}
