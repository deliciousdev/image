package com.noldaga.image.controller.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class imgRequest {
    private String nickname;
//    private MultipartFile image;
//    private List<MultipartFile> images;
}
