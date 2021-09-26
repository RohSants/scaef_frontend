create table medicamento(
	codigo int not null primary key,
    nome varchar(95) not null,
    cid varchar(5),
    mg int null,
    ml int null
);

create table paciente (
	id int primary key,
    nome varchar(95) not null,
    CNS int Not Null,
    CPF int Not Null,
    dataNasc date Not Null,
    email varchar(100) Not Null,
    municipio varchar(26) Not Null,
    endereco varchar(100) Not Null,
    complemento varchar(50) Null,
    CEP int Not Null,
    num int Not Null,
    tel int Null,
    fone int Null,
    Unique(CPF)
);

create table usuarios(
	Nome varchar(95) Not NULL,
    CPF int Not NULL,
    RG int Not NULL,
    CNS int primary key,
    Email varchar(100) NULL,
    Celular int NULL,
    Fone int NULL,
    Funcao varchar(14) Not NULL,
    CRF int NULL,
    Unique(CPF),
    Unique(RG),
    Unique(CRF)
);