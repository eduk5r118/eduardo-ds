// Importações necessárias
import java.sql.Connection;       // Representa a conexão
import java.sql.DriverManager;    // Cria a conexão
import java.sql.SQLException;     // Trata erros SQL
import java.sql.PreparedStatement;// Para comandos SQL parametrizados (evita SQL injection)

public class Inserir_Dados {
    // Método para inserir um aluno no banco
    public static void InserirAluno(String codigo_aluno,String nome_aluno) {
        // Dados para conexão
        String url = "jdbc:mysql://localhost:3306/fat"; // Endereço do banco
        String usuario = "root"; // Usuário do MySQL
        String senha = "";       // Senha do MySQL
        
        // Testa a conexão (opcional, só imprime no console se deu certo)
        Conexao.Conectabanco();

        // SQL que insere dados na tabela "alunos"
        String sql = "INSERT INTO alunos (codigo_aluno, nome_aluno) VALUES (?,?)";
     
        try (
            // Abre conexão com o banco
            Connection conn = DriverManager.getConnection(url, usuario, senha);
            // Prepara o comando SQL
            PreparedStatement stmt  = conn.prepareStatement(sql)
        )
        {
            // Define os valores para os "?" do SQL
            stmt.setString(1, codigo_aluno); // aqui vai o código do aluno
            stmt.setString(2, nome_aluno);   // aqui vai o nome do aluno
          
            // Executa o comando no banco
            stmt.executeUpdate();
            System.out.println("Dados inseridos com Sucesso");
             
        } catch (SQLException e) {
            // Caso haja erro, mostra a mensagem
            System.out.println("Erro ao conectar: " + e.getMessage());      
        }
    }
}