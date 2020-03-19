package pl.krzysztofurban.eblogspringdatajdbc.repository;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import pl.krzysztofurban.eblogspringdatajdbc.model.Post;

import java.util.List;

public interface PostRepository extends CrudRepository<Post, Long> {
  @Query("Select * from post")
  List<Post> findAll();
}
