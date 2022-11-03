drop database mdm_viewer_integration;
create database mdm_viewer_integration;
use mdm_viewer_integration;

create table cliente(
cpf char(90) not null,
senha varchar(50) not null,
nome varchar(50) not null,
inadimplente bit default FALSE not null,
tipoConsumidor varchar(50) default "Comum" not null,
primary key(cpf)
);

/*
create table medidor(
ID int not null unique auto_increment,
provisionado bit default FALSE not null,
dataMedicao date ,
voltagem float not null,
consumo float not null,
temperatura float not null,
CPFtitular char(11) not null,
primary key(ID),
foreign key(CPFtitular) references cliente(CPF)
);*/

insert into cliente( cpf, senha, nome, inadimplente, tipoConsumidor)
values(11122233344, "senha", "Bruno", 1, "VIP");
insert into cliente( cpf, senha, nome, inadimplente)
values(22233344455, "senha", "Carlos", 1);
insert into cliente( cpf, senha, nome, inadimplente, tipoConsumidor)
values(33344455566, "senha", "Osvaldo", 0, "Comum");

/*
insert into medidor(id, provisionado, datamedicao, voltagem, consumo, temperatura, cpftitular)
values (01, 1, '2020-8-12', 120.94, 1413.12, 28.9, 11122233344);
insert into medidor(id, provisionado, datamedicao, voltagem, consumo, temperatura, cpftitular)
values (02, 1, '2021-8-12', 120.94, 1413.12, 28.9, 11122233344);
insert into medidor(id, provisionado, datamedicao, voltagem, consumo, temperatura, cpftitular)
values (03, 0, '2022-8-12', 120.94, 1413.12, 28.9, 22233344455);
insert into medidor(id, provisionado, datamedicao, voltagem, consumo, temperatura, cpftitular)
values (04, 0, '2020-2-10', 120.94, 1413.12, 28.9, 33344455566);
insert into medidor(id, provisionado, datamedicao, voltagem, consumo, temperatura, cpftitular)
values (05, 1, '2022-3-7', 120.94, 1413.12, 28.9, 22233344455);*/
/*
curl http://localhost:8080/clientes

curl -X POST -H "Content-Type: application/json" -d "{\"cpf\":\"10\",\"senha\":\"testeSenha\",\"nome\":\"testeNome\",\"inadimplente\":1}" http://localhost:8080/clientes
curl -X POST -H "Content-Type: application/json" -d "{\"name\":\"XBox 360\",\"price\":299.99}" http://localhost:8080/products
"{\"rollNumber\":21 , \"firstName\":\"Saurabh\" , \"lastName\":\"Gupta\"}"

updates
curl -X PUT -H "Content-Type: application/json" -d "{\"cpf\":\"11122233344\",\"senha\":\"testeSenhaNova\",\"nome\":\"testeNomeNovo\",\"inadimplente\":1,\"tipoConsumidor\":\"tipoTesteNovo\"}" http://localhost:8080/clientes/11122233344
curl -X PUT -H "Content-Type: application/json" -d "{\"id\":1,\"name\":\"iPad\",\"price\":888}" http://localhost:8080/products/1

delete
curl -X DELETE http://localhost:8080/clientes/11122233344
curl -X DELETE http://localhost:8080/products/1

*/