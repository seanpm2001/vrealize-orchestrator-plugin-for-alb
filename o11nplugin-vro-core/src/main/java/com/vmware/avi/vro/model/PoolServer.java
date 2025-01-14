package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.avi.vro.model.IpAddr;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The PoolServer is a POJO class extends AviRestResource that used for creating
 * PoolServer.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "PoolServer")
@VsoFinder(name = Constants.FINDER_VRO_POOLSERVER)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class PoolServer extends AviRestResource {
    @JsonProperty("hostname")
    @JsonInclude(Include.NON_NULL)
    private String hostname = null;

    @JsonProperty("ip")
    @JsonInclude(Include.NON_NULL)
    private IpAddr ip = null;

    @JsonProperty("port")
    @JsonInclude(Include.NON_NULL)
    private Integer port = null;



  /**
   * This is the getter method this will return the attribute value.
   * Dns resolvable name of the server.
   * May be used in place of the ip address.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return hostname
   */
  @VsoMethod
  public String getHostname() {
    return hostname;
  }

  /**
   * This is the setter method to the attribute.
   * Dns resolvable name of the server.
   * May be used in place of the ip address.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param hostname set the hostname.
   */
  @VsoMethod
  public void setHostname(String  hostname) {
    this.hostname = hostname;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Ip address of the server in the poool.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return ip
   */
  @VsoMethod
  public IpAddr getIp() {
    return ip;
  }

  /**
   * This is the setter method to the attribute.
   * Ip address of the server in the poool.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param ip set the ip.
   */
  @VsoMethod
  public void setIp(IpAddr ip) {
    this.ip = ip;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Port of the pool server listening for http/https.
   * Default value is the default port in the pool.
   * Allowed values are 1-65535.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return port
   */
  @VsoMethod
  public Integer getPort() {
    return port;
  }

  /**
   * This is the setter method to the attribute.
   * Port of the pool server listening for http/https.
   * Default value is the default port in the pool.
   * Allowed values are 1-65535.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param port set the port.
   */
  @VsoMethod
  public void setPort(Integer  port) {
    this.port = port;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  PoolServer objPoolServer = (PoolServer) o;
  return   Objects.equals(this.ip, objPoolServer.ip)&&
  Objects.equals(this.hostname, objPoolServer.hostname)&&
  Objects.equals(this.port, objPoolServer.port);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class PoolServer {\n");
      sb.append("    hostname: ").append(toIndentedString(hostname)).append("\n");
        sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
        sb.append("    port: ").append(toIndentedString(port)).append("\n");
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

