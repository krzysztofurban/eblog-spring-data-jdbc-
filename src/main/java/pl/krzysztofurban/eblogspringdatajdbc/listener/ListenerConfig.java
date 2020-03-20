package pl.krzysztofurban.eblogspringdatajdbc.listener;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.relational.core.mapping.event.AfterLoadEvent;
import pl.krzysztofurban.eblogspringdatajdbc.model.Author;

@Configuration
@Slf4j
public class ListenerConfig {
  @Bean
  public ApplicationListener<AfterLoadEvent> afterLoadEvent() {
    return event -> {
      Object entity = event.getEntity();
      if (entity instanceof Author) {
        Author author = (Author) entity;
        log.info("AfterLoadEvent: {}", author.toString());
      }
    };
  }
}
