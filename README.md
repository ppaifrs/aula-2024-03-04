ESPECIFICAÇÃO
=============


```plain
Aluno envia um requerimento, com anexos.
Neste instante ele (o requerimento) consta como aberto.
Um usuário com perfil de registro acadêmico checa a documentação anexa e outros pre-requisitos, podendo homologar ou rejeitar, neste último caso com o motivo.
Se homologado, um usuário com perfil de coordenador será responsável por analisar e deferir ou indeferir, neste último caso com o motivo.
Cada passo, da abertura até as demais movimentações, deve ser registrado como histórico, constando data e hora, ação, setor (requerente, registro ou coordenação) e usuário responsável.
O aluno pode cancelar a requerimento, exceto se já rejeitado, deferido ou indeferido.
```

ORM O/R M

OBJECT/RELATIONAL MAPPING
Mapeamento Objeto/Relacional
"Diferença de Impedância" entre modelos
(impedance mismatch)

classe (class) => tabela (table)
  atributo tipo (String nome) => coluna (nome varchar(100))
  new Classe (instância, objeto) => insert into tabela
  A {
    B b;
  }
  table A {
    foreign key b B
  }
