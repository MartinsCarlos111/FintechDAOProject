package model;

import java.util.Date;

public class Recorrencia {
    private int idParcela;
    private double valorParcela;
    private int parcelaAtual;
    private Date dataVencimento;
    private Date dataPagamento;
    private int idDespesa;

    public Recorrencia(int idParcela, double valorParcela, int parcelaAtual,
                       Date dataVencimento, Date dataPagamento, int idDespesa) {
        this.idParcela = idParcela;
        this.valorParcela = valorParcela;
        this.parcelaAtual = parcelaAtual;
        this.dataVencimento = dataVencimento;
        this.dataPagamento = dataPagamento;
        this.idDespesa = idDespesa;
    }

    // Getters
    public int getIdParcela() {
        return idParcela;
    }

    public double getValorParcela() {
        return valorParcela;
    }

    public int getParcelaAtual() {
        return parcelaAtual;
    }

    public Date getDataVencimento() {
        return dataVencimento;
    }

    public Date getDataPagamento() {
        return dataPagamento;
    }

    public int getIdDespesa() {
        return idDespesa;
    }

    // Setters
    public void setIdParcela(int idParcela) {
        this.idParcela = idParcela;
    }

    public void setValorParcela(double valorParcela) {
        this.valorParcela = valorParcela;
    }

    public void setParcelaAtual(int parcelaAtual) {
        this.parcelaAtual = parcelaAtual;
    }

    public void setDataVencimento(Date dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public void setDataPagamento(Date dataPagamento) {
        this.dataPagamento = dataPagamento;
    }

    public void setIdDespesa(int idDespesa) {
        this.idDespesa = idDespesa;
    }
}