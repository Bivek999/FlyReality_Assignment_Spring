package com.example.demo.controller;

import com.example.demo.model.Document;
import com.example.demo.service.DocumentService;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DocumentController {
    @Autowired
    private DocumentService documentService;

    @PostMapping("/create")
    public ResponseEntity<String> createDocument(@RequestBody Document document) {
        documentService.saveDocument(document);
        return ResponseEntity.ok("Document created successfully");
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<Document> getDocument(@PathVariable Long id) {
        Document document = documentService.getDocument(id);

        if (document != null) {
            return ResponseEntity.ok(document);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
