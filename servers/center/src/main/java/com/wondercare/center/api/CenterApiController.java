package com.wondercare.center.api;

import com.wondercare.center.api.mapper.CenterMapper;
import com.wondercare.center.api.model.Center;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.wondercare.center.data.repository.CenterRepository;
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
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-01-19T21:41:34.831+08:00")

@Controller
public class CenterApiController implements CenterApi {

    private static final Logger log = LoggerFactory.getLogger(CenterApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    private final CenterRepository centerRepository;

    @org.springframework.beans.factory.annotation.Autowired
    public CenterApiController(ObjectMapper objectMapper, HttpServletRequest request, CenterRepository centerRepository) {
        this.objectMapper = objectMapper;
        this.request = request;
        this.centerRepository = centerRepository;
    }

    public ResponseEntity<Center> getCenterById(@ApiParam(value = "ID of center to return",required=true) @PathVariable("centerId") Long centerId) {
        String accept = request.getHeader("Accept");
        Center center = CenterMapper.INSTANCE.toCenter(centerRepository.findById(centerId).get());
        return new ResponseEntity<Center>(center, HttpStatus.OK);
    }

}
