package model;

import java.util.Date;

public class Despesa {
    private int idDespesa;
    private String nomeDespesa;
    private double valorDespesa;
    private Date dataDespesa;
    private String descricaoDespesa;
    private int quantidadeParcelas;
    private String categoriaDespesa;
    private int idUsuario;
    private int idParcelaRecorrencia;

    public Despesa(int idDespesa, String nomeDespesa, double valorDespesa, Date dataDespesa,
                   String descricaoDespesa, int quantidadeParcelas, String categoriaDespesa,
                   int idUsuario, int idParcelaRecorrencia) {
        this.idDespesa = idDespesa;
        this.nomeDespesa = nomeDespesa;
        this.valorDespesa = valorDespesa;
        this.dataDespesa = dataDespesa;
        this.descricaoDespesa = descricaoDespesa;
        this.quantidadeParcelas = quantidadeParcelas;
        this.categoriaDespesa = categoriaDespesa;
        this.idUsuario = idUsuario;
        this.idParcelaRecorrencia = idParcelaRecorrencia;
    }

    // Getters
    public int getIdDespesa() { return idDespesa; }
    public String getNomeDespesa() { return nomeDespesa; }
    public double getValorDespesa() { return valorDespesa; }
    public Date getDataDespesa() { return dataDespesa; }
    public String getDescricaoDespesa() { return descricaoDespesa; }
    public int getQuantidadeParcelas() { return quantidadeParcelas; }
    public String getCategoriaDespesa() { return categoriaDespesa; }
    public int getIdUsuario() { return idUsuario; }
    public int getIdParcelaRecorrencia() { return idParcelaRecorrencia; }

    // Setters
    public void setIdDespesa(int idDespesa) { this.idDespesa = idDespesa; }
    public void setNomeDespesa(String nomeDespesa) { this.nomeDespesa = nomeDespesa; }
    public void setValorDespesa(double valorDespesa) { this.valorDespesa = valorDespesa; }
    public void setDataDespesa(Date dataDespesa) { this.dataDespesa = dataDespesa; }
    public void setDescricaoDespesa(String descricaoDespesa) { this.descricaoDespesa = descricaoDespesa; }
    public void setQuantidadeParcelas(int quantidadeParcelas) { this.quantidadeParcelas = quantidadeParcelas; }
    public void setCategoriaDespesa(String categoriaDespesa) { this.categoriaDespesa = categoriaDespesa; }
    public void setIdUsuario(int idUsuario) { this.idUsuario = idUsuario; }
    public void setIdParcelaRecorrencia(int idParcelaRecorrencia) { this.idParcelaRecorrencia = idParcelaRecorrencia; }
}