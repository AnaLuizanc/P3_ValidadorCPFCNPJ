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

        if () {

            
            System.out.println("true");
        } else {
            throw new CpfInvalidoException();
        }
    }
    
}
