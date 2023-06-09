package com.noldaga.image.domain;


import lombok.AllArgsConstructor;
import lombok.Getter;

import javax.persistence.*;


@Table(name = "users")
@Entity
@Getter
@AllArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Long id;

    private String username;

    protected User(){}

    public static User of(String username){
        return new User(null, username);
    }
}
