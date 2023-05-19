package com.noldaga.image.controller.response;


import com.noldaga.image.domain.User;
import com.noldaga.image.domain.User2;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
public class UserResponse {

    private Long id;
    private String username;



    public static UserResponse fromEntity(User user){
        return new UserResponse(user.getId(), user.getUsername());
    }

    public static UserResponse fromEntity(User2 user){
        return new UserResponse(user.getId(), user.getUsername());
    }
}
