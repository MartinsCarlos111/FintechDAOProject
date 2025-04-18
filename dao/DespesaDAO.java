package dao;

import factory.ConnectionFactory;
import model.Despesa;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DespesaDAO {

    public void insert(Despesa despesa) {
        String sql = "INSERT INTO T_DESPESA (id_desp, nm_desp, vl_desp, dt_desp, ds_desp, " +
                "qntd_parcelas, ctg_desp, T_USUÁRIO_id_user, T_RECORRENCIA_id_parcela) " +
                "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, despesa.getIdDespesa());
            stmt.setString(2, despesa.getNomeDespesa());
            stmt.setDouble(3, despesa.getValorDespesa());
            stmt.setDate(4, new java.sql.Date(despesa.getDataDespesa().getTime()));
            stmt.setString(5, despesa.getDescricaoDespesa());
            stmt.setInt(6, despesa.getQuantidadeParcelas());
            stmt.setString(7, despesa.getCategoriaDespesa());
            stmt.setInt(8, despesa.getIdUsuario());
            stmt.setInt(9, despesa.getIdParcelaRecorrencia());

            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Despesa> getAllDespesas() {
        List<Despesa> lista = new ArrayList<>();
        String sql = "SELECT * FROM T_DESPESA";

        try (Connection conn = ConnectionFactory.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                Despesa despesa = new Despesa(
                        rs.getInt("id_desp"),
                        rs.getString("nm_desp"),
                        rs.getDouble("vl_desp"),
                        rs.getDate("dt_desp"),
                        rs.getString("ds_desp"),
                        rs.getInt("qntd_parcelas"),
                        rs.getString("ctg_desp"),
                        rs.getInt("T_USUÁRIO_id_user"),
                        rs.getInt("T_RECORRENCIA_id_parcela")
                );
                lista.add(despesa);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;
    }
}