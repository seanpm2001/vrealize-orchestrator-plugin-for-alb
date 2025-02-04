package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.avi.vro.model.TimeStamp;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The GslbDnsGsStatus is a POJO class extends AviRestResource that used for creating
 * GslbDnsGsStatus.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "GslbDnsGsStatus")
@VsoFinder(name = Constants.FINDER_VRO_GSLBDNSGSSTATUS)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class GslbDnsGsStatus extends AviRestResource {
    @JsonProperty("last_changed_time")
    @JsonInclude(Include.NON_NULL)
    private TimeStamp lastChangedTime = null;

    @JsonProperty("num_partial_updates")
    @JsonInclude(Include.NON_NULL)
    private Integer numPartialUpdates = null;

    @JsonProperty("partial_update_threshold")
    @JsonInclude(Include.NON_NULL)
    private Integer partialUpdateThreshold = 10;

    @JsonProperty("state")
    @JsonInclude(Include.NON_NULL)
    private String state = null;

    @JsonProperty("type")
    @JsonInclude(Include.NON_NULL)
    private String type = null;



  /**
   * This is the getter method this will return the attribute value.
   * Field introduced in 17.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return lastChangedTime
   */
  @VsoMethod
  public TimeStamp getLastChangedTime() {
    return lastChangedTime;
  }

  /**
   * This is the setter method to the attribute.
   * Field introduced in 17.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param lastChangedTime set the lastChangedTime.
   */
  @VsoMethod
  public void setLastChangedTime(TimeStamp lastChangedTime) {
    this.lastChangedTime = lastChangedTime;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Counter to track the number of partial updates sent.
   * Once it reaches the partial updates threshold, a full update is sent.
   * Field introduced in 17.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return numPartialUpdates
   */
  @VsoMethod
  public Integer getNumPartialUpdates() {
    return numPartialUpdates;
  }

  /**
   * This is the setter method to the attribute.
   * Counter to track the number of partial updates sent.
   * Once it reaches the partial updates threshold, a full update is sent.
   * Field introduced in 17.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param numPartialUpdates set the numPartialUpdates.
   */
  @VsoMethod
  public void setNumPartialUpdates(Integer  numPartialUpdates) {
    this.numPartialUpdates = numPartialUpdates;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Threshold after which a full gs status is sent.
   * Field introduced in 17.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 10.
   * @return partialUpdateThreshold
   */
  @VsoMethod
  public Integer getPartialUpdateThreshold() {
    return partialUpdateThreshold;
  }

  /**
   * This is the setter method to the attribute.
   * Threshold after which a full gs status is sent.
   * Field introduced in 17.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 10.
   * @param partialUpdateThreshold set the partialUpdateThreshold.
   */
  @VsoMethod
  public void setPartialUpdateThreshold(Integer  partialUpdateThreshold) {
    this.partialUpdateThreshold = partialUpdateThreshold;
  }

  /**
   * This is the getter method this will return the attribute value.
   * State variable to trigger full or partial update.
   * Enum options - GSLB_FULL_UPDATE_PENDING, GSLB_PARTIAL_UPDATE_PENDING.
   * Field introduced in 17.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return state
   */
  @VsoMethod
  public String getState() {
    return state;
  }

  /**
   * This is the setter method to the attribute.
   * State variable to trigger full or partial update.
   * Enum options - GSLB_FULL_UPDATE_PENDING, GSLB_PARTIAL_UPDATE_PENDING.
   * Field introduced in 17.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param state set the state.
   */
  @VsoMethod
  public void setState(String  state) {
    this.state = state;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Describes the type (partial/full) of the last gs status sent to dns-vs(es).
   * Enum options - GSLB_NO_UPDATE, GSLB_FULL_UPDATE, GSLB_PARTIAL_UPDATE.
   * Field introduced in 17.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return type
   */
  @VsoMethod
  public String getType() {
    return type;
  }

  /**
   * This is the setter method to the attribute.
   * Describes the type (partial/full) of the last gs status sent to dns-vs(es).
   * Enum options - GSLB_NO_UPDATE, GSLB_FULL_UPDATE, GSLB_PARTIAL_UPDATE.
   * Field introduced in 17.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param type set the type.
   */
  @VsoMethod
  public void setType(String  type) {
    this.type = type;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  GslbDnsGsStatus objGslbDnsGsStatus = (GslbDnsGsStatus) o;
  return   Objects.equals(this.type, objGslbDnsGsStatus.type)&&
  Objects.equals(this.lastChangedTime, objGslbDnsGsStatus.lastChangedTime)&&
  Objects.equals(this.state, objGslbDnsGsStatus.state)&&
  Objects.equals(this.numPartialUpdates, objGslbDnsGsStatus.numPartialUpdates)&&
  Objects.equals(this.partialUpdateThreshold, objGslbDnsGsStatus.partialUpdateThreshold);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class GslbDnsGsStatus {\n");
      sb.append("    lastChangedTime: ").append(toIndentedString(lastChangedTime)).append("\n");
        sb.append("    numPartialUpdates: ").append(toIndentedString(numPartialUpdates)).append("\n");
        sb.append("    partialUpdateThreshold: ").append(toIndentedString(partialUpdateThreshold)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

