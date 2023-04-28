CREATE TABLE tipo_medida (
	id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,
	descricao TEXT NOT NULL, sigla TEXT NOT NULL,
	fator REAL NOT NULL DEFAULT 0,
	data_cadastro TEXT NOT NULL DEFAULT CURRENT_TIMESTAMP,
	data_atualizacao TEXT NOT NULL DEFAULT CURRENT_TIMESTAMP);

CREATE TABLE producao (
	id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,
	descricao TEXT NOT NULL,
	percentual_lucro REAL NOT NULL DEFAULT 0,
	valor_venda REAL NOT NULL DEFAULT 0,
	data_cadastro TEXT NOT NULL DEFAULT CURRENT_TIMESTAMP,
	data_atualizacao TEXT NOT NULL DEFAULT CURRENT_TIMESTAMP);

CREATE TABLE insumo (
	id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,
	descricao TEXT NOT NULL,
	tipo_medida_compra_id INTEGER NOT NULL,
	tipo_medida_quantidade_representada_id INTEGER NOT NULL,
	quantidade_representada REAL NOT NULL DEFAULT 0,
	preco REAL NOT NULL DEFAULT 0,
	data_cadastro TEXT NOT NULL DEFAULT CURRENT_TIMESTAMP,
	data_atualizacao TEXT NOT NULL DEFAULT CURRENT_TIMESTAMP,
	FOREIGN KEY (tipo_medida_compra_id) REFERENCES tipo_medida (id),
	FOREIGN KEY (tipo_medida_quantidade_representada_id) REFERENCES tipo_medida (id));

CREATE TABLE item_producao (
	id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,
	producao_id INTEGER NOT NULL,
	insumo_id INTEGER NOT NULL,
	tipo_medida_id INTEGER NOT NULL,
	quantidade REAL NOT NULL DEFAULT 0,
	data_cadastro TEXT NOT NULL DEFAULT CURRENT_TIMESTAMP,
	FOREIGN KEY (producao_id) REFERENCES producao (id),
	FOREIGN KEY (insumo_id) REFERENCES insumo (id),
	FOREIGN KEY (tipo_medida_id) REFERENCES tipo_medida (id));

/* Tipos de Medida mocadas no banco de dados */
INSERT INTO tipo_medida (descricao, sigla, fator) VALUES ('Quilo', 'kg', 1);
INSERT INTO tipo_medida (descricao, sigla, fator) VALUES ('Grmas', 'mg', 1000);
INSERT INTO tipo_medida (descricao, sigla, fator) VALUES ('Litro', 'lt', 1);
INSERT INTO tipo_medida (descricao, sigla, fator) VALUES ('Mililitros', 'ml', 1000);
INSERT INTO tipo_medida (descricao, sigla, fator) VALUES ('Unidade', 'un', 1);
INSERT INTO tipo_medida (descricao, sigla, fator) VALUES ('Caixa', 'cx', 1);
INSERT INTO tipo_medida (descricao, sigla, fator) VALUES ('Pacote', 'pt', 1);

/* Inserts para testes */
/*
	Quilo      1
	Grmas      2
	Litro      3
	Mililitros 4
	Unidade    5
	Caixa      6
	Pacote     7
*/
INSERT INTO insumo (descricao, tipo_medida_compra_id, tipo_medida_quantidade_representada_id, quantidade_representada, preco) VALUES ('Oleo de Soja', 5, 4, 900, 7.64);
INSERT INTO insumo (descricao, tipo_medida_compra_id, tipo_medida_quantidade_representada_id, quantidade_representada, preco) VALUES ('Acucar', 1, 1, 1, 5.89);
INSERT INTO insumo (descricao, tipo_medida_compra_id, tipo_medida_quantidade_representada_id, quantidade_representada, preco) VALUES ('Ovos', 5, 5, 30, 21.99);
INSERT INTO insumo (descricao, tipo_medida_compra_id, tipo_medida_quantidade_representada_id, quantidade_representada, preco) VALUES ('Leite', 6, 3, 1, 5.49);
INSERT INTO insumo (descricao, tipo_medida_compra_id, tipo_medida_quantidade_representada_id, quantidade_representada, preco) VALUES ('Margarina', 7, 2, 500, 5.89);
INSERT INTO insumo (descricao, tipo_medida_compra_id, tipo_medida_quantidade_representada_id, quantidade_representada, preco) VALUES ('Farinha de Trigo', 1, 1, 1, 5.89);
INSERT INTO insumo (descricao, tipo_medida_compra_id, tipo_medida_quantidade_representada_id, quantidade_representada, preco) VALUES ('Sal', 1, 1, 1, 1.39);

INSERT INTO producao (descricao, percentual_lucro, valor_venda) VALUES ('Bolo de Ovos 30 fatias', 100, 75);

INSERT INTO item_producao (producao_id, insumo_id, tipo_medida_id, quantidade) VALUES (1, 2, 2, 320);
INSERT INTO item_producao (producao_id, insumo_id, tipo_medida_id, quantidade) VALUES (1, 5, 2, 250);
INSERT INTO item_producao (producao_id, insumo_id, tipo_medida_id, quantidade) VALUES (1, 3, 1, 3);
INSERT INTO item_producao (producao_id, insumo_id, tipo_medida_id, quantidade) VALUES (1, 7, 2, 360);
INSERT INTO item_producao (producao_id, insumo_id, tipo_medida_id, quantidade) VALUES (1, 4, 4, 240);
INSERT INTO item_producao (producao_id, insumo_id, tipo_medida_id, quantidade) VALUES (1, 5, 2, 1);

select i.id, pro.descricao, i.quantidade, pro.preco, tmp.fator as fator_produto, tmi.fator as fator_item, ((i.quantidade / tmi.fator) * (pro.preco / (pro.quantidade_representada / tmp.fator))) as custo from item_producao i
inner join tipo_medida tmi on tmi.id = i.tipo_medida_id
inner join insumo pro on pro.id = i.insumo_id
inner join tipo_medida tmp on tmp.id = pro.tipo_medida_quantidade_representada_id;
