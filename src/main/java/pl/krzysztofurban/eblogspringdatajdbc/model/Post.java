package pl.krzysztofurban.eblogspringdatajdbc.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
public class Post implements Serializable {
  @Id
  private Long id;
  private String title;
  private String content;
  @Column("modify_date")
  private LocalDateTime modifyDate;
  @Column("creation_date")
  private LocalDateTime creationDate;
}
