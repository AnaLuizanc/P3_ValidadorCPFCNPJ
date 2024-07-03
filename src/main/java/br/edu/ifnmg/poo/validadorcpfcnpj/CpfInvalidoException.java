package br.edu.ifnmg.poo.validadorcpfcnpj;

/**
 *
 * @author analu
 */
public class CpfInvalidoException extends Exception {

    public CpfInvalidoException() {
        super("Numero de digitos do CPF incompativel com o padrao.");
    }
}
