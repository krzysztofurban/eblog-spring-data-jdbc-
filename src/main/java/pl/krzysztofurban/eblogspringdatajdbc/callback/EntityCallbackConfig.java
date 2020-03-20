package pl.krzysztofurban.eblogspringdatajdbc.callback;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.relational.core.mapping.event.AfterLoadCallback;
import pl.krzysztofurban.eblogspringdatajdbc.model.Author;

@Configuration
@Slf4j
public class EntityCallbackConfig {
  @Bean
  AfterLoadCallback<Author> afterLoadCallbackExample() {
    return it -> {
      log.info("AfterLoadCallback: {}", it.toString());
      return it;
    };
  }
}
