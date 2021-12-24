
CREATE TABLE livro(
    id INTEGER NOT NULL PRIMARY KEY AUTO_INCREMENT,
    titulo VARCHAR(255) NOT NULL,
    ano VARCHAR(4) NOT NULL
);

CREATE TABLE capitulo(
    id INTEGER NOT NULL PRIMARY KEY AUTO_INCREMENT,
    titulo VARCHAR(255) NOT NULL,
    autor VARCHAR(255) NOT NULL,
    numero INTEGER NOT NULL,
    livro_id INTEGER NOT NULL,
    FOREIGN KEY(livro_id) REFERENCES livro(id)
);

CREATE TABLE verso(
    id INTEGER NOT NULL PRIMARY KEY AUTO_INCREMENT,
    numero INTEGER NOT NULL,
    texto VARCHAR(255) NOT NULL,
    capitulo_id INTEGER NOT NULL,
    FOREIGN KEY(capitulo_id) REFERENCES capitulo(id)
);

INSERT INTO livro(titulo, ano) VALUES('NVI', '1954');

INSERT INTO capitulo(titulo, autor, numero, livro_id) VALUES('Genesis', 'Moisés', 1, 1);
INSERT INTO capitulo(titulo, autor, numero, livro_id) VALUES('Exodo', 'Moisés', 2, 1);
INSERT INTO capitulo(titulo, autor, numero, livro_id) VALUES('Levítico', 'Moisés', 3, 1);
INSERT INTO capitulo(titulo, autor, numero, livro_id) VALUES('Números', 'Moisés', 4, 1);
INSERT INTO capitulo(titulo, autor, numero, livro_id) VALUES('Deuteronomio', 'Moisés', 5, 1);
INSERT INTO capitulo(titulo, autor, numero, livro_id) VALUES('Josué', 'Josué', 1, 1);
INSERT INTO capitulo(titulo, autor, numero, livro_id) VALUES('Jueces', 'Josué', 2, 1);

INSERT INTO verso(numero, texto, capitulo_id) VALUES(1, 'No princípio Deus Criou o céu e a terra.', 1);
INSERT INTO verso(numero, texto, capitulo_id) VALUES(2, 'A terra estava sem forma e vazia; as trevas cobriam o abismo e o espírito de Deus se movia sobre a superfície das águas.', 1);

INSERT INTO verso(numero, texto, capitulo_id) VALUES(1, 'São estes os nomes dos israelitas que entraram com Jacó no Egito, cada um com sua família:', 2);
INSERT INTO verso(numero, texto, capitulo_id) VALUES(2, 'Rúben, Simeão, Levi e Judá;', 2);

INSERT INTO verso(numero, texto, capitulo_id) VALUES(1, 'Javé chamou Moisés e, da tenda da reunião, lhe disse:', 3);