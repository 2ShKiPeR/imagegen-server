package com.example.imagegen.service;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


@Service
public class ImageService {

    private final RestTemplate restTemplate = new RestTemplate();

    public String generateImageBase64() {
        String url = "http://localhost:5000/generate-image"; // именно на Flask

        HttpHeaders headers = new HttpHeaders();
        headers.set("Content-Type", "application/json");

        HttpEntity<String> request = new HttpEntity<>(headers);

        ResponseEntity<String> response = restTemplate.exchange(
                url,
                HttpMethod.POST,
                request,
                String.class
        );
        try {
            ObjectMapper mapper = new ObjectMapper();
            JsonNode root = mapper.readTree(response.getBody());
            return root.get("image").asText(); // получить поле "image"
        } catch (Exception e) {
            throw new RuntimeException("Ошибка парсинга JSON", e);
        }
    }
}
