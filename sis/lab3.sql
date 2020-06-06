CREATE DATABASE lab3;
CREATE TABLE computers(
    comp_id serial PRIMARY KEY,
    name_comp varchar(10),
    model text,
    speed integer,
    ram integer,
    price integer
);
INSERT INTO computers(ram) VALUES (512), (128), (72), (64);
INSERT INTO computers(price) VALUES (21000); --blabla

INSERT INTO computers(comp_id, name_comp, model, speed, ram, price)
VALUES (DEFAULT, 'SAULE', 'MacBook Air 13', 100, 128, 400000);

INSERT INTO computers(ram) VALUES (NULL);

INSERT INTO computers(comp_id, name_comp, model, speed, ram, price)
VALUES (DEFAULT, 'person1', 'MacBook Air 18', 100, 128, 500000),
       (DEFAULT, 'person2', 'MacBook Pro 18', 200, 128, 600000),
       (DEFAULT, 'person3', 'MacBook Pro 16', 150, 128, 480000);

ALTER TABLE computers
    ALTER COLUMN price SET DEFAULT 75000;

ALTER TABLE computers
    ALTER COLUMN model TYPE integer using model::integer;

INSERT INTO computers(comp_id, price) VALUES (DEFAULT, DEFAULT);

CREATE TABLE personal_c  (LIKE computers including ALL);

INSERT INTO personal_c SELECT * FROM computers;
UPDATE computers SET model = '1875'
WHERE model IS NULL;
UPDATE computers SET price = price * 1.1;
SELECT name_comp, price AS "NewPrice" FROM computers;
DELETE FROM computers WHERE price< 50000;
DELETE FROM personal_c using computers WHERE comp_id = (SELECT computers.comp_id FROM computers) RETURNING *;
DELETE  FROM  computers RETURNING *;

