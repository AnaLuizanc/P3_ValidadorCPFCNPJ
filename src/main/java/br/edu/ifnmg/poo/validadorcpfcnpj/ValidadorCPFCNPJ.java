package br.edu.ifnmg.poo.validadorcpfcnpj;

/**
 *
 * @author analu
 */
public class ValidadorCPFCNPJ {

    //<editor-fold defaultstate="collapsed" desc="Métodos de verificação de CPF">
    public static boolean isCpfValido(long cpf) throws CpfInvalidoException {
        long digitoVerificador = cpf % 100;
        int digitoVerificadorGerado = geradorDigitoVerificadorCpf(cpf / 100);
        digitoVerificadorGerado = digitoVerificadorGerado * 10 + geradorDigitoVerificadorCpf(cpf / 10);
        if (digitoVerificador == digitoVerificadorGerado) {
            System.out.println(cpf + "\nVálido.");
            return true;
        } else {
            System.out.println(cpf);
            throw new CpfInvalidoException();
        }
    }

    public static int geradorDigitoVerificadorCpf(long cpf) {
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
        int digitoVerificadorGerado = geradorDigitoVerificadorCpf(cpfLong / 100);
        digitoVerificadorGerado = digitoVerificadorGerado * 10 + geradorDigitoVerificadorCpf(cpfLong / 10);
        if (digitoVerificador == digitoVerificadorGerado) {
            System.out.println(cpf + "\nVálido.");
            return true;
        } else {
            System.out.println(cpf);
            throw new CpfInvalidoException();
        }
    }

    public static long converterStringParaLong(String numero) {
        return Long.parseLong(ValidadorCPFCNPJ.removerSimbolosCpf(numero));
    }

    public static String removerSimbolosCpf(String cpf) {
        return cpf.substring(0, 3) + cpf.substring(4, 7) + cpf.substring(8, 11) + cpf.substring(cpf.indexOf("-") + 1);
    }
    //</editor-fold>

    public static boolean isCnpjValido(long cnpj) throws CnpjInvalidoException {
        long digitoVerificador = cnpj % 100;
        int digitoVerificadorGerado = geradorDigitoVerificadorCnpj(cnpj / 100);
        digitoVerificadorGerado = digitoVerificadorGerado * 10 + geradorDigitoVerificadorCnpj(cnpj / 10);
        if (digitoVerificador == digitoVerificadorGerado) {
            System.out.println(cnpj + "\nVálido.");
            return true;
        } else {
            System.out.println(cnpj);
            throw new CnpjInvalidoException();
        }
    }

    public static int geradorDigitoVerificadorCnpj(long cnpj) {
        int somatorio = 0;
        int minimo = 2;
        while (minimo <= 9) {
            somatorio += ((cnpj % 10) * minimo);
            minimo++;
            cnpj /= 10;
        }
        minimo = 2;
        while (cnpj > 0) {
            somatorio += obterDigito(cnpj, minimo) * minimo;
            minimo++;
            cnpj /= 10;
        }
        somatorio %= 11;
        if (somatorio > 0) {
            return 11 - (int) (somatorio);
        } else {
            return 0;
        }
    }
    
}
