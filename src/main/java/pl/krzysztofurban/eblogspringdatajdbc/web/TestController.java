package pl.krzysztofurban.eblogspringdatajdbc.web;

import com.google.common.collect.Lists;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pl.krzysztofurban.eblogspringdatajdbc.model.Author;
import pl.krzysztofurban.eblogspringdatajdbc.model.Post;
import pl.krzysztofurban.eblogspringdatajdbc.repository.AuthorRepository;
import pl.krzysztofurban.eblogspringdatajdbc.repository.PostRepository;

import java.util.List;

@RestController
@Slf4j
public class TestController {
  @Autowired
  AuthorRepository authorRepository;
  @Autowired
  PostRepository postRepository;

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
