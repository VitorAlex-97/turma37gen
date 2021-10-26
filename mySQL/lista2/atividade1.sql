CREATE DATABASE db_generation_game_online;

USE db_generation_game_online;

CREATE TABLE tb_classe(
	id_classe INT NOT NULL AUTO_INCREMENT,
	nome ENUM("DUELISTA", "INICIADOR", "CONTROLADOR", "SENTINELA") NOT NULL,
    cura BOOLEAN,
    PRIMARY KEY(id_classe)
);

CREATE TABLE tb_personagem(
	nome VARCHAR(255) NOT NULL,
    ataque INT,
    defesa INT,
    ultimate INT,
	disponivel INT,
    fk_classe INT,
	PRIMARY KEY (nome),
    FOREIGN KEY (fk_classe) REFERENCES tb_classe(id_classe)
);

-- COMO PODE VER, INICIEI A TABELA COM disponivel DO TIPO INT
ALTER TABLE tb_personagem
MODIFY COLUMN disponivel BOOLEAN;

-- Popule esta tabela classe com até 5 dados.
INSERT INTO tb_classe (nome, cura)
VALUES 
("DUELISTA", true),
("INICIADOR", null),
("CONTROLADOR", false),
("SENTINELA", null);

-- USEI POIS ADICIONEI 2X AS CLASSES
SELECT * FROM tb_classe;
DELETE FROM tb_classe WHERE id_classe > 4;

-- Popule esta tabela personagem com até 8 dados.
INSERT INTO tb_personagem (nome, ataque, defesa, ultimate, disponivel, fk_classe)
VALUES
("OMEN", 180, 100, 250, true, 3),
("RAZE", 300, 50, 400, true, 1),
("JETT", 250, 70, 300, true, 1),
("SAGE", 100, 400, 200, true, 4),
("PHONEX", 200, 60, 250, true, 1),
("SOVA", 200, 100, 280, true, 2),
("KILLJOY", 110, 300, 320, true, 4),
("BRINSTONE", 110, 150, 300, true, 3),
("SKYE", 160, 130, 270, true, 2);

-- Faça um select que retorne os personagens com o poder de ataque maior do que 2000.
SELECT * FROM tb_personagem
WHERE ataque > 200;

-- Faça um select trazendo os personagens com poder de defesa entre 1000 e 2000.
SELECT * FROM tb_personagem
WHERE defesa BETWEEN 100 AND 200;

-- Faça um select utilizando LIKE buscando os personagens com a letra C.
SELECT * FROM tb_personagem
WHERE nome LIKE "c%";

-- Faça um um select com Inner join entre tabela classe e personagem.
SELECT * FROM tb_classe
INNER JOIN tb_personagem
ON tb_classe.id_classe = tb_personagem.fk_classe;

-- Faça um select onde traga todos os personagem de uma classe específica
-- 1: DUELISTA
SELECT * FROM tb_personagem
WHERE tb_personagem.fk_classe = 1;
