-- Single Table Inheritance, lidar com os nulos
CREATE TABLE usuarios (
  email         VARCHAR(100),
  senha         TEXT,
  matricula     VARCHAR(10),
  data_ingresso DATE,
  siape         INTEGER,
  perfil        VARCHAR(20),
  tipo          VARCHAR(50) -- ALUNO, SERVIDOR
);

CREATE INDEX IF NOT EXISTS ON usuarios (tipo);

-- Class Table Inheritance
CREATE TABLE usuarios (
  email         VARCHAR(100) PRIMARY KEY,
  senha         TEXT
);

CREATE TABLE alunos (
  email         VARCHAR(100) REFERENCES usuarios (email),
  matricula     VARCHAR(10),
  data_ingresso DATE
);

CREATE TABLE servidores (
  email         VARCHAR(100) REFERENCES usuarios (email),
  siape         INTEGER,
  perfil        VARCHAR(20)
);

SELECT s.*, u.senha
FROM servidores s JOIN usuarios u ON u.email = s.email
WHERE s.siape = 112344;

-- Table per Concrete Class (Concrete Table Inheritance)
-- Tabela por Classe Concreta
CREATE TABLE alunos ( -- classe Aluno é concreta
  email         VARCHAR(100),
  senha         TEXT,
  matricula     VARCHAR(10),
  data_ingresso DATE
);

CREATE TABLE servidores ( -- classe Servidor é concreta
  email         VARCHAR(100),
  senha         TEXT,
  siape         INTEGER,
  perfil        VARCHAR(20)
);