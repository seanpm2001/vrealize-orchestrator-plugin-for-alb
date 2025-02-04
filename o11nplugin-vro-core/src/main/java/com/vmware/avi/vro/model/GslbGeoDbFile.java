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
 * The GslbGeoDbFile is a POJO class extends AviRestResource that used for creating
 * GslbGeoDbFile.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "GslbGeoDbFile")
@VsoFinder(name = Constants.FINDER_VRO_GSLBGEODBFILE)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class GslbGeoDbFile extends AviRestResource {
    @JsonProperty("checksum")
    @JsonInclude(Include.NON_NULL)
    private String checksum;

    @JsonProperty("file_id")
    @JsonInclude(Include.NON_NULL)
    private String fileId;

    @JsonProperty("filename")
    @JsonInclude(Include.NON_NULL)
    private String filename = null;

    @JsonProperty("format")
    @JsonInclude(Include.NON_NULL)
    private String format = "GSLB_GEODB_FILE_FORMAT_AVI";

    @JsonProperty("timestamp")
    @JsonInclude(Include.NON_NULL)
    private Integer timestamp;



  /**
   * This is the getter method this will return the attribute value.
   * File checksum is internally computed.
   * Field introduced in 17.1.1.
   * Allowed in enterprise edition with any value, essentials edition with any value, basic edition with any value, enterprise with cloud services
   * edition.
   * @return checksum
   */
  @VsoMethod
  public String getChecksum() {
    return checksum;
  }

  /**
   * This is the setter method to the attribute.
   * File checksum is internally computed.
   * Field introduced in 17.1.1.
   * Allowed in enterprise edition with any value, essentials edition with any value, basic edition with any value, enterprise with cloud services
   * edition.
   * @param checksum set the checksum.
   */
  @VsoMethod
  public void setChecksum(String  checksum) {
    this.checksum = checksum;
  }

  /**
   * This is the getter method this will return the attribute value.
   * System internal identifier for the file.
   * Field introduced in 17.1.1.
   * Allowed in enterprise edition with any value, essentials edition with any value, basic edition with any value, enterprise with cloud services
   * edition.
   * @return fileId
   */
  @VsoMethod
  public String getFileId() {
    return fileId;
  }

  /**
   * This is the setter method to the attribute.
   * System internal identifier for the file.
   * Field introduced in 17.1.1.
   * Allowed in enterprise edition with any value, essentials edition with any value, basic edition with any value, enterprise with cloud services
   * edition.
   * @param fileId set the fileId.
   */
  @VsoMethod
  public void setFileId(String  fileId) {
    this.fileId = fileId;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Geodb filename in the avi supported formats.
   * Field introduced in 17.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return filename
   */
  @VsoMethod
  public String getFilename() {
    return filename;
  }

  /**
   * This is the setter method to the attribute.
   * Geodb filename in the avi supported formats.
   * Field introduced in 17.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param filename set the filename.
   */
  @VsoMethod
  public void setFilename(String  filename) {
    this.filename = filename;
  }

  /**
   * This is the getter method this will return the attribute value.
   * This field indicates the file format.
   * Enum options - GSLB_GEODB_FILE_FORMAT_AVI, GSLB_GEODB_FILE_FORMAT_MAXMIND_CITY, GSLB_GEODB_FILE_FORMAT_MAXMIND_CITY_V6,
   * GSLB_GEODB_FILE_FORMAT_MAXMIND_CITY_V4_AND_V6, GSLB_GEODB_FILE_FORMAT_AVI_V6, GSLB_GEODB_FILE_FORMAT_AVI_V4_AND_V6.
   * Field introduced in 17.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as "GSLB_GEODB_FILE_FORMAT_AVI".
   * @return format
   */
  @VsoMethod
  public String getFormat() {
    return format;
  }

  /**
   * This is the setter method to the attribute.
   * This field indicates the file format.
   * Enum options - GSLB_GEODB_FILE_FORMAT_AVI, GSLB_GEODB_FILE_FORMAT_MAXMIND_CITY, GSLB_GEODB_FILE_FORMAT_MAXMIND_CITY_V6,
   * GSLB_GEODB_FILE_FORMAT_MAXMIND_CITY_V4_AND_V6, GSLB_GEODB_FILE_FORMAT_AVI_V6, GSLB_GEODB_FILE_FORMAT_AVI_V4_AND_V6.
   * Field introduced in 17.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as "GSLB_GEODB_FILE_FORMAT_AVI".
   * @param format set the format.
   */
  @VsoMethod
  public void setFormat(String  format) {
    this.format = format;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Internal timestamp associated with the file.
   * Field introduced in 17.1.1.
   * Allowed in enterprise edition with any value, essentials edition with any value, basic edition with any value, enterprise with cloud services
   * edition.
   * @return timestamp
   */
  @VsoMethod
  public Integer getTimestamp() {
    return timestamp;
  }

  /**
   * This is the setter method to the attribute.
   * Internal timestamp associated with the file.
   * Field introduced in 17.1.1.
   * Allowed in enterprise edition with any value, essentials edition with any value, basic edition with any value, enterprise with cloud services
   * edition.
   * @param timestamp set the timestamp.
   */
  @VsoMethod
  public void setTimestamp(Integer  timestamp) {
    this.timestamp = timestamp;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  GslbGeoDbFile objGslbGeoDbFile = (GslbGeoDbFile) o;
  return   Objects.equals(this.filename, objGslbGeoDbFile.filename)&&
  Objects.equals(this.format, objGslbGeoDbFile.format)&&
  Objects.equals(this.timestamp, objGslbGeoDbFile.timestamp)&&
  Objects.equals(this.checksum, objGslbGeoDbFile.checksum)&&
  Objects.equals(this.fileId, objGslbGeoDbFile.fileId);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class GslbGeoDbFile {\n");
      sb.append("    checksum: ").append(toIndentedString(checksum)).append("\n");
        sb.append("    fileId: ").append(toIndentedString(fileId)).append("\n");
        sb.append("    filename: ").append(toIndentedString(filename)).append("\n");
        sb.append("    format: ").append(toIndentedString(format)).append("\n");
        sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
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

