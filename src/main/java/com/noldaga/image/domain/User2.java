package com.noldaga.image.domain;


import lombok.AllArgsConstructor;
import lombok.Getter;

import javax.persistence.*;


@Table(name = "users2")
@Entity
@Getter
@AllArgsConstructor
public class User2 {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Long id;

    private String username;

    protected User2(){}

    public static User2 of(String username){
        return new User2(null, username);
    }
}
