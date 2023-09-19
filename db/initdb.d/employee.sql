use sampleDB;

CREATE TABLE employee
(
    id           INT(10),
    name     VARCHAR(40),
    admin    VARCHAR(40)
);

INSERT INTO employee (id, name,admin) VALUES (1, "sample_user","admin");
INSERT INTO employee (id, name,admin) VALUES (2, "sample_admin"," ");