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
 * The FailActionBackupPool is a POJO class extends AviRestResource that used for creating
 * FailActionBackupPool.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "FailActionBackupPool")
@VsoFinder(name = Constants.FINDER_VRO_FAILACTIONBACKUPPOOL)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class FailActionBackupPool extends AviRestResource {
    @JsonProperty("backup_pool_ref")
    @JsonInclude(Include.NON_NULL)
    private String backupPoolRef = null;



  /**
   * This is the getter method this will return the attribute value.
   * Specifies the uuid of the pool acting as backup pool.
   * It is a reference to an object of type pool.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return backupPoolRef
   */
  @VsoMethod
  public String getBackupPoolRef() {
    return backupPoolRef;
  }

  /**
   * This is the setter method to the attribute.
   * Specifies the uuid of the pool acting as backup pool.
   * It is a reference to an object of type pool.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param backupPoolRef set the backupPoolRef.
   */
  @VsoMethod
  public void setBackupPoolRef(String  backupPoolRef) {
    this.backupPoolRef = backupPoolRef;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  FailActionBackupPool objFailActionBackupPool = (FailActionBackupPool) o;
  return   Objects.equals(this.backupPoolRef, objFailActionBackupPool.backupPoolRef);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class FailActionBackupPool {\n");
      sb.append("    backupPoolRef: ").append(toIndentedString(backupPoolRef)).append("\n");
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

