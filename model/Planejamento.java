package model;

import java.util.Date;

public class Planejamento {
    private int idPlan;
    private String nomePlan;
    private double valorTotalPlan;
    private Date dataInicioPlan;
    private String descricao;
    private String categoria;
    private int idUsuario;

    public Planejamento(int idPlan, String nomePlan, double valorTotalPlan, Date dataInicioPlan, String descricao, String categoria, int idUsuario) {
        this.idPlan = idPlan;
        this.nomePlan = nomePlan;
        this.valorTotalPlan = valorTotalPlan;
        this.dataInicioPlan = dataInicioPlan;
        this.descricao = descricao;
        this.categoria = categoria;
        this.idUsuario = idUsuario;
    }

    // Getters
    public int getIdPlan() { return idPlan; }
    public String getNomePlan() { return nomePlan; }
    public double getValorTotalPlan() { return valorTotalPlan; }
    public Date getDataInicioPlan() { return dataInicioPlan; }
    public String getDescricao() { return descricao; }
    public String getCategoria() { return categoria; }
    public int getIdUsuario() { return idUsuario; }
}
