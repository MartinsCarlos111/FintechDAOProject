
package dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import factory.ConnectionFactory;
import model.Recebimento;

public class RecebimentoDAO {
    public void insert(Recebimento r) {
        String sql = "INSERT INTO T_RECEBIMENTO (id_receb, nm_receb, vl_receb, dt_receb, ds_receb, ctg_receb, f_USUÁRIO_id_user) VALUES (?, ?, ?, ?, ?, ?, ?)";
        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, r.getId());
            stmt.setString(2, r.getNome());
            stmt.setDouble(3, r.getValor());
            stmt.setDate(4, new java.sql.Date(r.getData().getTime()));
            stmt.setString(5, r.getDescricao());
            stmt.setString(6, r.getCategoria());
            stmt.setInt(7, r.getIdUsuario());

            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Recebimento> getAll() {
        List<Recebimento> lista = new ArrayList<>();
        String sql = "SELECT * FROM T_RECEBIMENTO";
        try (Connection conn = ConnectionFactory.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                Recebimento r = new Recebimento(
                    rs.getInt("id_receb"),
                    rs.getString("nm_receb"),
                    rs.getDouble("vl_receb"),
                    rs.getDate("dt_receb"),
                    rs.getString("ds_receb"),
                    rs.getString("ctg_receb"),
                    rs.getInt("f_USUÁRIO_id_user")
                );
                lista.add(r);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;
    }
}
