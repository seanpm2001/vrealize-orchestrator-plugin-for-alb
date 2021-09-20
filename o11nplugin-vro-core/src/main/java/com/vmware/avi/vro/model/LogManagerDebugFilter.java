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
 * The LogManagerDebugFilter is a POJO class extends AviRestResource that used for creating
 * LogManagerDebugFilter.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "LogManagerDebugFilter")
@VsoFinder(name = Constants.FINDER_VRO_LOGMANAGERDEBUGFILTER)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class LogManagerDebugFilter extends AviRestResource {
    @JsonProperty("entity_ref")
    @JsonInclude(Include.NON_NULL)
    private String entityRef = null;



  /**
   * This is the getter method this will return the attribute value.
   * Uuid of the entity.
   * It is a reference to an object of type virtualservice.
   * Field introduced in 20.1.7.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return entityRef
   */
  @VsoMethod
  public String getEntityRef() {
    return entityRef;
  }

  /**
   * This is the setter method to the attribute.
   * Uuid of the entity.
   * It is a reference to an object of type virtualservice.
   * Field introduced in 20.1.7.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param entityRef set the entityRef.
   */
  @VsoMethod
  public void setEntityRef(String  entityRef) {
    this.entityRef = entityRef;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  LogManagerDebugFilter objLogManagerDebugFilter = (LogManagerDebugFilter) o;
  return   Objects.equals(this.entityRef, objLogManagerDebugFilter.entityRef);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class LogManagerDebugFilter {\n");
      sb.append("    entityRef: ").append(toIndentedString(entityRef)).append("\n");
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

