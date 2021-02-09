create database db;
use db;
create table vacunas(
comunidad varchar(50) primary key,
create database db;
use db;
create table vacunas(
comunidad varchar(50) primary key,
dosis_pfizer int NOT NULL,
dosis_moderna int NOT NULL,
dosis_totales int NOT NUll,
dosis_administradas int NOT NUll,
porcentaje float NOT NUll,
personas int NOT NUll,
fecha date NOT NUll);
insert into vacunas(comunidad,dosis_pfizer,dosis_moderna,dosis_totales,dosis_administradas,porcentaje,personas,fecha) value
('Andalucía',244620,6800,251420,194101,77.2,15193,'2021-01-20'),
('Aragón',41265,1200,42465,38170,89.9,1731,'2021-01-21'),
('Asturias',44195,1200,45395,40011,88.1,5664,'2021-01-21'),
('Baleares',22590,600,23190,18105,78.1,1514,'2021-01-20'),
('Canarias',46185,1300,47485,45482,95.8,1744,'2021-01-20'),
('Cantabria',20625,500,21125,19980,94.6,241,'2021-01-20'),
('Castilla y León',93315,2500,95815,82162,85.8,5296,'2021-01-20'),
('Castilla La Mancha',61875,1700,63575,53880,84.8,1202,'2021-01-20'),
('Cataluña',211220,5800,217020,168054,77.4,2598,'2021-01-20'),
('C. Valenciana',109000,2900,111900,101437,90.6,2956,'2021-01-20'),
('Extremadura',39275,1000,40275,32039,79.6,638,'2021-01-20'),
('Galicia',66805,1800,68605,62011,90.4,3861,'2021-01-20'),
('La Rioja',11765,200,11965,8684,72.6,267,'2021-01-21'),
('Madrid',171915,4700,176615,142765,80.8,1738,'2021-01-20'),
('Murcia',45185,1200,46385,40757,87.9,1784,'2021-01-21'),
('Navarra',20625,500,21125,15754,74.6,767,'2021-01-20'),
('País Vasco',55980,1400,57380,36864,64.2,1333,'2021-01-20'),
('Ceuta',1980,200,2180,1545,70.9,326,'2021-01-20'),
('Melilla',1980,200,2180,1500,68.8,203,'2021-01-20');
