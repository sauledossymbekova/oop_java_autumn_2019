CREATE DATABASE lab2;
CREATE TABLE camera(
    id serial,
    name varchar(50),
    start_datetime timestamp without time zone,
    end_datetime timestamp without time zone,
    is_finished bool,
    description text
);
ALTER TABLE  camera
    ADD COLUMN created_at timestamp;
ALTER TABLE camera
    ALTER COLUMN name TYPE varchar(100);
ALTER TABLE camera
    ALTER COLUMN is_finished SET DEFAULT false;
ALTER TABLE camera
    ADD PRIMARY KEY (id);
CREATE TABLE lenses(
    id serial,
    name varchar(50),
    description text,
    priority smallint,
    lenses_id serial references camera(id)
);
DROP TABLE camera, camera restrict ;
DROP TABLE camera,camera cascade ;
DROP DATABASE lab2;
