package io.swagger.api;

import io.swagger.model.HTTPProblem;
import io.swagger.model.SchemaVehiculo;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-04-15T22:33:46.553Z[GMT]")
@RestController
public class VehiculosApiController implements VehiculosApi {

    private static final Logger log = LoggerFactory.getLogger(VehiculosApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public VehiculosApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<List<SchemaVehiculo>> vehiculoCget() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<SchemaVehiculo>>(objectMapper.readValue("[ {\n  \"cliente\" : \"cliente\",\n  \"taller\" : \"taller\",\n  \"vin\" : \"vin\"\n}, {\n  \"cliente\" : \"cliente\",\n  \"taller\" : \"taller\",\n  \"vin\" : \"vin\"\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<SchemaVehiculo>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<SchemaVehiculo>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<SchemaVehiculo> vehiculoCpost(@Parameter(in = ParameterIn.DEFAULT, description = "Datos del vehículo a añadir", required=true, schema=@Schema()) @Valid @RequestBody SchemaVehiculo body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<SchemaVehiculo>(objectMapper.readValue("{\n  \"cliente\" : \"cliente\",\n  \"taller\" : \"taller\",\n  \"vin\" : \"vin\"\n}", SchemaVehiculo.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<SchemaVehiculo>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<SchemaVehiculo>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> vehiculoDelete(@Parameter(in = ParameterIn.PATH, description = "VIN del vehículo", required=true, schema=@Schema()) @PathVariable("vin") String vin) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<SchemaVehiculo> vehiculoGet(@Parameter(in = ParameterIn.PATH, description = "VIN del vehículo", required=true, schema=@Schema()) @PathVariable("vin") String vin) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<SchemaVehiculo>(objectMapper.readValue("{\n  \"cliente\" : \"cliente\",\n  \"taller\" : \"taller\",\n  \"vin\" : \"vin\"\n}", SchemaVehiculo.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<SchemaVehiculo>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<SchemaVehiculo>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> vehiculoOptions() {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<SchemaVehiculo> vehiculoPut(@Parameter(in = ParameterIn.PATH, description = "VIN del vehículo", required=true, schema=@Schema()) @PathVariable("vin") String vin,@Parameter(in = ParameterIn.DEFAULT, description = "Datos actualizados del vehículo", required=true, schema=@Schema()) @Valid @RequestBody SchemaVehiculo body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<SchemaVehiculo>(objectMapper.readValue("{\n  \"cliente\" : \"cliente\",\n  \"taller\" : \"taller\",\n  \"vin\" : \"vin\"\n}", SchemaVehiculo.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<SchemaVehiculo>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<SchemaVehiculo>(HttpStatus.NOT_IMPLEMENTED);
    }

}
