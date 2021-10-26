/*
					Atividade 2
Crie um banco de dados para um e commerce, onde o sistema trabalhará com as
informações dos produtos deste ecommerce.
Crie uma tabela produtos e utilizando a habilidade de abstração e determine 5 atributos
relevantes dos produtos para se trabalhar com o serviço deste ecommerce.
Popule esta tabela com até 8 dados;
Faça um select que retorne os produtos com o valor maior do que 500.
Faça um select que retorne os produtos com o valor menor do que 500.
Ao término atualize um dado desta tabela através de uma query de atualização.
salve as querys para cada uma dos requisitos o exercício em um arquivo .SQL ou texto e
coloque no seu GitHuB pessoal e compartilhe esta atividade.
*/

CREATE DATABASE db_ecommerce;

USE db_ecommerce;

CREATE TABLE tb_produtos (
	id_produto BIGINT AUTO_INCREMENT,
    nome VARCHAR(100) NOT NULL,
    preco DECIMAL(10,2) NOT NULL,
    qtd_estoque INT NOT NULL,
    categoria VARCHAR(100),
    PRIMARY KEY (id_produto)
);

ALTER TABLE tb_produtos
MODIFY COLUMN qtd_estoque INT;

INSERT INTO tb_produtos (nome, preco, qtd_estoque, categoria)
VALUES
("Tenis Nike runner", 199.99, 9, "Esportivo"),
("Chuteira Nike kicker", 229.99, 10, "Esportivo"),
("Camisa Nike", 59.99, 20, "Casual"),
("Regata Nike", 49.99, 12, "Esportivo"),
("Camisa Nike kids", 49.99, 8, "Esportivo"),
("Tenis Nike", 159.99, 6, "Casual");

SELECT * FROM tb_produtos
WHERE preco > 500.00;

SELECT * FROM tb_produtos
WHERE preco < 500.00;

UPDATE tb_produtos
SET preco = 299.99
WHERE id_produto = 1; 
