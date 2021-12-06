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
import ua.checkbox.j8client.model.CurrencyExchangeType;
import ua.checkbox.j8client.model.CurrencyPayload;
import ua.checkbox.j8client.model.DeliveryPayload;

import java.io.IOException;
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.UUID;
// import org.threeten.bp.OffsetDateTime;
/**
 * CurrencyExchangePayload
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-11-02T14:34:29.121+02:00[Europe/Kiev]")
public class CurrencyExchangePayload {
  @SerializedName("id")
  private UUID id = null;

  @SerializedName("sell")
  private CurrencyPayload sell = null;

  @SerializedName("buy")
  private CurrencyPayload buy = null;

  @SerializedName("type")
  private CurrencyExchangeType type = null;

  @SerializedName("reversal")
  private Boolean reversal = false;

  @SerializedName("client_info")
  private String clientInfo = null;

  @SerializedName("header")
  private String header = null;

  @SerializedName("footer")
  private String footer = null;

  @SerializedName("commission")
  private BigDecimal commission = null;

  @SerializedName("delivery")
  private DeliveryPayload delivery = null;

  @SerializedName("fiscal_code")
  private String fiscalCode = null;

  @SerializedName("fiscal_date")
  private OffsetDateTime fiscalDate = null;

  public CurrencyExchangePayload id(UUID id) {
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

  public CurrencyExchangePayload sell(CurrencyPayload sell) {
    this.sell = sell;
    return this;
  }

   /**
   * Get sell
   * @return sell
  **/
  @Schema(description = "")
  public CurrencyPayload getSell() {
    return sell;
  }

  public void setSell(CurrencyPayload sell) {
    this.sell = sell;
  }

  public CurrencyExchangePayload buy(CurrencyPayload buy) {
    this.buy = buy;
    return this;
  }

   /**
   * Get buy
   * @return buy
  **/
  @Schema(description = "")
  public CurrencyPayload getBuy() {
    return buy;
  }

  public void setBuy(CurrencyPayload buy) {
    this.buy = buy;
  }

  public CurrencyExchangePayload type(CurrencyExchangeType type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @Schema(required = true, description = "")
  public CurrencyExchangeType getType() {
    return type;
  }

  public void setType(CurrencyExchangeType type) {
    this.type = type;
  }

  public CurrencyExchangePayload reversal(Boolean reversal) {
    this.reversal = reversal;
    return this;
  }

   /**
   * Get reversal
   * @return reversal
  **/
  @Schema(description = "")
  public Boolean isReversal() {
    return reversal;
  }

  public void setReversal(Boolean reversal) {
    this.reversal = reversal;
  }

  public CurrencyExchangePayload clientInfo(String clientInfo) {
    this.clientInfo = clientInfo;
    return this;
  }

   /**
   * Get clientInfo
   * @return clientInfo
  **/
  @Schema(description = "")
  public String getClientInfo() {
    return clientInfo;
  }

  public void setClientInfo(String clientInfo) {
    this.clientInfo = clientInfo;
  }

  public CurrencyExchangePayload header(String header) {
    this.header = header;
    return this;
  }

   /**
   * Get header
   * @return header
  **/
  @Schema(description = "")
  public String getHeader() {
    return header;
  }

  public void setHeader(String header) {
    this.header = header;
  }

  public CurrencyExchangePayload footer(String footer) {
    this.footer = footer;
    return this;
  }

   /**
   * Get footer
   * @return footer
  **/
  @Schema(description = "")
  public String getFooter() {
    return footer;
  }

  public void setFooter(String footer) {
    this.footer = footer;
  }

  public CurrencyExchangePayload commission(BigDecimal commission) {
    this.commission = commission;
    return this;
  }

   /**
   * Get commission
   * @return commission
  **/
  @Schema(description = "")
  public BigDecimal getCommission() {
    return commission;
  }

  public void setCommission(BigDecimal commission) {
    this.commission = commission;
  }

  public CurrencyExchangePayload delivery(DeliveryPayload delivery) {
    this.delivery = delivery;
    return this;
  }

   /**
   * Get delivery
   * @return delivery
  **/
  @Schema(description = "")
  public DeliveryPayload getDelivery() {
    return delivery;
  }

  public void setDelivery(DeliveryPayload delivery) {
    this.delivery = delivery;
  }

  public CurrencyExchangePayload fiscalCode(String fiscalCode) {
    this.fiscalCode = fiscalCode;
    return this;
  }

   /**
   * Get fiscalCode
   * @return fiscalCode
  **/
  @Schema(description = "")
  public String getFiscalCode() {
    return fiscalCode;
  }

  public void setFiscalCode(String fiscalCode) {
    this.fiscalCode = fiscalCode;
  }

  public CurrencyExchangePayload fiscalDate(OffsetDateTime fiscalDate) {
    this.fiscalDate = fiscalDate;
    return this;
  }

   /**
   * Get fiscalDate
   * @return fiscalDate
  **/
  @Schema(description = "")
  public OffsetDateTime getFiscalDate() {
    return fiscalDate;
  }

  public void setFiscalDate(OffsetDateTime fiscalDate) {
    this.fiscalDate = fiscalDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CurrencyExchangePayload currencyExchangePayload = (CurrencyExchangePayload) o;
    return Objects.equals(this.id, currencyExchangePayload.id) &&
        Objects.equals(this.sell, currencyExchangePayload.sell) &&
        Objects.equals(this.buy, currencyExchangePayload.buy) &&
        Objects.equals(this.type, currencyExchangePayload.type) &&
        Objects.equals(this.reversal, currencyExchangePayload.reversal) &&
        Objects.equals(this.clientInfo, currencyExchangePayload.clientInfo) &&
        Objects.equals(this.header, currencyExchangePayload.header) &&
        Objects.equals(this.footer, currencyExchangePayload.footer) &&
        Objects.equals(this.commission, currencyExchangePayload.commission) &&
        Objects.equals(this.delivery, currencyExchangePayload.delivery) &&
        Objects.equals(this.fiscalCode, currencyExchangePayload.fiscalCode) &&
        Objects.equals(this.fiscalDate, currencyExchangePayload.fiscalDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, sell, buy, type, reversal, clientInfo, header, footer, commission, delivery, fiscalCode, fiscalDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CurrencyExchangePayload {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    sell: ").append(toIndentedString(sell)).append("\n");
    sb.append("    buy: ").append(toIndentedString(buy)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    reversal: ").append(toIndentedString(reversal)).append("\n");
    sb.append("    clientInfo: ").append(toIndentedString(clientInfo)).append("\n");
    sb.append("    header: ").append(toIndentedString(header)).append("\n");
    sb.append("    footer: ").append(toIndentedString(footer)).append("\n");
    sb.append("    commission: ").append(toIndentedString(commission)).append("\n");
    sb.append("    delivery: ").append(toIndentedString(delivery)).append("\n");
    sb.append("    fiscalCode: ").append(toIndentedString(fiscalCode)).append("\n");
    sb.append("    fiscalDate: ").append(toIndentedString(fiscalDate)).append("\n");
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