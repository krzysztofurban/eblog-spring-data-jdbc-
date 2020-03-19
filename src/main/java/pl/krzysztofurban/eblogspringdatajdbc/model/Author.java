package pl.krzysztofurban.eblogspringdatajdbc.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Lazy;
import org.springframework.data.annotation.Id;

import java.io.Serializable;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Author implements Serializable {
  @Id
  private Long id;
  private String name;
  private int age;
  private Set<Post> posts;
}