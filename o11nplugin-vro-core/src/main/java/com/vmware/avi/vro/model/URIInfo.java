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
 * The URIInfo is a POJO class extends AviRestResource that used for creating
 * URIInfo.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "URIInfo")
@VsoFinder(name = Constants.FINDER_VRO_URIINFO)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class URIInfo extends AviRestResource {
    @JsonProperty("param_info")
    @JsonInclude(Include.NON_NULL)
    private List<ParamInfo> paramInfo = null;

    @JsonProperty("uri_hits")
    @JsonInclude(Include.NON_NULL)
    private Integer uriHits = null;

    @JsonProperty("uri_key")
    @JsonInclude(Include.NON_NULL)
    private String uriKey = null;



  /**
   * This is the getter method this will return the attribute value.
   * Information about various params under a uri.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return paramInfo
   */
  @VsoMethod
  public List<ParamInfo> getParamInfo() {
    return paramInfo;
  }

  /**
   * This is the setter method. this will set the paramInfo
   * Information about various params under a uri.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return paramInfo
   */
  @VsoMethod
  public void setParamInfo(List<ParamInfo>  paramInfo) {
    this.paramInfo = paramInfo;
  }

  /**
   * This is the setter method this will set the paramInfo
   * Information about various params under a uri.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return paramInfo
   */
  @VsoMethod
  public URIInfo addParamInfoItem(ParamInfo paramInfoItem) {
    if (this.paramInfo == null) {
      this.paramInfo = new ArrayList<ParamInfo>();
    }
    this.paramInfo.add(paramInfoItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Total number of uri hits.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return uriHits
   */
  @VsoMethod
  public Integer getUriHits() {
    return uriHits;
  }

  /**
   * This is the setter method to the attribute.
   * Total number of uri hits.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param uriHits set the uriHits.
   */
  @VsoMethod
  public void setUriHits(Integer  uriHits) {
    this.uriHits = uriHits;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Uri name.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return uriKey
   */
  @VsoMethod
  public String getUriKey() {
    return uriKey;
  }

  /**
   * This is the setter method to the attribute.
   * Uri name.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param uriKey set the uriKey.
   */
  @VsoMethod
  public void setUriKey(String  uriKey) {
    this.uriKey = uriKey;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  URIInfo objURIInfo = (URIInfo) o;
  return   Objects.equals(this.uriHits, objURIInfo.uriHits)&&
  Objects.equals(this.uriKey, objURIInfo.uriKey)&&
  Objects.equals(this.paramInfo, objURIInfo.paramInfo);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class URIInfo {\n");
      sb.append("    paramInfo: ").append(toIndentedString(paramInfo)).append("\n");
        sb.append("    uriHits: ").append(toIndentedString(uriHits)).append("\n");
        sb.append("    uriKey: ").append(toIndentedString(uriKey)).append("\n");
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

