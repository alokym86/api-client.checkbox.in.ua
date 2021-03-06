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
import java.time.OffsetDateTime;
// import org.threeten.bp.OffsetDateTime;
/**
 * WebhookInfoSchema
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-11-02T14:34:29.121+02:00[Europe/Kiev]")
public class WebhookInfoSchema {
  @SerializedName("url")
  private String url = null;

  @SerializedName("last_error_date")
  private OffsetDateTime lastErrorDate = null;

  @SerializedName("last_error_message")
  private String lastErrorMessage = null;

  @SerializedName("created_at")
  private OffsetDateTime createdAt = null;

  @SerializedName("updated_at")
  private OffsetDateTime updatedAt = null;

  public WebhookInfoSchema url(String url) {
    this.url = url;
    return this;
  }

   /**
   * Get url
   * @return url
  **/
  @Schema(required = true, description = "")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public WebhookInfoSchema lastErrorDate(OffsetDateTime lastErrorDate) {
    this.lastErrorDate = lastErrorDate;
    return this;
  }

   /**
   * Get lastErrorDate
   * @return lastErrorDate
  **/
  @Schema(description = "")
  public OffsetDateTime getLastErrorDate() {
    return lastErrorDate;
  }

  public void setLastErrorDate(OffsetDateTime lastErrorDate) {
    this.lastErrorDate = lastErrorDate;
  }

  public WebhookInfoSchema lastErrorMessage(String lastErrorMessage) {
    this.lastErrorMessage = lastErrorMessage;
    return this;
  }

   /**
   * Get lastErrorMessage
   * @return lastErrorMessage
  **/
  @Schema(description = "")
  public String getLastErrorMessage() {
    return lastErrorMessage;
  }

  public void setLastErrorMessage(String lastErrorMessage) {
    this.lastErrorMessage = lastErrorMessage;
  }

  public WebhookInfoSchema createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @Schema(required = true, description = "")
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public WebhookInfoSchema updatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Get updatedAt
   * @return updatedAt
  **/
  @Schema(description = "")
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebhookInfoSchema webhookInfoSchema = (WebhookInfoSchema) o;
    return Objects.equals(this.url, webhookInfoSchema.url) &&
        Objects.equals(this.lastErrorDate, webhookInfoSchema.lastErrorDate) &&
        Objects.equals(this.lastErrorMessage, webhookInfoSchema.lastErrorMessage) &&
        Objects.equals(this.createdAt, webhookInfoSchema.createdAt) &&
        Objects.equals(this.updatedAt, webhookInfoSchema.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(url, lastErrorDate, lastErrorMessage, createdAt, updatedAt);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebhookInfoSchema {\n");
    
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    lastErrorDate: ").append(toIndentedString(lastErrorDate)).append("\n");
    sb.append("    lastErrorMessage: ").append(toIndentedString(lastErrorMessage)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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
