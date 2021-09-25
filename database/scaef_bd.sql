create table medicamento(
	codigo int not null primary key,
    nome varchar(95) not null,
    cid varchar(5),
    mg int null,
    ml int null
);

create table paciente (
	Nome varchar(95) primary key,
    CNS int Not Null,
    CPF int Not Null,
    DataNasc date Not Null,
    Email varchar(100) Not Null,
    Municipio varchar(26) Not Null,
    Endereco varchar(100) Not Null,
    Complemento varchar(50) Null,
    CEP int Not Null,
    Num int Not Null,
    Tel int Null,
    Fone int Null,
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