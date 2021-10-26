/*
						Atividade 1
1.Crie um banco de dados para um serviço de RH de uma empresa, onde o sistema
2.trabalhará com as informações dos funcionaries desta empresa.
3.Crie uma tabela de funcionaries e utilizando a habilidade de abstração e determine 5
4.atributos relevantes dos funcionaries para se trabalhar com o serviço deste RH.
5.Popule esta tabela com até 5 dados;
6.Faça um select que retorne os funcionaries com o salário maior do que 2000.
7.Faça um select que retorne os funcionaries com o salário menor do que 2000.
8.Ao término atualize um dado desta tabela através de uma query de atualização.

salve as querys para cada uma dos requisitos o exercício em um arquivo .SQL ou texto e
coloque no seu GitHuB pessoal e compartilhe esta atividade.
*/

CREATE DATABASE db_RH;

USE db_rh;

CREATE TABLE tb_funcionarios(
	cpf VARCHAR(16) NOT NULL,
    nome VARCHAR(60) NOT NULL,
    salario DECIMAL(10,2) NOT NULL,
    data_entrada DATE NOT NULL,
	ferias BOOLEAN NOT NULL,
    PRIMARY KEY (cpf)
);

INSERT INTO tb_funcionarios (cpf, nome, salario, data_entrada, ferias)
VALUES("563.985.364-66", "Vitor Alex Sales da Costa", 2500.00, "2021-09-15", FALSE );

INSERT INTO tb_funcionarios (cpf, nome, salario, data_entrada, ferias)
VALUES("000.111.222-22", "Ivar Sales Santos", 7000.00, "2019-04-20", FALSE );

INSERT INTO tb_funcionarios (cpf, nome, salario, data_entrada, ferias)
VALUES("223.666.888-66", "Hebe Santos Sales", 4000.00, "2020-08-20", FALSE );

INSERT INTO tb_funcionarios (cpf, nome, salario, data_entrada, ferias)
VALUES("138.654.895-66", "Amanda Santos Pereira", 2500.00, "2021-06-15", FALSE );

INSERT INTO tb_funcionarios (cpf, nome, salario, data_entrada, ferias)
VALUES("169.654.895-66", "Maria Alyce Sales da Costa", 2500.00, "2021-07-01", FALSE );

SELECT * 
FROM tb_funcionarios
WHERE salario > 2000.00;

SELECT * 
FROM tb_funcionarios
WHERE salario < 3000.00;

UPDATE tb_funcionarios
SET ferias = true
WHERE cpf = "563.985.364-66";
