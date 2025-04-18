package dao;

import factory.ConnectionFactory;
import model.Insumo;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class InsumoDAO {

    public void insert(Insumo insumo) {
        String sql = "INSERT INTO T_INSUMO (id_ins, nm_ins, qntd_inicial, ctg_ins, T_USUÁRIO_id_user) VALUES (?, ?, ?, ?, ?)";

        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, insumo.getIdInsumo());
            stmt.setString(2, insumo.getNomeInsumo());
            stmt.setDouble(3, insumo.getQuantidadeInicial());
            stmt.setString(4, insumo.getCategoriaInsumo());
            stmt.setInt(5, insumo.getIdUsuario());

            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Insumo> getAllInsumos() {
        List<Insumo> lista = new ArrayList<>();
        String sql = "SELECT * FROM T_INSUMO";

        try (Connection conn = ConnectionFactory.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                Insumo insumo = new Insumo(
                        rs.getInt("id_ins"),
                        rs.getString("nm_ins"),
                        rs.getDouble("qntd_inicial"),
                        rs.getString("ctg_ins"),
                        rs.getInt("T_USUÁRIO_id_user")
                );
                lista.add(insumo);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return lista;
    }
}