use authenticationservice;

DROP table IF EXISTS T_USER;

create table T_USER
(
    user_id            BIGINT auto_increment NOT NULL PRIMARY KEY,
    email              varchar(40)           not null,
    name               varchar(40)           not null,
    password            varchar(40)           not null

) ENGINE = InnoDB;

INSERT INTO T_USER ( email, name, password) values ('oncle.kani@gmail.com','Arnaud','Kaninda');

COMMIT;
