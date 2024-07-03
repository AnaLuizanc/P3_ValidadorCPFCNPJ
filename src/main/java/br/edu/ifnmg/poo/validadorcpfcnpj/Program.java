package br.edu.ifnmg.poo.validadorcpfcnpj;

/**
 *
 * @author analu
 */
public class Program {

    public static void main(String[] args) {
        ValidadorCPFCNPJ valida = new ValidadorCPFCNPJ();
        
        
        try {
            valida.setNumero(14230703058L);
            valida.isCpfValido(14230703058L);
            
        } catch (CpfInvalidoException e) {
            System.out.println("ERRO: " + e.getMessage());
        }
       
    }
}
