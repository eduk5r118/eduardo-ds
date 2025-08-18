public class ConectaBanco {
    // Método principal do Java (ponto de entrada do programa)
    public static void main(String[] args) {
        // Primeiro: testa a conexão
        Conexao.Conectabanco();

        // Segundo: insere um aluno no banco
        Inserir_Dados.InserirAluno("2009", "Eduardo Coussirat");

        // Terceiro: consulta e mostra todos os alunos cadastrados
        Consulta.Consultar_Dados();
    }
}
