package br.edu.ifnmg.poo.validadorcpfcnpj;

/**
 *
 * @author analu
 */
public class Program {

    public static void main(String[] args) {

        try {
            ValidadorCPFCNPJ.isCpfValido(14230703058L);

        } catch (CpfInvalidoException e) {
            System.out.println(e.getMessage());
        }

        try {
            ValidadorCPFCNPJ.isCpfValido("142.307.030-58");

        } catch (CpfInvalidoException e) {
            System.out.println(e.getMessage());
        }

        try {
            ValidadorCPFCNPJ.isCpfValido(230703058L);

        } catch (CpfInvalidoException e) {
            System.out.println(e.getMessage());
        }

        try {
            ValidadorCPFCNPJ.isCpfValido("002.307.030-58");

        } catch (CpfInvalidoException e) {
            System.out.println(e.getMessage());
        }

        try {
            ValidadorCPFCNPJ.isCpfValido(456789014L);

        } catch (CpfInvalidoException e) {
            System.out.println(e.getMessage());
        }
        
        try {
            ValidadorCPFCNPJ.isCnpjInvalido("35.017.120/0001-86");

        } catch (CnpjInvalidoException e) {
            System.out.println(e.getMessage());
        }

        try {
            ValidadorCPFCNPJ.isCnpjValido(35017120000186L);

        } catch (CnpjInvalidoException e) {
            System.out.println(e.getMessage());
        }
        
        try {
            ValidadorCPFCNPJ.isCnpjInvalido("35.017.120/0001-88");

        } catch (CnpjInvalidoException e) {
            System.out.println(e.getMessage());
        }
    }
}
