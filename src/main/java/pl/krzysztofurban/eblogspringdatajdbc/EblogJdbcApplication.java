package pl.krzysztofurban.eblogspringdatajdbc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jdbc.repository.RowMapperMap;
import org.springframework.data.jdbc.repository.config.ConfigurableRowMapperMap;
import pl.krzysztofurban.eblogspringdatajdbc.model.Author;
import pl.krzysztofurban.eblogspringdatajdbc.model.rowmapper.AuthorRowMapper;

@SpringBootApplication
public class EblogJdbcApplication {

  public static void main(String[] args) {
    SpringApplication.run(EblogJdbcApplication.class, args);
  }

  @Bean
  RowMapperMap rowMappers() {
    return new ConfigurableRowMapperMap()
        .register(Author.class, new AuthorRowMapper());
  }
}
