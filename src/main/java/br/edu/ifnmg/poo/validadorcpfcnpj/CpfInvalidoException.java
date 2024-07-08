package br.edu.ifnmg.poo.validadorcpfcnpj;

/**
 * Classe de exceção de CPF.
 *
 * @author AnaLuizanc
 */
public class CpfInvalidoException extends Exception {

    public CpfInvalidoException() {
        super("Inválido.");
    }

}
