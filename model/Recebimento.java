
package model;

import java.util.Date;

public class Recebimento {
    private int id;
    private String nome;
    private double valor;
    private Date data;
    private String descricao;
    private String categoria;
    private int idUsuario;

    public Recebimento(int id, String nome, double valor, Date data, String descricao, String categoria, int idUsuario) {
        this.id = id;
        this.nome = nome;
        this.valor = valor;
        this.data = data;
        this.descricao = descricao;
        this.categoria = categoria;
        this.idUsuario = idUsuario;
    }

    public int getId() { return id; }
    public String getNome() { return nome; }
    public double getValor() { return valor; }
    public Date getData() { return data; }
    public String getDescricao() { return descricao; }
    public String getCategoria() { return categoria; }
    public int getIdUsuario() { return idUsuario; }
}
