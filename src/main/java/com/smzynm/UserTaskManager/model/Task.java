package com.smzynm.UserTaskManager.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "task")

public class Task {
    @Id
    private Long id;
    @Column(nullable = true)
    private String name;
    @Column(nullable = true)
    private String description;
    @Column(nullable = true)
    private LocalDateTime startDate;
    @Column(nullable = true)
    private LocalDateTime endDate;
    @Enumerated(EnumType.STRING)
    private State state;
    @Column(nullable = true, name = "identification_user")
    private String identicationUser;
    @ManyToOne
    @JoinColumn(name = "identification_user", insertable = false, updatable = false)
    private User user;
}
