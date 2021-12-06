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
 * BalanceModel
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-11-02T14:34:29.121+02:00[Europe/Kiev]")
public class BalanceModel {
  @SerializedName("initial")
  private Integer initial = null;

  @SerializedName("balance")
  private Integer balance = null;

  @SerializedName("cash_sales")
  private Integer cashSales = null;

  @SerializedName("card_sales")
  private Integer cardSales = null;

  @SerializedName("cash_returns")
  private Integer cashReturns = null;

  @SerializedName("card_returns")
  private Integer cardReturns = null;

  @SerializedName("service_in")
  private Integer serviceIn = null;

  @SerializedName("service_out")
  private Integer serviceOut = null;

  @SerializedName("updated_at")
  private OffsetDateTime updatedAt = null;

  public BalanceModel initial(Integer initial) {
    this.initial = initial;
    return this;
  }

   /**
   * Get initial
   * @return initial
  **/
  @Schema(required = true, description = "")
  public Integer getInitial() {
    return initial;
  }

  public void setInitial(Integer initial) {
    this.initial = initial;
  }

  public BalanceModel balance(Integer balance) {
    this.balance = balance;
    return this;
  }

   /**
   * Get balance
   * @return balance
  **/
  @Schema(required = true, description = "")
  public Integer getBalance() {
    return balance;
  }

  public void setBalance(Integer balance) {
    this.balance = balance;
  }

  public BalanceModel cashSales(Integer cashSales) {
    this.cashSales = cashSales;
    return this;
  }

   /**
   * Get cashSales
   * @return cashSales
  **/
  @Schema(required = true, description = "")
  public Integer getCashSales() {
    return cashSales;
  }

  public void setCashSales(Integer cashSales) {
    this.cashSales = cashSales;
  }

  public BalanceModel cardSales(Integer cardSales) {
    this.cardSales = cardSales;
    return this;
  }

   /**
   * Get cardSales
   * @return cardSales
  **/
  @Schema(required = true, description = "")
  public Integer getCardSales() {
    return cardSales;
  }

  public void setCardSales(Integer cardSales) {
    this.cardSales = cardSales;
  }

  public BalanceModel cashReturns(Integer cashReturns) {
    this.cashReturns = cashReturns;
    return this;
  }

   /**
   * Get cashReturns
   * @return cashReturns
  **/
  @Schema(required = true, description = "")
  public Integer getCashReturns() {
    return cashReturns;
  }

  public void setCashReturns(Integer cashReturns) {
    this.cashReturns = cashReturns;
  }

  public BalanceModel cardReturns(Integer cardReturns) {
    this.cardReturns = cardReturns;
    return this;
  }

   /**
   * Get cardReturns
   * @return cardReturns
  **/
  @Schema(required = true, description = "")
  public Integer getCardReturns() {
    return cardReturns;
  }

  public void setCardReturns(Integer cardReturns) {
    this.cardReturns = cardReturns;
  }

  public BalanceModel serviceIn(Integer serviceIn) {
    this.serviceIn = serviceIn;
    return this;
  }

   /**
   * Get serviceIn
   * @return serviceIn
  **/
  @Schema(required = true, description = "")
  public Integer getServiceIn() {
    return serviceIn;
  }

  public void setServiceIn(Integer serviceIn) {
    this.serviceIn = serviceIn;
  }

  public BalanceModel serviceOut(Integer serviceOut) {
    this.serviceOut = serviceOut;
    return this;
  }

   /**
   * Get serviceOut
   * @return serviceOut
  **/
  @Schema(required = true, description = "")
  public Integer getServiceOut() {
    return serviceOut;
  }

  public void setServiceOut(Integer serviceOut) {
    this.serviceOut = serviceOut;
  }

  public BalanceModel updatedAt(OffsetDateTime updatedAt) {
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
    BalanceModel balanceModel = (BalanceModel) o;
    return Objects.equals(this.initial, balanceModel.initial) &&
        Objects.equals(this.balance, balanceModel.balance) &&
        Objects.equals(this.cashSales, balanceModel.cashSales) &&
        Objects.equals(this.cardSales, balanceModel.cardSales) &&
        Objects.equals(this.cashReturns, balanceModel.cashReturns) &&
        Objects.equals(this.cardReturns, balanceModel.cardReturns) &&
        Objects.equals(this.serviceIn, balanceModel.serviceIn) &&
        Objects.equals(this.serviceOut, balanceModel.serviceOut) &&
        Objects.equals(this.updatedAt, balanceModel.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(initial, balance, cashSales, cardSales, cashReturns, cardReturns, serviceIn, serviceOut, updatedAt);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BalanceModel {\n");
    
    sb.append("    initial: ").append(toIndentedString(initial)).append("\n");
    sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
    sb.append("    cashSales: ").append(toIndentedString(cashSales)).append("\n");
    sb.append("    cardSales: ").append(toIndentedString(cardSales)).append("\n");
    sb.append("    cashReturns: ").append(toIndentedString(cashReturns)).append("\n");
    sb.append("    cardReturns: ").append(toIndentedString(cardReturns)).append("\n");
    sb.append("    serviceIn: ").append(toIndentedString(serviceIn)).append("\n");
    sb.append("    serviceOut: ").append(toIndentedString(serviceOut)).append("\n");
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