package pl.krzysztofurban.eblogspringdatajdbc.web.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value= HttpStatus.NOT_FOUND, reason="No such Author")
public class AuthorNotFoundException extends RuntimeException {
  public AuthorNotFoundException() {
  }

  public AuthorNotFoundException(String message) {
    super(message);
  }
}
