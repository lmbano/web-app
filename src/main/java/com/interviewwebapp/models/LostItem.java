package com.interviewwebapp.models;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Entity
@Getter
@Setter
@Table
public class LostItem {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO.AUTO)
    @Column(name="id")
    private int id;
    @Column
    private LocalDate date;
    @Column
    private String description;
    @Column
    private String Province;
    @Column
    private int randomNumber;
    @Column
    private String status;



}