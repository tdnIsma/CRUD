package persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoBanco {

    private static String URL = "jdbc:mysql://localhost:3306/pi";
    private static String USUARIO = "root";
    private static String SENHA = "";

    public static Connection getConexao() throws SQLException {
        Connection con = null;
        try {
            con = DriverManager.getConnection(URL, USUARIO, SENHA);
        } catch (SQLException se) {
            throw new SQLException("Erro ao conectar! " + se.getMessage());
        }//fecha catch
        return con;
    }//fecha

}
