package pl.krzysztofurban.eblogspringdatajdbc.web;

import com.google.common.collect.Lists;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.krzysztofurban.eblogspringdatajdbc.model.Author;
import pl.krzysztofurban.eblogspringdatajdbc.model.Post;
import pl.krzysztofurban.eblogspringdatajdbc.repository.AuthorRepository;
import pl.krzysztofurban.eblogspringdatajdbc.repository.PostRepository;

import java.util.List;

@RestController
@Slf4j
@RequiredArgsConstructor
public class TestController {
  private final AuthorRepository authorRepository;
  private final PostRepository postRepository;

  @GetMapping("/posts")
  public List<Post> allPosts() {
    return Lists.newArrayList(postRepository.findAll());
  }

  @GetMapping("/authors")
  public List<Author> authorsWithTopPosts() {
    log.info("authorsWithTopPosts");
    return authorRepository.findAuthorsWithPosts();
  }
}
