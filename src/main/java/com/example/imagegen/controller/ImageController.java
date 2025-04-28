package com.example.imagegen.controller;

import com.example.imagegen.service.ImageService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/generate")
public class ImageController {

    private final ImageService imageService;

    public ImageController(ImageService imageService) {
        this.imageService = imageService;
    }

    @PostMapping
    public ResponseEntity<Map<String, String>> generateImage() {
        String base64Image = imageService.generateImageBase64();

        Map<String, String> response = new HashMap<>();
        response.put("image", base64Image);

        return ResponseEntity.ok(response);
    }
}
