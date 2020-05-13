package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.vmware.avi.vro.model.ObjectAccessMatchTarget;
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
 * ObjectAccessPolicyRule
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "ObjectAccessPolicyRule")
@VsoFinder(name = Constants.FINDER_VRO_OBJECTACCESSPOLICYRULE, idAccessor = "getObjectID()")
@Service
public class ObjectAccessPolicyRule extends AviRestResource  {
  @JsonProperty("matches")
  @Valid
  private List<ObjectAccessMatchTarget> matches = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("obj_types")
  @Valid
  private List<String> objTypes = new ArrayList<String>();

  @JsonProperty("privilege")
  private String privilege = null;

  
  public ObjectAccessPolicyRule addMatchesItem(ObjectAccessMatchTarget matchesItem) {
    if (this.matches == null) {
      this.matches = new ArrayList<ObjectAccessMatchTarget>();
    }
    this.matches.add(matchesItem);
    return this;
  }
  
  /**
   * Match criteria for the rule. Field introduced in 18.2.7, 20.1.1.
   * @return matches
  **/
  @ApiModelProperty(value = "Match criteria for the rule. Field introduced in 18.2.7, 20.1.1.")

  @Valid

 
  @VsoMethod  
  public List<ObjectAccessMatchTarget> getMatches() {
    return matches;
  }
    
  @VsoMethod
  public void setMatches(List<ObjectAccessMatchTarget> matches) {
    this.matches = matches;
  }

  
  /**
   * Name of the rule. Field introduced in 18.2.7, 20.1.1.
   * @return name
  **/
  @ApiModelProperty(value = "Name of the rule. Field introduced in 18.2.7, 20.1.1.")


 
  @VsoMethod  
  public String getName() {
    return name;
  }
    
  @VsoMethod
  public void setName(String name) {
    this.name = name;
  }

  
  public ObjectAccessPolicyRule addObjTypesItem(String objTypesItem) {
    this.objTypes.add(objTypesItem);
    return this;
  }
  
  /**
   * Object types that this rule applies to. Enum options - VIRTUALSERVICE, POOL, HEALTHMONITOR, NETWORKPROFILE, APPLICATIONPROFILE, HTTPPOLICYSET, DNSPOLICY, SECURITYPOLICY, IPADDRGROUP, STRINGGROUP, SSLPROFILE, SSLKEYANDCERTIFICATE, NETWORKSECURITYPOLICY, APPLICATIONPERSISTENCEPROFILE, ANALYTICSPROFILE, VSDATASCRIPTSET, TENANT, PKIPROFILE, AUTHPROFILE, CLOUD, SERVERAUTOSCALEPOLICY, AUTOSCALELAUNCHCONFIG, MICROSERVICEGROUP, IPAMPROFILE, HARDWARESECURITYMODULEGROUP, POOLGROUP, PRIORITYLABELS, POOLGROUPDEPLOYMENTPOLICY, GSLBSERVICE, GSLBSERVICERUNTIME, SCHEDULER, GSLBGEODBPROFILE, GSLBAPPLICATIONPERSISTENCEPROFILE, TRAFFICCLONEPROFILE, VSVIP, WAFPOLICY, WAFPROFILE, ERRORPAGEPROFILE, ERRORPAGEBODY, L4POLICYSET, GSLBSERVICERUNTIMEBATCH, WAFPOLICYPSMGROUP, PINGACCESSAGENT, NETWORKSERVICE, NATPOLICY, SSOPOLICY, PROTOCOLPARSER, EXAMPLECHILD, TESTSEDATASTORELEVEL1, TESTSEDATASTORELEVEL2, TESTSEDATASTORELEVEL3, FILEOBJECT, IPREPUTATIONDB, SERVICEENGINE, DEBUGSERVICEENGINE, DEBUGCONTROLLER, DEBUGVIRTUALSERVICE, SERVICEENGINEGROUP, SEPROPERTIES, NETWORK, CONTROLLERNODE, CONTROLLERPROPERTIES, SYSTEMCONFIGURATION, VRFCONTEXT, USER, ALERTCONFIG, ALERTSYSLOGCONFIG, ALERTEMAILCONFIG, ALERTTYPECONFIG, APPLICATION, ROLE, CLOUDPROPERTIES, SNMPTRAPPROFILE, ACTIONGROUPPROFILE, MICROSERVICE, ALERTPARAMS, ACTIONGROUPCONFIG, CLOUDCONNECTORUSER, GSLB, GSLBDNSUPDATE, GSLBSITEOPS, GLBMGRWARMSTART, IPAMDNSRECORD, GSLBDNSGSSTATUS, GSLBDNSGEOFILEOPS, GSLBDNSGEOUPDATE, GSLBDNSGEOCLUSTEROPS, GSLBDNSCLEANUP, GSLBSITEOPSRESYNC, IPAMDNSPROVIDERPROFILE, ALBSERVICESCONFIG, TCPSTATRUNTIME, UDPSTATRUNTIME, IPSTATRUNTIME, ARPSTATRUNTIME, MBSTATRUNTIME, IPSTKQSTATSRUNTIME, MALLOCSTATRUNTIME, SHMALLOCSTATRUNTIME, CPUUSAGERUNTIME, L7GLOBALSTATSRUNTIME, L7VIRTUALSERVICESTATSRUNTIME, SEAGENTVNICDBRUNTIME, SEAGENTGRAPHDBRUNTIME, SEAGENTSTATERUNTIME, INTERFACERUNTIME, ARPTABLERUNTIME, DISPATCHERSTATRUNTIME, DISPATCHERSTATCLEARRUNTIME, DISPATCHERTABLEDUMPRUNTIME, DISPATCHERREMOTETIMERLISTDUMPRUNTIME, METRICSAGENTMESSAGE, HEALTHMONITORSTATRUNTIME, METRICSENTITYRUNTIME, PERSISTENCEINTERNAL, HTTPPOLICYSETINTERNAL, DNSPOLICYINTERNAL, CONNECTIONDUMPRUNTIME, SHAREDDBSTATS, SHAREDDBSTATSCLEAR, ICMPSTATRUNTIME, ROUTETABLERUNTIME, VIRTUALMACHINE, POOLSERVER, SEVSLIST, MEMINFORUNTIME, RTERINGSTATRUNTIME, ALGOSTATRUNTIME, HEALTHMONITORRUNTIME, CPUSTATRUNTIME, SEVM, HOST, PORTGROUP, CLUSTER, DATACENTER, VCENTER, HTTPPOLICYSETSTATS, DNSPOLICYSTATS, METRICSSESTATS, RATELIMITERSTATRUNTIME, NETWORKSECURITYPOLICYSTATS, TCPCONNRUNTIME, POOLSTATS, CONNPOOLINTERNAL, CONNPOOLSTATS, VSHASHSHOWRUNTIME, SELOGSTATSRUNTIME, NETWORKSECURITYPOLICYDETAIL, LICENSERUNTIME, SERVERRUNTIME, METRICSRUNTIMESUMMARY, METRICSRUNTIMEDETAIL, DISPATCHERSEHMPROBETEMPDISABLERUNTIME, POOLDEBUG, VSLOGMGRMAP, SERUMINSERTIONSTATS, HTTPCACHE, HTTPCACHESTATS, SEDOSSTATRUNTIME, VSDOSSTATRUNTIME, SERVERUPDATEREQ, VSSCALEOUTLIST, SEMEMDISTRUNTIME, TCPCONNRUNTIMEDETAIL, SEUPGRADESTATUS, SEUPGRADEPREVIEW, SEFAULTINJECTEXHAUSTM, SEFAULTINJECTEXHAUSTMCL, SEFAULTINJECTEXHAUSTMCLSMALL, SEFAULTINJECTEXHAUSTCONN, SEHEADLESSONLINEREQ, SEUPGRADE, SEUPGRADESTATUSDETAIL, SERESERVEDVS, SERESERVEDVSCLEAR, VSCANDIDATESEHOSTLIST, SEGROUPUPGRADE, REBALANCE, SEGROUPREBALANCE, SEAUTHSTATSRUNTIME, AUTOSCALESTATE, VIRTUALSERVICEAUTHSTATS, NETWORKSECURITYPOLICYDOS, KEYVALINTERNAL, KEYVALSUMMARYINTERNAL, SERVERSTATEUPDATEINFO, CLTRACKINTERNAL, CLTRACKSUMMARYINTERNAL, MICROSERVICERUNTIME, SEMICROSERVICE, VIRTUALSERVICEANALYSIS, CLIENTINTERNAL, CLIENTSUMMARYINTERNAL, MICROSERVICEGROUPRUNTIME, BGPRUNTIME, REQUESTQUEUERUNTIME, MIGRATEALL, MIGRATEALLSTATUSSUMMARY, MIGRATEALLSTATUSDETAIL, INTERFACESUMMARYRUNTIME, INTERFACELACPRUNTIME, DNSTABLE, GSLBSERVICEDETAIL, GSLBSERVICEINTERNAL, GSLBSERVICEHMONSTAT, SETROLESREQUEST, TRAFFICCLONERUNTIME, GEOLOCATIONINFO, SEVSHBSTATRUNTIME, GEODBINTERNAL, GSLBSITEINTERNAL, WAFSTATS, USERDEFINEDDATASCRIPTCOUNTERS, LLDPRUNTIME, VSESSHARINGPOOL, NDTABLERUNTIME, IP6STATRUNTIME, ICMP6STATRUNTIME, SEVSSPLACEMENT, L4POLICYSETSTATS, L4POLICYSETINTERNAL, BGPDEBUGINFO, SHARD, CPUSTATRUNTIMEDETAIL, SEASSERTSTATRUNTIME, SEFAULTINJECTINFRA, SEAGENTASSERTSTATRUNTIME, SEDATASTORESTATUS, DIFFQUEUESTATUS, IP6ROUTETABLERUNTIME, SECURITYMGRSTATE, VIRTUALSERVICESESCALEOUTSTATUS, SHARDSERVERSTATUS, SEAGENTSHARDCLIENTRESOURCEMAP, SEAGENTCONSISTENTHASH, SEAGENTVNICDBHISTORY, SEAGENTSHARDCLIENTAPPMAP, SEAGENTSHARDCLIENTEVENTHISTORY, NATSTATRUNTIME, NATFLOWRUNTIME, SECUTIRYMGRRUNTIME, SSOPOLICYSTATS, SENETWORKSERVICERUNTIME, SEGEORUNTIME, NATPOLICYSTATS, SEFAULTRUNTIME, VIRTUALSERVICESCALEOUTSTATUS, VIRTUALSERVICESCALEOUTSTATUSDETAIL, SECURITYMGRLEARN, SECURITYMGRTOPN, SSLSESSIONCACHE, SEGEODETAILS, GSLBSERVICEALGOSTAT, HTTPCONNECTIONRUNTIME, HTTPCONNECTIONRUNTIMEDETAIL, SERESOURCEPROTO, SECONSUMERPROTO, SECREATEPENDINGPROTO, PLACEMENTSTATS, SEVIPPROTO, RMVRFPROTO, VCENTERMAP, VIMGRVCENTERRUNTIME, INTERESTEDVMS, INTERESTEDHOSTS, VCENTERSUPPORTEDCOUNTERS, ENTITYCOUNTERS, TRANSACTIONSTATS, SEVMCREATEPROGRESS, PLACEMENTSTATUS, VISUBFOLDERS, VIDATASTORE, VIHOSTRESOURCES, CLOUDCONNECTOR, VINETWORKSUBNETVMS, VIDATASTORECONTENTS, VIMGRVCENTERCLOUDRUNTIME, VIVCENTERPORTGROUPS, VIVCENTERDATACENTERS, VIMGRHOSTRUNTIME, PLACEMENTGLOBALS, ALBSERVICES, APICCONFIGURATION, CIFTABLE, APICTRANSACTION, VIRTUALSERVICESTATEDBCACHESUMMARY, POOLSTATEDBCACHESUMMARY, SERVERSTATEDBCACHESUMMARY, APICAGENTINTERNAL, APICTRANSACTIONFLAP, APICGRAPHINSTANCES, APICEPGS, APICEPGEPS, APICDEVICEPKGVER, APICTENANTS, APICVMMDOMAINS, NSXCONFIGURATION, NSXSGTABLE, NSXAGENTINTERNAL, NSXSGINFO, NSXSGIPS, NSXAGENTINTERNALCLI, MAXOBJECTS. Field introduced in 18.2.7, 20.1.1.
   * @return objTypes
  **/
  @ApiModelProperty(required = true, value = "Object types that this rule applies to. Enum options - VIRTUALSERVICE, POOL, HEALTHMONITOR, NETWORKPROFILE, APPLICATIONPROFILE, HTTPPOLICYSET, DNSPOLICY, SECURITYPOLICY, IPADDRGROUP, STRINGGROUP, SSLPROFILE, SSLKEYANDCERTIFICATE, NETWORKSECURITYPOLICY, APPLICATIONPERSISTENCEPROFILE, ANALYTICSPROFILE, VSDATASCRIPTSET, TENANT, PKIPROFILE, AUTHPROFILE, CLOUD, SERVERAUTOSCALEPOLICY, AUTOSCALELAUNCHCONFIG, MICROSERVICEGROUP, IPAMPROFILE, HARDWARESECURITYMODULEGROUP, POOLGROUP, PRIORITYLABELS, POOLGROUPDEPLOYMENTPOLICY, GSLBSERVICE, GSLBSERVICERUNTIME, SCHEDULER, GSLBGEODBPROFILE, GSLBAPPLICATIONPERSISTENCEPROFILE, TRAFFICCLONEPROFILE, VSVIP, WAFPOLICY, WAFPROFILE, ERRORPAGEPROFILE, ERRORPAGEBODY, L4POLICYSET, GSLBSERVICERUNTIMEBATCH, WAFPOLICYPSMGROUP, PINGACCESSAGENT, NETWORKSERVICE, NATPOLICY, SSOPOLICY, PROTOCOLPARSER, EXAMPLECHILD, TESTSEDATASTORELEVEL1, TESTSEDATASTORELEVEL2, TESTSEDATASTORELEVEL3, FILEOBJECT, IPREPUTATIONDB, SERVICEENGINE, DEBUGSERVICEENGINE, DEBUGCONTROLLER, DEBUGVIRTUALSERVICE, SERVICEENGINEGROUP, SEPROPERTIES, NETWORK, CONTROLLERNODE, CONTROLLERPROPERTIES, SYSTEMCONFIGURATION, VRFCONTEXT, USER, ALERTCONFIG, ALERTSYSLOGCONFIG, ALERTEMAILCONFIG, ALERTTYPECONFIG, APPLICATION, ROLE, CLOUDPROPERTIES, SNMPTRAPPROFILE, ACTIONGROUPPROFILE, MICROSERVICE, ALERTPARAMS, ACTIONGROUPCONFIG, CLOUDCONNECTORUSER, GSLB, GSLBDNSUPDATE, GSLBSITEOPS, GLBMGRWARMSTART, IPAMDNSRECORD, GSLBDNSGSSTATUS, GSLBDNSGEOFILEOPS, GSLBDNSGEOUPDATE, GSLBDNSGEOCLUSTEROPS, GSLBDNSCLEANUP, GSLBSITEOPSRESYNC, IPAMDNSPROVIDERPROFILE, ALBSERVICESCONFIG, TCPSTATRUNTIME, UDPSTATRUNTIME, IPSTATRUNTIME, ARPSTATRUNTIME, MBSTATRUNTIME, IPSTKQSTATSRUNTIME, MALLOCSTATRUNTIME, SHMALLOCSTATRUNTIME, CPUUSAGERUNTIME, L7GLOBALSTATSRUNTIME, L7VIRTUALSERVICESTATSRUNTIME, SEAGENTVNICDBRUNTIME, SEAGENTGRAPHDBRUNTIME, SEAGENTSTATERUNTIME, INTERFACERUNTIME, ARPTABLERUNTIME, DISPATCHERSTATRUNTIME, DISPATCHERSTATCLEARRUNTIME, DISPATCHERTABLEDUMPRUNTIME, DISPATCHERREMOTETIMERLISTDUMPRUNTIME, METRICSAGENTMESSAGE, HEALTHMONITORSTATRUNTIME, METRICSENTITYRUNTIME, PERSISTENCEINTERNAL, HTTPPOLICYSETINTERNAL, DNSPOLICYINTERNAL, CONNECTIONDUMPRUNTIME, SHAREDDBSTATS, SHAREDDBSTATSCLEAR, ICMPSTATRUNTIME, ROUTETABLERUNTIME, VIRTUALMACHINE, POOLSERVER, SEVSLIST, MEMINFORUNTIME, RTERINGSTATRUNTIME, ALGOSTATRUNTIME, HEALTHMONITORRUNTIME, CPUSTATRUNTIME, SEVM, HOST, PORTGROUP, CLUSTER, DATACENTER, VCENTER, HTTPPOLICYSETSTATS, DNSPOLICYSTATS, METRICSSESTATS, RATELIMITERSTATRUNTIME, NETWORKSECURITYPOLICYSTATS, TCPCONNRUNTIME, POOLSTATS, CONNPOOLINTERNAL, CONNPOOLSTATS, VSHASHSHOWRUNTIME, SELOGSTATSRUNTIME, NETWORKSECURITYPOLICYDETAIL, LICENSERUNTIME, SERVERRUNTIME, METRICSRUNTIMESUMMARY, METRICSRUNTIMEDETAIL, DISPATCHERSEHMPROBETEMPDISABLERUNTIME, POOLDEBUG, VSLOGMGRMAP, SERUMINSERTIONSTATS, HTTPCACHE, HTTPCACHESTATS, SEDOSSTATRUNTIME, VSDOSSTATRUNTIME, SERVERUPDATEREQ, VSSCALEOUTLIST, SEMEMDISTRUNTIME, TCPCONNRUNTIMEDETAIL, SEUPGRADESTATUS, SEUPGRADEPREVIEW, SEFAULTINJECTEXHAUSTM, SEFAULTINJECTEXHAUSTMCL, SEFAULTINJECTEXHAUSTMCLSMALL, SEFAULTINJECTEXHAUSTCONN, SEHEADLESSONLINEREQ, SEUPGRADE, SEUPGRADESTATUSDETAIL, SERESERVEDVS, SERESERVEDVSCLEAR, VSCANDIDATESEHOSTLIST, SEGROUPUPGRADE, REBALANCE, SEGROUPREBALANCE, SEAUTHSTATSRUNTIME, AUTOSCALESTATE, VIRTUALSERVICEAUTHSTATS, NETWORKSECURITYPOLICYDOS, KEYVALINTERNAL, KEYVALSUMMARYINTERNAL, SERVERSTATEUPDATEINFO, CLTRACKINTERNAL, CLTRACKSUMMARYINTERNAL, MICROSERVICERUNTIME, SEMICROSERVICE, VIRTUALSERVICEANALYSIS, CLIENTINTERNAL, CLIENTSUMMARYINTERNAL, MICROSERVICEGROUPRUNTIME, BGPRUNTIME, REQUESTQUEUERUNTIME, MIGRATEALL, MIGRATEALLSTATUSSUMMARY, MIGRATEALLSTATUSDETAIL, INTERFACESUMMARYRUNTIME, INTERFACELACPRUNTIME, DNSTABLE, GSLBSERVICEDETAIL, GSLBSERVICEINTERNAL, GSLBSERVICEHMONSTAT, SETROLESREQUEST, TRAFFICCLONERUNTIME, GEOLOCATIONINFO, SEVSHBSTATRUNTIME, GEODBINTERNAL, GSLBSITEINTERNAL, WAFSTATS, USERDEFINEDDATASCRIPTCOUNTERS, LLDPRUNTIME, VSESSHARINGPOOL, NDTABLERUNTIME, IP6STATRUNTIME, ICMP6STATRUNTIME, SEVSSPLACEMENT, L4POLICYSETSTATS, L4POLICYSETINTERNAL, BGPDEBUGINFO, SHARD, CPUSTATRUNTIMEDETAIL, SEASSERTSTATRUNTIME, SEFAULTINJECTINFRA, SEAGENTASSERTSTATRUNTIME, SEDATASTORESTATUS, DIFFQUEUESTATUS, IP6ROUTETABLERUNTIME, SECURITYMGRSTATE, VIRTUALSERVICESESCALEOUTSTATUS, SHARDSERVERSTATUS, SEAGENTSHARDCLIENTRESOURCEMAP, SEAGENTCONSISTENTHASH, SEAGENTVNICDBHISTORY, SEAGENTSHARDCLIENTAPPMAP, SEAGENTSHARDCLIENTEVENTHISTORY, NATSTATRUNTIME, NATFLOWRUNTIME, SECUTIRYMGRRUNTIME, SSOPOLICYSTATS, SENETWORKSERVICERUNTIME, SEGEORUNTIME, NATPOLICYSTATS, SEFAULTRUNTIME, VIRTUALSERVICESCALEOUTSTATUS, VIRTUALSERVICESCALEOUTSTATUSDETAIL, SECURITYMGRLEARN, SECURITYMGRTOPN, SSLSESSIONCACHE, SEGEODETAILS, GSLBSERVICEALGOSTAT, HTTPCONNECTIONRUNTIME, HTTPCONNECTIONRUNTIMEDETAIL, SERESOURCEPROTO, SECONSUMERPROTO, SECREATEPENDINGPROTO, PLACEMENTSTATS, SEVIPPROTO, RMVRFPROTO, VCENTERMAP, VIMGRVCENTERRUNTIME, INTERESTEDVMS, INTERESTEDHOSTS, VCENTERSUPPORTEDCOUNTERS, ENTITYCOUNTERS, TRANSACTIONSTATS, SEVMCREATEPROGRESS, PLACEMENTSTATUS, VISUBFOLDERS, VIDATASTORE, VIHOSTRESOURCES, CLOUDCONNECTOR, VINETWORKSUBNETVMS, VIDATASTORECONTENTS, VIMGRVCENTERCLOUDRUNTIME, VIVCENTERPORTGROUPS, VIVCENTERDATACENTERS, VIMGRHOSTRUNTIME, PLACEMENTGLOBALS, ALBSERVICES, APICCONFIGURATION, CIFTABLE, APICTRANSACTION, VIRTUALSERVICESTATEDBCACHESUMMARY, POOLSTATEDBCACHESUMMARY, SERVERSTATEDBCACHESUMMARY, APICAGENTINTERNAL, APICTRANSACTIONFLAP, APICGRAPHINSTANCES, APICEPGS, APICEPGEPS, APICDEVICEPKGVER, APICTENANTS, APICVMMDOMAINS, NSXCONFIGURATION, NSXSGTABLE, NSXAGENTINTERNAL, NSXSGINFO, NSXSGIPS, NSXAGENTINTERNALCLI, MAXOBJECTS. Field introduced in 18.2.7, 20.1.1.")
  @NotNull


 
  @VsoMethod  
  public List<String> getObjTypes() {
    return objTypes;
  }
    
  @VsoMethod
  public void setObjTypes(List<String> objTypes) {
    this.objTypes = objTypes;
  }

  
  /**
   * Privilege granted for objects matched by the rule. Enum options - NO_ACCESS, READ_ACCESS, WRITE_ACCESS. Field introduced in 18.2.7, 20.1.1.
   * @return privilege
  **/
  @ApiModelProperty(value = "Privilege granted for objects matched by the rule. Enum options - NO_ACCESS, READ_ACCESS, WRITE_ACCESS. Field introduced in 18.2.7, 20.1.1.")


 
  @VsoMethod  
  public String getPrivilege() {
    return privilege;
  }
    
  @VsoMethod
  public void setPrivilege(String privilege) {
    this.privilege = privilege;
  }

  
  public String getObjectID() {
		return "ObjectAccessPolicyRule";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ObjectAccessPolicyRule objectAccessPolicyRule = (ObjectAccessPolicyRule) o;
    return Objects.equals(this.matches, objectAccessPolicyRule.matches) &&
        Objects.equals(this.name, objectAccessPolicyRule.name) &&
        Objects.equals(this.objTypes, objectAccessPolicyRule.objTypes) &&
        Objects.equals(this.privilege, objectAccessPolicyRule.privilege);
  }

  @Override
  public int hashCode() {
    return Objects.hash(matches, name, objTypes, privilege);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ObjectAccessPolicyRule {\n");
    
    sb.append("    matches: ").append(toIndentedString(matches)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    objTypes: ").append(toIndentedString(objTypes)).append("\n");
    sb.append("    privilege: ").append(toIndentedString(privilege)).append("\n");
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
