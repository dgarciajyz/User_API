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
import java.util.UUID;



import javax.validation.constraints.*;




/**
 * DestinationItem
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.java.JavaJerseyServerCodegen", date = "2018-11-23T18:06:22.527Z[GMT]")
public class DestinationItem   {
  
    
      
  
  @JsonProperty("id_destination")
  
  
  
  
  private UUID idDestination = null;
  

  
    
      
  
  @JsonProperty("denomination")
  
  
  
  
  private String denomination = null;
  

  
    
      
  
  @JsonProperty("x_coordinate")
  
  
  
  
  private BigDecimal xCoordinate = null;
  

  
    
      
  
  @JsonProperty("y_coordinate")
  
  
  
  
  private BigDecimal yCoordinate = null;
  

  
  
  
  public DestinationItem idDestination(UUID idDestination) {
    this.idDestination = idDestination;
    return this;
  }
  
  

  
  /**
  
  
   * Get idDestination
  
  
  
   * @return idDestination
   **/
 
  
  @JsonProperty("id_destination")
  
  @ApiModelProperty(example = "d290f1ee-6c54-4b01-90e6-d701748f0851", required = true, value = "")

  @NotNull

  public UUID getIdDestination() {
    return idDestination;
  }
  

  public void setIdDestination(UUID idDestination) {
    this.idDestination = idDestination;
  }
  

  
  
  public DestinationItem denomination(String denomination) {
    this.denomination = denomination;
    return this;
  }
  
  

  
  /**
  
  
   * Get denomination
  
  
  
   * @return denomination
   **/
 
  
  @JsonProperty("denomination")
  
  @ApiModelProperty(example = "Rosemary's House", required = true, value = "")

  @NotNull

  public String getDenomination() {
    return denomination;
  }
  

  public void setDenomination(String denomination) {
    this.denomination = denomination;
  }
  

  
  
  public DestinationItem xCoordinate(BigDecimal xCoordinate) {
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
  

  
  
  public DestinationItem yCoordinate(BigDecimal yCoordinate) {
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
    DestinationItem destinationItem = (DestinationItem) o;
    return Objects.equals(this.idDestination, destinationItem.idDestination) &&
        Objects.equals(this.denomination, destinationItem.denomination) &&
        Objects.equals(this.xCoordinate, destinationItem.xCoordinate) &&
        Objects.equals(this.yCoordinate, destinationItem.yCoordinate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idDestination, denomination, xCoordinate, yCoordinate);
  }




  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DestinationItem {\n");
    
    sb.append("    idDestination: ").append(toIndentedString(idDestination)).append("\n");
    sb.append("    denomination: ").append(toIndentedString(denomination)).append("\n");
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


