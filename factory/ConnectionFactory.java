
package factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    public static Connection getConnection() throws SQLException {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            return DriverManager.getConnection(
                "jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL",
                "seu_rm",
                "senha_fiapon"
            );

//            return DriverManager.getConnection(
//                    "jdbc:oracle:thin:@localhost:1521/XEPDB1",  // Nome padrão do PDB
//                    "system",                                   // Usuário padrão
//                    "password123"                               // Senha definida na variável de ambiente
//            );

        } catch (ClassNotFoundException e) {
            throw new SQLException("Driver JDBC não encontrado.", e);
        }
    }
}
