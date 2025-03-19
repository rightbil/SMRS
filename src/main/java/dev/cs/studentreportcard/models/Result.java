package dev.cs.studentreportcard.models;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import java.time.LocalDate;
import java.time.Period;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity // make it JPA entity
@Table(name = "Result") // make table name "customers" in db
@FieldDefaults(level = AccessLevel.PRIVATE) //make all fields access specifier private
@SequenceGenerator(name = "customerNumber_Seq", initialValue = 1000, allocationSize = 1)
public class Result {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "customerNumber_Seq")
    @Setter(AccessLevel.PRIVATE)
    Integer ResultId;// int(11)NOT NULL,
    //FK
    Integer StudentId;// int(11)NOT NULL,
    @Column(length = 50)
    String Subject; // Varchar(50) NULL
    @Column(nullable = false, length = 50)
    String AcademicYear;// varchar(50)NOT NULL,
    @Column(nullable = false, length = 1)
    String Grade;// varchar(50)NOT NULL,
    @Column(nullable = false, length = 1)
    String Section;
    @Column()
    @Min(0)
    @Max(100)
    Integer Q1;
    @Column()
    @Min(0)
    @Max(100)
    Integer Q2;
    @Column()
    @Min(0)
    @Max(100)
    Integer Q3;
    @Column()
    @Min(0)
    @Max(100)
    Integer Q4;
    @Column(columnDefinition = "varchar(50) default NULL")
    String UpdatedBy;// varchar(50)DEFAULT NULL,
    @Column(nullable = false, length = 50)
    String UpdateDate;// varchar(50)NOT NULL,
    @Column(length = 100)
    String Comment;
}

