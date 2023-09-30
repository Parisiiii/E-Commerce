--CREATE TABLE cliente (
--    id   INT NOT NULL PRIMARY KEY ,
--    nome VARCHAR(80),
--    email VARCHAR(155),
--    senha VARCHAR(500),
--    saldo DECIMAL
--);
--
--CREATE TABLE produto (
--    id   INT NOT NULL PRIMARY KEY ,
--    nome VARCHAR(80),
--    preco Decimal,
--    quantidade int,
--    categoria_fk int,
--    FOREIGN KEY (categoria_fk) REFERENCES categoria(id)
--);
--
--CREATE TABLE pedido (
--    id   INT NOT NULL PRIMARY KEY ,
--    numero_pedido int,
--    cliente_fk int,
--    FOREIGN KEY(cliente_fk) REFERENCES cliente(id)
--);
--
--CREATE TABLE item_pedido (
--    id   INT NOT NULL PRIMARY KEY ,
--    produto_fk int,
--    pedido_fk int,
--    FOREIGN KEY (produto_fk) REFERENCES produto(id),
--    FOREIGN KEY (pedido_fk) REFERENCES pedido(id)
--);
--
insert into pedido values(12,1,'5ac4426d-8286-417f-b56f-4ce23f879a8b');
insert into pedido_produto values(1,5);
insert into endereco values(901,1,'Maringá','PR','Rua joao carlos polo');
insert into pessoa values(2,20000,'50be9f0c-56cb-49ae-acdd-df4d8a35a961','joao@hotmail.com', 'João Carlos', 'soulindo');
insert into pessoa_endereco values(1,2);

INSERT INTO produto(id,numero,preco,nome,uuid) VALUES (1,12,200,'teclado husky blizzard', 'b0c413d0-fb71-4432-abb9-a47278859497');
INSERT INTO produto(id,numero,preco,nome,uuid) VALUES (2,764,200,'mouse logitech g403', '9cba249d-4f17-4417-a54b-602c1f9fc894');
INSERT INTO produto(id,numero,preco,nome,uuid) VALUES (3,23,3000,'acer aspire 5', 'e79f1432-719f-4b61-bb7b-8beae6b401ab');
INSERT INTO produto(id,numero,preco,nome,uuid) VALUES (4,32,544,'monitor lg 4334', 'ae105e7d-e8af-42ab-97c0-b962ee0703ba');
