drop table if exists `peliculas`;
create table `peliculas`(
`id` int not null auto_increment primary key,
`nombre` varchar(100) not null,
`clasificacion_edad` int not null 
);

drop table if exists `salas`;
create table `salas`(
`id` int not null auto_increment primary key,
`nombre` varchar(100) not null ,
`pelicula_id` int default null,
CONSTRAINT `pelicula_fk` FOREIGN KEY (`pelicula_id`) REFERENCES `peliculas` (`id`)
);

insert into peliculas(nombre,clasificacion_edad) values ('sala apollo',7),('sala oblivion',3),('sala maho',12);
insert into salas(nombre,pelicula_id) values ('shrek',1),('cars',2),('souls',3);