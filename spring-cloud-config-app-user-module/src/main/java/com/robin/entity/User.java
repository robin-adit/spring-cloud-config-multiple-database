package com.robin.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.io.Serializable;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;

    @Column(nullable = false,name = "first_name")
    @NotBlank(message="Please provide First Name")
    private String firstName;

    @Column(nullable = false,name = "last_name")
    @NotBlank(message="Please provide Last Name")
    private String lastName;

    @Column(nullable = false, name = "email")
    private String emailAddress;

    @Column(nullable = true, name = "active")
    private Boolean isActive = false;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="role_id",referencedColumnName = "role_id")
    private Role role;
}