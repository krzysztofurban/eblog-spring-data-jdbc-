package pl.krzysztofurban.eblogspringdatajdbc.model;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.Mappings;
import pl.krzysztofurban.eblogspringdatajdbc.model.dto.AuthorDto;

@Mapper(componentModel = "spring")
public interface AuthorMapper {
  Author toEntity(AuthorDto authorDto);

  AuthorDto toDto(Author author);

  @Mapping(target = "posts", ignore = true)
  Author updateAuthorFromDto(AuthorDto authorDto, @MappingTarget Author author);
}
