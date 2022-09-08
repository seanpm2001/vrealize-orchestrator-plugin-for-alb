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
 * The VipAutoscalePolicy is a POJO class extends AviRestResource that used for creating
 * VipAutoscalePolicy.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "VipAutoscalePolicy")
@VsoFinder(name = Constants.FINDER_VRO_VIPAUTOSCALEPOLICY)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class VipAutoscalePolicy extends AviRestResource {
    @JsonProperty("dns_cooldown")
    @JsonInclude(Include.NON_NULL)
    private Integer dnsCooldown = 60;

    @JsonProperty("max_size")
    @JsonInclude(Include.NON_NULL)
    private Integer maxSize = 5;

    @JsonProperty("min_size")
    @JsonInclude(Include.NON_NULL)
    private Integer minSize = 1;

    @JsonProperty("suspend")
    @JsonInclude(Include.NON_NULL)
    private Boolean suspend = false;



  /**
   * This is the getter method this will return the attribute value.
   * The amount of time, in seconds, when a vip is withdrawn before a scaling activity starts.
   * Field introduced in 17.2.12, 18.1.2.
   * Unit is seconds.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 60.
   * @return dnsCooldown
   */
  @VsoMethod
  public Integer getDnsCooldown() {
    return dnsCooldown;
  }

  /**
   * This is the setter method to the attribute.
   * The amount of time, in seconds, when a vip is withdrawn before a scaling activity starts.
   * Field introduced in 17.2.12, 18.1.2.
   * Unit is seconds.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 60.
   * @param dnsCooldown set the dnsCooldown.
   */
  @VsoMethod
  public void setDnsCooldown(Integer  dnsCooldown) {
    this.dnsCooldown = dnsCooldown;
  }

  /**
   * This is the getter method this will return the attribute value.
   * The maximum size of the group.
   * Field introduced in 17.2.12, 18.1.2.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 5.
   * @return maxSize
   */
  @VsoMethod
  public Integer getMaxSize() {
    return maxSize;
  }

  /**
   * This is the setter method to the attribute.
   * The maximum size of the group.
   * Field introduced in 17.2.12, 18.1.2.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 5.
   * @param maxSize set the maxSize.
   */
  @VsoMethod
  public void setMaxSize(Integer  maxSize) {
    this.maxSize = maxSize;
  }

  /**
   * This is the getter method this will return the attribute value.
   * The minimum size of the group.
   * Field introduced in 17.2.12, 18.1.2.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 1.
   * @return minSize
   */
  @VsoMethod
  public Integer getMinSize() {
    return minSize;
  }

  /**
   * This is the setter method to the attribute.
   * The minimum size of the group.
   * Field introduced in 17.2.12, 18.1.2.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 1.
   * @param minSize set the minSize.
   */
  @VsoMethod
  public void setMinSize(Integer  minSize) {
    this.minSize = minSize;
  }

  /**
   * This is the getter method this will return the attribute value.
   * When set, scaling is suspended.
   * Field introduced in 17.2.12, 18.1.2.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return suspend
   */
  @VsoMethod
  public Boolean getSuspend() {
    return suspend;
  }

  /**
   * This is the setter method to the attribute.
   * When set, scaling is suspended.
   * Field introduced in 17.2.12, 18.1.2.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param suspend set the suspend.
   */
  @VsoMethod
  public void setSuspend(Boolean  suspend) {
    this.suspend = suspend;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  VipAutoscalePolicy objVipAutoscalePolicy = (VipAutoscalePolicy) o;
  return   Objects.equals(this.minSize, objVipAutoscalePolicy.minSize)&&
  Objects.equals(this.maxSize, objVipAutoscalePolicy.maxSize)&&
  Objects.equals(this.dnsCooldown, objVipAutoscalePolicy.dnsCooldown)&&
  Objects.equals(this.suspend, objVipAutoscalePolicy.suspend);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class VipAutoscalePolicy {\n");
      sb.append("    dnsCooldown: ").append(toIndentedString(dnsCooldown)).append("\n");
        sb.append("    maxSize: ").append(toIndentedString(maxSize)).append("\n");
        sb.append("    minSize: ").append(toIndentedString(minSize)).append("\n");
        sb.append("    suspend: ").append(toIndentedString(suspend)).append("\n");
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

