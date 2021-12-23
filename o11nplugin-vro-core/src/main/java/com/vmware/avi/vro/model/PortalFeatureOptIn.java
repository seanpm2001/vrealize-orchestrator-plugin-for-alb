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
 * The PortalFeatureOptIn is a POJO class extends AviRestResource that used for creating
 * PortalFeatureOptIn.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "PortalFeatureOptIn")
@VsoFinder(name = Constants.FINDER_VRO_PORTALFEATUREOPTIN)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class PortalFeatureOptIn extends AviRestResource {
    @JsonProperty("enable_appsignature_sync")
    @JsonInclude(Include.NON_NULL)
    private Boolean enableAppsignatureSync = false;

    @JsonProperty("enable_auto_case_creation_on_se_failure")
    @JsonInclude(Include.NON_NULL)
    private Boolean enableAutoCaseCreationOnSeFailure;

    @JsonProperty("enable_auto_case_creation_on_system_failure")
    @JsonInclude(Include.NON_NULL)
    private Boolean enableAutoCaseCreationOnSystemFailure;

    @JsonProperty("enable_auto_download_waf_signatures")
    @JsonInclude(Include.NON_NULL)
    private Boolean enableAutoDownloadWafSignatures;

    @JsonProperty("enable_ip_reputation")
    @JsonInclude(Include.NON_NULL)
    private Boolean enableIpReputation = false;

    @JsonProperty("enable_pulse_case_management")
    @JsonInclude(Include.NON_NULL)
    private Boolean enablePulseCaseManagement;

    @JsonProperty("enable_pulse_waf_management")
    @JsonInclude(Include.NON_NULL)
    private Boolean enablePulseWafManagement;

    @JsonProperty("enable_user_agent_db_sync")
    @JsonInclude(Include.NON_NULL)
    private Boolean enableUserAgentDbSync = false;

    @JsonProperty("enable_waf_signatures_notifications")
    @JsonInclude(Include.NON_NULL)
    private Boolean enableWafSignaturesNotifications;



  /**
   * This is the getter method this will return the attribute value.
   * Enable to receive application specific signature updates.
   * Field introduced in 20.1.4.
   * Allowed in basic(allowed values- false) edition, essentials(allowed values- false) edition, enterprise(allowed values- false) edition, enterprise
   * edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return enableAppsignatureSync
   */
  @VsoMethod
  public Boolean getEnableAppsignatureSync() {
    return enableAppsignatureSync;
  }

  /**
   * This is the setter method to the attribute.
   * Enable to receive application specific signature updates.
   * Field introduced in 20.1.4.
   * Allowed in basic(allowed values- false) edition, essentials(allowed values- false) edition, enterprise(allowed values- false) edition, enterprise
   * edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param enableAppsignatureSync set the enableAppsignatureSync.
   */
  @VsoMethod
  public void setEnableAppsignatureSync(Boolean  enableAppsignatureSync) {
    this.enableAppsignatureSync = enableAppsignatureSync;
  }

  /**
   * This is the getter method this will return the attribute value.
   * This field is deprecated.
   * Field deprecated in 21.1.1.
   * Field introduced in 20.1.1.
   * Allowed in basic(allowed values- false) edition, essentials(allowed values- false) edition, enterprise edition.
   * @return enableAutoCaseCreationOnSeFailure
   */
  @VsoMethod
  public Boolean getEnableAutoCaseCreationOnSeFailure() {
    return enableAutoCaseCreationOnSeFailure;
  }

  /**
   * This is the setter method to the attribute.
   * This field is deprecated.
   * Field deprecated in 21.1.1.
   * Field introduced in 20.1.1.
   * Allowed in basic(allowed values- false) edition, essentials(allowed values- false) edition, enterprise edition.
   * @param enableAutoCaseCreationOnSeFailure set the enableAutoCaseCreationOnSeFailure.
   */
  @VsoMethod
  public void setEnableAutoCaseCreationOnSeFailure(Boolean  enableAutoCaseCreationOnSeFailure) {
    this.enableAutoCaseCreationOnSeFailure = enableAutoCaseCreationOnSeFailure;
  }

  /**
   * This is the getter method this will return the attribute value.
   * This field is deprecated.
   * Field deprecated in 21.1.1.
   * Field introduced in 20.1.1.
   * Allowed in basic(allowed values- false) edition, essentials(allowed values- false) edition, enterprise edition.
   * @return enableAutoCaseCreationOnSystemFailure
   */
  @VsoMethod
  public Boolean getEnableAutoCaseCreationOnSystemFailure() {
    return enableAutoCaseCreationOnSystemFailure;
  }

  /**
   * This is the setter method to the attribute.
   * This field is deprecated.
   * Field deprecated in 21.1.1.
   * Field introduced in 20.1.1.
   * Allowed in basic(allowed values- false) edition, essentials(allowed values- false) edition, enterprise edition.
   * @param enableAutoCaseCreationOnSystemFailure set the enableAutoCaseCreationOnSystemFailure.
   */
  @VsoMethod
  public void setEnableAutoCaseCreationOnSystemFailure(Boolean  enableAutoCaseCreationOnSystemFailure) {
    this.enableAutoCaseCreationOnSystemFailure = enableAutoCaseCreationOnSystemFailure;
  }

  /**
   * This is the getter method this will return the attribute value.
   * This field is deprecated.
   * Field deprecated in 21.1.1.
   * Field introduced in 20.1.1.
   * Allowed in basic(allowed values- false) edition, essentials(allowed values- false) edition, enterprise edition.
   * @return enableAutoDownloadWafSignatures
   */
  @VsoMethod
  public Boolean getEnableAutoDownloadWafSignatures() {
    return enableAutoDownloadWafSignatures;
  }

  /**
   * This is the setter method to the attribute.
   * This field is deprecated.
   * Field deprecated in 21.1.1.
   * Field introduced in 20.1.1.
   * Allowed in basic(allowed values- false) edition, essentials(allowed values- false) edition, enterprise edition.
   * @param enableAutoDownloadWafSignatures set the enableAutoDownloadWafSignatures.
   */
  @VsoMethod
  public void setEnableAutoDownloadWafSignatures(Boolean  enableAutoDownloadWafSignatures) {
    this.enableAutoDownloadWafSignatures = enableAutoDownloadWafSignatures;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Enable to receive ip reputation updates.
   * Field introduced in 20.1.1.
   * Allowed in basic(allowed values- false) edition, essentials(allowed values- false) edition, enterprise(allowed values- false) edition, enterprise
   * edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return enableIpReputation
   */
  @VsoMethod
  public Boolean getEnableIpReputation() {
    return enableIpReputation;
  }

  /**
   * This is the setter method to the attribute.
   * Enable to receive ip reputation updates.
   * Field introduced in 20.1.1.
   * Allowed in basic(allowed values- false) edition, essentials(allowed values- false) edition, enterprise(allowed values- false) edition, enterprise
   * edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param enableIpReputation set the enableIpReputation.
   */
  @VsoMethod
  public void setEnableIpReputation(Boolean  enableIpReputation) {
    this.enableIpReputation = enableIpReputation;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Enable pulse case management.
   * Field introduced in 21.1.1.
   * Allowed in basic(allowed values- false) edition, essentials(allowed values- false) edition, enterprise(allowed values- false) edition, enterprise
   * edition.
   * Special default for basic edition is false, essentials edition is false, enterprise edition is false, enterprise is true.
   * @return enablePulseCaseManagement
   */
  @VsoMethod
  public Boolean getEnablePulseCaseManagement() {
    return enablePulseCaseManagement;
  }

  /**
   * This is the setter method to the attribute.
   * Enable pulse case management.
   * Field introduced in 21.1.1.
   * Allowed in basic(allowed values- false) edition, essentials(allowed values- false) edition, enterprise(allowed values- false) edition, enterprise
   * edition.
   * Special default for basic edition is false, essentials edition is false, enterprise edition is false, enterprise is true.
   * @param enablePulseCaseManagement set the enablePulseCaseManagement.
   */
  @VsoMethod
  public void setEnablePulseCaseManagement(Boolean  enablePulseCaseManagement) {
    this.enablePulseCaseManagement = enablePulseCaseManagement;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Enable to receive waf crs updates.
   * Field introduced in 21.1.1.
   * Allowed in basic(allowed values- false) edition, essentials(allowed values- false) edition, enterprise(allowed values- false) edition, enterprise
   * edition.
   * Special default for basic edition is false, essentials edition is false, enterprise edition is false, enterprise is true.
   * @return enablePulseWafManagement
   */
  @VsoMethod
  public Boolean getEnablePulseWafManagement() {
    return enablePulseWafManagement;
  }

  /**
   * This is the setter method to the attribute.
   * Enable to receive waf crs updates.
   * Field introduced in 21.1.1.
   * Allowed in basic(allowed values- false) edition, essentials(allowed values- false) edition, enterprise(allowed values- false) edition, enterprise
   * edition.
   * Special default for basic edition is false, essentials edition is false, enterprise edition is false, enterprise is true.
   * @param enablePulseWafManagement set the enablePulseWafManagement.
   */
  @VsoMethod
  public void setEnablePulseWafManagement(Boolean  enablePulseWafManagement) {
    this.enablePulseWafManagement = enablePulseWafManagement;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Enable to receive bot management updates.
   * Field introduced in 21.1.1.
   * Allowed in basic(allowed values- false) edition, essentials(allowed values- false) edition, enterprise edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return enableUserAgentDbSync
   */
  @VsoMethod
  public Boolean getEnableUserAgentDbSync() {
    return enableUserAgentDbSync;
  }

  /**
   * This is the setter method to the attribute.
   * Enable to receive bot management updates.
   * Field introduced in 21.1.1.
   * Allowed in basic(allowed values- false) edition, essentials(allowed values- false) edition, enterprise edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param enableUserAgentDbSync set the enableUserAgentDbSync.
   */
  @VsoMethod
  public void setEnableUserAgentDbSync(Boolean  enableUserAgentDbSync) {
    this.enableUserAgentDbSync = enableUserAgentDbSync;
  }

  /**
   * This is the getter method this will return the attribute value.
   * This field is deprecated.
   * Field deprecated in 21.1.1.
   * Field introduced in 20.1.1.
   * Allowed in basic(allowed values- false) edition, essentials(allowed values- false) edition, enterprise(allowed values- false) edition, enterprise
   * edition.
   * Special default for basic edition is false, essentials edition is false, enterprise edition is false.
   * @return enableWafSignaturesNotifications
   */
  @VsoMethod
  public Boolean getEnableWafSignaturesNotifications() {
    return enableWafSignaturesNotifications;
  }

  /**
   * This is the setter method to the attribute.
   * This field is deprecated.
   * Field deprecated in 21.1.1.
   * Field introduced in 20.1.1.
   * Allowed in basic(allowed values- false) edition, essentials(allowed values- false) edition, enterprise(allowed values- false) edition, enterprise
   * edition.
   * Special default for basic edition is false, essentials edition is false, enterprise edition is false.
   * @param enableWafSignaturesNotifications set the enableWafSignaturesNotifications.
   */
  @VsoMethod
  public void setEnableWafSignaturesNotifications(Boolean  enableWafSignaturesNotifications) {
    this.enableWafSignaturesNotifications = enableWafSignaturesNotifications;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  PortalFeatureOptIn objPortalFeatureOptIn = (PortalFeatureOptIn) o;
  return   Objects.equals(this.enableAutoDownloadWafSignatures, objPortalFeatureOptIn.enableAutoDownloadWafSignatures)&&
  Objects.equals(this.enableWafSignaturesNotifications, objPortalFeatureOptIn.enableWafSignaturesNotifications)&&
  Objects.equals(this.enableAutoCaseCreationOnSystemFailure, objPortalFeatureOptIn.enableAutoCaseCreationOnSystemFailure)&&
  Objects.equals(this.enableAutoCaseCreationOnSeFailure, objPortalFeatureOptIn.enableAutoCaseCreationOnSeFailure)&&
  Objects.equals(this.enableIpReputation, objPortalFeatureOptIn.enableIpReputation)&&
  Objects.equals(this.enableAppsignatureSync, objPortalFeatureOptIn.enableAppsignatureSync)&&
  Objects.equals(this.enableUserAgentDbSync, objPortalFeatureOptIn.enableUserAgentDbSync)&&
  Objects.equals(this.enablePulseWafManagement, objPortalFeatureOptIn.enablePulseWafManagement)&&
  Objects.equals(this.enablePulseCaseManagement, objPortalFeatureOptIn.enablePulseCaseManagement);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class PortalFeatureOptIn {\n");
      sb.append("    enableAppsignatureSync: ").append(toIndentedString(enableAppsignatureSync)).append("\n");
        sb.append("    enableAutoCaseCreationOnSeFailure: ").append(toIndentedString(enableAutoCaseCreationOnSeFailure)).append("\n");
        sb.append("    enableAutoCaseCreationOnSystemFailure: ").append(toIndentedString(enableAutoCaseCreationOnSystemFailure)).append("\n");
        sb.append("    enableAutoDownloadWafSignatures: ").append(toIndentedString(enableAutoDownloadWafSignatures)).append("\n");
        sb.append("    enableIpReputation: ").append(toIndentedString(enableIpReputation)).append("\n");
        sb.append("    enablePulseCaseManagement: ").append(toIndentedString(enablePulseCaseManagement)).append("\n");
        sb.append("    enablePulseWafManagement: ").append(toIndentedString(enablePulseWafManagement)).append("\n");
        sb.append("    enableUserAgentDbSync: ").append(toIndentedString(enableUserAgentDbSync)).append("\n");
        sb.append("    enableWafSignaturesNotifications: ").append(toIndentedString(enableWafSignaturesNotifications)).append("\n");
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

