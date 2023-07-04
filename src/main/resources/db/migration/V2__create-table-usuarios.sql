create table usuarios(
    id TEXT PRIMARY KEY UNIQUE NOT NULL,
    login varchar(100) not null,
    senha varchar(255) not null
);