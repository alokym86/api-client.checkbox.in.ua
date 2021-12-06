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
import ua.checkbox.j8client.model.ReportPaymentsModel;
import ua.checkbox.j8client.model.ReportTaxesModel;

import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * ReportModel
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-11-02T14:34:29.121+02:00[Europe/Kiev]")
public class ReportModel {
  @SerializedName("id")
  private UUID id = null;

  @SerializedName("serial")
  private Integer serial = null;

  @SerializedName("is_z_report")
  private Boolean isZReport = null;

  @SerializedName("payments")
  private List<ReportPaymentsModel> payments = new ArrayList<ReportPaymentsModel>();

  @SerializedName("taxes")
  private List<ReportTaxesModel> taxes = new ArrayList<ReportTaxesModel>();

  @SerializedName("sell_receipts_count")
  private Integer sellReceiptsCount = null;

  @SerializedName("return_receipts_count")
  private Integer returnReceiptsCount = null;

  @SerializedName("transfers_count")
  private Integer transfersCount = null;

  @SerializedName("transfers_sum")
  private Integer transfersSum = null;

  @SerializedName("balance")
  private Integer balance = null;

  @SerializedName("initial")
  private Integer initial = null;

  @SerializedName("created_at")
  private OffsetDateTime createdAt = null;

  @SerializedName("updated_at")
  private OffsetDateTime updatedAt = null;

  public ReportModel id(UUID id) {
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

  public ReportModel serial(Integer serial) {
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

  public ReportModel isZReport(Boolean isZReport) {
    this.isZReport = isZReport;
    return this;
  }

   /**
   * Get isZReport
   * @return isZReport
  **/
  @Schema(required = true, description = "")
  public Boolean isIsZReport() {
    return isZReport;
  }

  public void setIsZReport(Boolean isZReport) {
    this.isZReport = isZReport;
  }

  public ReportModel payments(List<ReportPaymentsModel> payments) {
    this.payments = payments;
    return this;
  }

  public ReportModel addPaymentsItem(ReportPaymentsModel paymentsItem) {
    this.payments.add(paymentsItem);
    return this;
  }

   /**
   * Get payments
   * @return payments
  **/
  @Schema(required = true, description = "")
  public List<ReportPaymentsModel> getPayments() {
    return payments;
  }

  public void setPayments(List<ReportPaymentsModel> payments) {
    this.payments = payments;
  }

  public ReportModel taxes(List<ReportTaxesModel> taxes) {
    this.taxes = taxes;
    return this;
  }

  public ReportModel addTaxesItem(ReportTaxesModel taxesItem) {
    this.taxes.add(taxesItem);
    return this;
  }

   /**
   * Get taxes
   * @return taxes
  **/
  @Schema(required = true, description = "")
  public List<ReportTaxesModel> getTaxes() {
    return taxes;
  }

  public void setTaxes(List<ReportTaxesModel> taxes) {
    this.taxes = taxes;
  }

  public ReportModel sellReceiptsCount(Integer sellReceiptsCount) {
    this.sellReceiptsCount = sellReceiptsCount;
    return this;
  }

   /**
   * Get sellReceiptsCount
   * @return sellReceiptsCount
  **/
  @Schema(required = true, description = "")
  public Integer getSellReceiptsCount() {
    return sellReceiptsCount;
  }

  public void setSellReceiptsCount(Integer sellReceiptsCount) {
    this.sellReceiptsCount = sellReceiptsCount;
  }

  public ReportModel returnReceiptsCount(Integer returnReceiptsCount) {
    this.returnReceiptsCount = returnReceiptsCount;
    return this;
  }

   /**
   * Get returnReceiptsCount
   * @return returnReceiptsCount
  **/
  @Schema(required = true, description = "")
  public Integer getReturnReceiptsCount() {
    return returnReceiptsCount;
  }

  public void setReturnReceiptsCount(Integer returnReceiptsCount) {
    this.returnReceiptsCount = returnReceiptsCount;
  }

  public ReportModel transfersCount(Integer transfersCount) {
    this.transfersCount = transfersCount;
    return this;
  }

   /**
   * Get transfersCount
   * @return transfersCount
  **/
  @Schema(required = true, description = "")
  public Integer getTransfersCount() {
    return transfersCount;
  }

  public void setTransfersCount(Integer transfersCount) {
    this.transfersCount = transfersCount;
  }

  public ReportModel transfersSum(Integer transfersSum) {
    this.transfersSum = transfersSum;
    return this;
  }

   /**
   * Get transfersSum
   * @return transfersSum
  **/
  @Schema(required = true, description = "")
  public Integer getTransfersSum() {
    return transfersSum;
  }

  public void setTransfersSum(Integer transfersSum) {
    this.transfersSum = transfersSum;
  }

  public ReportModel balance(Integer balance) {
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

  public ReportModel initial(Integer initial) {
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

  public ReportModel createdAt(OffsetDateTime createdAt) {
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

  public ReportModel updatedAt(OffsetDateTime updatedAt) {
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
    ReportModel reportModel = (ReportModel) o;
    return Objects.equals(this.id, reportModel.id) &&
        Objects.equals(this.serial, reportModel.serial) &&
        Objects.equals(this.isZReport, reportModel.isZReport) &&
        Objects.equals(this.payments, reportModel.payments) &&
        Objects.equals(this.taxes, reportModel.taxes) &&
        Objects.equals(this.sellReceiptsCount, reportModel.sellReceiptsCount) &&
        Objects.equals(this.returnReceiptsCount, reportModel.returnReceiptsCount) &&
        Objects.equals(this.transfersCount, reportModel.transfersCount) &&
        Objects.equals(this.transfersSum, reportModel.transfersSum) &&
        Objects.equals(this.balance, reportModel.balance) &&
        Objects.equals(this.initial, reportModel.initial) &&
        Objects.equals(this.createdAt, reportModel.createdAt) &&
        Objects.equals(this.updatedAt, reportModel.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, serial, isZReport, payments, taxes, sellReceiptsCount, returnReceiptsCount, transfersCount, transfersSum, balance, initial, createdAt, updatedAt);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportModel {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    serial: ").append(toIndentedString(serial)).append("\n");
    sb.append("    isZReport: ").append(toIndentedString(isZReport)).append("\n");
    sb.append("    payments: ").append(toIndentedString(payments)).append("\n");
    sb.append("    taxes: ").append(toIndentedString(taxes)).append("\n");
    sb.append("    sellReceiptsCount: ").append(toIndentedString(sellReceiptsCount)).append("\n");
    sb.append("    returnReceiptsCount: ").append(toIndentedString(returnReceiptsCount)).append("\n");
    sb.append("    transfersCount: ").append(toIndentedString(transfersCount)).append("\n");
    sb.append("    transfersSum: ").append(toIndentedString(transfersSum)).append("\n");
    sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
    sb.append("    initial: ").append(toIndentedString(initial)).append("\n");
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