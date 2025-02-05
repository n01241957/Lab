package com.example.demo;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Schedule {
    private int id;
    private int deviceId;
    private LocalDateTime scheduledTime;
    private boolean status; // true = turn on, false = turn off
}

