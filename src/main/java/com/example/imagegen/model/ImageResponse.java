package com.example.imagegen.model;

public class ImageResponse {
    private String imageBase64;

    public ImageResponse() {}

    public ImageResponse(String imageBase64) {
        this.imageBase64 = imageBase64;
    }

    public String getImageBase64() {
        return imageBase64;
    }

    public void setImageBase64(String imageBase64) {
        this.imageBase64 = imageBase64;
    }
}
