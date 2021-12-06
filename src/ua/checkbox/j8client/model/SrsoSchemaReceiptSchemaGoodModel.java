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
 * SrsoSchemaReceiptSchemaGoodModel
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-11-02T14:34:29.121+02:00[Europe/Kiev]")
public class SrsoSchemaReceiptSchemaGoodModel {
  @SerializedName("code")
  private String code = null;

  @SerializedName("barcode")
  private String barcode = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("header")
  private String header = null;

  @SerializedName("footer")
  private String footer = null;

  @SerializedName("uktzed")
  private String uktzed = null;

  @SerializedName("price")
  private Integer price = null;

  public SrsoSchemaReceiptSchemaGoodModel code(String code) {
    this.code = code;
    return this;
  }

   /**
   * Get code
   * @return code
  **/
  @Schema(required = true, description = "")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public SrsoSchemaReceiptSchemaGoodModel barcode(String barcode) {
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

  public SrsoSchemaReceiptSchemaGoodModel name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @Schema(required = true, description = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public SrsoSchemaReceiptSchemaGoodModel header(String header) {
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

  public SrsoSchemaReceiptSchemaGoodModel footer(String footer) {
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

  public SrsoSchemaReceiptSchemaGoodModel uktzed(String uktzed) {
    this.uktzed = uktzed;
    return this;
  }

   /**
   * Get uktzed
   * @return uktzed
  **/
  @Schema(description = "")
  public String getUktzed() {
    return uktzed;
  }

  public void setUktzed(String uktzed) {
    this.uktzed = uktzed;
  }

  public SrsoSchemaReceiptSchemaGoodModel price(Integer price) {
    this.price = price;
    return this;
  }

   /**
   * Get price
   * @return price
  **/
  @Schema(required = true, description = "")
  public Integer getPrice() {
    return price;
  }

  public void setPrice(Integer price) {
    this.price = price;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SrsoSchemaReceiptSchemaGoodModel srsoSchemaReceiptSchemaGoodModel = (SrsoSchemaReceiptSchemaGoodModel) o;
    return Objects.equals(this.code, srsoSchemaReceiptSchemaGoodModel.code) &&
        Objects.equals(this.barcode, srsoSchemaReceiptSchemaGoodModel.barcode) &&
        Objects.equals(this.name, srsoSchemaReceiptSchemaGoodModel.name) &&
        Objects.equals(this.header, srsoSchemaReceiptSchemaGoodModel.header) &&
        Objects.equals(this.footer, srsoSchemaReceiptSchemaGoodModel.footer) &&
        Objects.equals(this.uktzed, srsoSchemaReceiptSchemaGoodModel.uktzed) &&
        Objects.equals(this.price, srsoSchemaReceiptSchemaGoodModel.price);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, barcode, name, header, footer, uktzed, price);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SrsoSchemaReceiptSchemaGoodModel {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    barcode: ").append(toIndentedString(barcode)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    header: ").append(toIndentedString(header)).append("\n");
    sb.append("    footer: ").append(toIndentedString(footer)).append("\n");
    sb.append("    uktzed: ").append(toIndentedString(uktzed)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
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
