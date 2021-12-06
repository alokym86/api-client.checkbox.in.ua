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
import ua.checkbox.j8client.model.DeliveryPayload;
import ua.checkbox.j8client.model.DiscountPayload;
import ua.checkbox.j8client.model.GoodItemPayload;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
/**
 * ReceiptSellPayload
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-11-02T14:34:29.121+02:00[Europe/Kiev]")
public class ReceiptSellPayload {
  @SerializedName("id")
  private UUID id = null;

  @SerializedName("cashier_name")
  private String cashierName = null;

  @SerializedName("departament")
  private String departament = null;

  @SerializedName("goods")
  private List<GoodItemPayload> goods = new ArrayList<GoodItemPayload>();

  @SerializedName("delivery")
  private DeliveryPayload delivery = null;

  @SerializedName("discounts")
  private List<DiscountPayload> discounts = null;

  @SerializedName("payments")
  private List<AnyOfReceiptSellPayloadPaymentsItems> payments = null;

  @SerializedName("rounding")
  private Boolean rounding = false;

  @SerializedName("header")
  private String header = null;

  @SerializedName("footer")
  private String footer = null;

  @SerializedName("barcode")
  private String barcode = null;

  @SerializedName("order_id")
  private UUID orderId = null;

  @SerializedName("related_receipt_id")
  private UUID relatedReceiptId = null;

  @SerializedName("previous_receipt_id")
  private UUID previousReceiptId = null;

  @SerializedName("technical_return")
  private Boolean technicalReturn = false;

  @SerializedName("context")
  private Map<String, Object> context = null;

  @SerializedName("is_pawnshop")
  private Boolean isPawnshop = false;

  public ReceiptSellPayload id(UUID id) {
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

  public ReceiptSellPayload cashierName(String cashierName) {
    this.cashierName = cashierName;
    return this;
  }

   /**
   * Get cashierName
   * @return cashierName
  **/
  @Schema(description = "")
  public String getCashierName() {
    return cashierName;
  }

  public void setCashierName(String cashierName) {
    this.cashierName = cashierName;
  }

  public ReceiptSellPayload departament(String departament) {
    this.departament = departament;
    return this;
  }

   /**
   * Get departament
   * @return departament
  **/
  @Schema(description = "")
  public String getDepartament() {
    return departament;
  }

  public void setDepartament(String departament) {
    this.departament = departament;
  }

  public ReceiptSellPayload goods(List<GoodItemPayload> goods) {
    this.goods = goods;
    return this;
  }

  public ReceiptSellPayload addGoodsItem(GoodItemPayload goodsItem) {
    this.goods.add(goodsItem);
    return this;
  }

   /**
   * Get goods
   * @return goods
  **/
  @Schema(required = true, description = "")
  public List<GoodItemPayload> getGoods() {
    return goods;
  }

  public void setGoods(List<GoodItemPayload> goods) {
    this.goods = goods;
  }

  public ReceiptSellPayload delivery(DeliveryPayload delivery) {
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

  public ReceiptSellPayload discounts(List<DiscountPayload> discounts) {
    this.discounts = discounts;
    return this;
  }

  public ReceiptSellPayload addDiscountsItem(DiscountPayload discountsItem) {
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

  public ReceiptSellPayload payments(List<AnyOfReceiptSellPayloadPaymentsItems> payments) {
    this.payments = payments;
    return this;
  }

  public ReceiptSellPayload addPaymentsItem(AnyOfReceiptSellPayloadPaymentsItems paymentsItem) {
    if (this.payments == null) {
      this.payments = new ArrayList<AnyOfReceiptSellPayloadPaymentsItems>();
    }
    this.payments.add(paymentsItem);
    return this;
  }

   /**
   * Get payments
   * @return payments
  **/
  @Schema(description = "")
  public List<AnyOfReceiptSellPayloadPaymentsItems> getPayments() {
    return payments;
  }

  public void setPayments(List<AnyOfReceiptSellPayloadPaymentsItems> payments) {
    this.payments = payments;
  }

  public ReceiptSellPayload rounding(Boolean rounding) {
    this.rounding = rounding;
    return this;
  }

   /**
   * Get rounding
   * @return rounding
  **/
  @Schema(description = "")
  public Boolean isRounding() {
    return rounding;
  }

  public void setRounding(Boolean rounding) {
    this.rounding = rounding;
  }

  public ReceiptSellPayload header(String header) {
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

  public ReceiptSellPayload footer(String footer) {
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

  public ReceiptSellPayload barcode(String barcode) {
    this.barcode = barcode;
    return this;
  }

   /**
   * Get barcode
   * @return barcode
  **/
  @Schema(description = "")
  public String getBarcode() {
    return barcode;
  }

  public void setBarcode(String barcode) {
    this.barcode = barcode;
  }

  public ReceiptSellPayload orderId(UUID orderId) {
    this.orderId = orderId;
    return this;
  }

   /**
   * Get orderId
   * @return orderId
  **/
  @Schema(description = "")
  public UUID getOrderId() {
    return orderId;
  }

  public void setOrderId(UUID orderId) {
    this.orderId = orderId;
  }

  public ReceiptSellPayload relatedReceiptId(UUID relatedReceiptId) {
    this.relatedReceiptId = relatedReceiptId;
    return this;
  }

   /**
   * Get relatedReceiptId
   * @return relatedReceiptId
  **/
  @Schema(description = "")
  public UUID getRelatedReceiptId() {
    return relatedReceiptId;
  }

  public void setRelatedReceiptId(UUID relatedReceiptId) {
    this.relatedReceiptId = relatedReceiptId;
  }

  public ReceiptSellPayload previousReceiptId(UUID previousReceiptId) {
    this.previousReceiptId = previousReceiptId;
    return this;
  }

   /**
   * id попереднього фіскального чеку (використовується опціонально для контролю послідовності)
   * @return previousReceiptId
  **/
  @Schema(description = "id попереднього фіскального чеку (використовується опціонально для контролю послідовності)")
  public UUID getPreviousReceiptId() {
    return previousReceiptId;
  }

  public void setPreviousReceiptId(UUID previousReceiptId) {
    this.previousReceiptId = previousReceiptId;
  }

  public ReceiptSellPayload technicalReturn(Boolean technicalReturn) {
    this.technicalReturn = technicalReturn;
    return this;
  }

   /**
   * Get technicalReturn
   * @return technicalReturn
  **/
  @Schema(description = "")
  public Boolean isTechnicalReturn() {
    return technicalReturn;
  }

  public void setTechnicalReturn(Boolean technicalReturn) {
    this.technicalReturn = technicalReturn;
  }

  public ReceiptSellPayload context(Map<String, Object> context) {
    this.context = context;
    return this;
  }

  public ReceiptSellPayload putContextItem(String key, Object contextItem) {
    if (this.context == null) {
      this.context = new HashMap<String, Object>();
    }
    this.context.put(key, contextItem);
    return this;
  }

   /**
   * Get context
   * @return context
  **/
  @Schema(description = "")
  public Map<String, Object> getContext() {
    return context;
  }

  public void setContext(Map<String, Object> context) {
    this.context = context;
  }

  public ReceiptSellPayload isPawnshop(Boolean isPawnshop) {
    this.isPawnshop = isPawnshop;
    return this;
  }

   /**
   * Get isPawnshop
   * @return isPawnshop
  **/
  @Schema(description = "")
  public Boolean isIsPawnshop() {
    return isPawnshop;
  }

  public void setIsPawnshop(Boolean isPawnshop) {
    this.isPawnshop = isPawnshop;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReceiptSellPayload receiptSellPayload = (ReceiptSellPayload) o;
    return Objects.equals(this.id, receiptSellPayload.id) &&
        Objects.equals(this.cashierName, receiptSellPayload.cashierName) &&
        Objects.equals(this.departament, receiptSellPayload.departament) &&
        Objects.equals(this.goods, receiptSellPayload.goods) &&
        Objects.equals(this.delivery, receiptSellPayload.delivery) &&
        Objects.equals(this.discounts, receiptSellPayload.discounts) &&
        Objects.equals(this.payments, receiptSellPayload.payments) &&
        Objects.equals(this.rounding, receiptSellPayload.rounding) &&
        Objects.equals(this.header, receiptSellPayload.header) &&
        Objects.equals(this.footer, receiptSellPayload.footer) &&
        Objects.equals(this.barcode, receiptSellPayload.barcode) &&
        Objects.equals(this.orderId, receiptSellPayload.orderId) &&
        Objects.equals(this.relatedReceiptId, receiptSellPayload.relatedReceiptId) &&
        Objects.equals(this.previousReceiptId, receiptSellPayload.previousReceiptId) &&
        Objects.equals(this.technicalReturn, receiptSellPayload.technicalReturn) &&
        Objects.equals(this.context, receiptSellPayload.context) &&
        Objects.equals(this.isPawnshop, receiptSellPayload.isPawnshop);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, cashierName, departament, goods, delivery, discounts, payments, rounding, header, footer, barcode, orderId, relatedReceiptId, previousReceiptId, technicalReturn, context, isPawnshop);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReceiptSellPayload {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    cashierName: ").append(toIndentedString(cashierName)).append("\n");
    sb.append("    departament: ").append(toIndentedString(departament)).append("\n");
    sb.append("    goods: ").append(toIndentedString(goods)).append("\n");
    sb.append("    delivery: ").append(toIndentedString(delivery)).append("\n");
    sb.append("    discounts: ").append(toIndentedString(discounts)).append("\n");
    sb.append("    payments: ").append(toIndentedString(payments)).append("\n");
    sb.append("    rounding: ").append(toIndentedString(rounding)).append("\n");
    sb.append("    header: ").append(toIndentedString(header)).append("\n");
    sb.append("    footer: ").append(toIndentedString(footer)).append("\n");
    sb.append("    barcode: ").append(toIndentedString(barcode)).append("\n");
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    relatedReceiptId: ").append(toIndentedString(relatedReceiptId)).append("\n");
    sb.append("    previousReceiptId: ").append(toIndentedString(previousReceiptId)).append("\n");
    sb.append("    technicalReturn: ").append(toIndentedString(technicalReturn)).append("\n");
    sb.append("    context: ").append(toIndentedString(context)).append("\n");
    sb.append("    isPawnshop: ").append(toIndentedString(isPawnshop)).append("\n");
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
