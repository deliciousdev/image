package com.noldaga.image.controller;


import com.noldaga.image.controller.request.UserRequest;
import com.noldaga.image.controller.response.Response;
import com.noldaga.image.controller.response.UserResponse;
import com.noldaga.image.domain.User;
import com.noldaga.image.domain.User2;
import com.noldaga.image.repository.UserRepository;
import com.noldaga.image.repository.UserRepository2;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class UserController {


    private final UserRepository userRepository;
    private final UserRepository2 userRepository2;


    @PostMapping("/user")
    public Response<UserResponse> test(@RequestBody UserRequest req){

        System.out.println("UserController.test");
        System.out.println(req);
        User user = User.of(req.getUsername());
        userRepository.saveAndFlush(user);

        return Response.success(UserResponse.fromEntity(user));
    }


    @PostMapping("/user2")
    public Response<UserResponse> test2(@RequestBody UserRequest req){

        System.out.println("UserController.test2");
        System.out.println(req);
        User2 user2 = User2.of(req.getUsername());
        userRepository2.saveAndFlush(user2);

        return Response.success(UserResponse.fromEntity(user2));
    }
}
