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
 * The SSHSeDeployment is a POJO class extends AviRestResource that used for creating
 * SSHSeDeployment.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "SSHSeDeployment")
@VsoFinder(name = Constants.FINDER_VRO_SSHSEDEPLOYMENT)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class SSHSeDeployment extends AviRestResource {
    @JsonProperty("host_os")
    @JsonInclude(Include.NON_NULL)
    private String hostOs;

    @JsonProperty("password")
    @JsonInclude(Include.NON_NULL)
    private String password;

    @JsonProperty("ssh_user")
    @JsonInclude(Include.NON_NULL)
    private String sshUser;

    @JsonProperty("sudo_user")
    @JsonInclude(Include.NON_NULL)
    private String sudoUser;



  /**
   * This is the getter method this will return the attribute value.
   * Host os distribution e.g.
   * Coreos, ubuntu, redhat.
   * Field deprecated in 17.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * @return hostOs
   */
  @VsoMethod
  public String getHostOs() {
    return hostOs;
  }

  /**
   * This is the setter method to the attribute.
   * Host os distribution e.g.
   * Coreos, ubuntu, redhat.
   * Field deprecated in 17.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * @param hostOs set the hostOs.
   */
  @VsoMethod
  public void setHostOs(String  hostOs) {
    this.hostOs = hostOs;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Password for ssh and/or sudo.
   * Field deprecated in 17.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * @return password
   */
  @VsoMethod
  public String getPassword() {
    return password;
  }

  /**
   * This is the setter method to the attribute.
   * Password for ssh and/or sudo.
   * Field deprecated in 17.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * @param password set the password.
   */
  @VsoMethod
  public void setPassword(String  password) {
    this.password = password;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Username for ssh access to hosts.
   * Field deprecated in 17.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * @return sshUser
   */
  @VsoMethod
  public String getSshUser() {
    return sshUser;
  }

  /**
   * This is the setter method to the attribute.
   * Username for ssh access to hosts.
   * Field deprecated in 17.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * @param sshUser set the sshUser.
   */
  @VsoMethod
  public void setSshUser(String  sshUser) {
    this.sshUser = sshUser;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Username for sudo.
   * Field deprecated in 17.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * @return sudoUser
   */
  @VsoMethod
  public String getSudoUser() {
    return sudoUser;
  }

  /**
   * This is the setter method to the attribute.
   * Username for sudo.
   * Field deprecated in 17.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * @param sudoUser set the sudoUser.
   */
  @VsoMethod
  public void setSudoUser(String  sudoUser) {
    this.sudoUser = sudoUser;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  SSHSeDeployment objSSHSeDeployment = (SSHSeDeployment) o;
  return   Objects.equals(this.sshUser, objSSHSeDeployment.sshUser)&&
  Objects.equals(this.sudoUser, objSSHSeDeployment.sudoUser)&&
  Objects.equals(this.password, objSSHSeDeployment.password)&&
  Objects.equals(this.hostOs, objSSHSeDeployment.hostOs);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class SSHSeDeployment {\n");
      sb.append("    hostOs: ").append(toIndentedString(hostOs)).append("\n");
        sb.append("    password: ").append(toIndentedString(password)).append("\n");
        sb.append("    sshUser: ").append(toIndentedString(sshUser)).append("\n");
        sb.append("    sudoUser: ").append(toIndentedString(sudoUser)).append("\n");
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

