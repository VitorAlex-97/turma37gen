CREATE DATABASE db_farmacia_do_bem;

USE db_farmacia_do_bem;

CREATE TABLE tb_categoria(
	id_nome VARCHAR(255) NOT NULL,
    corredor INT,
    qtd_marcas INT,
    PRIMARY KEY (id_nome)
);

CREATE TABLE tb_produto (
	codigo VARCHAR(255),
    nome VARCHAR(255),
    preco DECIMAL (5,2),
    marca VARCHAR(255),
    validade DATE,
    fk_categoria VARCHAR(255) NOT NULL,
    PRIMARY KEY (codigo),
    FOREIGN KEY (fk_categoria) REFERENCES tb_categoria (id_nome)    
);

-- Popule esta tabela Categoria com até 5 dados.
INSERT INTO tb_categoria (id_nome, corredor, qtd_marcas)
VALUES
("COSMÉTICOS", 1, 6),
("HIGIENE", 2, 8),
("MEDICAMENTOS", 3, 20),
("CONVENIÊNCIA", 4, 15),
("SUPLEMENTOS", 5, 7);

-- Popule esta tabela Produto com até 8 dados.
INSERT INTO tb_produto (codigo, nome, preco, marca, validade, fk_categoria)
VALUES
("001", "BIOTONICOX", 18.99, "BIOACTIVO", "2022-02-15", "SUPLEMENTOS"),
("002", "DIPIRONA", 4.99, "NEO-QUÍMICA", "2022-06-15", "MEDICAMENTOS"),
("003", "PARACETAMOL", 3.99, "MEDLEY", "2022-05-02", "MEDICAMENTOS"),
("004", "FRAUDA BABY", 25.99, "JOHNSON", "2022-02-06", "HIGIENE"),
("005", "LENÇO UMEDECIDO", 9.99, "NEVEA", "2022-02-03", "HIGIENE"),
("006", "DESODORANTE NEVEA", 10.99, "NEVEA", "2022-02-15", "HIGIENE"),
("007", "ESCOVA DE DENTE", 7.99, "ORAL-B", "2022-02-13", "HIGIENE"),
("008", "PASTA DENTAL", 3.99, "ORAL-B", "2022-02-13", "HIGIENE");

-- Faça um select que retorne os Produtos com o valor maior do que 10 reais.
SELECT * FROM tb_produto 
WHERE preco > 10.00;

-- Faça um select trazendo os Produtos com valor entre 3 e 60 reais.
SELECT * FROM tb_produto
WHERE preco BETWEEN 3.00 AND 60.00;

-- Faça um select utilizando LIKE buscando os Produtos com a letra B.
SELECT * FROM tb_produto
WHERE nome LIKE "%B%";

-- Faça um um select com Inner join entre tabela categoria e produto.
SELECT * FROM tb_produto
INNER JOIN tb_categoria
ON tb_produto.fk_categoria = tb_categoria.id_nome;

-- Faça um select onde traga todos os Produtos de uma categoria específica (exemplo todos os produtos que são cosméticos).
SELECT * FROM tb_produto
WHERE fk_categoria = "HIGIENE";