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
/**
 * ReportPaymentsPayload
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-11-02T14:34:29.121+02:00[Europe/Kiev]")
public class ReportPaymentsPayload {
  @SerializedName("type")
  private PaymentType type = null;

  @SerializedName("code")
  private Integer code = null;

  @SerializedName("label")
  private String label = null;

  @SerializedName("sell_sum")
  private Integer sellSum = null;

  @SerializedName("return_sum")
  private Integer returnSum = null;

  @SerializedName("service_in")
  private Integer serviceIn = null;

  @SerializedName("service_out")
  private Integer serviceOut = null;

  public ReportPaymentsPayload type(PaymentType type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @Schema(required = true, description = "")
  public PaymentType getType() {
    return type;
  }

  public void setType(PaymentType type) {
    this.type = type;
  }

  public ReportPaymentsPayload code(Integer code) {
    this.code = code;
    return this;
  }

   /**
   * Get code
   * @return code
  **/
  @Schema(description = "")
  public Integer getCode() {
    return code;
  }

  public void setCode(Integer code) {
    this.code = code;
  }

  public ReportPaymentsPayload label(String label) {
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

  public ReportPaymentsPayload sellSum(Integer sellSum) {
    this.sellSum = sellSum;
    return this;
  }

   /**
   * Get sellSum
   * @return sellSum
  **/
  @Schema(required = true, description = "")
  public Integer getSellSum() {
    return sellSum;
  }

  public void setSellSum(Integer sellSum) {
    this.sellSum = sellSum;
  }

  public ReportPaymentsPayload returnSum(Integer returnSum) {
    this.returnSum = returnSum;
    return this;
  }

   /**
   * Get returnSum
   * @return returnSum
  **/
  @Schema(required = true, description = "")
  public Integer getReturnSum() {
    return returnSum;
  }

  public void setReturnSum(Integer returnSum) {
    this.returnSum = returnSum;
  }

  public ReportPaymentsPayload serviceIn(Integer serviceIn) {
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

  public ReportPaymentsPayload serviceOut(Integer serviceOut) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportPaymentsPayload reportPaymentsPayload = (ReportPaymentsPayload) o;
    return Objects.equals(this.type, reportPaymentsPayload.type) &&
        Objects.equals(this.code, reportPaymentsPayload.code) &&
        Objects.equals(this.label, reportPaymentsPayload.label) &&
        Objects.equals(this.sellSum, reportPaymentsPayload.sellSum) &&
        Objects.equals(this.returnSum, reportPaymentsPayload.returnSum) &&
        Objects.equals(this.serviceIn, reportPaymentsPayload.serviceIn) &&
        Objects.equals(this.serviceOut, reportPaymentsPayload.serviceOut);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, code, label, sellSum, returnSum, serviceIn, serviceOut);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportPaymentsPayload {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    sellSum: ").append(toIndentedString(sellSum)).append("\n");
    sb.append("    returnSum: ").append(toIndentedString(returnSum)).append("\n");
    sb.append("    serviceIn: ").append(toIndentedString(serviceIn)).append("\n");
    sb.append("    serviceOut: ").append(toIndentedString(serviceOut)).append("\n");
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
