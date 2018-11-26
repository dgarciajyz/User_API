/*
 * Service_01_User_API
 * Remembranza Project is a response to the need of dealing with mental diseases in advanced ages
 *
 * OpenAPI spec version: 1.0.0
 * Contact: mjesusaz@alumnos.unex.es
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.model;


import java.util.Objects;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.Long;



import javax.validation.constraints.*;




/**
 * MementoItem
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.java.JavaJerseyServerCodegen", date = "2018-11-23T18:06:22.527Z[GMT]")
public class MementoItem   {
  
    
      
  
  @JsonProperty("id_memento")
  
  
  
  
  private Long idMemento = null;
  

  
    
      
  
  @JsonProperty("title")
  
  
  
  
  private String title = null;
  

  
    
      
  
  @JsonProperty("url_recorded_voice")
  
  
  
  
  private String urlRecordedVoice = null;
  

  
    
      
  
  @JsonProperty("x_coordinate")
  
  
  
  
  private BigDecimal xCoordinate = null;
  

  
    
      
  
  @JsonProperty("y_coordinate")
  
  
  
  
  private BigDecimal yCoordinate = null;
  

  
  
  
  public MementoItem idMemento(Long idMemento) {
    this.idMemento = idMemento;
    return this;
  }
  
  

  
  /**
  
  
   * Get idMemento
  
  
  
   * @return idMemento
   **/
 
  
  @JsonProperty("id_memento")
  
  @ApiModelProperty(example = "d290f1ee-6c54-4b01-90e6-d701748f0851", required = true, value = "")

  @NotNull

  public Long getIdMemento() {
    return idMemento;
  }
  

  public void setIdMemento(Long idMemento) {
    this.idMemento = idMemento;
  }
  

  
  
  public MementoItem title(String title) {
    this.title = title;
    return this;
  }
  
  

  
  /**
  
  
   * Get title
  
  
  
   * @return title
   **/
 
  
  @JsonProperty("title")
  
  @ApiModelProperty(example = "Rosemary's Baby", required = true, value = "")

  @NotNull

  public String getTitle() {
    return title;
  }
  

  public void setTitle(String title) {
    this.title = title;
  }
  

  
  
  public MementoItem urlRecordedVoice(String urlRecordedVoice) {
    this.urlRecordedVoice = urlRecordedVoice;
    return this;
  }
  
  

  
  /**
  
  
   * Get urlRecordedVoice
  
  
  
   * @return urlRecordedVoice
   **/
 
  
  @JsonProperty("url_recorded_voice")
  
  @ApiModelProperty(example = "rosemarysbaby.mp3", required = true, value = "")

  @NotNull

  public String getUrlRecordedVoice() {
    return urlRecordedVoice;
  }
  

  public void setUrlRecordedVoice(String urlRecordedVoice) {
    this.urlRecordedVoice = urlRecordedVoice;
  }
  

  
  
  public MementoItem xCoordinate(BigDecimal xCoordinate) {
    this.xCoordinate = xCoordinate;
    return this;
  }
  
  

  
  /**
  
  
   * Get xCoordinate
  
  
  
   * @return xCoordinate
   **/
 
  
  @JsonProperty("x_coordinate")
  
  @ApiModelProperty(example = "6.548648484", required = true, value = "")

  @NotNull

  public BigDecimal getXCoordinate() {
    return xCoordinate;
  }
  

  public void setXCoordinate(BigDecimal xCoordinate) {
    this.xCoordinate = xCoordinate;
  }
  

  
  
  public MementoItem yCoordinate(BigDecimal yCoordinate) {
    this.yCoordinate = yCoordinate;
    return this;
  }
  
  

  
  /**
  
  
   * Get yCoordinate
  
  
  
   * @return yCoordinate
   **/
 
  
  @JsonProperty("y_coordinate")
  
  @ApiModelProperty(example = "36.48484648", required = true, value = "")

  @NotNull

  public BigDecimal getYCoordinate() {
    return yCoordinate;
  }
  

  public void setYCoordinate(BigDecimal yCoordinate) {
    this.yCoordinate = yCoordinate;
  }
  

  


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MementoItem mementoItem = (MementoItem) o;
    return Objects.equals(this.idMemento, mementoItem.idMemento) &&
        Objects.equals(this.title, mementoItem.title) &&
        Objects.equals(this.urlRecordedVoice, mementoItem.urlRecordedVoice) &&
        Objects.equals(this.xCoordinate, mementoItem.xCoordinate) &&
        Objects.equals(this.yCoordinate, mementoItem.yCoordinate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idMemento, title, urlRecordedVoice, xCoordinate, yCoordinate);
  }




  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MementoItem {\n");
    
    sb.append("    idMemento: ").append(toIndentedString(idMemento)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    urlRecordedVoice: ").append(toIndentedString(urlRecordedVoice)).append("\n");
    sb.append("    xCoordinate: ").append(toIndentedString(xCoordinate)).append("\n");
    sb.append("    yCoordinate: ").append(toIndentedString(yCoordinate)).append("\n");
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



