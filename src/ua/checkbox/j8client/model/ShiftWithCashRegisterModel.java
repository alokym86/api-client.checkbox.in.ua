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
import com.google.gson.annotations.SerializedName;

import java.time.OffsetDateTime;
import java.util.List;
import java.util.UUID;
// import org.threeten.bp.OffsetDateTime;
/**
 * ShiftWithCashRegisterModel
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-11-02T14:34:29.121+02:00[Europe/Kiev]")
public class ShiftWithCashRegisterModel extends ShiftModel {
  
  @SerializedName("cash_register")
  private CashRegisterModel cashRegister = null;
  @Override
  public ShiftWithCashRegisterModel id(UUID id) {
    this.id = id;
    return this;
  }
  @Override
  public ShiftWithCashRegisterModel serial(Integer serial) {
    this.serial = serial;
    return this;
  }
  @Override
  public ShiftWithCashRegisterModel status(ShiftStatus status) {
    this.status = status;
    return this;
  }
  @Override
  public ShiftWithCashRegisterModel zReport(ReportModel zReport) {
    this.zReport = zReport;
    return this;
  }
  @Override
  public ShiftWithCashRegisterModel openedAt(OffsetDateTime openedAt) {
    this.openedAt = openedAt;
    return this;
  }
  @Override
  public ShiftWithCashRegisterModel closedAt(OffsetDateTime closedAt) {
    this.closedAt = closedAt;
    return this;
  }
  @Override
  public ShiftWithCashRegisterModel initialTransaction(ShortTransaction initialTransaction) {
    this.initialTransaction = initialTransaction;
    return this;
  }
  @Override
  public ShiftWithCashRegisterModel closingTransaction(ShortTransaction closingTransaction) {
    this.closingTransaction = closingTransaction;
    return this;
  }
  @Override
  public ShiftWithCashRegisterModel createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }
  @Override
  public ShiftWithCashRegisterModel updatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }
  @Override
  public ShiftWithCashRegisterModel balance(BalanceModel balance) {
    this.balance = balance;
    return this;
  }
  @Override
  public ShiftWithCashRegisterModel taxes(List<ShiftTaxModel> taxes) {
    this.taxes = taxes;
    return this;
  }
  @Override
  public ShiftWithCashRegisterModel addTaxesItem(ShiftTaxModel taxesItem) {
    this.taxes.add(taxesItem);
    return this;
  }

  public ShiftWithCashRegisterModel cashRegister(CashRegisterModel cashRegister) {
    this.cashRegister = cashRegister;
    return this;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ShiftWithCashRegisterModel shiftWithCashRegisterModel = (ShiftWithCashRegisterModel) o;
    return Objects.equals(this.id, shiftWithCashRegisterModel.id) &&
        Objects.equals(this.serial, shiftWithCashRegisterModel.serial) &&
        Objects.equals(this.status, shiftWithCashRegisterModel.status) &&
        Objects.equals(this.zReport, shiftWithCashRegisterModel.zReport) &&
        Objects.equals(this.openedAt, shiftWithCashRegisterModel.openedAt) &&
        Objects.equals(this.closedAt, shiftWithCashRegisterModel.closedAt) &&
        Objects.equals(this.initialTransaction, shiftWithCashRegisterModel.initialTransaction) &&
        Objects.equals(this.closingTransaction, shiftWithCashRegisterModel.closingTransaction) &&
        Objects.equals(this.createdAt, shiftWithCashRegisterModel.createdAt) &&
        Objects.equals(this.updatedAt, shiftWithCashRegisterModel.updatedAt) &&
        Objects.equals(this.balance, shiftWithCashRegisterModel.balance) &&
        Objects.equals(this.taxes, shiftWithCashRegisterModel.taxes) &&
        Objects.equals(this.cashRegister, shiftWithCashRegisterModel.cashRegister);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, serial, status, zReport, openedAt, closedAt, initialTransaction, closingTransaction, createdAt, updatedAt, balance, taxes, cashRegister);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShiftWithCashRegisterModel {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    serial: ").append(toIndentedString(serial)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    zReport: ").append(toIndentedString(zReport)).append("\n");
    sb.append("    openedAt: ").append(toIndentedString(openedAt)).append("\n");
    sb.append("    closedAt: ").append(toIndentedString(closedAt)).append("\n");
    sb.append("    initialTransaction: ").append(toIndentedString(initialTransaction)).append("\n");
    sb.append("    closingTransaction: ").append(toIndentedString(closingTransaction)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
    sb.append("    taxes: ").append(toIndentedString(taxes)).append("\n");
    sb.append("    cashRegister: ").append(toIndentedString(cashRegister)).append("\n");
    sb.append("}");
    return sb.toString();
  }

}
