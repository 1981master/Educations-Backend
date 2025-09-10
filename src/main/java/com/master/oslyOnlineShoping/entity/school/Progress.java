package com.master.oslyOnlineShoping.entity.school;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "Progress")
public class Progress {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long progressId;

    private Integer score;
    private String completionStatus;
    private Integer timeSpent;
    private Double percentageProgress;
    private LocalDate dateCompleted;

    // Relationships
    @ManyToOne
    @JoinColumn(name = "student_id")
    private Student student;

    @ManyToOne
    @JoinColumn(name = "activity_id")
    private Activity activity;

    @ManyToOne
    @JoinColumn(name = "subject_id")
    private Subject subject;
}
