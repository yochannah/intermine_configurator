/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.4).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.model.SupplementaryDataSource;
import io.swagger.model.SupplementaryDataSourcesResponse;
import io.swagger.annotations.*;
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

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-01-22T09:44:44.307Z[GMT]")
@Api(value = "supplementaryDataSources", description = "the supplementaryDataSources API")
public interface SupplementaryDataSourcesApi {

    @ApiOperation(value = "Get list of possible supplementary data sources for this mine config", nickname = "getSupplementaryDataSources", notes = "Returns a list of possible external data sources to add to this mine, e.g. GO terms, publications, etc.", response = SupplementaryDataSource.class, responseContainer = "List", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = SupplementaryDataSource.class, responseContainer = "List") })
    @RequestMapping(value = "/supplementaryDataSources",
        produces = { "application/json", "application/xml" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<SupplementaryDataSource>> getSupplementaryDataSources();


    @ApiOperation(value = "set list of desired supplementary data sources", nickname = "setSupplementaryDataSources", notes = "Saves a list of possible external data sources to add to this mine, e.g. GO terms, publications, etc.", response = SupplementaryDataSourcesResponse.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = SupplementaryDataSourcesResponse.class) })
    @RequestMapping(value = "/supplementaryDataSources",
        produces = { "application/json", "application/xml" }, 
        method = RequestMethod.POST)
    ResponseEntity<SupplementaryDataSourcesResponse> setSupplementaryDataSources();

}
