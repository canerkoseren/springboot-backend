package com.example.sample;

import java.util.Arrays;
import java.util.List;

import com.example.sample.model.SampleEntity;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sample-backend")
public class SampleRestController {

    Logger logger = LoggerFactory.getLogger(SampleRestController.class);
    
    @GetMapping(value = "/status")
    public ResponseEntity<String> getStatus(){

        logger.info("Status is UP");

        return new ResponseEntity<>("OK", HttpStatus.OK);
    }

    @GetMapping(value = "/list")
    public ResponseEntity<List<SampleEntity>> list(){

        return new ResponseEntity<>(Arrays.asList(new SampleEntity()), HttpStatus.OK);
    }
}
