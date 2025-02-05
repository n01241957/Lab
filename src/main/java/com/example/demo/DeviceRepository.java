package com.example.demo;


import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class DeviceRepository {
    private final String filePath = "src/main/resources/data/devices.json";
    private final ObjectMapper objectMapper = new ObjectMapper();

    public List<Device> getDevices() {
        try {
            return objectMapper.readValue(new File(filePath), new TypeReference<List<Device>>() {});
        } catch (Exception e) {
            throw new RuntimeException("Error reading devices.json", e);
        }
    }

    public void saveDevices(List<Device> devices) {
        try {
            objectMapper.writeValue(new File(filePath), devices);
        } catch (Exception e) {
            throw new RuntimeException("Error writing to devices.json", e);
        }
    }
}

