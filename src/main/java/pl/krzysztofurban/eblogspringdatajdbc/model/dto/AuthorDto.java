package pl.krzysztofurban.eblogspringdatajdbc.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AuthorDto {
  private String name;
  private int age;
}
