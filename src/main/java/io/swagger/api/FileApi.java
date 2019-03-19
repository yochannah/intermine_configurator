/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.4).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.model.DataFile;
import io.swagger.model.DataFileProperties;
import io.swagger.model.DataFilePropertiesResponseInner;
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
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-01-23T12:52:20.308Z[GMT]")
@Api(value = "file", description = "the file API")
public interface FileApi {

//    @ApiOperation(value = "Return identified file type", nickname = "detectFileProperties", notes = "", response = DataFileProperties.class, tags={  })
//    @ApiResponses(value = {
//        @ApiResponse(code = 200, message = "successfully detected file type", response = DataFileProperties.class) })
//    @RequestMapping(value = "/file/properties/detect",
//        produces = { "application/json", "application/xml" },
//        consumes = { "application/json", "application/xml", "multipart/form-data" },
//        method = RequestMethod.POST)
//    ResponseEntity<DataFileProperties> detectFileProperties(@ApiParam(value = "File or file snippet that needs to be identified." ,required=true )  @Valid @RequestBody DataFile body);
//

    @ApiOperation(value = "Validate data file", nickname = "detectFileProperties", notes = "", response = DataFileProperties.class, tags={  })
    @ApiResponses(value = {
        @ApiResponse(code = 200, message = "successfully detected file type", response = DataFileProperties.class) })
    @RequestMapping(value = "/file/properties/detect",
        produces = { "application/json", "application/xml" },
        consumes = { "application/json", "application/xml", "multipart/form-data" },
        method = RequestMethod.POST)
    //ResponseEntity<DataFileProperties> detectFileProperties(@ApiParam(value = "") @RequestParam(value="name", required=true)  String name,@ApiParam(value = "") @RequestParam(value="fileContents", required=true)  String fileContents,@ApiParam(value = "", allowableValues="fasta, gff, tab, csv") @RequestParam(value="fileFormat", required=true)  String fileFormat,@ApiParam(value = "") @RequestParam(value="organism", required=true)  Object organism);
    ResponseEntity<DataFileProperties> detectFileProperties(@ApiParam(value = "File or file snippet that needs to be identified." ,required=true )  @Valid @RequestBody DataFile body);


    @ApiOperation(value = "Delete file and associated properties", nickname = "fileDeletePost", notes = "Remove uploaded file and any properties detected or mapped by user.", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "File and properties deleted") })
    @RequestMapping(value = "/file/delete",
        consumes = { "application/json", "application/xml" },
        method = RequestMethod.POST)
    ResponseEntity<Void> fileDeletePost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody String body);


    @ApiOperation(value = "Upload File that has properties mapped", nickname = "fileSavePost", notes = "Finalise upload for a file that has already had its properties detected and mapped.", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successfully saved provided File") })
    @RequestMapping(value = "/file/save",
        consumes = { "application/json", "application/xml" },
        method = RequestMethod.POST)
    ResponseEntity<Void> fileSavePost(@ApiParam(value = "File or file snippet that needs to be identified." ,required=true )  @Valid @RequestBody DataFile body);


    @ApiOperation(value = "Save file properties to a given InterMine pre-build config", nickname = "saveFileProperties", notes = "Following on from `detectFileProperties`, we need to save a set of configs associated with a file. This can be run multiple times, as the user may upload an unknown number of files.", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successfully saved provided DataFileProperties details") })
    @RequestMapping(value = "/file/properties/save",
        consumes = { "application/json", "application/xml" },
        method = RequestMethod.POST)
    ResponseEntity<Void> saveFileProperties(@ApiParam(value = "File or file snippet that needs to be identified." ,required=true )  @Valid @RequestBody List<DataFilePropertiesResponseInner> body);

}