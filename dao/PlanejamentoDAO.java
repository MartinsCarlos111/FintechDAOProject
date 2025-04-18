package dao;

import factory.ConnectionFactory;
import model.Planejamento;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PlanejamentoDAO {

    public void insert(Planejamento p) {
        String sql = "INSERT INTO T_PLANEJAMENTO (id_plan, nm_plan, vl_total_plan, dt_inicio_plan, ds_plan, ctg_plan, T_USUÁRIO_id_user) VALUES (?, ?, ?, ?, ?, ?, ?)";

        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, p.getIdPlan());
            stmt.setString(2, p.getNomePlan());
            stmt.setDouble(3, p.getValorTotalPlan());
            stmt.setDate(4, new java.sql.Date(p.getDataInicioPlan().getTime())); // Converte a data para o formato SQL
            stmt.setString(5, p.getDescricao());
            stmt.setString(6, p.getCategoria());
            stmt.setInt(7, p.getIdUsuario());

            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Método para retornar todos os Planejamentos
    public List<Planejamento> getAllPlanejamentos() {
        List<Planejamento> lista = new ArrayList<>();
        String sql = "SELECT * FROM T_PLANEJAMENTO";

        try (Connection conn = ConnectionFactory.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                Planejamento planejamento = new Planejamento(
                        rs.getInt("id_plan"),
                        rs.getString("nm_plan"),
                        rs.getDouble("vl_total_plan"),
                        rs.getDate("dt_inicio_plan"), // Obtém a data diretamente
                        rs.getString("ds_plan"),
                        rs.getString("ctg_plan"),
                        rs.getInt("T_USUÁRIO_id_user")
                );
                lista.add(planejamento);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return lista;
    }
}
