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
import ua.checkbox.j8client.model.ShortReceiptModel;

import java.io.IOException;
/**
 * ServiceReceiptUpdateSchema
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-11-02T14:34:29.121+02:00[Europe/Kiev]")
public class ServiceReceiptUpdateSchema {
  @SerializedName("service_receipt")
  private ShortReceiptModel serviceReceipt = null;

  public ServiceReceiptUpdateSchema serviceReceipt(ShortReceiptModel serviceReceipt) {
    this.serviceReceipt = serviceReceipt;
    return this;
  }

   /**
   * Get serviceReceipt
   * @return serviceReceipt
  **/
  @Schema(required = true, description = "")
  public ShortReceiptModel getServiceReceipt() {
    return serviceReceipt;
  }

  public void setServiceReceipt(ShortReceiptModel serviceReceipt) {
    this.serviceReceipt = serviceReceipt;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceReceiptUpdateSchema serviceReceiptUpdateSchema = (ServiceReceiptUpdateSchema) o;
    return Objects.equals(this.serviceReceipt, serviceReceiptUpdateSchema.serviceReceipt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serviceReceipt);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceReceiptUpdateSchema {\n");
    
    sb.append("    serviceReceipt: ").append(toIndentedString(serviceReceipt)).append("\n");
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