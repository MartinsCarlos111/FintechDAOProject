package model;

public class Insumo {
    private int idInsumo;
    private String nomeInsumo;
    private double quantidadeInicial;
    private String categoriaInsumo;
    private int idUsuario;

    public Insumo(int idInsumo, String nomeInsumo, double quantidadeInicial, String categoriaInsumo, int idUsuario) {
        this.idInsumo = idInsumo;
        this.nomeInsumo = nomeInsumo;
        this.quantidadeInicial = quantidadeInicial;
        this.categoriaInsumo = categoriaInsumo;
        this.idUsuario = idUsuario;
    }

    // Getters
    public int getIdInsumo() {
        return idInsumo;
    }

    public String getNomeInsumo() {
        return nomeInsumo;
    }

    public double getQuantidadeInicial() {
        return quantidadeInicial;
    }

    public String getCategoriaInsumo() {
        return categoriaInsumo;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    // Setters (if needed)
    public void setIdInsumo(int idInsumo) {
        this.idInsumo = idInsumo;
    }

    public void setNomeInsumo(String nomeInsumo) {
        this.nomeInsumo = nomeInsumo;
    }

    public void setQuantidadeInicial(double quantidadeInicial) {
        this.quantidadeInicial = quantidadeInicial;
    }

    public void setCategoriaInsumo(String categoriaInsumo) {
        this.categoriaInsumo = categoriaInsumo;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }
}