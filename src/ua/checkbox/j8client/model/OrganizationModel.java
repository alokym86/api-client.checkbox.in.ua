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
import java.util.UUID;
import org.threeten.bp.LocalDate;
// import org.threeten.bp.OffsetDateTime;
/**
 * OrganizationModel
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-11-02T14:34:29.121+02:00[Europe/Kiev]")
public class OrganizationModel {
  @SerializedName("id")
  private UUID id = null;

  @SerializedName("title")
  private String title = null;

  @SerializedName("edrpou")
  private String edrpou = null;

  @SerializedName("tax_number")
  private String taxNumber = null;

  @SerializedName("created_at")
  private OffsetDateTime createdAt = null;

  @SerializedName("updated_at")
  private OffsetDateTime updatedAt = null;

  @SerializedName("subscription_exp")
  private LocalDate subscriptionExp = null;

  public OrganizationModel id(UUID id) {
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

  public OrganizationModel title(String title) {
    this.title = title;
    return this;
  }

   /**
   * Get title
   * @return title
  **/
  @Schema(required = true, description = "")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public OrganizationModel edrpou(String edrpou) {
    this.edrpou = edrpou;
    return this;
  }

   /**
   * Get edrpou
   * @return edrpou
  **/
  @Schema(required = true, description = "")
  public String getEdrpou() {
    return edrpou;
  }

  public void setEdrpou(String edrpou) {
    this.edrpou = edrpou;
  }

  public OrganizationModel taxNumber(String taxNumber) {
    this.taxNumber = taxNumber;
    return this;
  }

   /**
   * Get taxNumber
   * @return taxNumber
  **/
  @Schema(required = true, description = "")
  public String getTaxNumber() {
    return taxNumber;
  }

  public void setTaxNumber(String taxNumber) {
    this.taxNumber = taxNumber;
  }

  public OrganizationModel createdAt(OffsetDateTime createdAt) {
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

  public OrganizationModel updatedAt(OffsetDateTime updatedAt) {
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

  public OrganizationModel subscriptionExp(LocalDate subscriptionExp) {
    this.subscriptionExp = subscriptionExp;
    return this;
  }

   /**
   * Get subscriptionExp
   * @return subscriptionExp
  **/
  @Schema(description = "")
  public LocalDate getSubscriptionExp() {
    return subscriptionExp;
  }

  public void setSubscriptionExp(LocalDate subscriptionExp) {
    this.subscriptionExp = subscriptionExp;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrganizationModel organizationModel = (OrganizationModel) o;
    return Objects.equals(this.id, organizationModel.id) &&
        Objects.equals(this.title, organizationModel.title) &&
        Objects.equals(this.edrpou, organizationModel.edrpou) &&
        Objects.equals(this.taxNumber, organizationModel.taxNumber) &&
        Objects.equals(this.createdAt, organizationModel.createdAt) &&
        Objects.equals(this.updatedAt, organizationModel.updatedAt) &&
        Objects.equals(this.subscriptionExp, organizationModel.subscriptionExp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, title, edrpou, taxNumber, createdAt, updatedAt, subscriptionExp);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrganizationModel {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    edrpou: ").append(toIndentedString(edrpou)).append("\n");
    sb.append("    taxNumber: ").append(toIndentedString(taxNumber)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    subscriptionExp: ").append(toIndentedString(subscriptionExp)).append("\n");
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