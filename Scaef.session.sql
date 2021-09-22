create table medicamento(
	codigo int not null,
    nome varchar(95) not null,
    cid varchar(5) primary key,
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