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
    unique key uni_nome_produto (nome_produto),
);
create table pedidos(
    id_pedido bigint unsigned not null auto_increment,
    foreign key nome_produto_pedido (nome_produto) references produtos (id_produto) on delete restrict on update cascade,
    foreign key nome_produto_cliente (nome_cliente) references clientes (id_cliente) on delete restrict on update cascade
    
);