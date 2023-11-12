package com.example.demo.service;

import com.example.demo.model.Response;
import com.example.demo.repository.ResponseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Component
public class ResponseService {
    @Autowired
    private ResponseRepo responseRepository;


    public void submitResponse(Response response) {
        responseRepository.save(response);
    }
}
