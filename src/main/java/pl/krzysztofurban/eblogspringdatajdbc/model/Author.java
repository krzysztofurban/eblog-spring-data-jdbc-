package pl.krzysztofurban.eblogspringdatajdbc.model;

import lombok.AllArgsConstructor;
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
}
