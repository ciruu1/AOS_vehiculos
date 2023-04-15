package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SchemaVehiculo
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-04-15T22:33:46.553Z[GMT]")


public class SchemaVehiculo   {
  @JsonProperty("vin")
  private String vin = null;

  @JsonProperty("cliente")
  private String cliente = null;

  @JsonProperty("taller")
  private String taller = null;

  public SchemaVehiculo vin(String vin) {
    this.vin = vin;
    return this;
  }

  /**
   * Número de identificación del vehículo (VIN)
   * @return vin
   **/
  @Schema(required = true, description = "Número de identificación del vehículo (VIN)")
      @NotNull

    public String getVin() {
    return vin;
  }

  public void setVin(String vin) {
    this.vin = vin;
  }

  public SchemaVehiculo cliente(String cliente) {
    this.cliente = cliente;
    return this;
  }

  /**
   * Identificador único del propietario del vehículo
   * @return cliente
   **/
  @Schema(required = true, description = "Identificador único del propietario del vehículo")
      @NotNull

    public String getCliente() {
    return cliente;
  }

  public void setCliente(String cliente) {
    this.cliente = cliente;
  }

  public SchemaVehiculo taller(String taller) {
    this.taller = taller;
    return this;
  }

  /**
   * Taller de reparacion
   * @return taller
   **/
  @Schema(required = true, description = "Taller de reparacion")
      @NotNull

    public String getTaller() {
    return taller;
  }

  public void setTaller(String taller) {
    this.taller = taller;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SchemaVehiculo schemaVehiculo = (SchemaVehiculo) o;
    return Objects.equals(this.vin, schemaVehiculo.vin) &&
        Objects.equals(this.cliente, schemaVehiculo.cliente) &&
        Objects.equals(this.taller, schemaVehiculo.taller);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vin, cliente, taller);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SchemaVehiculo {\n");
    
    sb.append("    vin: ").append(toIndentedString(vin)).append("\n");
    sb.append("    cliente: ").append(toIndentedString(cliente)).append("\n");
    sb.append("    taller: ").append(toIndentedString(taller)).append("\n");
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
