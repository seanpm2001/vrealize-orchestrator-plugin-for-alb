package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The DnsSrvRdata is a POJO class extends AviRestResource that used for creating
 * DnsSrvRdata.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "DnsSrvRdata")
@VsoFinder(name = Constants.FINDER_VRO_DNSSRVRDATA)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class DnsSrvRdata extends AviRestResource {
    @JsonProperty("port")
    @JsonInclude(Include.NON_NULL)
    private Integer port = null;

    @JsonProperty("priority")
    @JsonInclude(Include.NON_NULL)
    private Integer priority = 0;

    @JsonProperty("target")
    @JsonInclude(Include.NON_NULL)
    private String target = "default.host";

    @JsonProperty("weight")
    @JsonInclude(Include.NON_NULL)
    private Integer weight = 0;



  /**
   * This is the getter method this will return the attribute value.
   * Service port.
   * Allowed values are 0-65535.
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
   * Service port.
   * Allowed values are 0-65535.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param port set the port.
   */
  @VsoMethod
  public void setPort(Integer  port) {
    this.port = port;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Priority of the target hosting the service, low value implies higher priority for this service record.
   * Allowed values are 0-65535.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 0.
   * @return priority
   */
  @VsoMethod
  public Integer getPriority() {
    return priority;
  }

  /**
   * This is the setter method to the attribute.
   * Priority of the target hosting the service, low value implies higher priority for this service record.
   * Allowed values are 0-65535.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 0.
   * @param priority set the priority.
   */
  @VsoMethod
  public void setPriority(Integer  priority) {
    this.priority = priority;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Canonical hostname, of the machine hosting the service, with no trailing period.
   * 'default.host' is valid but not 'default.host.'.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as "default.host".
   * @return target
   */
  @VsoMethod
  public String getTarget() {
    return target;
  }

  /**
   * This is the setter method to the attribute.
   * Canonical hostname, of the machine hosting the service, with no trailing period.
   * 'default.host' is valid but not 'default.host.'.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as "default.host".
   * @param target set the target.
   */
  @VsoMethod
  public void setTarget(String  target) {
    this.target = target;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Relative weight for service records with same priority, high value implies higher preference for this service record.
   * Allowed values are 0-65535.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 0.
   * @return weight
   */
  @VsoMethod
  public Integer getWeight() {
    return weight;
  }

  /**
   * This is the setter method to the attribute.
   * Relative weight for service records with same priority, high value implies higher preference for this service record.
   * Allowed values are 0-65535.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 0.
   * @param weight set the weight.
   */
  @VsoMethod
  public void setWeight(Integer  weight) {
    this.weight = weight;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  DnsSrvRdata objDnsSrvRdata = (DnsSrvRdata) o;
  return   Objects.equals(this.priority, objDnsSrvRdata.priority)&&
  Objects.equals(this.weight, objDnsSrvRdata.weight)&&
  Objects.equals(this.target, objDnsSrvRdata.target)&&
  Objects.equals(this.port, objDnsSrvRdata.port);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class DnsSrvRdata {\n");
      sb.append("    port: ").append(toIndentedString(port)).append("\n");
        sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
        sb.append("    target: ").append(toIndentedString(target)).append("\n");
        sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
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

