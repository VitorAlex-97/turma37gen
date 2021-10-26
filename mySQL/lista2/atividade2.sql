CREATE DATABASE db_pizzaria_legal;

USE db_pizzaria_legal;

CREATE TABLE tb_categoria(
	nome VARCHAR(255) NOT NULL,
    tipo ENUM ("DOCE","SALGADA"),
    is_rodizio BOOLEAN,
	PRIMARY KEY (nome)
);

CREATE TABLE tb_pizza(
	id_pizza INT NOT NULL AUTO_INCREMENT,
    tamanho ENUM("G", "M", "P"),
	preco DECIMAL(3, 2),
    adicional BOOLEAN DEFAULT false,
	cliente VARCHAR(255) NOT NULL,
    fk_categoria VARCHAR(255),
    PRIMARY KEY(id_pizza),
    FOREIGN KEY (fk_categoria) REFERENCES tb_categoria(nome)
);

ALTER TABLE tb_pizza
MODIFY COLUMN preco DECIMAL(5, 2);

-- Popule esta tabela Categoria com até 5 dados.
INSERT INTO tb_categoria(nome, tipo, is_rodizio)
VALUES
("CALABRESA", "SALGADA", true),
("PORTUGUESA", "SALGADA", true),
("FRANGO COM CATUPIRI", "SALGADA", true),
("BRIGADEIRO", "DOCE", true),
("CARNE DE SOL", "SALGADA", false);

-- Popule esta tabela pizza com até 8 dados.
INSERT INTO tb_pizza(tamanho, preco, adicional, cliente, fk_categoria)
VALUES
("G", 44.99, true, "mesa 2", "CARNE DE SOL"),
("G", 29.99, false, "mesa 2", "CALABRESA"),
("G", 35.99, false, "mesa 2", "FRANGO COM CATUPIRI"),
("G", 35.99, false, "mesa 3", "FRANGO COM CATUPIRI"),
("G", 35.99, false, "mesa 3", "FRANGO COM CATUPIRI"),
("M", 29.99, false, "mesa 5", "CARNE DE SOL"),
("G", 32.99, false, "mesa 4","PORTUGUESA"),
("G", 39.99, false, "mesa 4", "CARNE DE SOL");


-- Faça um select que retorne os Produtos com o valor maior do que 45 reais.
SELECT * FROM tb_pizza
WHERE preco > 45.00;

-- Faça um select trazendo os Produtos com valor entre 29 e 60 reais.
SELECT * FROM tb_pizza
WHERE preco BETWEEN 29.00 AND 60.00;

-- Faça um select utilizando LIKE buscando os Produtos com a letra C.
SELECT * FROM tb_pizza
WHERE fk_categoria LIKE "C%";

-- Faça um um select com Inner join entre tabela categoria e pizza.
SELECT * FROM tb_categoria
INNER JOIN tb_pizza
ON tb_categoria.nome = tb_pizza.fk_categoria;

-- Faça um select onde traga todos os Produtos de uma categoria específica (exemplo todos os produtos que são pizza doce).
SELECT * FROM tb_pizza
WHERE tb_pizza.fk_categoria = "CARNE DE SOL";