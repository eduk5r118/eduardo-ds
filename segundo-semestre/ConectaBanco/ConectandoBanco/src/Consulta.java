// Importações
import java.sql.Connection;       // Conexão com o banco
import java.sql.DriverManager;    // Cria a conexão
import java.sql.PreparedStatement;// Para consultas SQL
import java.sql.ResultSet;        // Armazena os resultados do SELECT
import java.sql.SQLException;     // Trata erros SQL

public class Consulta {
    // Método que consulta e exibe todos os alunos cadastrados
    public static void Consultar_Dados() {
        // Dados de conexão
        String url = "jdbc:mysql://localhost:3306/fat";
        String usuario = "root";
        String senha = "";

        try {
            // Carrega o driver JDBC
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Conecta ao banco
            Connection conexao = DriverManager.getConnection(url, usuario, senha);
            System.out.println("✅ Conectado ao banco!");

            // SQL que busca todos os alunos
            String sql = "SELECT * FROM alunos";

            // Prepara o comando
            PreparedStatement stmt = conexao.prepareStatement(sql);

            // Executa a consulta
            ResultSet resultado = stmt.executeQuery();

            // Exibe os alunos encontrados
            System.out.println("📋 Lista de alunos:");
            while (resultado.next()) { // percorre cada linha da tabela
                String nome_aluno = resultado.getString("nome_aluno");     // pega o nome
                String codigo_aluno = resultado.getString("codigo_aluno"); // pega o código
                System.out.println("Nome: " + nome_aluno + " | Codigo Aluno: " + codigo_aluno);
            }

            // Fecha recursos
            resultado.close();
            stmt.close();
            conexao.close();

        } catch (ClassNotFoundException e) {
            // Se o driver JDBC não for encontrado
            System.out.println("❌ Driver JDBC não encontrado: " + e.getMessage());
        } catch (SQLException e) {
            // Se der erro na consulta ou conexão
            System.out.println("❌ Erro ao conectar ou consultar: " + e.getMessage());
        }
    }
    
}
