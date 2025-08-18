// Importações necessárias para trabalhar com JDBC (Java Database Connectivity)
import java.sql.Connection;     // Representa a conexão com o banco
import java.sql.DriverManager;  // Cria a conexão
import java.sql.SQLException;   // Trata erros de SQL

public class Conexao {
    // Método estático para conectar ao banco
    public static void Conectabanco()
    {
        // URL de conexão (banco chamado "fat" no MySQL rodando na porta 3306)
        String url = "jdbc:mysql://localhost:3306/fat";
        String usuario = "root";   // Usuário do MySQL
        String senha = "";         // Senha (aqui está vazia)

        try {
            // Carrega o driver JDBC do MySQL
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Abre a conexão com o banco
            Connection conexao = DriverManager.getConnection(url, usuario , senha);

            // Mensagem se der certo
            System.out.println("Conexao realizada com sucesso!");

            // Fecha a conexão
            conexao.close();

        } catch (ClassNotFoundException e) {
            // Caso o driver não seja encontrado
            System.out.println("Driver JDBC não encontrado: " + e.getMessage());
        } catch (SQLException e) {
            // Caso haja erro na conexão
            System.out.println("Erro ao conectar: " + e.getMessage());
        }
    }
}
