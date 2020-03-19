package pl.krzysztofurban.eblogspringdatajdbc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jdbc.repository.RowMapperMap;
import org.springframework.data.jdbc.repository.config.ConfigurableRowMapperMap;

@SpringBootApplication
public class EblogJdbcApplication {

  public static void main(String[] args) {
    SpringApplication.run(EblogJdbcApplication.class, args);
  }
}
