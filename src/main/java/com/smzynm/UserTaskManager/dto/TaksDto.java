package com.smzynm.UserTaskManager.dto;

import lombok.Data;

import java.time.LocalDateTime;
@Data

public class TaksDto {
    private Long id;
    private String name;
    private String description;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private String state;
    private String identification_user;
}
