package br.edu.ifnmg.poo.validadorcpfcnpj;

/**
 *
 * @author analu
 */
public class ValidadorCPFCNPJ {

    private long numero;
    private String numeroString;

    //<editor-fold defaultstate="collapsed" desc="Getters e Setters">
    public long getNumero() {
        return numero;
    }

    public void setNumero(long numero) {
        this.numero = numero;
    }

    public String getNumeroString() {
        return numeroString;
    }

    public void setNumeroString(String numeroString) {
        this.numeroString = numeroString;
    }

//</editor-fold>
    public static void isCpfValido(long numero) throws CpfInvalidoException {

        if (ValidadorCPFCNPJ.contarDigitos(numero)) {
            // primeira parte verdadeira
        } else {
            throw new CpfInvalidoException();
        }
    }

    public static boolean contarDigitos(long numero) {
        int digitos = 0;
        long quociente = 10000000000L;
        while (quociente >= 1) {
            if ((numero / quociente) == 0) {
                digitos++;
                quociente = quociente / 10;
                continue;
            }
            numero = numero % quociente;
            quociente = quociente / 10;
            digitos++;
        }
        return digitos == 11 ? true : false;
    }
}
