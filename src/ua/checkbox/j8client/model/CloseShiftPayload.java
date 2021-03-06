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
 * CloseShiftPayload
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-11-02T14:34:29.121+02:00[Europe/Kiev]")
public class CloseShiftPayload {
  @SerializedName("skip_client_name_check")
  private Boolean skipClientNameCheck = false;

  @SerializedName("report")
  private AllOfCloseShiftPayloadReport report = null;

  @SerializedName("fiscal_code")
  private String fiscalCode = null;

  @SerializedName("fiscal_date")
  private OffsetDateTime fiscalDate = null;

  public CloseShiftPayload skipClientNameCheck(Boolean skipClientNameCheck) {
    this.skipClientNameCheck = skipClientNameCheck;
    return this;
  }

   /**
   * Get skipClientNameCheck
   * @return skipClientNameCheck
  **/
  @Schema(description = "")
  public Boolean isSkipClientNameCheck() {
    return skipClientNameCheck;
  }

  public void setSkipClientNameCheck(Boolean skipClientNameCheck) {
    this.skipClientNameCheck = skipClientNameCheck;
  }

  public CloseShiftPayload report(AllOfCloseShiftPayloadReport report) {
    this.report = report;
    return this;
  }

   /**
   * Get report
   * @return report
  **/
  @Schema(description = "")
  public AllOfCloseShiftPayloadReport getReport() {
    return report;
  }

  public void setReport(AllOfCloseShiftPayloadReport report) {
    this.report = report;
  }

  public CloseShiftPayload fiscalCode(String fiscalCode) {
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

  public CloseShiftPayload fiscalDate(OffsetDateTime fiscalDate) {
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
    CloseShiftPayload closeShiftPayload = (CloseShiftPayload) o;
    return Objects.equals(this.skipClientNameCheck, closeShiftPayload.skipClientNameCheck) &&
        Objects.equals(this.report, closeShiftPayload.report) &&
        Objects.equals(this.fiscalCode, closeShiftPayload.fiscalCode) &&
        Objects.equals(this.fiscalDate, closeShiftPayload.fiscalDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(skipClientNameCheck, report, fiscalCode, fiscalDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CloseShiftPayload {\n");
    
    sb.append("    skipClientNameCheck: ").append(toIndentedString(skipClientNameCheck)).append("\n");
    sb.append("    report: ").append(toIndentedString(report)).append("\n");
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
