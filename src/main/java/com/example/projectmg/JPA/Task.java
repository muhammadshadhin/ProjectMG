package com.example.projectmg.JPA;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@NoArgsConstructor
@Data
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    private String title;
    private boolean completed;
    @Column(name = "completed_at")
    private Timestamp completedAt;

    @ManyToOne(fetch = FetchType.LAZY)
    @JsonIgnore
    private Goal goal;

}
