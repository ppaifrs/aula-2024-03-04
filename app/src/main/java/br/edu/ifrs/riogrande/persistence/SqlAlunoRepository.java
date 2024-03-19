package br.edu.ifrs.riogrande.persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Optional;

import javax.sql.DataSource;

import br.edu.ifrs.riogrande.entity.Aluno;


// Dependency Injection (Injeção de Dependências)
public class SqlAlunoRepository implements IAlunoRepository {

  // dependência
  private final DataSource dataSource;

  public SqlAlunoRepository(DataSource dataSource) {
    this.dataSource = dataSource;
  }

  @Override
  public void save(Aluno a) { // DataSource (abstrair)
    try (Connection con = dataSource.getConnection()) {
      // INSERT (implementação)
    } catch (SQLException e) {
      throw new RepositoryException(e);
    }
    // conectar ao banco de dados
    // submeter o comando
    // testar resposta
    // desconectar do banco de dados
  }

  @Override
  public boolean delete(Aluno a) {
    try {
      Connection con = DriverManager.getConnection("jdbc:postgresql://127.0.0.1:5432/mochinho", "usuario", "senha");

      con.close();
    } catch (SQLException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    throw new UnsupportedOperationException("Unimplemented method 'delete'");
  }

  @Override
  public boolean deleteByMatricula(String matricula) {
    throw new UnsupportedOperationException("Unimplemented method 'deleteByMatricula'");
  }

  @Override
  public void update(Aluno a) {
    throw new UnsupportedOperationException("Unimplemented method 'update'");
  }

  @Override
  public Optional<Aluno> findByMatricula(String matricula) {
    throw new UnsupportedOperationException("Unimplemented method 'findByMatricula'");
  }

  @Override
  public Aluno loadByMatricula(String matricula) throws AlunoNotFoundException {
    throw new UnsupportedOperationException("Unimplemented method 'loadByMatricula'");
  }
  
}
