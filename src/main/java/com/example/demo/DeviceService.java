package com.example.demo;


import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeviceService {
    private final DeviceRepository deviceRepository;

    public DeviceService(DeviceRepository deviceRepository) {
        this.deviceRepository = deviceRepository;
    }

    public List<Device> getAllDevices() {
        return deviceRepository.getDevices();
    }

    public void toggleDeviceStatus(int id) {
        List<Device> devices = deviceRepository.getDevices();
        for (Device device : devices) {
            if (device.getId() == id) {
                device.setStatus(!device.isStatus());
                break;
            }
        }
        deviceRepository.saveDevices(devices);
    }
}

