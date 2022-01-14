CREATE TABLE IF NOT EXISTS evento(id serial PRIMARY KEY, nome VARCHAR(128), data VARCHAR(128));

CREATE TABLE IF NOT EXISTS participante(dorsal serial PRIMARY KEY, nome VARCHAR(128), genero VARCHAR(128), escalao VARCHAR(128), evento VARCHAR(128));
