package dao;

import factory.ConnectionFactory;
import model.Recorrencia;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class RecorrenciaDAO {

    public void insert(Recorrencia recorrencia) {
        String sql = "INSERT INTO T_RECORRENCIA (id_parcela, vl_parcela, parcela_atual, dt_vencimento, dt_pagamento, T_DESPESA_id_desp) VALUES (?, ?, ?, ?, ?, ?)";

        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, recorrencia.getIdParcela());
            stmt.setDouble(2, recorrencia.getValorParcela());
            stmt.setInt(3, recorrencia.getParcelaAtual());
            stmt.setDate(4, new java.sql.Date(recorrencia.getDataVencimento().getTime()));
            stmt.setDate(5, recorrencia.getDataPagamento() != null ?
                    new java.sql.Date(recorrencia.getDataPagamento().getTime()) : null);
            stmt.setInt(6, recorrencia.getIdDespesa());

            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Recorrencia> getAllRecorrencias() {
        List<Recorrencia> lista = new ArrayList<>();
        String sql = "SELECT * FROM T_RECORRENCIA";

        try (Connection conn = ConnectionFactory.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                Recorrencia rec = new Recorrencia(
                        rs.getInt("Id_pareela"),
                        rs.getDouble("vl_pareela"),
                        rs.getInt("pareela_atual"),
                        rs.getDate("dt_venoimento"),
                        rs.getDate("dt_pagamento"),
                        rs.getInt("T_DESPESA_id_desp")
                );
                lista.add(rec);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;
    }
}