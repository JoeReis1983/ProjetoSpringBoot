/*Criando e usando o server*/
create schema dbserver;
use dbserver;

/* criando usuario user e atribuindo permissões*/
create user 'user'@'localhost' identified by 'pass123';
grant select, insert, delete, update on dbserver.* to user@'localhost';

/*Criando tabelas*/

create table clientes(
    id_cliente bigint unsigned not null auto_increment,
    nome_cliente varchar(20) not null,
    primary key (id_cliente),
    unique key uni_nome_cliente (nome_cliente)
);
create table produtos(
    id_produto bigint unsigned not null auto_increment,
    nome_produto varchar(20) not null,
    primary key (id_produto),
    unique key uni_nome_produto (nome_produto)
);
create table pedidos(
    id_pedido bigint unsigned not null ,
    id_cliente bigint unsigned not null,
    id_produto bigint unsigned not null,
    primary key(id_cliente,id_produto),
    foreign key id_pedido_cliente (id_cliente) references clientes (id_cliente) on delete restrict on update cascade,
    foreign key id_pedido_produto (id_produto) references produtos (id_produto) on delete restrict on update cascade
    
);

insert into clientes( id_cliente,nome_cliente) VALUES(1,'Celso');
insert into clientes( id_cliente,nome_cliente) VALUES(2,'Adriano');
insert into clientes( id_cliente,nome_cliente) VALUES(3,'Toni');

insert into produtos( id_produto, nome_produto) VALUES(1,'Celta');
insert into produtos( id_produto, nome_produto) VALUES(2,'Uno');
insert into produtos( id_produto, nome_produto) VALUES(3,'Palio');
insert into produtos( id_produto, nome_produto) VALUES(4,'Corsa');
insert into produtos( id_produto, nome_produto) VALUES(5,'Civic');
insert into produtos( id_produto, nome_produto) VALUES(6,'Fox');
insert into produtos( id_produto, nome_produto) VALUES(7,'Saveiro');

insert into pedidos( id_pedido, id_cliente, id_produto) VALUES(101,1,2);
insert into pedidos( id_pedido, id_cliente, id_produto) VALUES(102,1,4);
insert into pedidos( id_pedido, id_cliente, id_produto) VALUES(103,1,6);





