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
 * The MesosMetricsDebugFilter is a POJO class extends AviRestResource that used for creating
 * MesosMetricsDebugFilter.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "MesosMetricsDebugFilter")
@VsoFinder(name = Constants.FINDER_VRO_MESOSMETRICSDEBUGFILTER)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class MesosMetricsDebugFilter extends AviRestResource {
    @JsonProperty("mesos_master")
    @JsonInclude(Include.NON_NULL)
    private String mesosMaster = null;

    @JsonProperty("mesos_slave")
    @JsonInclude(Include.NON_NULL)
    private String mesosSlave = null;

    @JsonProperty("metric_entity")
    @JsonInclude(Include.NON_NULL)
    private String metricEntity = null;

    @JsonProperty("metrics_collection_frq")
    @JsonInclude(Include.NON_NULL)
    private Integer metricsCollectionFrq = 60;



  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return mesosMaster
   */
  @VsoMethod
  public String getMesosMaster() {
    return mesosMaster;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param mesosMaster set the mesosMaster.
   */
  @VsoMethod
  public void setMesosMaster(String  mesosMaster) {
    this.mesosMaster = mesosMaster;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return mesosSlave
   */
  @VsoMethod
  public String getMesosSlave() {
    return mesosSlave;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param mesosSlave set the mesosSlave.
   */
  @VsoMethod
  public void setMesosSlave(String  mesosSlave) {
    this.mesosSlave = mesosSlave;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Enum options - VSERVER_METRICS_ENTITY, VM_METRICS_ENTITY, SE_METRICS_ENTITY, CONTROLLER_METRICS_ENTITY, APPLICATION_METRICS_ENTITY,
   * TENANT_METRICS_ENTITY, POOL_METRICS_ENTITY.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return metricEntity
   */
  @VsoMethod
  public String getMetricEntity() {
    return metricEntity;
  }

  /**
   * This is the setter method to the attribute.
   * Enum options - VSERVER_METRICS_ENTITY, VM_METRICS_ENTITY, SE_METRICS_ENTITY, CONTROLLER_METRICS_ENTITY, APPLICATION_METRICS_ENTITY,
   * TENANT_METRICS_ENTITY, POOL_METRICS_ENTITY.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param metricEntity set the metricEntity.
   */
  @VsoMethod
  public void setMetricEntity(String  metricEntity) {
    this.metricEntity = metricEntity;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 60.
   * @return metricsCollectionFrq
   */
  @VsoMethod
  public Integer getMetricsCollectionFrq() {
    return metricsCollectionFrq;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 60.
   * @param metricsCollectionFrq set the metricsCollectionFrq.
   */
  @VsoMethod
  public void setMetricsCollectionFrq(Integer  metricsCollectionFrq) {
    this.metricsCollectionFrq = metricsCollectionFrq;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  MesosMetricsDebugFilter objMesosMetricsDebugFilter = (MesosMetricsDebugFilter) o;
  return   Objects.equals(this.metricEntity, objMesosMetricsDebugFilter.metricEntity)&&
  Objects.equals(this.mesosMaster, objMesosMetricsDebugFilter.mesosMaster)&&
  Objects.equals(this.mesosSlave, objMesosMetricsDebugFilter.mesosSlave)&&
  Objects.equals(this.metricsCollectionFrq, objMesosMetricsDebugFilter.metricsCollectionFrq);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class MesosMetricsDebugFilter {\n");
      sb.append("    mesosMaster: ").append(toIndentedString(mesosMaster)).append("\n");
        sb.append("    mesosSlave: ").append(toIndentedString(mesosSlave)).append("\n");
        sb.append("    metricEntity: ").append(toIndentedString(metricEntity)).append("\n");
        sb.append("    metricsCollectionFrq: ").append(toIndentedString(metricsCollectionFrq)).append("\n");
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

