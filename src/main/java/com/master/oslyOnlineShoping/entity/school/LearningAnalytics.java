package com.master.oslyOnlineShoping.entity.school;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "LearningAnalytics")
public class LearningAnalytics {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long analyticsId;

    private String performanceMetric;
    private LocalDate dateRecorded;

    // Relationships
    @ManyToOne
    @JoinColumn(name = "student_id")
    private Student student;

    @ManyToOne
    @JoinColumn(name = "activity_id")
    private Activity activity;
}
