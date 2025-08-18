CREATE DATABASE IF NOT EXISTS fat; -- cria o banco de dados

USE fat; -- seleciona esse banco para trabalhar

-- cria a tabela onde os dados serão armazenados
CREATE TABLE IF NOT EXISTS alunos (
	codigo_aluno VARCHAR(10), -- código único do aluno (chave primária)
    nome_aluno VARCHAR(100)		 -- nome do aluno
);

