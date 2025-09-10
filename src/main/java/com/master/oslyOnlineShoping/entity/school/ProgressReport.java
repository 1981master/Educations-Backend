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
@Table(name = "ProgressReports")
public class ProgressReport {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long reportId;

    private LocalDate reportDate;
    private String summary;
    private String areasOfImprovement;

    // Relationships
    @ManyToOne
    @JoinColumn(name = "student_id")
    private Student student;
}
