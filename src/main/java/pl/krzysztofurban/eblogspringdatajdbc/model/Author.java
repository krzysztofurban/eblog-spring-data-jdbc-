package pl.krzysztofurban.eblogspringdatajdbc.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Embedded;

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

  @Embedded.Nullable
  private Address address;

  @Builder
  public Author(Long id, String name, int age) {
    this.id = id;
    this.name = name;
    this.age = age;
  }
}
