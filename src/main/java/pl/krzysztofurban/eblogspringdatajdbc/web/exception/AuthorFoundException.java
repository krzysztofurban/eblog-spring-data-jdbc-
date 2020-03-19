package pl.krzysztofurban.eblogspringdatajdbc.web.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value= HttpStatus.NOT_FOUND, reason="No such Author")
public class AuthorFoundException extends RuntimeException {
  public AuthorFoundException() {
  }

  public AuthorFoundException(String message) {
    super(message);
  }
}
