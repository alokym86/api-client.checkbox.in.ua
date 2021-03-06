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
import ua.checkbox.j8client.model.OrderModel;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * Пагінований результат
 */
@Schema(description = "Пагінований результат")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-11-02T14:34:29.121+02:00[Europe/Kiev]")
public class PaginatedResultOrderModel_ {
  @SerializedName("meta")
  private AllOfPaginatedResultOrderModelMeta meta = null;

  @SerializedName("results")
  private List<OrderModel> results = new ArrayList<OrderModel>();

  public PaginatedResultOrderModel_ meta(AllOfPaginatedResultOrderModelMeta meta) {
    this.meta = meta;
    return this;
  }

   /**
   * Get meta
   * @return meta
  **/
  @Schema(required = true, description = "")
  public AllOfPaginatedResultOrderModelMeta getMeta() {
    return meta;
  }

  public void setMeta(AllOfPaginatedResultOrderModelMeta meta) {
    this.meta = meta;
  }

  public PaginatedResultOrderModel_ results(List<OrderModel> results) {
    this.results = results;
    return this;
  }

  public PaginatedResultOrderModel_ addResultsItem(OrderModel resultsItem) {
    this.results.add(resultsItem);
    return this;
  }

   /**
   * Get results
   * @return results
  **/
  @Schema(required = true, description = "")
  public List<OrderModel> getResults() {
    return results;
  }

  public void setResults(List<OrderModel> results) {
    this.results = results;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaginatedResultOrderModel_ paginatedResultOrderModel_ = (PaginatedResultOrderModel_) o;
    return Objects.equals(this.meta, paginatedResultOrderModel_.meta) &&
        Objects.equals(this.results, paginatedResultOrderModel_.results);
  }

  @Override
  public int hashCode() {
    return Objects.hash(meta, results);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaginatedResultOrderModel_ {\n");
    
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
    sb.append("    results: ").append(toIndentedString(results)).append("\n");
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
