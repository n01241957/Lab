package com.example.demo;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DeviceController {
    private final DeviceService deviceService;

    public DeviceController(DeviceService deviceService) {
        this.deviceService = deviceService;
    }

    @GetMapping("/devices")
    public String viewDevices(Model model) {
        model.addAttribute("devices", deviceService.getAllDevices());
        return "devices";
    }

    @PostMapping("/toggle-device")
    public String toggleDevice(@RequestParam int id) {
        deviceService.toggleDeviceStatus(id);
        return "redirect:/devices";
    }
}

