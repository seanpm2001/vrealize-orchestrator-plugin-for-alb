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
 * The ALBServicesAccountUser is a POJO class extends AviRestResource that used for creating
 * ALBServicesAccountUser.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "ALBServicesAccountUser")
@VsoFinder(name = Constants.FINDER_VRO_ALBSERVICESACCOUNTUSER)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class ALBServicesAccountUser extends AviRestResource {
    @JsonProperty("email")
    @JsonInclude(Include.NON_NULL)
    private String email = null;

    @JsonProperty("name")
    @JsonInclude(Include.NON_NULL)
    private String name = null;

    @JsonProperty("phone")
    @JsonInclude(Include.NON_NULL)
    private String phone = null;



  /**
   * This is the getter method this will return the attribute value.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return email
   */
  @VsoMethod
  public String getEmail() {
    return email;
  }

  /**
   * This is the setter method to the attribute.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param email set the email.
   */
  @VsoMethod
  public void setEmail(String  email) {
    this.email = email;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return name
   */
  @VsoMethod
  public String getName() {
    return name;
  }

  /**
   * This is the setter method to the attribute.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param name set the name.
   */
  @VsoMethod
  public void setName(String  name) {
    this.name = name;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return phone
   */
  @VsoMethod
  public String getPhone() {
    return phone;
  }

  /**
   * This is the setter method to the attribute.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param phone set the phone.
   */
  @VsoMethod
  public void setPhone(String  phone) {
    this.phone = phone;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  ALBServicesAccountUser objALBServicesAccountUser = (ALBServicesAccountUser) o;
  return   Objects.equals(this.name, objALBServicesAccountUser.name)&&
  Objects.equals(this.email, objALBServicesAccountUser.email)&&
  Objects.equals(this.phone, objALBServicesAccountUser.phone);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class ALBServicesAccountUser {\n");
      sb.append("    email: ").append(toIndentedString(email)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
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

