create table contasAReceber(
    id int not null primary key auto_increment,
    valorconta decimal (13, 2),
    dataconta date,
    idcliente int not null
);


