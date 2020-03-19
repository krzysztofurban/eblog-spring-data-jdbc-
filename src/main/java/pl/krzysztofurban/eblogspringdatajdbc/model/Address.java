package pl.krzysztofurban.eblogspringdatajdbc.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class Address {
  private String firstAddressLine;
  private String secondAddressLine;
  private String city;
  private String postalCode;
  private String country;
}
