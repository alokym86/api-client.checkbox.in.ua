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
import java.util.UUID;
// import org.threeten.bp.OffsetDateTime;
/**
 * CalculatedReceiptTaxPayload
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-11-02T14:34:29.121+02:00[Europe/Kiev]")
public class CalculatedReceiptTaxPayload {
  @SerializedName("id")
  private UUID id = null;

  @SerializedName("code")
  private Integer code = null;

  @SerializedName("label")
  private String label = null;

  @SerializedName("symbol")
  private String symbol = null;

  @SerializedName("rate")
  private BigDecimal rate = null;

  @SerializedName("value")
  private BigDecimal value = null;

  @SerializedName("extra_rate")
  private BigDecimal extraRate = null;

  @SerializedName("extra_value")
  private BigDecimal extraValue = null;

  @SerializedName("included")
  private Boolean included = null;

  @SerializedName("created_at")
  private OffsetDateTime createdAt = null;

  @SerializedName("sales_turnover")
  private BigDecimal salesTurnover = new BigDecimal(0.0);

  @SerializedName("returns_turnover")
  private BigDecimal returnsTurnover = new BigDecimal(0.0);

  public CalculatedReceiptTaxPayload id(UUID id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @Schema(description = "")
  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public CalculatedReceiptTaxPayload code(Integer code) {
    this.code = code;
    return this;
  }

   /**
   * Get code
   * @return code
  **/
  @Schema(required = true, description = "")
  public Integer getCode() {
    return code;
  }

  public void setCode(Integer code) {
    this.code = code;
  }

  public CalculatedReceiptTaxPayload label(String label) {
    this.label = label;
    return this;
  }

   /**
   * Get label
   * @return label
  **/
  @Schema(required = true, description = "")
  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }

  public CalculatedReceiptTaxPayload symbol(String symbol) {
    this.symbol = symbol;
    return this;
  }

   /**
   * Get symbol
   * @return symbol
  **/
  @Schema(required = true, description = "")
  public String getSymbol() {
    return symbol;
  }

  public void setSymbol(String symbol) {
    this.symbol = symbol;
  }

  public CalculatedReceiptTaxPayload rate(BigDecimal rate) {
    this.rate = rate;
    return this;
  }

   /**
   * Get rate
   * @return rate
  **/
  @Schema(required = true, description = "")
  public BigDecimal getRate() {
    return rate;
  }

  public void setRate(BigDecimal rate) {
    this.rate = rate;
  }

  public CalculatedReceiptTaxPayload value(BigDecimal value) {
    this.value = value;
    return this;
  }

   /**
   * Get value
   * @return value
  **/
  @Schema(required = true, description = "")
  public BigDecimal getValue() {
    return value;
  }

  public void setValue(BigDecimal value) {
    this.value = value;
  }

  public CalculatedReceiptTaxPayload extraRate(BigDecimal extraRate) {
    this.extraRate = extraRate;
    return this;
  }

   /**
   * Get extraRate
   * @return extraRate
  **/
  @Schema(description = "")
  public BigDecimal getExtraRate() {
    return extraRate;
  }

  public void setExtraRate(BigDecimal extraRate) {
    this.extraRate = extraRate;
  }

  public CalculatedReceiptTaxPayload extraValue(BigDecimal extraValue) {
    this.extraValue = extraValue;
    return this;
  }

   /**
   * Get extraValue
   * @return extraValue
  **/
  @Schema(required = true, description = "")
  public BigDecimal getExtraValue() {
    return extraValue;
  }

  public void setExtraValue(BigDecimal extraValue) {
    this.extraValue = extraValue;
  }

  public CalculatedReceiptTaxPayload included(Boolean included) {
    this.included = included;
    return this;
  }

   /**
   * Get included
   * @return included
  **/
  @Schema(required = true, description = "")
  public Boolean isIncluded() {
    return included;
  }

  public void setIncluded(Boolean included) {
    this.included = included;
  }

  public CalculatedReceiptTaxPayload createdAt(OffsetDateTime createdAt) {
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

  public CalculatedReceiptTaxPayload salesTurnover(BigDecimal salesTurnover) {
    this.salesTurnover = salesTurnover;
    return this;
  }

   /**
   * Get salesTurnover
   * @return salesTurnover
  **/
  @Schema(description = "")
  public BigDecimal getSalesTurnover() {
    return salesTurnover;
  }

  public void setSalesTurnover(BigDecimal salesTurnover) {
    this.salesTurnover = salesTurnover;
  }

  public CalculatedReceiptTaxPayload returnsTurnover(BigDecimal returnsTurnover) {
    this.returnsTurnover = returnsTurnover;
    return this;
  }

   /**
   * Get returnsTurnover
   * @return returnsTurnover
  **/
  @Schema(description = "")
  public BigDecimal getReturnsTurnover() {
    return returnsTurnover;
  }

  public void setReturnsTurnover(BigDecimal returnsTurnover) {
    this.returnsTurnover = returnsTurnover;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CalculatedReceiptTaxPayload calculatedReceiptTaxPayload = (CalculatedReceiptTaxPayload) o;
    return Objects.equals(this.id, calculatedReceiptTaxPayload.id) &&
        Objects.equals(this.code, calculatedReceiptTaxPayload.code) &&
        Objects.equals(this.label, calculatedReceiptTaxPayload.label) &&
        Objects.equals(this.symbol, calculatedReceiptTaxPayload.symbol) &&
        Objects.equals(this.rate, calculatedReceiptTaxPayload.rate) &&
        Objects.equals(this.value, calculatedReceiptTaxPayload.value) &&
        Objects.equals(this.extraRate, calculatedReceiptTaxPayload.extraRate) &&
        Objects.equals(this.extraValue, calculatedReceiptTaxPayload.extraValue) &&
        Objects.equals(this.included, calculatedReceiptTaxPayload.included) &&
        Objects.equals(this.createdAt, calculatedReceiptTaxPayload.createdAt) &&
        Objects.equals(this.salesTurnover, calculatedReceiptTaxPayload.salesTurnover) &&
        Objects.equals(this.returnsTurnover, calculatedReceiptTaxPayload.returnsTurnover);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, code, label, symbol, rate, value, extraRate, extraValue, included, createdAt, salesTurnover, returnsTurnover);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CalculatedReceiptTaxPayload {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    symbol: ").append(toIndentedString(symbol)).append("\n");
    sb.append("    rate: ").append(toIndentedString(rate)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    extraRate: ").append(toIndentedString(extraRate)).append("\n");
    sb.append("    extraValue: ").append(toIndentedString(extraValue)).append("\n");
    sb.append("    included: ").append(toIndentedString(included)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    salesTurnover: ").append(toIndentedString(salesTurnover)).append("\n");
    sb.append("    returnsTurnover: ").append(toIndentedString(returnsTurnover)).append("\n");
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
