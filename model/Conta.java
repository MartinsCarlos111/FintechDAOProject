package model;

public class Conta {
    private int idConta;
    private String numeroConta;
    private String agencia;
    private String digitoVerificador;
    private String tipoConta;
    private double saldo;
    private int idUsuario;

    public Conta(int idConta, String numeroConta, String agencia, String digitoVerificador, String tipoConta, double saldo, int idUsuario) {
        this.idConta = idConta;
        this.numeroConta = numeroConta;
        this.agencia = agencia;
        this.digitoVerificador = digitoVerificador;
        this.tipoConta = tipoConta;
        this.saldo = saldo;
        this.idUsuario = idUsuario;
    }

    public int getIdConta() {
        return idConta;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public String getAgencia() {
        return agencia;
    }

    public String getDigitoVerificador() {
        return digitoVerificador;
    }

    public String getTipoConta() {
        return tipoConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public int getIdUsuario() {
        return idUsuario;
    }
}
