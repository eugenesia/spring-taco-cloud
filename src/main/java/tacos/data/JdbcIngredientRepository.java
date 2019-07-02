package tacos.data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import tacos.Ingredient;

@Repository
public class JdbcIngredientRepository implements IngredientRepository {
  
  private JdbcTemplate jdbc;
  
  @Autowired
  public JdbcIngredientRepository(JdbcTemplate jdbc) {
    this.jdbc = jdbc;
  }

  @Override
  public Iterable<Ingredient> findAll() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Ingredient findById(String id) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Ingredient save(Ingredient ingredient) {
    // TODO Auto-generated method stub
    return null;
  }
}
