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
import io.swagger.v3.oas.annotations.media.Schema;

import java.time.OffsetDateTime;
import java.util.List;
import java.util.UUID;
// import org.threeten.bp.OffsetDateTime;
/**
 * ShiftWithCashierAndCashRegister
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-11-02T14:34:29.121+02:00[Europe/Kiev]")
public class ShiftWithCashierAndCashRegister extends ShiftWithCashierModel {
 
  @SerializedName("cash_register")
  private CashRegisterModel cashRegister = null;
  
  @Override
  public ShiftWithCashierAndCashRegister id(UUID id) {
    this.id = id;
    return this;
  }
  @Override
  public ShiftWithCashierAndCashRegister serial(Integer serial) {
    this.serial = serial;
    return this;
  }
  @Override
  public ShiftWithCashierAndCashRegister status(ShiftStatus status) {
    this.status = status;
    return this;
  }
  @Override
  public ShiftWithCashierAndCashRegister zReport(ReportModel zReport) {
    this.zReport = zReport;
    return this;
  }
  @Override
  public ShiftWithCashierAndCashRegister openedAt(OffsetDateTime openedAt) {
    this.openedAt = openedAt;
    return this;
  }
  @Override
  public ShiftWithCashierAndCashRegister closedAt(OffsetDateTime closedAt) {
    this.closedAt = closedAt;
    return this;
  }
  @Override
  public ShiftWithCashierAndCashRegister initialTransaction(ShortTransaction initialTransaction) {
    this.initialTransaction = initialTransaction;
    return this;
  }
  @Override
  public ShiftWithCashierAndCashRegister closingTransaction(ShortTransaction closingTransaction) {
    this.closingTransaction = closingTransaction;
    return this;
  }
  @Override
  public ShiftWithCashierAndCashRegister createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }
  @Override
  public ShiftWithCashierAndCashRegister updatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }
  @Override
  public ShiftWithCashierAndCashRegister balance(BalanceModel balance) {
    this.balance = balance;
    return this;
  }
  @Override
  public ShiftWithCashierAndCashRegister taxes(List<ShiftTaxModel> taxes) {
    this.taxes = taxes;
    return this;
  }
  @Override
  public ShiftWithCashierAndCashRegister addTaxesItem(ShiftTaxModel taxesItem) {
    this.taxes.add(taxesItem);
    return this;
  }

  public ShiftWithCashierAndCashRegister cashRegister(CashRegisterModel cashRegister) {
    this.cashRegister = cashRegister;
    return this;
  }

   /**
   * Get cashRegister
   * @return cashRegister
  **/
  @Schema(required = true, description = "")
  public CashRegisterModel getCashRegister() {
    return cashRegister;
  }

  public void setCashRegister(CashRegisterModel cashRegister) {
    this.cashRegister = cashRegister;
  }
  @Override
  public ShiftWithCashierAndCashRegister cashier(CashierModel cashier) {
    this.cashier = cashier;
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
    ShiftWithCashierAndCashRegister shiftWithCashierAndCashRegister = (ShiftWithCashierAndCashRegister) o;
    return Objects.equals(this.id, shiftWithCashierAndCashRegister.id) &&
        Objects.equals(this.serial, shiftWithCashierAndCashRegister.serial) &&
        Objects.equals(this.status, shiftWithCashierAndCashRegister.status) &&
        Objects.equals(this.zReport, shiftWithCashierAndCashRegister.zReport) &&
        Objects.equals(this.openedAt, shiftWithCashierAndCashRegister.openedAt) &&
        Objects.equals(this.closedAt, shiftWithCashierAndCashRegister.closedAt) &&
        Objects.equals(this.initialTransaction, shiftWithCashierAndCashRegister.initialTransaction) &&
        Objects.equals(this.closingTransaction, shiftWithCashierAndCashRegister.closingTransaction) &&
        Objects.equals(this.createdAt, shiftWithCashierAndCashRegister.createdAt) &&
        Objects.equals(this.updatedAt, shiftWithCashierAndCashRegister.updatedAt) &&
        Objects.equals(this.balance, shiftWithCashierAndCashRegister.balance) &&
        Objects.equals(this.taxes, shiftWithCashierAndCashRegister.taxes) &&
        Objects.equals(this.cashRegister, shiftWithCashierAndCashRegister.cashRegister) &&
        Objects.equals(this.cashier, shiftWithCashierAndCashRegister.cashier);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, serial, status, zReport, openedAt, closedAt, initialTransaction, closingTransaction, createdAt, updatedAt, balance, taxes, cashRegister, cashier);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShiftWithCashierAndCashRegister {\n");
    
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
    sb.append("    cashier: ").append(toIndentedString(cashier)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
