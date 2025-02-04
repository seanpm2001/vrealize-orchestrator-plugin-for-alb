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
 * The DebugSeAgent is a POJO class extends AviRestResource that used for creating
 * DebugSeAgent.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "DebugSeAgent")
@VsoFinder(name = Constants.FINDER_VRO_DEBUGSEAGENT)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class DebugSeAgent extends AviRestResource {
    @JsonProperty("log_every_n")
    @JsonInclude(Include.NON_NULL)
    private Integer logEveryN = 0;

    @JsonProperty("log_level")
    @JsonInclude(Include.NON_NULL)
    private String logLevel = null;

    @JsonProperty("sub_module")
    @JsonInclude(Include.NON_NULL)
    private String subModule = null;

    @JsonProperty("trace_level")
    @JsonInclude(Include.NON_NULL)
    private String traceLevel = null;



  /**
   * This is the getter method this will return the attribute value.
   * Log every nth message.
   * Field introduced in 17.2.7.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 0.
   * @return logEveryN
   */
  @VsoMethod
  public Integer getLogEveryN() {
    return logEveryN;
  }

  /**
   * This is the setter method to the attribute.
   * Log every nth message.
   * Field introduced in 17.2.7.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 0.
   * @param logEveryN set the logEveryN.
   */
  @VsoMethod
  public void setLogEveryN(Integer  logEveryN) {
    this.logEveryN = logEveryN;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Enum options - LOG_LEVEL_DISABLED, LOG_LEVEL_INFO, LOG_LEVEL_WARNING, LOG_LEVEL_ERROR.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return logLevel
   */
  @VsoMethod
  public String getLogLevel() {
    return logLevel;
  }

  /**
   * This is the setter method to the attribute.
   * Enum options - LOG_LEVEL_DISABLED, LOG_LEVEL_INFO, LOG_LEVEL_WARNING, LOG_LEVEL_ERROR.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param logLevel set the logLevel.
   */
  @VsoMethod
  public void setLogLevel(String  logLevel) {
    this.logLevel = logLevel;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Enum options - TASK_QUEUE_DEBUG, RPC_INFRA_DEBUG, JOB_MGR_DEBUG, TRANSACTION_DEBUG, SE_AGENT_DEBUG, SE_AGENT_METRICS_DEBUG, VIRTUALSERVICE_DEBUG,
   * RES_MGR_DEBUG, SE_MGR_DEBUG, VI_MGR_DEBUG, METRICS_MANAGER_DEBUG, METRICS_MGR_DEBUG, EVENT_API_DEBUG, HS_MGR_DEBUG, ALERT_MGR_DEBUG,
   * AUTOSCALE_MGR_DEBUG, APIC_AGENT_DEBUG, REDIS_INFRA_DEBUG, CLOUD_CONNECTOR_DEBUG, MESOS_METRICS_DEBUG...
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return subModule
   */
  @VsoMethod
  public String getSubModule() {
    return subModule;
  }

  /**
   * This is the setter method to the attribute.
   * Enum options - TASK_QUEUE_DEBUG, RPC_INFRA_DEBUG, JOB_MGR_DEBUG, TRANSACTION_DEBUG, SE_AGENT_DEBUG, SE_AGENT_METRICS_DEBUG, VIRTUALSERVICE_DEBUG,
   * RES_MGR_DEBUG, SE_MGR_DEBUG, VI_MGR_DEBUG, METRICS_MANAGER_DEBUG, METRICS_MGR_DEBUG, EVENT_API_DEBUG, HS_MGR_DEBUG, ALERT_MGR_DEBUG,
   * AUTOSCALE_MGR_DEBUG, APIC_AGENT_DEBUG, REDIS_INFRA_DEBUG, CLOUD_CONNECTOR_DEBUG, MESOS_METRICS_DEBUG...
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param subModule set the subModule.
   */
  @VsoMethod
  public void setSubModule(String  subModule) {
    this.subModule = subModule;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Enum options - TRACE_LEVEL_DISABLED, TRACE_LEVEL_ERROR, TRACE_LEVEL_DEBUG, TRACE_LEVEL_DEBUG_DETAIL.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return traceLevel
   */
  @VsoMethod
  public String getTraceLevel() {
    return traceLevel;
  }

  /**
   * This is the setter method to the attribute.
   * Enum options - TRACE_LEVEL_DISABLED, TRACE_LEVEL_ERROR, TRACE_LEVEL_DEBUG, TRACE_LEVEL_DEBUG_DETAIL.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param traceLevel set the traceLevel.
   */
  @VsoMethod
  public void setTraceLevel(String  traceLevel) {
    this.traceLevel = traceLevel;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  DebugSeAgent objDebugSeAgent = (DebugSeAgent) o;
  return   Objects.equals(this.subModule, objDebugSeAgent.subModule)&&
  Objects.equals(this.traceLevel, objDebugSeAgent.traceLevel)&&
  Objects.equals(this.logLevel, objDebugSeAgent.logLevel)&&
  Objects.equals(this.logEveryN, objDebugSeAgent.logEveryN);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class DebugSeAgent {\n");
      sb.append("    logEveryN: ").append(toIndentedString(logEveryN)).append("\n");
        sb.append("    logLevel: ").append(toIndentedString(logLevel)).append("\n");
        sb.append("    subModule: ").append(toIndentedString(subModule)).append("\n");
        sb.append("    traceLevel: ").append(toIndentedString(traceLevel)).append("\n");
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

