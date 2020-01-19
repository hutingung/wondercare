package com.wondercare.center.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets CenterType
 */
public enum CenterType {
  
  INSTITUITION("INSTITUITION"),
  
  HOME("HOME"),
  
  UNKNOWN("UNKNOWN"),
  
  WORKPLACE("WORKPLACE");

  private String value;

  CenterType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static CenterType fromValue(String text) {
    for (CenterType b : CenterType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}

