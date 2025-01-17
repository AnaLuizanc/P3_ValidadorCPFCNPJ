package br.edu.ifnmg.poo.validadorcpfcnpj;

/**
 * Classe de validação de CPF e CNPJ.
 *
 * @author AnaLuizanc
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
        long cpfLong = converterStringParaLong(removerSimbolosCpf(cpf));
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
        return Long.parseLong(numero);
    }

    public static String removerSimbolosCpf(String cpf) {
        return cpf.substring(0, 3) + cpf.substring(4, 7) + cpf.substring(8, 11) + cpf.substring(cpf.indexOf("-") + 1);
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Métodos de verificação de CNPJ">
    
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
        int peso = 2;
        while (peso <= 9) {
            somatorio += ((cnpj % 10) * peso);
            peso++;
            cnpj /= 10;
        }
        peso = 2;
        while (cnpj > 0) {
            somatorio += obterDigito(cnpj, peso) * peso;
            peso++;
            cnpj /= 10;
        }
        somatorio %= 11;
        if (somatorio > 0) {
            return 11 - (int) (somatorio);
        } else {
            return 0;
        }
    }

    public static boolean isCnpjValido(String cnpj) throws CnpjInvalidoException {
        long cnpjLong = converterStringParaLong(removerSimbolosCnpj(cnpj));
        long digitoVerificador = cnpjLong % 100;
        int digitoVerificadorGerado = geradorDigitoVerificadorCnpj(cnpjLong / 100);
        digitoVerificadorGerado = digitoVerificadorGerado * 10 + geradorDigitoVerificadorCnpj(cnpjLong / 10);
        if (digitoVerificador == digitoVerificadorGerado) {
            System.out.println(cnpj + "\nVálido.");
            return true;
        } else {
            System.out.println(cnpj);
            throw new CnpjInvalidoException();
        }
    }

    public static String removerSimbolosCnpj(String cnpj) {
        return cnpj.substring(0, 2) + cnpj.substring(3, 6) + cnpj.substring(7, 10) + cnpj.substring(11, 15) + cnpj.substring(cnpj.indexOf("-") + 1);
    }
//</editor-fold>
}
