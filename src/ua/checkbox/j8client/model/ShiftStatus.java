/*
 * test checkbox API
 * Core API of Software Registrar of Settlement Operations
 *
 * OpenAPI spec version: 0.1.26
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package ua.checkbox.j8client.model;

import java.util.Objects;
import java.util.Arrays;
import io.swagger.v3.oas.annotations.media.Schema;
import com.google.gson.annotations.SerializedName;
import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * An enumeration.
 */
@JsonAdapter(ShiftStatus.Adapter.class)
public enum ShiftStatus {
  CREATED("CREATED"),
  OPENING("OPENING"),
  OPENED("OPENED"),
  CLOSING("CLOSING"),
  CLOSED("CLOSED");

  private String value;

  ShiftStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ShiftStatus fromValue(String text) {
    for (ShiftStatus b : ShiftStatus.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<ShiftStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final ShiftStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ShiftStatus read(final JsonReader jsonReader) throws IOException {
      Object value = jsonReader.nextString();
      return ShiftStatus.fromValue(String.valueOf(value));
    }
  }
}
