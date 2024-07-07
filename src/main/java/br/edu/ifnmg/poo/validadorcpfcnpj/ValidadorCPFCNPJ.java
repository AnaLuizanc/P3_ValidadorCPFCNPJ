package br.edu.ifnmg.poo.validadorcpfcnpj;

/**
 *
 * @author analu
 */
public class ValidadorCPFCNPJ {

    public static boolean isCpfValido(long cpf) throws CpfInvalidoException {
        long digitoVerificador = cpf % 100;
        int digitoVerificadorGerado = geradorDigitoVerificador(cpf / 100);
        digitoVerificadorGerado = digitoVerificadorGerado * 10 + geradorDigitoVerificador(cpf / 10);
        if (digitoVerificador == digitoVerificadorGerado) {
            System.out.println(cpf + "\nVálido.");
            return true;
        } else {
            System.out.println(cpf);
            throw new CpfInvalidoException();
        }
    }

    public static int geradorDigitoVerificador(long cpf) {
        int somatorio = 0;
        int indice = 9;
        while (cpf > 0) {
            somatorio += obterDigito(cpf, indice) * indice;
            indice--;
            cpf /= 10;
        }
        return somatorio % 11;
    }

    public static int obterDigito(long cpf, int indice) {
        return (int) cpf % 10;
    }

    public static boolean isCpfValido(String cpf) throws CpfInvalidoException {
        long cpfLong = converterStringParaLong(cpf);
        long digitoVerificador = cpfLong % 100;
        int digitoVerificadorGerado = geradorDigitoVerificador(cpfLong / 100);
        digitoVerificadorGerado = digitoVerificadorGerado * 10 + geradorDigitoVerificador(cpfLong / 10);
        if (digitoVerificador == digitoVerificadorGerado) {
            System.out.println(cpf + "\nVálido.");
            return true;
        } else {
            System.out.println(cpf);
            throw new CpfInvalidoException();
        }
    }

    public static long converterStringParaLong(String cpf) {
        return Long.parseLong(ValidadorCPFCNPJ.removerSimbolos(cpf));
    }

    public static String removerSimbolos(String cpf) {
        String primeiraParte, segundaParte, terceiraParte, quartaParte;
        primeiraParte = cpf.substring(0, 3);
        segundaParte = cpf.substring(4, 7);
        terceiraParte = cpf.substring(8, 11);
        quartaParte = cpf.substring(cpf.indexOf("-") + 1);
        cpf = primeiraParte + segundaParte + terceiraParte + quartaParte;
        return cpf;
    }

}
