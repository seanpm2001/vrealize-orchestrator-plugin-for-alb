package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.avi.vro.model.DsrProfile;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The TCPFastPathProfile is a POJO class extends AviRestResource that used for creating
 * TCPFastPathProfile.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "TCPFastPathProfile")
@VsoFinder(name = Constants.FINDER_VRO_TCPFASTPATHPROFILE)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class TCPFastPathProfile extends AviRestResource {
    @JsonProperty("dsr_profile")
    @JsonInclude(Include.NON_NULL)
    private DsrProfile dsrProfile = null;

    @JsonProperty("enable_syn_protection")
    @JsonInclude(Include.NON_NULL)
    private Boolean enableSynProtection = false;

    @JsonProperty("session_idle_timeout")
    @JsonInclude(Include.NON_NULL)
    private Integer sessionIdleTimeout = 300;



  /**
   * This is the getter method this will return the attribute value.
   * Dsr profile information.
   * Field introduced in 18.2.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return dsrProfile
   */
  @VsoMethod
  public DsrProfile getDsrProfile() {
    return dsrProfile;
  }

  /**
   * This is the setter method to the attribute.
   * Dsr profile information.
   * Field introduced in 18.2.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param dsrProfile set the dsrProfile.
   */
  @VsoMethod
  public void setDsrProfile(DsrProfile dsrProfile) {
    this.dsrProfile = dsrProfile;
  }

  /**
   * This is the getter method this will return the attribute value.
   * When enabled, avi will complete the 3-way handshake with the client before forwarding any packets to the server.
   * This will protect the server from syn flood and half open syn connections.
   * Allowed in enterprise edition with any value, essentials edition(allowed values- false), basic edition(allowed values- false), enterprise with
   * cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return enableSynProtection
   */
  @VsoMethod
  public Boolean getEnableSynProtection() {
    return enableSynProtection;
  }

  /**
   * This is the setter method to the attribute.
   * When enabled, avi will complete the 3-way handshake with the client before forwarding any packets to the server.
   * This will protect the server from syn flood and half open syn connections.
   * Allowed in enterprise edition with any value, essentials edition(allowed values- false), basic edition(allowed values- false), enterprise with
   * cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param enableSynProtection set the enableSynProtection.
   */
  @VsoMethod
  public void setEnableSynProtection(Boolean  enableSynProtection) {
    this.enableSynProtection = enableSynProtection;
  }

  /**
   * This is the getter method this will return the attribute value.
   * The amount of time (in sec) for which a connection needs to be idle before it is eligible to be deleted.
   * Allowed values are 5-14400.
   * Special values are 0 - infinite.
   * Unit is sec.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 300.
   * @return sessionIdleTimeout
   */
  @VsoMethod
  public Integer getSessionIdleTimeout() {
    return sessionIdleTimeout;
  }

  /**
   * This is the setter method to the attribute.
   * The amount of time (in sec) for which a connection needs to be idle before it is eligible to be deleted.
   * Allowed values are 5-14400.
   * Special values are 0 - infinite.
   * Unit is sec.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 300.
   * @param sessionIdleTimeout set the sessionIdleTimeout.
   */
  @VsoMethod
  public void setSessionIdleTimeout(Integer  sessionIdleTimeout) {
    this.sessionIdleTimeout = sessionIdleTimeout;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  TCPFastPathProfile objTCPFastPathProfile = (TCPFastPathProfile) o;
  return   Objects.equals(this.sessionIdleTimeout, objTCPFastPathProfile.sessionIdleTimeout)&&
  Objects.equals(this.enableSynProtection, objTCPFastPathProfile.enableSynProtection)&&
  Objects.equals(this.dsrProfile, objTCPFastPathProfile.dsrProfile);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class TCPFastPathProfile {\n");
      sb.append("    dsrProfile: ").append(toIndentedString(dsrProfile)).append("\n");
        sb.append("    enableSynProtection: ").append(toIndentedString(enableSynProtection)).append("\n");
        sb.append("    sessionIdleTimeout: ").append(toIndentedString(sessionIdleTimeout)).append("\n");
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

