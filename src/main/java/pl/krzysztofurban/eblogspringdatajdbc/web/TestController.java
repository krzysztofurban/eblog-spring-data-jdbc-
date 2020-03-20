package pl.krzysztofurban.eblogspringdatajdbc.web;

import com.google.common.collect.Lists;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import pl.krzysztofurban.eblogspringdatajdbc.model.Author;
import pl.krzysztofurban.eblogspringdatajdbc.model.AuthorMapper;
import pl.krzysztofurban.eblogspringdatajdbc.model.Post;
import pl.krzysztofurban.eblogspringdatajdbc.model.dto.AuthorDto;
import pl.krzysztofurban.eblogspringdatajdbc.repository.AuthorRepository;
import pl.krzysztofurban.eblogspringdatajdbc.repository.PostRepository;
import pl.krzysztofurban.eblogspringdatajdbc.web.exception.AuthorNotFoundException;

import java.util.List;

@RestController
@Slf4j
@RequiredArgsConstructor
public class TestController {
  private final AuthorRepository authorRepository;
  private final PostRepository postRepository;
  private final AuthorMapper authorMapper;

  @GetMapping("/posts")
  public List<Post> allPosts() {
    return Lists.newArrayList(postRepository.findAll());
  }

  @GetMapping("/authors")
  public List<Author> authorsWithTopPosts() {
    return authorRepository.findAuthorsWithPosts();
  }

  @GetMapping("/authors/generic/findAll")
  public List<Author> genericFindAll() {
    return Lists.newArrayList(authorRepository.findAll());
  }

  @GetMapping("/authors/generic/findById/{id}")
  public Author genericFindByID(@PathVariable Long id) {
    return authorRepository.findById(id).orElseThrow(AuthorNotFoundException::new);
  }

  @PatchMapping("/authors/{id}")
  public AuthorDto genericSaveMethod(@PathVariable Long id, @RequestBody AuthorDto authorDto) {
    log.info("Updating author entity with id {}", id);
    Author author = authorRepository.findById(id).orElseThrow(AuthorNotFoundException::new);
    authorRepository.save(authorMapper.updateAuthorFromDto(authorDto, author));
    return authorMapper.toDto(authorRepository.findById(id).orElseThrow(AuthorNotFoundException::new));
  }

  @GetMapping("/author/minInfo/{id}")
  public Author findAuthorAndReturnMinInfo(@PathVariable Integer id) {
    return authorRepository.findMinInfoById(id);
  }
}
