package com.example.demo;

import java.io.Serializable;

public class Device implements Serializable {
    private int id;
    private String name;
    private String type;
    private boolean status; // true = ON, false = OFF

    // Constructor
    public Device(int id, String name, String type, boolean status) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.status = status;
    }

    // Default Constructor
    public Device() {
    }

    // Getter Methods
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public boolean isStatus() {
        return status;
    }

    // Setter Methods
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Device{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", status=" + status +
                '}';
    }
}
