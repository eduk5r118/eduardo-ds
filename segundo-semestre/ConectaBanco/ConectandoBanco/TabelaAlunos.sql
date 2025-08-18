CREATE DATABASE IF NOT EXISTS fat; -- Cria o banco de dados 

USE fat; -- Seleciona esse banco para trabalhar

-- Cria a tabela onde os dados serão armazenados
CREATE TABLE IF NOT EXISTS alunos (
    codigo_aluno VARCHAR(10), -- Código único do aluno (chave primária)
    nome_aluno   VARCHAR(100)          -- Nome do aluno
);

