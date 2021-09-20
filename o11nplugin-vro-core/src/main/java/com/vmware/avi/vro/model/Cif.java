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
 * The Cif is a POJO class extends AviRestResource that used for creating
 * Cif.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "Cif")
@VsoFinder(name = Constants.FINDER_VRO_CIF)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class Cif extends AviRestResource {
    @JsonProperty("adapter")
    @JsonInclude(Include.NON_NULL)
    private String adapter = null;

    @JsonProperty("cif")
    @JsonInclude(Include.NON_NULL)
    private String cif = null;

    @JsonProperty("mac_address")
    @JsonInclude(Include.NON_NULL)
    private String macAddress = null;

    @JsonProperty("resources")
    @JsonInclude(Include.NON_NULL)
    private List<String> resources = null;

    @JsonProperty("se_uuid")
    @JsonInclude(Include.NON_NULL)
    private String seUuid = null;



  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property adapter of obj type cif field type str  type string.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return adapter
   */
  @VsoMethod
  public String getAdapter() {
    return adapter;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property adapter of obj type cif field type str  type string.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param adapter set the adapter.
   */
  @VsoMethod
  public void setAdapter(String  adapter) {
    this.adapter = adapter;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property cif of obj type cif field type str  type string.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return cif
   */
  @VsoMethod
  public String getCif() {
    return cif;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property cif of obj type cif field type str  type string.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param cif set the cif.
   */
  @VsoMethod
  public void setCif(String  cif) {
    this.cif = cif;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property mac_address of obj type cif field type str  type string.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return macAddress
   */
  @VsoMethod
  public String getMacAddress() {
    return macAddress;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property mac_address of obj type cif field type str  type string.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param macAddress set the macAddress.
   */
  @VsoMethod
  public void setMacAddress(String  macAddress) {
    this.macAddress = macAddress;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property resources of obj type cif field type str  type array.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return resources
   */
  @VsoMethod
  public List<String> getResources() {
    return resources;
  }

  /**
   * This is the setter method. this will set the resources
   * Placeholder for description of property resources of obj type cif field type str  type array.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return resources
   */
  @VsoMethod
  public void setResources(List<String>  resources) {
    this.resources = resources;
  }

  /**
   * This is the setter method this will set the resources
   * Placeholder for description of property resources of obj type cif field type str  type array.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return resources
   */
  @VsoMethod
  public Cif addResourcesItem(String resourcesItem) {
    if (this.resources == null) {
      this.resources = new ArrayList<String>();
    }
    this.resources.add(resourcesItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Unique object identifier of se.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return seUuid
   */
  @VsoMethod
  public String getSeUuid() {
    return seUuid;
  }

  /**
   * This is the setter method to the attribute.
   * Unique object identifier of se.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param seUuid set the seUuid.
   */
  @VsoMethod
  public void setSeUuid(String  seUuid) {
    this.seUuid = seUuid;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  Cif objCif = (Cif) o;
  return   Objects.equals(this.cif, objCif.cif)&&
  Objects.equals(this.seUuid, objCif.seUuid)&&
  Objects.equals(this.macAddress, objCif.macAddress)&&
  Objects.equals(this.adapter, objCif.adapter)&&
  Objects.equals(this.resources, objCif.resources);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class Cif {\n");
      sb.append("    adapter: ").append(toIndentedString(adapter)).append("\n");
        sb.append("    cif: ").append(toIndentedString(cif)).append("\n");
        sb.append("    macAddress: ").append(toIndentedString(macAddress)).append("\n");
        sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
        sb.append("    seUuid: ").append(toIndentedString(seUuid)).append("\n");
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

