package io.swagger.api;

import io.swagger.model.DataBuild;
import io.swagger.model.DataBuildStatus;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
import java.util.Map;
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-01-22T09:44:44.307Z[GMT]")
@Controller
public class BuildApiController implements BuildApi {

    private static final Logger log = LoggerFactory.getLogger(BuildApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public BuildApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<DataBuildStatus> buildStatusGet() {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<DataBuildStatus>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<DataBuild> buildTriggerPost() {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<DataBuild>(HttpStatus.NOT_IMPLEMENTED);
    }

}
