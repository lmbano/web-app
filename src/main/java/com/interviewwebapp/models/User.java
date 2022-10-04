package com.interviewwebapp.models;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity

public class User {


    @Id
    @GeneratedValue(strategy= GenerationType.AUTO.AUTO)
    @Column(name="id")
    private int id;
    private String username;
    private String first_name;
    private String last_name;
    private Role role ;
    private String password;
}
