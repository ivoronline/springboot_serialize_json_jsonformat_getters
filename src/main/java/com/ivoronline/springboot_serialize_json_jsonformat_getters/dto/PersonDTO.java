package com.ivoronline.springboot_serialize_json_jsonformat_getters.dto;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.LocalDate;

public class PersonDTO {

  //PROPERTIES
  public LocalDate birthday;
  public String    name;

  //GETTERS (Used for Serialization)
  @JsonFormat(pattern="dd.MM.yyyy")
  public LocalDate getBirthday() { return birthday;         }
  public String    getName    () { return "Getter " + name; }

}
