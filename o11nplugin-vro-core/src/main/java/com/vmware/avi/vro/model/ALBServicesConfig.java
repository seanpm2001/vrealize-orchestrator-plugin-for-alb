package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.avi.vro.model.AppSignatureConfig;
import com.vmware.avi.vro.model.ALBServicesUser;
import com.vmware.avi.vro.model.PortalFeatureOptIn;
import com.vmware.avi.vro.model.IpReputationConfig;
import com.vmware.avi.vro.model.ProactiveSupportDefaults;
import com.vmware.avi.vro.model.ProxyConfiguration;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The ALBServicesConfig is a POJO class extends AviRestResource that used for creating
 * ALBServicesConfig.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "ALBServicesConfig")
@VsoFinder(name = Constants.FINDER_VRO_ALBSERVICESCONFIG, idAccessor = "getObjectID()")
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class ALBServicesConfig extends AviRestResource {
    @JsonProperty("app_signature_config")
    @JsonInclude(Include.NON_NULL)
    private AppSignatureConfig appSignatureConfig = null;

    @JsonProperty("asset_contact")
    @JsonInclude(Include.NON_NULL)
    private ALBServicesUser assetContact = null;

    @JsonProperty("feature_opt_in_status")
    @JsonInclude(Include.NON_NULL)
    private PortalFeatureOptIn featureOptInStatus = null;

    @JsonProperty("ip_reputation_config")
    @JsonInclude(Include.NON_NULL)
    private IpReputationConfig ipReputationConfig = null;

    @JsonProperty("mode")
    @JsonInclude(Include.NON_NULL)
    private String mode = "MYVMWARE";

    @JsonProperty("polling_interval")
    @JsonInclude(Include.NON_NULL)
    private Integer pollingInterval = 10;

    @JsonProperty("portal_url")
    @JsonInclude(Include.NON_NULL)
    private String portalUrl = null;

    @JsonProperty("proactive_support_defaults")
    @JsonInclude(Include.NON_NULL)
    private ProactiveSupportDefaults proactiveSupportDefaults = null;

    @JsonProperty("split_proxy_configuration")
    @JsonInclude(Include.NON_NULL)
    private ProxyConfiguration splitProxyConfiguration = null;

    @JsonProperty("url")
    @JsonInclude(Include.NON_NULL)
    private String url = "url";

    @JsonProperty("use_split_proxy")
    @JsonInclude(Include.NON_NULL)
    private Boolean useSplitProxy = false;

    @JsonProperty("use_tls")
    @JsonInclude(Include.NON_NULL)
    private Boolean useTls = true;

    @JsonProperty("uuid")
    @JsonInclude(Include.NON_NULL)
    private String uuid = null;



  /**
   * This is the getter method this will return the attribute value.
   * Default values to be used for application signature sync.
   * Field introduced in 20.1.4.
   * Allowed in basic edition, essentials edition, enterprise edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return appSignatureConfig
   */
  @VsoMethod
  public AppSignatureConfig getAppSignatureConfig() {
    return appSignatureConfig;
  }

  /**
   * This is the setter method to the attribute.
   * Default values to be used for application signature sync.
   * Field introduced in 20.1.4.
   * Allowed in basic edition, essentials edition, enterprise edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param appSignatureConfig set the appSignatureConfig.
   */
  @VsoMethod
  public void setAppSignatureConfig(AppSignatureConfig appSignatureConfig) {
    this.appSignatureConfig = appSignatureConfig;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Information about the default contact for this controller cluster.
   * Field introduced in 20.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return assetContact
   */
  @VsoMethod
  public ALBServicesUser getAssetContact() {
    return assetContact;
  }

  /**
   * This is the setter method to the attribute.
   * Information about the default contact for this controller cluster.
   * Field introduced in 20.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param assetContact set the assetContact.
   */
  @VsoMethod
  public void setAssetContact(ALBServicesUser assetContact) {
    this.assetContact = assetContact;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Information about the portal features opted in for controller.
   * Field introduced in 20.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return featureOptInStatus
   */
  @VsoMethod
  public PortalFeatureOptIn getFeatureOptInStatus() {
    return featureOptInStatus;
  }

  /**
   * This is the setter method to the attribute.
   * Information about the portal features opted in for controller.
   * Field introduced in 20.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param featureOptInStatus set the featureOptInStatus.
   */
  @VsoMethod
  public void setFeatureOptInStatus(PortalFeatureOptIn featureOptInStatus) {
    this.featureOptInStatus = featureOptInStatus;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Default values to be used for ip reputation sync.
   * Field introduced in 20.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return ipReputationConfig
   */
  @VsoMethod
  public IpReputationConfig getIpReputationConfig() {
    return ipReputationConfig;
  }

  /**
   * This is the setter method to the attribute.
   * Default values to be used for ip reputation sync.
   * Field introduced in 20.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param ipReputationConfig set the ipReputationConfig.
   */
  @VsoMethod
  public void setIpReputationConfig(IpReputationConfig ipReputationConfig) {
    this.ipReputationConfig = ipReputationConfig;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Mode helps log collection and upload.
   * Enum options - SALESFORCE, SYSTEST, MYVMWARE.
   * Field introduced in 20.1.2.
   * Allowed in basic(allowed values- salesforce,myvmware,systest) edition, essentials(allowed values- salesforce,myvmware,systest) edition,
   * enterprise edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as "MYVMWARE".
   * @return mode
   */
  @VsoMethod
  public String getMode() {
    return mode;
  }

  /**
   * This is the setter method to the attribute.
   * Mode helps log collection and upload.
   * Enum options - SALESFORCE, SYSTEST, MYVMWARE.
   * Field introduced in 20.1.2.
   * Allowed in basic(allowed values- salesforce,myvmware,systest) edition, essentials(allowed values- salesforce,myvmware,systest) edition,
   * enterprise edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as "MYVMWARE".
   * @param mode set the mode.
   */
  @VsoMethod
  public void setMode(String  mode) {
    this.mode = mode;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Time interval in minutes.
   * Allowed values are 5-60.
   * Field introduced in 18.2.6.
   * Default value when not specified in API or module is interpreted by Avi Controller as 10.
   * @return pollingInterval
   */
  @VsoMethod
  public Integer getPollingInterval() {
    return pollingInterval;
  }

  /**
   * This is the setter method to the attribute.
   * Time interval in minutes.
   * Allowed values are 5-60.
   * Field introduced in 18.2.6.
   * Default value when not specified in API or module is interpreted by Avi Controller as 10.
   * @param pollingInterval set the pollingInterval.
   */
  @VsoMethod
  public void setPollingInterval(Integer  pollingInterval) {
    this.pollingInterval = pollingInterval;
  }

  /**
   * This is the getter method this will return the attribute value.
   * The fqdn or ip address of the customer portal.
   * Field introduced in 18.2.6.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return portalUrl
   */
  @VsoMethod
  public String getPortalUrl() {
    return portalUrl;
  }

  /**
   * This is the setter method to the attribute.
   * The fqdn or ip address of the customer portal.
   * Field introduced in 18.2.6.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param portalUrl set the portalUrl.
   */
  @VsoMethod
  public void setPortalUrl(String  portalUrl) {
    this.portalUrl = portalUrl;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Default values to be used during proactive case creation and techsupport attachment.
   * Field introduced in 20.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return proactiveSupportDefaults
   */
  @VsoMethod
  public ProactiveSupportDefaults getProactiveSupportDefaults() {
    return proactiveSupportDefaults;
  }

  /**
   * This is the setter method to the attribute.
   * Default values to be used during proactive case creation and techsupport attachment.
   * Field introduced in 20.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param proactiveSupportDefaults set the proactiveSupportDefaults.
   */
  @VsoMethod
  public void setProactiveSupportDefaults(ProactiveSupportDefaults proactiveSupportDefaults) {
    this.proactiveSupportDefaults = proactiveSupportDefaults;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Split proxy configuration to connect external pulse services.
   * Field introduced in 20.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return splitProxyConfiguration
   */
  @VsoMethod
  public ProxyConfiguration getSplitProxyConfiguration() {
    return splitProxyConfiguration;
  }

  /**
   * This is the setter method to the attribute.
   * Split proxy configuration to connect external pulse services.
   * Field introduced in 20.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param splitProxyConfiguration set the splitProxyConfiguration.
   */
  @VsoMethod
  public void setSplitProxyConfiguration(ProxyConfiguration splitProxyConfiguration) {
    this.splitProxyConfiguration = splitProxyConfiguration;
  }
/**
   * This is the getter method this will return the attribute value.
   * Avi controller URL of the object.
   * @return url
   */
  @VsoMethod
  public String getUrl() {
    return url;
  }

  /**
   * This is the setter method. this will set the url
   * Avi controller URL of the object.
   * @return url
   */
  @VsoMethod
  public void setUrl(String  url) {
    this.url = url;
  }

  /**
   * This is the getter method this will return the attribute value.
   * By default, use system proxy configuration.if true, use split proxy configuration.
   * Field introduced in 20.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return useSplitProxy
   */
  @VsoMethod
  public Boolean getUseSplitProxy() {
    return useSplitProxy;
  }

  /**
   * This is the setter method to the attribute.
   * By default, use system proxy configuration.if true, use split proxy configuration.
   * Field introduced in 20.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param useSplitProxy set the useSplitProxy.
   */
  @VsoMethod
  public void setUseSplitProxy(Boolean  useSplitProxy) {
    this.useSplitProxy = useSplitProxy;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Secure the controller to pulse communication over tls.
   * Field introduced in 20.1.3.
   * Default value when not specified in API or module is interpreted by Avi Controller as true.
   * @return useTls
   */
  @VsoMethod
  public Boolean getUseTls() {
    return useTls;
  }

  /**
   * This is the setter method to the attribute.
   * Secure the controller to pulse communication over tls.
   * Field introduced in 20.1.3.
   * Default value when not specified in API or module is interpreted by Avi Controller as true.
   * @param useTls set the useTls.
   */
  @VsoMethod
  public void setUseTls(Boolean  useTls) {
    this.useTls = useTls;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Field introduced in 18.2.6.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return uuid
   */
  @VsoMethod
  public String getUuid() {
    return uuid;
  }

  /**
   * This is the setter method to the attribute.
   * Field introduced in 18.2.6.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param uuid set the uuid.
   */
  @VsoMethod
  public void setUuid(String  uuid) {
    this.uuid = uuid;
  }


  public String getObjectID() {
    return "ALBServicesConfig" + "(" + uuid + ")";
  }

@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  ALBServicesConfig objALBServicesConfig = (ALBServicesConfig) o;
  return   Objects.equals(this.uuid, objALBServicesConfig.uuid)&&
  Objects.equals(this.portalUrl, objALBServicesConfig.portalUrl)&&
  Objects.equals(this.pollingInterval, objALBServicesConfig.pollingInterval)&&
  Objects.equals(this.assetContact, objALBServicesConfig.assetContact)&&
  Objects.equals(this.featureOptInStatus, objALBServicesConfig.featureOptInStatus)&&
  Objects.equals(this.proactiveSupportDefaults, objALBServicesConfig.proactiveSupportDefaults)&&
  Objects.equals(this.useSplitProxy, objALBServicesConfig.useSplitProxy)&&
  Objects.equals(this.splitProxyConfiguration, objALBServicesConfig.splitProxyConfiguration)&&
  Objects.equals(this.ipReputationConfig, objALBServicesConfig.ipReputationConfig)&&
  Objects.equals(this.useTls, objALBServicesConfig.useTls)&&
  Objects.equals(this.mode, objALBServicesConfig.mode)&&
  Objects.equals(this.appSignatureConfig, objALBServicesConfig.appSignatureConfig);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class ALBServicesConfig {\n");
      sb.append("    appSignatureConfig: ").append(toIndentedString(appSignatureConfig)).append("\n");
        sb.append("    assetContact: ").append(toIndentedString(assetContact)).append("\n");
        sb.append("    featureOptInStatus: ").append(toIndentedString(featureOptInStatus)).append("\n");
        sb.append("    ipReputationConfig: ").append(toIndentedString(ipReputationConfig)).append("\n");
        sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
        sb.append("    pollingInterval: ").append(toIndentedString(pollingInterval)).append("\n");
        sb.append("    portalUrl: ").append(toIndentedString(portalUrl)).append("\n");
        sb.append("    proactiveSupportDefaults: ").append(toIndentedString(proactiveSupportDefaults)).append("\n");
        sb.append("    splitProxyConfiguration: ").append(toIndentedString(splitProxyConfiguration)).append("\n");
            sb.append("    useSplitProxy: ").append(toIndentedString(useSplitProxy)).append("\n");
        sb.append("    useTls: ").append(toIndentedString(useTls)).append("\n");
        sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
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

