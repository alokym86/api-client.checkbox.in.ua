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
import ua.checkbox.j8client.model.TransactionStatus;
import ua.checkbox.j8client.model.TransactionType;

import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.UUID;
// import org.threeten.bp.OffsetDateTime;
/**
 * ShortTransaction
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-11-02T14:34:29.121+02:00[Europe/Kiev]")
public class ShortTransaction {
  @SerializedName("id")
  private UUID id = null;

  @SerializedName("type")
  private TransactionType type = null;

  @SerializedName("serial")
  private Integer serial = null;

  @SerializedName("status")
  private TransactionStatus status = null;

  @SerializedName("request_signed_at")
  private OffsetDateTime requestSignedAt = null;

  @SerializedName("request_received_at")
  private OffsetDateTime requestReceivedAt = null;

  @SerializedName("response_status")
  private String responseStatus = null;

  @SerializedName("response_error_message")
  private String responseErrorMessage = null;

  @SerializedName("response_id")
  private String responseId = null;

  @SerializedName("offline_id")
  private String offlineId = null;

  @SerializedName("created_at")
  private OffsetDateTime createdAt = null;

  @SerializedName("updated_at")
  private OffsetDateTime updatedAt = null;

  @SerializedName("previous_hash")
  private String previousHash = null;

  public ShortTransaction id(UUID id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @Schema(required = true, description = "")
  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public ShortTransaction type(TransactionType type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @Schema(required = true, description = "")
  public TransactionType getType() {
    return type;
  }

  public void setType(TransactionType type) {
    this.type = type;
  }

  public ShortTransaction serial(Integer serial) {
    this.serial = serial;
    return this;
  }

   /**
   * Get serial
   * @return serial
  **/
  @Schema(required = true, description = "")
  public Integer getSerial() {
    return serial;
  }

  public void setSerial(Integer serial) {
    this.serial = serial;
  }

  public ShortTransaction status(TransactionStatus status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @Schema(required = true, description = "")
  public TransactionStatus getStatus() {
    return status;
  }

  public void setStatus(TransactionStatus status) {
    this.status = status;
  }

  public ShortTransaction requestSignedAt(OffsetDateTime requestSignedAt) {
    this.requestSignedAt = requestSignedAt;
    return this;
  }

   /**
   * Get requestSignedAt
   * @return requestSignedAt
  **/
  @Schema(description = "")
  public OffsetDateTime getRequestSignedAt() {
    return requestSignedAt;
  }

  public void setRequestSignedAt(OffsetDateTime requestSignedAt) {
    this.requestSignedAt = requestSignedAt;
  }

  public ShortTransaction requestReceivedAt(OffsetDateTime requestReceivedAt) {
    this.requestReceivedAt = requestReceivedAt;
    return this;
  }

   /**
   * Get requestReceivedAt
   * @return requestReceivedAt
  **/
  @Schema(description = "")
  public OffsetDateTime getRequestReceivedAt() {
    return requestReceivedAt;
  }

  public void setRequestReceivedAt(OffsetDateTime requestReceivedAt) {
    this.requestReceivedAt = requestReceivedAt;
  }

  public ShortTransaction responseStatus(String responseStatus) {
    this.responseStatus = responseStatus;
    return this;
  }

   /**
   * Get responseStatus
   * @return responseStatus
  **/
  @Schema(description = "")
  public String getResponseStatus() {
    return responseStatus;
  }

  public void setResponseStatus(String responseStatus) {
    this.responseStatus = responseStatus;
  }

  public ShortTransaction responseErrorMessage(String responseErrorMessage) {
    this.responseErrorMessage = responseErrorMessage;
    return this;
  }

   /**
   * Get responseErrorMessage
   * @return responseErrorMessage
  **/
  @Schema(description = "")
  public String getResponseErrorMessage() {
    return responseErrorMessage;
  }

  public void setResponseErrorMessage(String responseErrorMessage) {
    this.responseErrorMessage = responseErrorMessage;
  }

  public ShortTransaction responseId(String responseId) {
    this.responseId = responseId;
    return this;
  }

   /**
   * Get responseId
   * @return responseId
  **/
  @Schema(description = "")
  public String getResponseId() {
    return responseId;
  }

  public void setResponseId(String responseId) {
    this.responseId = responseId;
  }

  public ShortTransaction offlineId(String offlineId) {
    this.offlineId = offlineId;
    return this;
  }

   /**
   * Get offlineId
   * @return offlineId
  **/
  @Schema(description = "")
  public String getOfflineId() {
    return offlineId;
  }

  public void setOfflineId(String offlineId) {
    this.offlineId = offlineId;
  }

  public ShortTransaction createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @Schema(description = "")
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public ShortTransaction updatedAt(OffsetDateTime updatedAt) {
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

  public ShortTransaction previousHash(String previousHash) {
    this.previousHash = previousHash;
    return this;
  }

   /**
   * Get previousHash
   * @return previousHash
  **/
  @Schema(description = "")
  public String getPreviousHash() {
    return previousHash;
  }

  public void setPreviousHash(String previousHash) {
    this.previousHash = previousHash;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ShortTransaction shortTransaction = (ShortTransaction) o;
    return Objects.equals(this.id, shortTransaction.id) &&
        Objects.equals(this.type, shortTransaction.type) &&
        Objects.equals(this.serial, shortTransaction.serial) &&
        Objects.equals(this.status, shortTransaction.status) &&
        Objects.equals(this.requestSignedAt, shortTransaction.requestSignedAt) &&
        Objects.equals(this.requestReceivedAt, shortTransaction.requestReceivedAt) &&
        Objects.equals(this.responseStatus, shortTransaction.responseStatus) &&
        Objects.equals(this.responseErrorMessage, shortTransaction.responseErrorMessage) &&
        Objects.equals(this.responseId, shortTransaction.responseId) &&
        Objects.equals(this.offlineId, shortTransaction.offlineId) &&
        Objects.equals(this.createdAt, shortTransaction.createdAt) &&
        Objects.equals(this.updatedAt, shortTransaction.updatedAt) &&
        Objects.equals(this.previousHash, shortTransaction.previousHash);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type, serial, status, requestSignedAt, requestReceivedAt, responseStatus, responseErrorMessage, responseId, offlineId, createdAt, updatedAt, previousHash);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShortTransaction {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    serial: ").append(toIndentedString(serial)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    requestSignedAt: ").append(toIndentedString(requestSignedAt)).append("\n");
    sb.append("    requestReceivedAt: ").append(toIndentedString(requestReceivedAt)).append("\n");
    sb.append("    responseStatus: ").append(toIndentedString(responseStatus)).append("\n");
    sb.append("    responseErrorMessage: ").append(toIndentedString(responseErrorMessage)).append("\n");
    sb.append("    responseId: ").append(toIndentedString(responseId)).append("\n");
    sb.append("    offlineId: ").append(toIndentedString(offlineId)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    previousHash: ").append(toIndentedString(previousHash)).append("\n");
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
