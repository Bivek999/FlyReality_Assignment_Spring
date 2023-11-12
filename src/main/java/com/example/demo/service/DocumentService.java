package com.example.demo.service;

import com.example.demo.model.Document;
import com.example.demo.repository.DocumentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@Service
public class DocumentService {

    @Autowired
    private DocumentRepository documentRepository;

    public void saveDocument(Document document) {
        documentRepository.save(document);
    }

    public Document getDocument(Long id) {
        Optional<Document> optionalDocument = documentRepository.findById(id);
        return optionalDocument.orElse(null);
    }
}
