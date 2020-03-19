package pl.krzysztofurban.eblogspringdatajdbc.repository;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import pl.krzysztofurban.eblogspringdatajdbc.model.Author;

import java.util.List;

public interface AuthorRepository extends CrudRepository<Author, Long> {
  @Query("Select a.* from author a")
  List<Author> findAuthorsWithPosts();

  @Query("Select * from author a where a.age = :age")
  List<Author> findByAge(@Param("age") Integer age);
}
