package br.edu.ifnmg.poo.validadorcpfcnpj;

/**
 * Classe de exceção de CNPJ.
 *
 * @author AnaLuizanc
 */
public class CnpjInvalidoException extends Exception {

    public CnpjInvalidoException() {
        super("Inválido");
    }

}
