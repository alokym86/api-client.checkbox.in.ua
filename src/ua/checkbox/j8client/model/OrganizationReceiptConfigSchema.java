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
import ua.checkbox.j8client.model.ShortOrganizationModel;

import java.io.IOException;
/**
 * OrganizationReceiptConfigSchema
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-11-02T14:34:29.121+02:00[Europe/Kiev]")
public class OrganizationReceiptConfigSchema {
  @SerializedName("text_global_header")
  private String textGlobalHeader = null;

  @SerializedName("text_global_footer")
  private String textGlobalFooter = null;

  @SerializedName("html_title")
  private String htmlTitle = null;

  @SerializedName("email_subject")
  private String emailSubject = null;

  @SerializedName("html_global_header")
  private String htmlGlobalHeader = null;

  @SerializedName("html_global_footer")
  private String htmlGlobalFooter = null;

  @SerializedName("html_body_style")
  private String htmlBodyStyle = null;

  @SerializedName("html_receipt_style")
  private String htmlReceiptStyle = null;

  @SerializedName("html_ruler_style")
  private String htmlRulerStyle = null;

  @SerializedName("html_light_block_style")
  private String htmlLightBlockStyle = null;

  @SerializedName("organization")
  private ShortOrganizationModel organization = null;

  public OrganizationReceiptConfigSchema textGlobalHeader(String textGlobalHeader) {
    this.textGlobalHeader = textGlobalHeader;
    return this;
  }

   /**
   * Get textGlobalHeader
   * @return textGlobalHeader
  **/
  @Schema(description = "")
  public String getTextGlobalHeader() {
    return textGlobalHeader;
  }

  public void setTextGlobalHeader(String textGlobalHeader) {
    this.textGlobalHeader = textGlobalHeader;
  }

  public OrganizationReceiptConfigSchema textGlobalFooter(String textGlobalFooter) {
    this.textGlobalFooter = textGlobalFooter;
    return this;
  }

   /**
   * Get textGlobalFooter
   * @return textGlobalFooter
  **/
  @Schema(description = "")
  public String getTextGlobalFooter() {
    return textGlobalFooter;
  }

  public void setTextGlobalFooter(String textGlobalFooter) {
    this.textGlobalFooter = textGlobalFooter;
  }

  public OrganizationReceiptConfigSchema htmlTitle(String htmlTitle) {
    this.htmlTitle = htmlTitle;
    return this;
  }

   /**
   * Get htmlTitle
   * @return htmlTitle
  **/
  @Schema(description = "")
  public String getHtmlTitle() {
    return htmlTitle;
  }

  public void setHtmlTitle(String htmlTitle) {
    this.htmlTitle = htmlTitle;
  }

  public OrganizationReceiptConfigSchema emailSubject(String emailSubject) {
    this.emailSubject = emailSubject;
    return this;
  }

   /**
   * Get emailSubject
   * @return emailSubject
  **/
  @Schema(description = "")
  public String getEmailSubject() {
    return emailSubject;
  }

  public void setEmailSubject(String emailSubject) {
    this.emailSubject = emailSubject;
  }

  public OrganizationReceiptConfigSchema htmlGlobalHeader(String htmlGlobalHeader) {
    this.htmlGlobalHeader = htmlGlobalHeader;
    return this;
  }

   /**
   * Get htmlGlobalHeader
   * @return htmlGlobalHeader
  **/
  @Schema(description = "")
  public String getHtmlGlobalHeader() {
    return htmlGlobalHeader;
  }

  public void setHtmlGlobalHeader(String htmlGlobalHeader) {
    this.htmlGlobalHeader = htmlGlobalHeader;
  }

  public OrganizationReceiptConfigSchema htmlGlobalFooter(String htmlGlobalFooter) {
    this.htmlGlobalFooter = htmlGlobalFooter;
    return this;
  }

   /**
   * Get htmlGlobalFooter
   * @return htmlGlobalFooter
  **/
  @Schema(description = "")
  public String getHtmlGlobalFooter() {
    return htmlGlobalFooter;
  }

  public void setHtmlGlobalFooter(String htmlGlobalFooter) {
    this.htmlGlobalFooter = htmlGlobalFooter;
  }

  public OrganizationReceiptConfigSchema htmlBodyStyle(String htmlBodyStyle) {
    this.htmlBodyStyle = htmlBodyStyle;
    return this;
  }

   /**
   * Get htmlBodyStyle
   * @return htmlBodyStyle
  **/
  @Schema(description = "")
  public String getHtmlBodyStyle() {
    return htmlBodyStyle;
  }

  public void setHtmlBodyStyle(String htmlBodyStyle) {
    this.htmlBodyStyle = htmlBodyStyle;
  }

  public OrganizationReceiptConfigSchema htmlReceiptStyle(String htmlReceiptStyle) {
    this.htmlReceiptStyle = htmlReceiptStyle;
    return this;
  }

   /**
   * Get htmlReceiptStyle
   * @return htmlReceiptStyle
  **/
  @Schema(description = "")
  public String getHtmlReceiptStyle() {
    return htmlReceiptStyle;
  }

  public void setHtmlReceiptStyle(String htmlReceiptStyle) {
    this.htmlReceiptStyle = htmlReceiptStyle;
  }

  public OrganizationReceiptConfigSchema htmlRulerStyle(String htmlRulerStyle) {
    this.htmlRulerStyle = htmlRulerStyle;
    return this;
  }

   /**
   * Get htmlRulerStyle
   * @return htmlRulerStyle
  **/
  @Schema(description = "")
  public String getHtmlRulerStyle() {
    return htmlRulerStyle;
  }

  public void setHtmlRulerStyle(String htmlRulerStyle) {
    this.htmlRulerStyle = htmlRulerStyle;
  }

  public OrganizationReceiptConfigSchema htmlLightBlockStyle(String htmlLightBlockStyle) {
    this.htmlLightBlockStyle = htmlLightBlockStyle;
    return this;
  }

   /**
   * Get htmlLightBlockStyle
   * @return htmlLightBlockStyle
  **/
  @Schema(description = "")
  public String getHtmlLightBlockStyle() {
    return htmlLightBlockStyle;
  }

  public void setHtmlLightBlockStyle(String htmlLightBlockStyle) {
    this.htmlLightBlockStyle = htmlLightBlockStyle;
  }

  public OrganizationReceiptConfigSchema organization(ShortOrganizationModel organization) {
    this.organization = organization;
    return this;
  }

   /**
   * Get organization
   * @return organization
  **/
  @Schema(required = true, description = "")
  public ShortOrganizationModel getOrganization() {
    return organization;
  }

  public void setOrganization(ShortOrganizationModel organization) {
    this.organization = organization;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrganizationReceiptConfigSchema organizationReceiptConfigSchema = (OrganizationReceiptConfigSchema) o;
    return Objects.equals(this.textGlobalHeader, organizationReceiptConfigSchema.textGlobalHeader) &&
        Objects.equals(this.textGlobalFooter, organizationReceiptConfigSchema.textGlobalFooter) &&
        Objects.equals(this.htmlTitle, organizationReceiptConfigSchema.htmlTitle) &&
        Objects.equals(this.emailSubject, organizationReceiptConfigSchema.emailSubject) &&
        Objects.equals(this.htmlGlobalHeader, organizationReceiptConfigSchema.htmlGlobalHeader) &&
        Objects.equals(this.htmlGlobalFooter, organizationReceiptConfigSchema.htmlGlobalFooter) &&
        Objects.equals(this.htmlBodyStyle, organizationReceiptConfigSchema.htmlBodyStyle) &&
        Objects.equals(this.htmlReceiptStyle, organizationReceiptConfigSchema.htmlReceiptStyle) &&
        Objects.equals(this.htmlRulerStyle, organizationReceiptConfigSchema.htmlRulerStyle) &&
        Objects.equals(this.htmlLightBlockStyle, organizationReceiptConfigSchema.htmlLightBlockStyle) &&
        Objects.equals(this.organization, organizationReceiptConfigSchema.organization);
  }

  @Override
  public int hashCode() {
    return Objects.hash(textGlobalHeader, textGlobalFooter, htmlTitle, emailSubject, htmlGlobalHeader, htmlGlobalFooter, htmlBodyStyle, htmlReceiptStyle, htmlRulerStyle, htmlLightBlockStyle, organization);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrganizationReceiptConfigSchema {\n");
    
    sb.append("    textGlobalHeader: ").append(toIndentedString(textGlobalHeader)).append("\n");
    sb.append("    textGlobalFooter: ").append(toIndentedString(textGlobalFooter)).append("\n");
    sb.append("    htmlTitle: ").append(toIndentedString(htmlTitle)).append("\n");
    sb.append("    emailSubject: ").append(toIndentedString(emailSubject)).append("\n");
    sb.append("    htmlGlobalHeader: ").append(toIndentedString(htmlGlobalHeader)).append("\n");
    sb.append("    htmlGlobalFooter: ").append(toIndentedString(htmlGlobalFooter)).append("\n");
    sb.append("    htmlBodyStyle: ").append(toIndentedString(htmlBodyStyle)).append("\n");
    sb.append("    htmlReceiptStyle: ").append(toIndentedString(htmlReceiptStyle)).append("\n");
    sb.append("    htmlRulerStyle: ").append(toIndentedString(htmlRulerStyle)).append("\n");
    sb.append("    htmlLightBlockStyle: ").append(toIndentedString(htmlLightBlockStyle)).append("\n");
    sb.append("    organization: ").append(toIndentedString(organization)).append("\n");
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
