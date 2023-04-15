/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.42).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.model.HTTPProblem;
import io.swagger.model.SchemaVehiculo;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.bind.annotation.CookieValue;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-04-15T22:33:46.553Z[GMT]")
@Validated
public interface VehiculosApi {

    @Operation(summary = "Obtener todos los vehículos", description = "", tags={ "🚗 Vehiculos" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Lista de vehículos", content = @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = SchemaVehiculo.class)))),
        
        @ApiResponse(responseCode = "404", description = "`NOT FOUND`: recurso no disponible", content = @Content(mediaType = "application/problem+json", schema = @Schema(implementation = HTTPProblem.class))) })
    @RequestMapping(value = "/vehiculos",
        produces = { "application/json", "application/problem+json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<SchemaVehiculo>> vehiculoCget();


    @Operation(summary = "Añadir un nuevo vehículo", description = "", tags={ "🚗 Vehiculos" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "201", description = "Vehículo creado", content = @Content(mediaType = "application/json", schema = @Schema(implementation = SchemaVehiculo.class))),
        
        @ApiResponse(responseCode = "400", description = "`BAD REQUEST` El identificador único ya existe.", content = @Content(mediaType = "application/problem+json", schema = @Schema(implementation = HTTPProblem.class))),
        
        @ApiResponse(responseCode = "409", description = "`CONFLICT`: el recurso no reúne las condiciones adecuadas", content = @Content(mediaType = "application/problem+json", schema = @Schema(implementation = HTTPProblem.class))),
        
        @ApiResponse(responseCode = "422", description = "`UNPROCESSABLE ENTITY` Falta alguno de los atributos obligatorios o son incorrectos.", content = @Content(mediaType = "application/problem+json", schema = @Schema(implementation = HTTPProblem.class))) })
    @RequestMapping(value = "/vehiculos",
        produces = { "application/json", "application/problem+json" }, 
        consumes = { "application/json" }, 
        method = RequestMethod.POST)
    ResponseEntity<SchemaVehiculo> vehiculoCpost(@Parameter(in = ParameterIn.DEFAULT, description = "Datos del vehículo a añadir", required=true, schema=@Schema()) @Valid @RequestBody SchemaVehiculo body);


    @Operation(summary = "Eliminar un vehículo por VIN", description = "", tags={ "🚗 Vehiculos" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "204", description = "Vehiculo eliminado &lt;Cuerpo de la respuesta vacío&gt;"),
        
        @ApiResponse(responseCode = "404", description = "`NOT FOUND`: recurso no disponible", content = @Content(mediaType = "application/problem+json", schema = @Schema(implementation = HTTPProblem.class))) })
    @RequestMapping(value = "/vehiculos/{vin}",
        produces = { "application/problem+json" }, 
        method = RequestMethod.DELETE)
    ResponseEntity<Void> vehiculoDelete(@Parameter(in = ParameterIn.PATH, description = "VIN del vehículo", required=true, schema=@Schema()) @PathVariable("vin") String vin);


    @Operation(summary = "Obtener un vehículo por VIN", description = "", tags={ "🚗 Vehiculos" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Vehículo encontrado", content = @Content(mediaType = "application/json", schema = @Schema(implementation = SchemaVehiculo.class))),
        
        @ApiResponse(responseCode = "404", description = "`NOT FOUND`: recurso no disponible", content = @Content(mediaType = "application/problem+json", schema = @Schema(implementation = HTTPProblem.class))) })
    @RequestMapping(value = "/vehiculos/{vin}",
        produces = { "application/json", "application/problem+json" }, 
        method = RequestMethod.GET)
    ResponseEntity<SchemaVehiculo> vehiculoGet(@Parameter(in = ParameterIn.PATH, description = "VIN del vehículo", required=true, schema=@Schema()) @PathVariable("vin") String vin);


    @Operation(summary = "Proporciona la lista de los métodos HTTP soportados por esta ruta.", description = "Devuelve una cabecera `Allow` con la lista de métodos HTTP soportados (separados por comas).", tags={ "🚗 Vehiculos" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "204", description = "cabecera `Allow` &lt;El cuerpo de la respuesta está vacío&gt;") })
    @RequestMapping(value = "/vehiculos/{vin}",
        method = RequestMethod.OPTIONS)
    ResponseEntity<Void> vehiculoOptions();


    @Operation(summary = "Actualizar un vehículo por VIN", description = "", tags={ "🚗 Vehiculos" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Vehículo actualizado", content = @Content(mediaType = "application/json", schema = @Schema(implementation = SchemaVehiculo.class))),
        
        @ApiResponse(responseCode = "404", description = "`NOT FOUND`: recurso no disponible", content = @Content(mediaType = "application/problem+json", schema = @Schema(implementation = HTTPProblem.class))),
        
        @ApiResponse(responseCode = "412", description = "`PRECONDITION FAILED`: El ETag proporcionado no está actualizado", content = @Content(mediaType = "application/problem+json", schema = @Schema(implementation = HTTPProblem.class))),
        
        @ApiResponse(responseCode = "422", description = "`UNPROCESSABLE ENTITY` Falta alguno de los atributos obligatorios o son incorrectos.", content = @Content(mediaType = "application/problem+json", schema = @Schema(implementation = HTTPProblem.class))) })
    @RequestMapping(value = "/vehiculos/{vin}",
        produces = { "application/json", "application/problem+json" }, 
        consumes = { "application/json" }, 
        method = RequestMethod.PUT)
    ResponseEntity<SchemaVehiculo> vehiculoPut(@Parameter(in = ParameterIn.PATH, description = "VIN del vehículo", required=true, schema=@Schema()) @PathVariable("vin") String vin, @Parameter(in = ParameterIn.DEFAULT, description = "Datos actualizados del vehículo", required=true, schema=@Schema()) @Valid @RequestBody SchemaVehiculo body);

}
