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
 * The SeThreshEventDetails is a POJO class extends AviRestResource that used for creating
 * SeThreshEventDetails.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "SeThreshEventDetails")
@VsoFinder(name = Constants.FINDER_VRO_SETHRESHEVENTDETAILS)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class SeThreshEventDetails extends AviRestResource {
    @JsonProperty("curr_value")
    @JsonInclude(Include.NON_NULL)
    private Integer currValue = null;

    @JsonProperty("thresh")
    @JsonInclude(Include.NON_NULL)
    private Integer thresh = null;



  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return currValue
   */
  @VsoMethod
  public Integer getCurrValue() {
    return currValue;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param currValue set the currValue.
   */
  @VsoMethod
  public void setCurrValue(Integer  currValue) {
    this.currValue = currValue;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return thresh
   */
  @VsoMethod
  public Integer getThresh() {
    return thresh;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param thresh set the thresh.
   */
  @VsoMethod
  public void setThresh(Integer  thresh) {
    this.thresh = thresh;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  SeThreshEventDetails objSeThreshEventDetails = (SeThreshEventDetails) o;
  return   Objects.equals(this.thresh, objSeThreshEventDetails.thresh)&&
  Objects.equals(this.currValue, objSeThreshEventDetails.currValue);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class SeThreshEventDetails {\n");
      sb.append("    currValue: ").append(toIndentedString(currValue)).append("\n");
        sb.append("    thresh: ").append(toIndentedString(thresh)).append("\n");
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

