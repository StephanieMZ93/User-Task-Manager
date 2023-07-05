package com.smzynm.UserTaskManager.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "user")

public class User {
    @Id
    private String identification;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String lastname;
    @Column(nullable = false)
    private String city;
    @Column(nullable = false)
    private String phone;
    @Column(nullable = false, unique = true)
    private String email;
    @OneToMany(mappedBy = "user")
    private List<Task> taskList;
}
