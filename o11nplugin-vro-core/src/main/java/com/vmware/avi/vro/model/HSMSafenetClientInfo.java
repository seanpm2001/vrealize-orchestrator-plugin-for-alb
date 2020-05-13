package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;
/**
 * HSMSafenetClientInfo
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "HSMSafenetClientInfo")
@VsoFinder(name = Constants.FINDER_VRO_HSMSAFENETCLIENTINFO, idAccessor = "getObjectID()")
@Service
public class HSMSafenetClientInfo extends AviRestResource  {
  @JsonProperty("chrystoki_conf")
  private String chrystokiConf = null;

  @JsonProperty("client_cert")
  private String clientCert = null;

  @JsonProperty("client_ip")
  private String clientIp = null;

  @JsonProperty("client_priv_key")
  private String clientPrivKey = null;

  @JsonProperty("session_major_number")
  private Integer sessionMajorNumber = null;

  @JsonProperty("session_minor_number")
  private Integer sessionMinorNumber = null;

  
  /**
   * Generated File - Chrystoki.conf .
   * @return chrystokiConf
  **/
  @ApiModelProperty(value = "Generated File - Chrystoki.conf .")


 
  @VsoMethod  
  public String getChrystokiConf() {
    return chrystokiConf;
  }
    
  @VsoMethod
  public void setChrystokiConf(String chrystokiConf) {
    this.chrystokiConf = chrystokiConf;
  }

  
  /**
   * Client Certificate generated by createCert.
   * @return clientCert
  **/
  @ApiModelProperty(value = "Client Certificate generated by createCert.")


 
  @VsoMethod  
  public String getClientCert() {
    return clientCert;
  }
    
  @VsoMethod
  public void setClientCert(String clientCert) {
    this.clientCert = clientCert;
  }

  
  /**
   * Name prepended to client key and certificate filename.
   * @return clientIp
  **/
  @ApiModelProperty(required = true, value = "Name prepended to client key and certificate filename.")
  @NotNull


 
  @VsoMethod  
  public String getClientIp() {
    return clientIp;
  }
    
  @VsoMethod
  public void setClientIp(String clientIp) {
    this.clientIp = clientIp;
  }

  
  /**
   * Client Private Key generated by createCert.
   * @return clientPrivKey
  **/
  @ApiModelProperty(value = "Client Private Key generated by createCert.")


 
  @VsoMethod  
  public String getClientPrivKey() {
    return clientPrivKey;
  }
    
  @VsoMethod
  public void setClientPrivKey(String clientPrivKey) {
    this.clientPrivKey = clientPrivKey;
  }

  
  /**
   * Major number of the sesseion.
   * @return sessionMajorNumber
  **/
  @ApiModelProperty(value = "Major number of the sesseion.")


 
  @VsoMethod  
  public Integer getSessionMajorNumber() {
    return sessionMajorNumber;
  }
    
  @VsoMethod
  public void setSessionMajorNumber(Integer sessionMajorNumber) {
    this.sessionMajorNumber = sessionMajorNumber;
  }

  
  /**
   * Minor number of the sesseion.
   * @return sessionMinorNumber
  **/
  @ApiModelProperty(value = "Minor number of the sesseion.")


 
  @VsoMethod  
  public Integer getSessionMinorNumber() {
    return sessionMinorNumber;
  }
    
  @VsoMethod
  public void setSessionMinorNumber(Integer sessionMinorNumber) {
    this.sessionMinorNumber = sessionMinorNumber;
  }

  
  public String getObjectID() {
		return "HSMSafenetClientInfo";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HSMSafenetClientInfo hsMSafenetClientInfo = (HSMSafenetClientInfo) o;
    return Objects.equals(this.chrystokiConf, hsMSafenetClientInfo.chrystokiConf) &&
        Objects.equals(this.clientCert, hsMSafenetClientInfo.clientCert) &&
        Objects.equals(this.clientIp, hsMSafenetClientInfo.clientIp) &&
        Objects.equals(this.clientPrivKey, hsMSafenetClientInfo.clientPrivKey) &&
        Objects.equals(this.sessionMajorNumber, hsMSafenetClientInfo.sessionMajorNumber) &&
        Objects.equals(this.sessionMinorNumber, hsMSafenetClientInfo.sessionMinorNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(chrystokiConf, clientCert, clientIp, clientPrivKey, sessionMajorNumber, sessionMinorNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HSMSafenetClientInfo {\n");
    
    sb.append("    chrystokiConf: ").append(toIndentedString(chrystokiConf)).append("\n");
    sb.append("    clientCert: ").append(toIndentedString(clientCert)).append("\n");
    sb.append("    clientIp: ").append(toIndentedString(clientIp)).append("\n");
    sb.append("    clientPrivKey: ").append(toIndentedString(clientPrivKey)).append("\n");
    sb.append("    sessionMajorNumber: ").append(toIndentedString(sessionMajorNumber)).append("\n");
    sb.append("    sessionMinorNumber: ").append(toIndentedString(sessionMinorNumber)).append("\n");
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

