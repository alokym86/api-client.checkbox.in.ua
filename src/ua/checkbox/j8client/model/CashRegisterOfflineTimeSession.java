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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.math.BigDecimal;
import java.time.OffsetDateTime;
// import org.threeten.bp.OffsetDateTime;
/**
 * CashRegisterOfflineTimeSession
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-11-02T14:34:29.121+02:00[Europe/Kiev]")
public class CashRegisterOfflineTimeSession {
  @SerializedName("start")
  private OffsetDateTime start = null;

  @SerializedName("end")
  private OffsetDateTime end = null;

  @SerializedName("duration")
  private BigDecimal duration = null;

  public CashRegisterOfflineTimeSession start(OffsetDateTime start) {
    this.start = start;
    return this;
  }

   /**
   * Get start
   * @return start
  **/
  @Schema(description = "")
  public OffsetDateTime getStart() {
    return start;
  }

  public void setStart(OffsetDateTime start) {
    this.start = start;
  }

  public CashRegisterOfflineTimeSession end(OffsetDateTime end) {
    this.end = end;
    return this;
  }

   /**
   * Get end
   * @return end
  **/
  @Schema(description = "")
  public OffsetDateTime getEnd() {
    return end;
  }

  public void setEnd(OffsetDateTime end) {
    this.end = end;
  }

  public CashRegisterOfflineTimeSession duration(BigDecimal duration) {
    this.duration = duration;
    return this;
  }

   /**
   * Get duration
   * @return duration
  **/
  @Schema(description = "")
  public BigDecimal getDuration() {
    return duration;
  }

  public void setDuration(BigDecimal duration) {
    this.duration = duration;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CashRegisterOfflineTimeSession cashRegisterOfflineTimeSession = (CashRegisterOfflineTimeSession) o;
    return Objects.equals(this.start, cashRegisterOfflineTimeSession.start) &&
        Objects.equals(this.end, cashRegisterOfflineTimeSession.end) &&
        Objects.equals(this.duration, cashRegisterOfflineTimeSession.duration);
  }

  @Override
  public int hashCode() {
    return Objects.hash(start, end, duration);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CashRegisterOfflineTimeSession {\n");
    
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
    sb.append("    end: ").append(toIndentedString(end)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}