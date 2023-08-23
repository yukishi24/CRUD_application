use sampleDB;

CREATE TABLE employee
(
    id           INT(10),
    name     VARCHAR(40)
);

INSERT INTO employee (id, name) VALUES (1, "sample_user");
INSERT INTO employee (id, name) VALUES (2, "sample_admin");