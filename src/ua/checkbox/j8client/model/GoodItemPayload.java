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
import ua.checkbox.j8client.model.DiscountPayload;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
/**
 * GoodItemPayload
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-11-02T14:34:29.121+02:00[Europe/Kiev]")
public class GoodItemPayload {
  @SerializedName("good")
  private AllOfGoodItemPayloadGood good = null;

  @SerializedName("good_id")
  private UUID goodId = null;

  @SerializedName("quantity")
  private Integer quantity = null;

  @SerializedName("is_return")
  private Boolean isReturn = false;

  @SerializedName("discounts")
  private List<DiscountPayload> discounts = null;

  public GoodItemPayload good(AllOfGoodItemPayloadGood good) {
    this.good = good;
    return this;
  }

   /**
   * Інформація про товар
   * @return good
  **/
  @Schema(description = "Інформація про товар")
  public AllOfGoodItemPayloadGood getGood() {
    return good;
  }

  public void setGood(AllOfGoodItemPayloadGood good) {
    this.good = good;
  }

  public GoodItemPayload goodId(UUID goodId) {
    this.goodId = goodId;
    return this;
  }

   /**
   * Get goodId
   * @return goodId
  **/
  @Schema(description = "")
  public UUID getGoodId() {
    return goodId;
  }

  public void setGoodId(UUID goodId) {
    this.goodId = goodId;
  }

  public GoodItemPayload quantity(Integer quantity) {
    this.quantity = quantity;
    return this;
  }

   /**
   * Get quantity
   * @return quantity
  **/
  @Schema(required = true, description = "")
  public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

  public GoodItemPayload isReturn(Boolean isReturn) {
    this.isReturn = isReturn;
    return this;
  }

   /**
   * Get isReturn
   * @return isReturn
  **/
  @Schema(description = "")
  public Boolean isIsReturn() {
    return isReturn;
  }

  public void setIsReturn(Boolean isReturn) {
    this.isReturn = isReturn;
  }

  public GoodItemPayload discounts(List<DiscountPayload> discounts) {
    this.discounts = discounts;
    return this;
  }

  public GoodItemPayload addDiscountsItem(DiscountPayload discountsItem) {
    if (this.discounts == null) {
      this.discounts = new ArrayList<DiscountPayload>();
    }
    this.discounts.add(discountsItem);
    return this;
  }

   /**
   * Get discounts
   * @return discounts
  **/
  @Schema(description = "")
  public List<DiscountPayload> getDiscounts() {
    return discounts;
  }

  public void setDiscounts(List<DiscountPayload> discounts) {
    this.discounts = discounts;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GoodItemPayload goodItemPayload = (GoodItemPayload) o;
    return Objects.equals(this.good, goodItemPayload.good) &&
        Objects.equals(this.goodId, goodItemPayload.goodId) &&
        Objects.equals(this.quantity, goodItemPayload.quantity) &&
        Objects.equals(this.isReturn, goodItemPayload.isReturn) &&
        Objects.equals(this.discounts, goodItemPayload.discounts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(good, goodId, quantity, isReturn, discounts);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GoodItemPayload {\n");
    
    sb.append("    good: ").append(toIndentedString(good)).append("\n");
    sb.append("    goodId: ").append(toIndentedString(goodId)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    isReturn: ").append(toIndentedString(isReturn)).append("\n");
    sb.append("    discounts: ").append(toIndentedString(discounts)).append("\n");
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