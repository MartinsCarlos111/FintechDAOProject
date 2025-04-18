package dao;

import factory.ConnectionFactory;
import model.Conta;
import model.Recebimento;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ContaDAO {

    public void insert(Conta c) {
        String sql = "INSERT INTO T_CONTA (id_conta, num_conta, agencia, digito_verificador, tipo_conta, saldo_user, T_USUÁRIO_id_user) VALUES (?, ?, ?, ?, ?, ?, ?)";

        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, c.getIdConta());
            stmt.setString(2, c.getNumeroConta());
            stmt.setString(3, c.getAgencia());
            stmt.setString(4, c.getDigitoVerificador());
            stmt.setString(5, c.getTipoConta());
            stmt.setDouble(6, c.getSaldo());
            stmt.setInt(7, c.getIdUsuario());

            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Conta> getAllContas() {
        List<Conta> lista = new ArrayList<>();
        String sql = "SELECT * FROM T_CONTA";

        try (Connection conn = ConnectionFactory.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                Conta conta = new Conta(
                        rs.getInt("id_conta"),
                        rs.getString("num_conta"),
                        rs.getString("agencia"),
                        rs.getString("digito_verificador"),
                        rs.getString("tipo_conta"),
                        rs.getDouble("saldo_user"),
                        rs.getInt("T_USUÁRIO_id_user")
                );
                lista.add(conta);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return lista;
    }

}
