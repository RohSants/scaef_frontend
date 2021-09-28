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
    cns varchar(15) Not Null,
    cpf varchar(11) Not Null,
    dataNasc date Not Null,
    email varchar(95) Not Null,
    mun varchar(26) Not Null,
    endr varchar(80) Not Null,
    comp varchar(50) Null,
    cep int Not Null,
    num int Not Null,
    tel int Null,
    fone int Null,
    Unique(nome),
    Unique(cns),
    Unique(cpf),
    Unique(email)
);

create table usuarios(
	nome varchar(95) Not NULL,
    cpf varchar(9) Not NULL,
    rg varchar(11) Not NULL,
    email varchar(100) NULL,
    celular int NULL,
    fone int NULL,
    funcao varchar(14) Not NULL,
    crf int NULL,
    Unique(cpf),
    Unique(rg),
    Unique(crf),
    Unique(email)
);