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
import ua.checkbox.j8client.model.CalculatedDiscountPayload;
import ua.checkbox.j8client.model.CalculatedGoodDetailsPayload;
import ua.checkbox.j8client.model.CalculatedGoodTaxPayload;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
/**
 * CalculatedGoodItemPayload
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-11-02T14:34:29.121+02:00[Europe/Kiev]")
public class CalculatedGoodItemPayload {
  @SerializedName("good")
  private CalculatedGoodDetailsPayload good = null;

  @SerializedName("good_id")
  private UUID goodId = null;

  @SerializedName("sum")
  private Integer sum = null;

  @SerializedName("quantity")
  private Integer quantity = null;

  @SerializedName("is_return")
  private Boolean isReturn = false;

  @SerializedName("taxes")
  private List<CalculatedGoodTaxPayload> taxes = new ArrayList<CalculatedGoodTaxPayload>();

  @SerializedName("discounts")
  private List<CalculatedDiscountPayload> discounts = null;

  public CalculatedGoodItemPayload good(CalculatedGoodDetailsPayload good) {
    this.good = good;
    return this;
  }

   /**
   * Get good
   * @return good
  **/
  @Schema(required = true, description = "")
  public CalculatedGoodDetailsPayload getGood() {
    return good;
  }

  public void setGood(CalculatedGoodDetailsPayload good) {
    this.good = good;
  }

  public CalculatedGoodItemPayload goodId(UUID goodId) {
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

  public CalculatedGoodItemPayload sum(Integer sum) {
    this.sum = sum;
    return this;
  }

   /**
   * Get sum
   * @return sum
  **/
  @Schema(required = true, description = "")
  public Integer getSum() {
    return sum;
  }

  public void setSum(Integer sum) {
    this.sum = sum;
  }

  public CalculatedGoodItemPayload quantity(Integer quantity) {
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

  public CalculatedGoodItemPayload isReturn(Boolean isReturn) {
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

  public CalculatedGoodItemPayload taxes(List<CalculatedGoodTaxPayload> taxes) {
    this.taxes = taxes;
    return this;
  }

  public CalculatedGoodItemPayload addTaxesItem(CalculatedGoodTaxPayload taxesItem) {
    this.taxes.add(taxesItem);
    return this;
  }

   /**
   * Get taxes
   * @return taxes
  **/
  @Schema(required = true, description = "")
  public List<CalculatedGoodTaxPayload> getTaxes() {
    return taxes;
  }

  public void setTaxes(List<CalculatedGoodTaxPayload> taxes) {
    this.taxes = taxes;
  }

  public CalculatedGoodItemPayload discounts(List<CalculatedDiscountPayload> discounts) {
    this.discounts = discounts;
    return this;
  }

  public CalculatedGoodItemPayload addDiscountsItem(CalculatedDiscountPayload discountsItem) {
    if (this.discounts == null) {
      this.discounts = new ArrayList<CalculatedDiscountPayload>();
    }
    this.discounts.add(discountsItem);
    return this;
  }

   /**
   * Get discounts
   * @return discounts
  **/
  @Schema(description = "")
  public List<CalculatedDiscountPayload> getDiscounts() {
    return discounts;
  }

  public void setDiscounts(List<CalculatedDiscountPayload> discounts) {
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
    CalculatedGoodItemPayload calculatedGoodItemPayload = (CalculatedGoodItemPayload) o;
    return Objects.equals(this.good, calculatedGoodItemPayload.good) &&
        Objects.equals(this.goodId, calculatedGoodItemPayload.goodId) &&
        Objects.equals(this.sum, calculatedGoodItemPayload.sum) &&
        Objects.equals(this.quantity, calculatedGoodItemPayload.quantity) &&
        Objects.equals(this.isReturn, calculatedGoodItemPayload.isReturn) &&
        Objects.equals(this.taxes, calculatedGoodItemPayload.taxes) &&
        Objects.equals(this.discounts, calculatedGoodItemPayload.discounts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(good, goodId, sum, quantity, isReturn, taxes, discounts);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CalculatedGoodItemPayload {\n");
    
    sb.append("    good: ").append(toIndentedString(good)).append("\n");
    sb.append("    goodId: ").append(toIndentedString(goodId)).append("\n");
    sb.append("    sum: ").append(toIndentedString(sum)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    isReturn: ").append(toIndentedString(isReturn)).append("\n");
    sb.append("    taxes: ").append(toIndentedString(taxes)).append("\n");
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
