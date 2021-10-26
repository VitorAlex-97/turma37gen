CREATE DATABASE db_blog_pessoal;

USE db_blog_pessoal;

CREATE TABLE tb_temas (
	id_tema BIGINT NOT NULL AUTO_INCREMENT,
    descricao VARCHAR(255) NOT NULL,
    PRIMARY KEY (id_tema)
);

CREATE TABLE tb_usuarios(
	id_usuario BIGINT NOT NULL AUTO_INCREMENT,
    nome VARCHAR(255) NOT NULL,
    usuario VARCHAR(255) NOT NULL,
    senha VARCHAR(255) NOT NULL,
    PRIMARY KEY (id_usuario)
);

CREATE TABLE tb_postagens(
	id_postagem BIGINT NOT NULL,
    titulo VARCHAR(255) NOT NULL,
    texto  VARCHAR(255) NOT NULL,
    `data` TIMESTAMP,
    fk_usuario BIGINT,
    fk_tema BIGINT,
    FOREIGN KEY (fk_usuario) REFERENCES tb_usuarios(id_usuario),
    FOREIGN KEY (fk_tema) REFERENCES tb_temas(id_tema)
);

