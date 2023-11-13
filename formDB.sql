create database formDB;

use formDB;

create table calendar(
id   int not null auto_increment primary key,
persona varchar(50) default "anonymus",
actividad varchar(200) not null,
fecha varchar(30)
);

-- aqui hare que no puedas eliminar toda la tabla por accidente cuando uses el delete, que te diga que lo hagas uno por uno,
-- almenos que uses drop table y te lleves todo
set autocommit=off;
commit;

select * from calendar;

rollback;

