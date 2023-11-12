package com.example.demo.controller;

import com.example.demo.model.Response;
import com.example.demo.service.ResponseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ResponseController {

    @Autowired
    ResponseService responseService;
@PostMapping("/submission")
    public void submission(@RequestBody Response response){
        responseService.submitResponse(response);
}
}
