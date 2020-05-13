package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.vmware.avi.vro.model.DockerRegistry;
import com.vmware.avi.vro.model.FeProxyRoutePublishConfig;
import com.vmware.avi.vro.model.IpAddr;
import com.vmware.avi.vro.model.IpAddrPrefix;
import com.vmware.avi.vro.model.MarathonConfiguration;
import com.vmware.avi.vro.model.MarathonSeDeployment;
import com.vmware.avi.vro.model.MesosAttribute;
import com.vmware.avi.vro.model.MesosSeResources;
import com.vmware.avi.vro.model.NuageSDNController;
import com.vmware.avi.vro.model.SSHSeDeployment;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;
/**
 * MesosConfiguration
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "MesosConfiguration")
@VsoFinder(name = Constants.FINDER_VRO_MESOSCONFIGURATION, idAccessor = "getObjectID()")
@Service
public class MesosConfiguration extends AviRestResource  {
  @JsonProperty("all_vses_are_feproxy")
  private Boolean allVsesAreFeproxy = null;

  @JsonProperty("app_sync_frequency")
  private Integer appSyncFrequency = 60;

  @JsonProperty("container_port_match_http_service")
  private Boolean containerPortMatchHttpService = true;

  @JsonProperty("coredump_directory")
  private String coredumpDirectory = "/var/lib/systemd/coredump";

  @JsonProperty("disable_auto_backend_service_sync")
  private Boolean disableAutoBackendServiceSync = null;

  @JsonProperty("disable_auto_frontend_service_sync")
  private Boolean disableAutoFrontendServiceSync = null;

  @JsonProperty("disable_auto_gs_sync")
  private Boolean disableAutoGsSync = null;

  @JsonProperty("disable_auto_se_creation")
  private Boolean disableAutoSeCreation = null;

  @JsonProperty("docker_registry_se")
  private DockerRegistry dockerRegistrySe = null;

  @JsonProperty("east_west_placement_subnet")
  private IpAddrPrefix eastWestPlacementSubnet = null;

  @JsonProperty("enable_event_subscription")
  private Boolean enableEventSubscription = true;

  @JsonProperty("feproxy_bridge_name")
  private String feproxyBridgeName = "cbr1";

  @JsonProperty("feproxy_container_port_as_service")
  private Boolean feproxyContainerPortAsService = true;

  @JsonProperty("feproxy_route_publish")
  private FeProxyRoutePublishConfig feproxyRoutePublish = null;

  @JsonProperty("feproxy_vips_enable_proxy_arp")
  private Boolean feproxyVipsEnableProxyArp = true;

  @JsonProperty("fleet_endpoint")
  private String fleetEndpoint = null;

  @JsonProperty("http_container_ports")
  @Valid
  private List<Integer> httpContainerPorts = null;

  @JsonProperty("marathon_configurations")
  @Valid
  private List<MarathonConfiguration> marathonConfigurations = null;

  @JsonProperty("marathon_se_deployment")
  private MarathonSeDeployment marathonSeDeployment = null;

  @JsonProperty("mesos_url")
  private String mesosUrl = "http://leader.mesos:5050";

  @JsonProperty("node_availability_zone_label")
  private String nodeAvailabilityZoneLabel = null;

  @JsonProperty("nuage_controller")
  private NuageSDNController nuageController = null;

  @JsonProperty("se_deployment_method")
  private String seDeploymentMethod = "MESOS_SE_CREATE_FLEET";

  @JsonProperty("se_exclude_attributes")
  @Valid
  private List<MesosAttribute> seExcludeAttributes = null;

  @JsonProperty("se_include_attributes")
  @Valid
  private List<MesosAttribute> seIncludeAttributes = null;

  @JsonProperty("se_resources")
  @Valid
  private List<MesosSeResources> seResources = null;

  @JsonProperty("se_spawn_rate")
  private Integer seSpawnRate = 25;

  @JsonProperty("se_volume")
  private String seVolume = "/opt/avi/se";

  @JsonProperty("services_accessible_all_interfaces")
  private Boolean servicesAccessibleAllInterfaces = null;

  @JsonProperty("ssh_se_deployment")
  private SSHSeDeployment sshSeDeployment = null;

  @JsonProperty("ssh_user_ref")
  private String sshUserRef = null;

  @JsonProperty("use_bridge_ip_as_vip")
  private Boolean useBridgeIpAsVip = null;

  @JsonProperty("use_container_ip_port")
  private Boolean useContainerIpPort = null;

  @JsonProperty("use_controller_image")
  private Boolean useControllerImage = null;

  @JsonProperty("use_vips_for_east_west_services")
  private Boolean useVipsForEastWestServices = true;

  @JsonProperty("vip")
  private IpAddr vip = null;

  
  /**
   * Consider all Virtualservices as Front End Proxies. Front End proxies are placed on specific SEs as opposed to Back End proxies placed on all SEs. Applicable where each service has its own VIP and VIP is reachable from anywhere.
   * @return allVsesAreFeproxy
  **/
  @ApiModelProperty(value = "Consider all Virtualservices as Front End Proxies. Front End proxies are placed on specific SEs as opposed to Back End proxies placed on all SEs. Applicable where each service has its own VIP and VIP is reachable from anywhere.")


 
  @VsoMethod  
  public Boolean isAllVsesAreFeproxy() {
    return allVsesAreFeproxy;
  }
    
  @VsoMethod
  public void setAllVsesAreFeproxy(Boolean allVsesAreFeproxy) {
    this.allVsesAreFeproxy = allVsesAreFeproxy;
  }

  
  /**
   * Sync frequency in seconds with frameworks.
   * @return appSyncFrequency
  **/
  @ApiModelProperty(value = "Sync frequency in seconds with frameworks.")


 
  @VsoMethod  
  public Integer getAppSyncFrequency() {
    return appSyncFrequency;
  }
    
  @VsoMethod
  public void setAppSyncFrequency(Integer appSyncFrequency) {
    this.appSyncFrequency = appSyncFrequency;
  }

  
  /**
   * Perform container port matching to create a HTTP Virtualservice instead of a TCP/UDP VirtualService.
   * @return containerPortMatchHttpService
  **/
  @ApiModelProperty(value = "Perform container port matching to create a HTTP Virtualservice instead of a TCP/UDP VirtualService.")


 
  @VsoMethod  
  public Boolean isContainerPortMatchHttpService() {
    return containerPortMatchHttpService;
  }
    
  @VsoMethod
  public void setContainerPortMatchHttpService(Boolean containerPortMatchHttpService) {
    this.containerPortMatchHttpService = containerPortMatchHttpService;
  }

  
  /**
   * Directory to mount to check for core dumps on Service Engines. This will be mapped read only to /var/crash on any new Service Engines. This is a disruptive change.
   * @return coredumpDirectory
  **/
  @ApiModelProperty(value = "Directory to mount to check for core dumps on Service Engines. This will be mapped read only to /var/crash on any new Service Engines. This is a disruptive change.")


 
  @VsoMethod  
  public String getCoredumpDirectory() {
    return coredumpDirectory;
  }
    
  @VsoMethod
  public void setCoredumpDirectory(String coredumpDirectory) {
    this.coredumpDirectory = coredumpDirectory;
  }

  
  /**
   * Disable auto service sync for back end services.
   * @return disableAutoBackendServiceSync
  **/
  @ApiModelProperty(value = "Disable auto service sync for back end services.")


 
  @VsoMethod  
  public Boolean isDisableAutoBackendServiceSync() {
    return disableAutoBackendServiceSync;
  }
    
  @VsoMethod
  public void setDisableAutoBackendServiceSync(Boolean disableAutoBackendServiceSync) {
    this.disableAutoBackendServiceSync = disableAutoBackendServiceSync;
  }

  
  /**
   * Disable auto service sync for front end services.
   * @return disableAutoFrontendServiceSync
  **/
  @ApiModelProperty(value = "Disable auto service sync for front end services.")


 
  @VsoMethod  
  public Boolean isDisableAutoFrontendServiceSync() {
    return disableAutoFrontendServiceSync;
  }
    
  @VsoMethod
  public void setDisableAutoFrontendServiceSync(Boolean disableAutoFrontendServiceSync) {
    this.disableAutoFrontendServiceSync = disableAutoFrontendServiceSync;
  }

  
  /**
   * Disable auto sync for GSLB services. Field introduced in 17.1.2.
   * @return disableAutoGsSync
  **/
  @ApiModelProperty(value = "Disable auto sync for GSLB services. Field introduced in 17.1.2.")


 
  @VsoMethod  
  public Boolean isDisableAutoGsSync() {
    return disableAutoGsSync;
  }
    
  @VsoMethod
  public void setDisableAutoGsSync(Boolean disableAutoGsSync) {
    this.disableAutoGsSync = disableAutoGsSync;
  }

  
  /**
   * Disable SE creation.
   * @return disableAutoSeCreation
  **/
  @ApiModelProperty(value = "Disable SE creation.")


 
  @VsoMethod  
  public Boolean isDisableAutoSeCreation() {
    return disableAutoSeCreation;
  }
    
  @VsoMethod
  public void setDisableAutoSeCreation(Boolean disableAutoSeCreation) {
    this.disableAutoSeCreation = disableAutoSeCreation;
  }

  
  /**
   * Docker registry for ServiceEngine image.
   * @return dockerRegistrySe
  **/
  @ApiModelProperty(value = "Docker registry for ServiceEngine image.")

  @Valid

 
  @VsoMethod  
  public DockerRegistry getDockerRegistrySe() {
    return dockerRegistrySe;
  }
    
  @VsoMethod
  public void setDockerRegistrySe(DockerRegistry dockerRegistrySe) {
    this.dockerRegistrySe = dockerRegistrySe;
  }

  
  /**
   * Match against this prefix when placing east-west VSs on SEs (Mesos mode only).
   * @return eastWestPlacementSubnet
  **/
  @ApiModelProperty(value = "Match against this prefix when placing east-west VSs on SEs (Mesos mode only).")

  @Valid

 
  @VsoMethod  
  public IpAddrPrefix getEastWestPlacementSubnet() {
    return eastWestPlacementSubnet;
  }
    
  @VsoMethod
  public void setEastWestPlacementSubnet(IpAddrPrefix eastWestPlacementSubnet) {
    this.eastWestPlacementSubnet = eastWestPlacementSubnet;
  }

  
  /**
   * Enable Marathon event subscriptions.
   * @return enableEventSubscription
  **/
  @ApiModelProperty(value = "Enable Marathon event subscriptions.")


 
  @VsoMethod  
  public Boolean isEnableEventSubscription() {
    return enableEventSubscription;
  }
    
  @VsoMethod
  public void setEnableEventSubscription(Boolean enableEventSubscription) {
    this.enableEventSubscription = enableEventSubscription;
  }

  
  /**
   * Name of second Linux bridge on Host providing connectivity for Front End proxies. This is a disruptive change.
   * @return feproxyBridgeName
  **/
  @ApiModelProperty(value = "Name of second Linux bridge on Host providing connectivity for Front End proxies. This is a disruptive change.")


 
  @VsoMethod  
  public String getFeproxyBridgeName() {
    return feproxyBridgeName;
  }
    
  @VsoMethod
  public void setFeproxyBridgeName(String feproxyBridgeName) {
    this.feproxyBridgeName = feproxyBridgeName;
  }

  
  /**
   * For Front End proxies, use container port as service port.
   * @return feproxyContainerPortAsService
  **/
  @ApiModelProperty(value = "For Front End proxies, use container port as service port.")


 
  @VsoMethod  
  public Boolean isFeproxyContainerPortAsService() {
    return feproxyContainerPortAsService;
  }
    
  @VsoMethod
  public void setFeproxyContainerPortAsService(Boolean feproxyContainerPortAsService) {
    this.feproxyContainerPortAsService = feproxyContainerPortAsService;
  }

  
  /**
   * Publish ECMP route to upstream router for VIP.
   * @return feproxyRoutePublish
  **/
  @ApiModelProperty(value = "Publish ECMP route to upstream router for VIP.")

  @Valid

 
  @VsoMethod  
  public FeProxyRoutePublishConfig getFeproxyRoutePublish() {
    return feproxyRoutePublish;
  }
    
  @VsoMethod
  public void setFeproxyRoutePublish(FeProxyRoutePublishConfig feproxyRoutePublish) {
    this.feproxyRoutePublish = feproxyRoutePublish;
  }

  
  /**
   * Enable proxy ARP from Host interface for Front End  proxies.
   * @return feproxyVipsEnableProxyArp
  **/
  @ApiModelProperty(value = "Enable proxy ARP from Host interface for Front End  proxies.")


 
  @VsoMethod  
  public Boolean isFeproxyVipsEnableProxyArp() {
    return feproxyVipsEnableProxyArp;
  }
    
  @VsoMethod
  public void setFeproxyVipsEnableProxyArp(Boolean feproxyVipsEnableProxyArp) {
    this.feproxyVipsEnableProxyArp = feproxyVipsEnableProxyArp;
  }

  
  /**
   * Optional fleet remote endpoint if fleet is used for SE deployment.
   * @return fleetEndpoint
  **/
  @ApiModelProperty(value = "Optional fleet remote endpoint if fleet is used for SE deployment.")


 
  @VsoMethod  
  public String getFleetEndpoint() {
    return fleetEndpoint;
  }
    
  @VsoMethod
  public void setFleetEndpoint(String fleetEndpoint) {
    this.fleetEndpoint = fleetEndpoint;
  }

  
  public MesosConfiguration addHttpContainerPortsItem(Integer httpContainerPortsItem) {
    if (this.httpContainerPorts == null) {
      this.httpContainerPorts = new ArrayList<Integer>();
    }
    this.httpContainerPorts.add(httpContainerPortsItem);
    return this;
  }
  
  /**
   * List of container ports that create a HTTP Virtualservice instead of a TCP/UDP VirtualService. Defaults to 80.
   * @return httpContainerPorts
  **/
  @ApiModelProperty(value = "List of container ports that create a HTTP Virtualservice instead of a TCP/UDP VirtualService. Defaults to 80.")


 
  @VsoMethod  
  public List<Integer> getHttpContainerPorts() {
    return httpContainerPorts;
  }
    
  @VsoMethod
  public void setHttpContainerPorts(List<Integer> httpContainerPorts) {
    this.httpContainerPorts = httpContainerPorts;
  }

  
  public MesosConfiguration addMarathonConfigurationsItem(MarathonConfiguration marathonConfigurationsItem) {
    if (this.marathonConfigurations == null) {
      this.marathonConfigurations = new ArrayList<MarathonConfiguration>();
    }
    this.marathonConfigurations.add(marathonConfigurationsItem);
    return this;
  }
  
  /**
   * List of Marathon frameworks.
   * @return marathonConfigurations
  **/
  @ApiModelProperty(value = "List of Marathon frameworks.")

  @Valid

 
  @VsoMethod  
  public List<MarathonConfiguration> getMarathonConfigurations() {
    return marathonConfigurations;
  }
    
  @VsoMethod
  public void setMarathonConfigurations(List<MarathonConfiguration> marathonConfigurations) {
    this.marathonConfigurations = marathonConfigurations;
  }

  
  /**
   * Options for Marathon SE deployment.
   * @return marathonSeDeployment
  **/
  @ApiModelProperty(value = "Options for Marathon SE deployment.")

  @Valid

 
  @VsoMethod  
  public MarathonSeDeployment getMarathonSeDeployment() {
    return marathonSeDeployment;
  }
    
  @VsoMethod
  public void setMarathonSeDeployment(MarathonSeDeployment marathonSeDeployment) {
    this.marathonSeDeployment = marathonSeDeployment;
  }

  
  /**
   * Mesos URL of the form http //host port.
   * @return mesosUrl
  **/
  @ApiModelProperty(value = "Mesos URL of the form http //host port.")


 
  @VsoMethod  
  public String getMesosUrl() {
    return mesosUrl;
  }
    
  @VsoMethod
  public void setMesosUrl(String mesosUrl) {
    this.mesosUrl = mesosUrl;
  }

  
  /**
   * Mesos Node label to be used as Mesos Node's availability zone in a dual availability zone deployment. ServiceEngines belonging to the availability zone will be rebooted during a manual DR failover.
   * @return nodeAvailabilityZoneLabel
  **/
  @ApiModelProperty(value = "Mesos Node label to be used as Mesos Node's availability zone in a dual availability zone deployment. ServiceEngines belonging to the availability zone will be rebooted during a manual DR failover.")


 
  @VsoMethod  
  public String getNodeAvailabilityZoneLabel() {
    return nodeAvailabilityZoneLabel;
  }
    
  @VsoMethod
  public void setNodeAvailabilityZoneLabel(String nodeAvailabilityZoneLabel) {
    this.nodeAvailabilityZoneLabel = nodeAvailabilityZoneLabel;
  }

  
  /**
   * Nuage Overlay SDN Controller information.
   * @return nuageController
  **/
  @ApiModelProperty(value = "Nuage Overlay SDN Controller information.")

  @Valid

 
  @VsoMethod  
  public NuageSDNController getNuageController() {
    return nuageController;
  }
    
  @VsoMethod
  public void setNuageController(NuageSDNController nuageController) {
    this.nuageController = nuageController;
  }

  
  /**
   * Use Fleet/SSH for deploying Service Engines. Enum options - MESOS_SE_CREATE_FLEET, MESOS_SE_CREATE_SSH, MESOS_SE_CREATE_MARATHON.
   * @return seDeploymentMethod
  **/
  @ApiModelProperty(value = "Use Fleet/SSH for deploying Service Engines. Enum options - MESOS_SE_CREATE_FLEET, MESOS_SE_CREATE_SSH, MESOS_SE_CREATE_MARATHON.")


 
  @VsoMethod  
  public String getSeDeploymentMethod() {
    return seDeploymentMethod;
  }
    
  @VsoMethod
  public void setSeDeploymentMethod(String seDeploymentMethod) {
    this.seDeploymentMethod = seDeploymentMethod;
  }

  
  public MesosConfiguration addSeExcludeAttributesItem(MesosAttribute seExcludeAttributesItem) {
    if (this.seExcludeAttributes == null) {
      this.seExcludeAttributes = new ArrayList<MesosAttribute>();
    }
    this.seExcludeAttributes.add(seExcludeAttributesItem);
    return this;
  }
  
  /**
   * Exclude hosts with attributes for SE creation.
   * @return seExcludeAttributes
  **/
  @ApiModelProperty(value = "Exclude hosts with attributes for SE creation.")

  @Valid

 
  @VsoMethod  
  public List<MesosAttribute> getSeExcludeAttributes() {
    return seExcludeAttributes;
  }
    
  @VsoMethod
  public void setSeExcludeAttributes(List<MesosAttribute> seExcludeAttributes) {
    this.seExcludeAttributes = seExcludeAttributes;
  }

  
  public MesosConfiguration addSeIncludeAttributesItem(MesosAttribute seIncludeAttributesItem) {
    if (this.seIncludeAttributes == null) {
      this.seIncludeAttributes = new ArrayList<MesosAttribute>();
    }
    this.seIncludeAttributes.add(seIncludeAttributesItem);
    return this;
  }
  
  /**
   * Create SEs just on hosts with include attributes.
   * @return seIncludeAttributes
  **/
  @ApiModelProperty(value = "Create SEs just on hosts with include attributes.")

  @Valid

 
  @VsoMethod  
  public List<MesosAttribute> getSeIncludeAttributes() {
    return seIncludeAttributes;
  }
    
  @VsoMethod
  public void setSeIncludeAttributes(List<MesosAttribute> seIncludeAttributes) {
    this.seIncludeAttributes = seIncludeAttributes;
  }

  
  public MesosConfiguration addSeResourcesItem(MesosSeResources seResourcesItem) {
    if (this.seResources == null) {
      this.seResources = new ArrayList<MesosSeResources>();
    }
    this.seResources.add(seResourcesItem);
    return this;
  }
  
  /**
   * Obsolete - ignored.
   * @return seResources
  **/
  @ApiModelProperty(value = "Obsolete - ignored.")

  @Valid

 
  @VsoMethod  
  public List<MesosSeResources> getSeResources() {
    return seResources;
  }
    
  @VsoMethod
  public void setSeResources(List<MesosSeResources> seResources) {
    this.seResources = seResources;
  }

  
  /**
   * New SE spawn rate per minute.
   * @return seSpawnRate
  **/
  @ApiModelProperty(value = "New SE spawn rate per minute.")


 
  @VsoMethod  
  public Integer getSeSpawnRate() {
    return seSpawnRate;
  }
    
  @VsoMethod
  public void setSeSpawnRate(Integer seSpawnRate) {
    this.seSpawnRate = seSpawnRate;
  }

  
  /**
   * Host volume to be used as a disk for Avi SE, This is a disruptive change.
   * @return seVolume
  **/
  @ApiModelProperty(value = "Host volume to be used as a disk for Avi SE, This is a disruptive change.")


 
  @VsoMethod  
  public String getSeVolume() {
    return seVolume;
  }
    
  @VsoMethod
  public void setSeVolume(String seVolume) {
    this.seVolume = seVolume;
  }

  
  /**
   * Make service ports accessible on all Host interfaces in addition to East-West VIP and/or bridge IP. Usually enabled AWS Mesos clusters to export East-West services on Host interface.
   * @return servicesAccessibleAllInterfaces
  **/
  @ApiModelProperty(value = "Make service ports accessible on all Host interfaces in addition to East-West VIP and/or bridge IP. Usually enabled AWS Mesos clusters to export East-West services on Host interface.")


 
  @VsoMethod  
  public Boolean isServicesAccessibleAllInterfaces() {
    return servicesAccessibleAllInterfaces;
  }
    
  @VsoMethod
  public void setServicesAccessibleAllInterfaces(Boolean servicesAccessibleAllInterfaces) {
    this.servicesAccessibleAllInterfaces = servicesAccessibleAllInterfaces;
  }

  
  /**
   * Parameters for SSH SE deployment. Field deprecated in 17.1.1.
   * @return sshSeDeployment
  **/
  @ApiModelProperty(value = "Parameters for SSH SE deployment. Field deprecated in 17.1.1.")

  @Valid

 
  @VsoMethod  
  public SSHSeDeployment getSshSeDeployment() {
    return sshSeDeployment;
  }
    
  @VsoMethod
  public void setSshSeDeployment(SSHSeDeployment sshSeDeployment) {
    this.sshSeDeployment = sshSeDeployment;
  }

  
  /**
   * Cloud connector user uuid for SSH to hosts. It is a reference to an object of type CloudConnectorUser. Field introduced in 17.1.1.
   * @return sshUserRef
  **/
  @ApiModelProperty(value = "Cloud connector user uuid for SSH to hosts. It is a reference to an object of type CloudConnectorUser. Field introduced in 17.1.1.")


 
  @VsoMethod  
  public String getSshUserRef() {
    return sshUserRef;
  }
    
  @VsoMethod
  public void setSshUserRef(String sshUserRef) {
    this.sshUserRef = sshUserRef;
  }

  
  /**
   * Use Bridge IP on each Host as VIP.
   * @return useBridgeIpAsVip
  **/
  @ApiModelProperty(value = "Use Bridge IP on each Host as VIP.")


 
  @VsoMethod  
  public Boolean isUseBridgeIpAsVip() {
    return useBridgeIpAsVip;
  }
    
  @VsoMethod
  public void setUseBridgeIpAsVip(Boolean useBridgeIpAsVip) {
    this.useBridgeIpAsVip = useBridgeIpAsVip;
  }

  
  /**
   * Use container IP address port for pool instead of host IP address hostport. This mode is applicable if the container IP is reachable (not a private NATed IP) from other hosts in a routed environment for containers.
   * @return useContainerIpPort
  **/
  @ApiModelProperty(value = "Use container IP address port for pool instead of host IP address hostport. This mode is applicable if the container IP is reachable (not a private NATed IP) from other hosts in a routed environment for containers.")


 
  @VsoMethod  
  public Boolean isUseContainerIpPort() {
    return useContainerIpPort;
  }
    
  @VsoMethod
  public void setUseContainerIpPort(Boolean useContainerIpPort) {
    this.useContainerIpPort = useContainerIpPort;
  }

  
  /**
   * If true, use controller generated SE docker image via fileservice, else use docker repository image as defined by docker_registry_se.
   * @return useControllerImage
  **/
  @ApiModelProperty(value = "If true, use controller generated SE docker image via fileservice, else use docker repository image as defined by docker_registry_se.")


 
  @VsoMethod  
  public Boolean isUseControllerImage() {
    return useControllerImage;
  }
    
  @VsoMethod
  public void setUseControllerImage(Boolean useControllerImage) {
    this.useControllerImage = useControllerImage;
  }

  
  /**
   * Use unique virtual IP address for every east west service in Mesos/Marathon. 'use_bridge_ip_as_vip' and 'vip' fields , if set, will not be used if this field is set.
   * @return useVipsForEastWestServices
  **/
  @ApiModelProperty(value = "Use unique virtual IP address for every east west service in Mesos/Marathon. 'use_bridge_ip_as_vip' and 'vip' fields , if set, will not be used if this field is set.")


 
  @VsoMethod  
  public Boolean isUseVipsForEastWestServices() {
    return useVipsForEastWestServices;
  }
    
  @VsoMethod
  public void setUseVipsForEastWestServices(Boolean useVipsForEastWestServices) {
    this.useVipsForEastWestServices = useVipsForEastWestServices;
  }

  
  /**
   * VIP to be used by all East-West apps on all Hosts. Preferrably use an address from outside the subnet.
   * @return vip
  **/
  @ApiModelProperty(value = "VIP to be used by all East-West apps on all Hosts. Preferrably use an address from outside the subnet.")

  @Valid

 
  @VsoMethod  
  public IpAddr getVip() {
    return vip;
  }
    
  @VsoMethod
  public void setVip(IpAddr vip) {
    this.vip = vip;
  }

  
  public String getObjectID() {
		return "MesosConfiguration";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MesosConfiguration mesosConfiguration = (MesosConfiguration) o;
    return Objects.equals(this.allVsesAreFeproxy, mesosConfiguration.allVsesAreFeproxy) &&
        Objects.equals(this.appSyncFrequency, mesosConfiguration.appSyncFrequency) &&
        Objects.equals(this.containerPortMatchHttpService, mesosConfiguration.containerPortMatchHttpService) &&
        Objects.equals(this.coredumpDirectory, mesosConfiguration.coredumpDirectory) &&
        Objects.equals(this.disableAutoBackendServiceSync, mesosConfiguration.disableAutoBackendServiceSync) &&
        Objects.equals(this.disableAutoFrontendServiceSync, mesosConfiguration.disableAutoFrontendServiceSync) &&
        Objects.equals(this.disableAutoGsSync, mesosConfiguration.disableAutoGsSync) &&
        Objects.equals(this.disableAutoSeCreation, mesosConfiguration.disableAutoSeCreation) &&
        Objects.equals(this.dockerRegistrySe, mesosConfiguration.dockerRegistrySe) &&
        Objects.equals(this.eastWestPlacementSubnet, mesosConfiguration.eastWestPlacementSubnet) &&
        Objects.equals(this.enableEventSubscription, mesosConfiguration.enableEventSubscription) &&
        Objects.equals(this.feproxyBridgeName, mesosConfiguration.feproxyBridgeName) &&
        Objects.equals(this.feproxyContainerPortAsService, mesosConfiguration.feproxyContainerPortAsService) &&
        Objects.equals(this.feproxyRoutePublish, mesosConfiguration.feproxyRoutePublish) &&
        Objects.equals(this.feproxyVipsEnableProxyArp, mesosConfiguration.feproxyVipsEnableProxyArp) &&
        Objects.equals(this.fleetEndpoint, mesosConfiguration.fleetEndpoint) &&
        Objects.equals(this.httpContainerPorts, mesosConfiguration.httpContainerPorts) &&
        Objects.equals(this.marathonConfigurations, mesosConfiguration.marathonConfigurations) &&
        Objects.equals(this.marathonSeDeployment, mesosConfiguration.marathonSeDeployment) &&
        Objects.equals(this.mesosUrl, mesosConfiguration.mesosUrl) &&
        Objects.equals(this.nodeAvailabilityZoneLabel, mesosConfiguration.nodeAvailabilityZoneLabel) &&
        Objects.equals(this.nuageController, mesosConfiguration.nuageController) &&
        Objects.equals(this.seDeploymentMethod, mesosConfiguration.seDeploymentMethod) &&
        Objects.equals(this.seExcludeAttributes, mesosConfiguration.seExcludeAttributes) &&
        Objects.equals(this.seIncludeAttributes, mesosConfiguration.seIncludeAttributes) &&
        Objects.equals(this.seResources, mesosConfiguration.seResources) &&
        Objects.equals(this.seSpawnRate, mesosConfiguration.seSpawnRate) &&
        Objects.equals(this.seVolume, mesosConfiguration.seVolume) &&
        Objects.equals(this.servicesAccessibleAllInterfaces, mesosConfiguration.servicesAccessibleAllInterfaces) &&
        Objects.equals(this.sshSeDeployment, mesosConfiguration.sshSeDeployment) &&
        Objects.equals(this.sshUserRef, mesosConfiguration.sshUserRef) &&
        Objects.equals(this.useBridgeIpAsVip, mesosConfiguration.useBridgeIpAsVip) &&
        Objects.equals(this.useContainerIpPort, mesosConfiguration.useContainerIpPort) &&
        Objects.equals(this.useControllerImage, mesosConfiguration.useControllerImage) &&
        Objects.equals(this.useVipsForEastWestServices, mesosConfiguration.useVipsForEastWestServices) &&
        Objects.equals(this.vip, mesosConfiguration.vip);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allVsesAreFeproxy, appSyncFrequency, containerPortMatchHttpService, coredumpDirectory, disableAutoBackendServiceSync, disableAutoFrontendServiceSync, disableAutoGsSync, disableAutoSeCreation, dockerRegistrySe, eastWestPlacementSubnet, enableEventSubscription, feproxyBridgeName, feproxyContainerPortAsService, feproxyRoutePublish, feproxyVipsEnableProxyArp, fleetEndpoint, httpContainerPorts, marathonConfigurations, marathonSeDeployment, mesosUrl, nodeAvailabilityZoneLabel, nuageController, seDeploymentMethod, seExcludeAttributes, seIncludeAttributes, seResources, seSpawnRate, seVolume, servicesAccessibleAllInterfaces, sshSeDeployment, sshUserRef, useBridgeIpAsVip, useContainerIpPort, useControllerImage, useVipsForEastWestServices, vip);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MesosConfiguration {\n");
    
    sb.append("    allVsesAreFeproxy: ").append(toIndentedString(allVsesAreFeproxy)).append("\n");
    sb.append("    appSyncFrequency: ").append(toIndentedString(appSyncFrequency)).append("\n");
    sb.append("    containerPortMatchHttpService: ").append(toIndentedString(containerPortMatchHttpService)).append("\n");
    sb.append("    coredumpDirectory: ").append(toIndentedString(coredumpDirectory)).append("\n");
    sb.append("    disableAutoBackendServiceSync: ").append(toIndentedString(disableAutoBackendServiceSync)).append("\n");
    sb.append("    disableAutoFrontendServiceSync: ").append(toIndentedString(disableAutoFrontendServiceSync)).append("\n");
    sb.append("    disableAutoGsSync: ").append(toIndentedString(disableAutoGsSync)).append("\n");
    sb.append("    disableAutoSeCreation: ").append(toIndentedString(disableAutoSeCreation)).append("\n");
    sb.append("    dockerRegistrySe: ").append(toIndentedString(dockerRegistrySe)).append("\n");
    sb.append("    eastWestPlacementSubnet: ").append(toIndentedString(eastWestPlacementSubnet)).append("\n");
    sb.append("    enableEventSubscription: ").append(toIndentedString(enableEventSubscription)).append("\n");
    sb.append("    feproxyBridgeName: ").append(toIndentedString(feproxyBridgeName)).append("\n");
    sb.append("    feproxyContainerPortAsService: ").append(toIndentedString(feproxyContainerPortAsService)).append("\n");
    sb.append("    feproxyRoutePublish: ").append(toIndentedString(feproxyRoutePublish)).append("\n");
    sb.append("    feproxyVipsEnableProxyArp: ").append(toIndentedString(feproxyVipsEnableProxyArp)).append("\n");
    sb.append("    fleetEndpoint: ").append(toIndentedString(fleetEndpoint)).append("\n");
    sb.append("    httpContainerPorts: ").append(toIndentedString(httpContainerPorts)).append("\n");
    sb.append("    marathonConfigurations: ").append(toIndentedString(marathonConfigurations)).append("\n");
    sb.append("    marathonSeDeployment: ").append(toIndentedString(marathonSeDeployment)).append("\n");
    sb.append("    mesosUrl: ").append(toIndentedString(mesosUrl)).append("\n");
    sb.append("    nodeAvailabilityZoneLabel: ").append(toIndentedString(nodeAvailabilityZoneLabel)).append("\n");
    sb.append("    nuageController: ").append(toIndentedString(nuageController)).append("\n");
    sb.append("    seDeploymentMethod: ").append(toIndentedString(seDeploymentMethod)).append("\n");
    sb.append("    seExcludeAttributes: ").append(toIndentedString(seExcludeAttributes)).append("\n");
    sb.append("    seIncludeAttributes: ").append(toIndentedString(seIncludeAttributes)).append("\n");
    sb.append("    seResources: ").append(toIndentedString(seResources)).append("\n");
    sb.append("    seSpawnRate: ").append(toIndentedString(seSpawnRate)).append("\n");
    sb.append("    seVolume: ").append(toIndentedString(seVolume)).append("\n");
    sb.append("    servicesAccessibleAllInterfaces: ").append(toIndentedString(servicesAccessibleAllInterfaces)).append("\n");
    sb.append("    sshSeDeployment: ").append(toIndentedString(sshSeDeployment)).append("\n");
    sb.append("    sshUserRef: ").append(toIndentedString(sshUserRef)).append("\n");
    sb.append("    useBridgeIpAsVip: ").append(toIndentedString(useBridgeIpAsVip)).append("\n");
    sb.append("    useContainerIpPort: ").append(toIndentedString(useContainerIpPort)).append("\n");
    sb.append("    useControllerImage: ").append(toIndentedString(useControllerImage)).append("\n");
    sb.append("    useVipsForEastWestServices: ").append(toIndentedString(useVipsForEastWestServices)).append("\n");
    sb.append("    vip: ").append(toIndentedString(vip)).append("\n");
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

