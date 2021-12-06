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
import ua.checkbox.j8client.model.CashierPermissionsModel;
import ua.checkbox.j8client.model.SignatureType;

import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.UUID;
// import org.threeten.bp.OffsetDateTime;
/**
 * CashierModel
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-11-02T14:34:29.121+02:00[Europe/Kiev]")
public class CashierModel {
  @SerializedName("id")
  private UUID id = null;

  @SerializedName("full_name")
  private String fullName = null;

  @SerializedName("nin")
  private String nin = null;

  @SerializedName("key_id")
  private String keyId = null;

  @SerializedName("signature_type")
  private SignatureType signatureType = null;

  @SerializedName("permissions")
  private CashierPermissionsModel permissions = null;

  @SerializedName("created_at")
  private OffsetDateTime createdAt = null;

  @SerializedName("updated_at")
  private OffsetDateTime updatedAt = null;

  public CashierModel id(UUID id) {
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

  public CashierModel fullName(String fullName) {
    this.fullName = fullName;
    return this;
  }

   /**
   * Get fullName
   * @return fullName
  **/
  @Schema(required = true, description = "")
  public String getFullName() {
    return fullName;
  }

  public void setFullName(String fullName) {
    this.fullName = fullName;
  }

  public CashierModel nin(String nin) {
    this.nin = nin;
    return this;
  }

   /**
   * Get nin
   * @return nin
  **/
  @Schema(required = true, description = "")
  public String getNin() {
    return nin;
  }

  public void setNin(String nin) {
    this.nin = nin;
  }

  public CashierModel keyId(String keyId) {
    this.keyId = keyId;
    return this;
  }

   /**
   * Get keyId
   * @return keyId
  **/
  @Schema(required = true, description = "")
  public String getKeyId() {
    return keyId;
  }

  public void setKeyId(String keyId) {
    this.keyId = keyId;
  }

  public CashierModel signatureType(SignatureType signatureType) {
    this.signatureType = signatureType;
    return this;
  }

   /**
   * Get signatureType
   * @return signatureType
  **/
  @Schema(required = true, description = "")
  public SignatureType getSignatureType() {
    return signatureType;
  }

  public void setSignatureType(SignatureType signatureType) {
    this.signatureType = signatureType;
  }

  public CashierModel permissions(CashierPermissionsModel permissions) {
    this.permissions = permissions;
    return this;
  }

   /**
   * Get permissions
   * @return permissions
  **/
  @Schema(description = "")
  public CashierPermissionsModel getPermissions() {
    return permissions;
  }

  public void setPermissions(CashierPermissionsModel permissions) {
    this.permissions = permissions;
  }

  public CashierModel createdAt(OffsetDateTime createdAt) {
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

  public CashierModel updatedAt(OffsetDateTime updatedAt) {
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
    CashierModel cashierModel = (CashierModel) o;
    return Objects.equals(this.id, cashierModel.id) &&
        Objects.equals(this.fullName, cashierModel.fullName) &&
        Objects.equals(this.nin, cashierModel.nin) &&
        Objects.equals(this.keyId, cashierModel.keyId) &&
        Objects.equals(this.signatureType, cashierModel.signatureType) &&
        Objects.equals(this.permissions, cashierModel.permissions) &&
        Objects.equals(this.createdAt, cashierModel.createdAt) &&
        Objects.equals(this.updatedAt, cashierModel.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, fullName, nin, keyId, signatureType, permissions, createdAt, updatedAt);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CashierModel {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    fullName: ").append(toIndentedString(fullName)).append("\n");
    sb.append("    nin: ").append(toIndentedString(nin)).append("\n");
    sb.append("    keyId: ").append(toIndentedString(keyId)).append("\n");
    sb.append("    signatureType: ").append(toIndentedString(signatureType)).append("\n");
    sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
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