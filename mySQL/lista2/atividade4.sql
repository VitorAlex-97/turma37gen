CREATE DATABASE db_cidade_das_carnes;

USE db_cidade_das_carnes;

CREATE TABLE tb_categoria (
	nome VARCHAR(255) NOT NULL,
    qtd_marcas INT,
    disponivel BOOLEAN,
    PRIMARY KEY (nome)
);

CREATE TABLE tb_produto (
	codigo VARCHAR(255),
    nome VARCHAR(255),
    preco DECIMAL (5,2),
    marca VARCHAR(255),
    validade DATE,
    fk_categoria VARCHAR(255) NOT NULL,
    PRIMARY KEY (codigo),
    FOREIGN KEY (fk_categoria) REFERENCES tb_categoria (nome)    
);

INSERT INTO tb_categoria(nome, qtd_marcas, disponivel)
VALUES
("BOVINO", 5, true),
("SUINO", 5, true),
("AVES", 7, true),
("PEIXE", 4, true),
("FRUTOS DO MAR", 6, true);

INSERT INTO tb_produto (codigo, nome, preco, marca, validade, fk_categoria)
VALUES
("001", "PEITO DE FRANGO", 15.99, "FRIBOI", "2022-02-15", "AVES"),
("002", "ASINHA", 9.99, "SADIA", "2022-02-20", "AVES"),
("003", "MAMINHA", 44.99, "FRIMESA", "2022-04-15", "BOVINO"),
("004", "ASINHA", 12.99, "FRIMESA", "2022-02-15", "AVES"),
("005", "PEITO DE FRANGO", 18.99, "SADIA", "2022-05-15", "AVES"),
("006", "BISTECA", 14.99, "SADIA", "2022-02-15", "SUINO"),
("007", "BISTECA", 15.99, "FRIBOI", "2022-02-01", "SUINO"),
("008", "MAMINHA", 49.99, "FRIBOI", "2022-02-15", "BOVINO");

-- Faça um select que retorne os Produtos com o valor maior do que 50 reais.
SELECT * FROM tb_produto
WHERE preco > 15.00;

-- Faça um select trazendo os Produtos com valor entre 3 e 60 reais.
SELECT * FROM tb_produto
WHERE preco BETWEEN 10.00 AND 20.00;

-- Faça um select utilizando LIKE buscando os Produtos com a letra C.
SELECT * FROM tb_produto
WHERE nome LIKE "%c%";