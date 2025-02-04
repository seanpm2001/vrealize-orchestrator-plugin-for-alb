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
 * The ControllerCloudLimits is a POJO class extends AviRestResource that used for creating
 * ControllerCloudLimits.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "ControllerCloudLimits")
@VsoFinder(name = Constants.FINDER_VRO_CONTROLLERCLOUDLIMITS)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class ControllerCloudLimits extends AviRestResource {
    @JsonProperty("num_clouds")
    @JsonInclude(Include.NON_NULL)
    private Integer numClouds = null;

    @JsonProperty("t1_lrs_per_cloud")
    @JsonInclude(Include.NON_NULL)
    private Integer t1LrsPerCloud = null;

    @JsonProperty("type")
    @JsonInclude(Include.NON_NULL)
    private String type = null;



  /**
   * This is the getter method this will return the attribute value.
   * Maximum number of clouds of a given type.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return numClouds
   */
  @VsoMethod
  public Integer getNumClouds() {
    return numClouds;
  }

  /**
   * This is the setter method to the attribute.
   * Maximum number of clouds of a given type.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param numClouds set the numClouds.
   */
  @VsoMethod
  public void setNumClouds(Integer  numClouds) {
    this.numClouds = numClouds;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Maximum number of tier1 logical routers allowed per cloud.
   * Field introduced in 30.2.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return t1LrsPerCloud
   */
  @VsoMethod
  public Integer getT1LrsPerCloud() {
    return t1LrsPerCloud;
  }

  /**
   * This is the setter method to the attribute.
   * Maximum number of tier1 logical routers allowed per cloud.
   * Field introduced in 30.2.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param t1LrsPerCloud set the t1LrsPerCloud.
   */
  @VsoMethod
  public void setT1LrsPerCloud(Integer  t1LrsPerCloud) {
    this.t1LrsPerCloud = t1LrsPerCloud;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Cloud type for the limit.
   * Enum options - CLOUD_NONE, CLOUD_VCENTER, CLOUD_OPENSTACK, CLOUD_AWS, CLOUD_VCA, CLOUD_APIC, CLOUD_MESOS, CLOUD_LINUXSERVER, CLOUD_DOCKER_UCP,
   * CLOUD_RANCHER, CLOUD_OSHIFT_K8S, CLOUD_AZURE, CLOUD_GCP, CLOUD_NSXT.
   * Field introduced in 20.1.1.
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
   * Cloud type for the limit.
   * Enum options - CLOUD_NONE, CLOUD_VCENTER, CLOUD_OPENSTACK, CLOUD_AWS, CLOUD_VCA, CLOUD_APIC, CLOUD_MESOS, CLOUD_LINUXSERVER, CLOUD_DOCKER_UCP,
   * CLOUD_RANCHER, CLOUD_OSHIFT_K8S, CLOUD_AZURE, CLOUD_GCP, CLOUD_NSXT.
   * Field introduced in 20.1.1.
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
  ControllerCloudLimits objControllerCloudLimits = (ControllerCloudLimits) o;
  return   Objects.equals(this.type, objControllerCloudLimits.type)&&
  Objects.equals(this.numClouds, objControllerCloudLimits.numClouds)&&
  Objects.equals(this.t1LrsPerCloud, objControllerCloudLimits.t1LrsPerCloud);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class ControllerCloudLimits {\n");
      sb.append("    numClouds: ").append(toIndentedString(numClouds)).append("\n");
        sb.append("    t1LrsPerCloud: ").append(toIndentedString(t1LrsPerCloud)).append("\n");
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

