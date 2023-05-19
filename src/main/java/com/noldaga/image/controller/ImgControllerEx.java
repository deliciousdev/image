package com.noldaga.image.controller;

import com.noldaga.image.module.S3Uploader;
import com.noldaga.image.controller.request.imgRequest;
import com.noldaga.image.controller.response.Response;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@Log4j2
@RequiredArgsConstructor
@RestController
public class ImgControllerEx {
    private final S3Uploader s3Uploader;

    @PostMapping("/imgs")
    public Response<List<String>> uploadImgs(@RequestPart(required = false) List<MultipartFile> img) throws IOException {
        List<String>urls = s3Uploader.uploadList(img, "/sample");
        return Response.success(urls);
    }//이미지 여러개 넣을때 이런식..

    @PostMapping("/img")
    public Response<String> uploadImg(
            @RequestPart(value = "json") imgRequest requestDto,
            @RequestPart(value="file",required = false) MultipartFile img) throws IOException
    {
        System.out.println("ImgControllerEx.uploadImg");
        String urls = s3Uploader.upload(img, "/sample2");
        return Response.success(requestDto.getNickname()+"님이 "+urls+" 를 올렸습니다.");
    }//이미지 하나 넣을때 이런식..

    @DeleteMapping("/img")
    public Response<String> delImg(String url) throws IOException {
        String fileName = s3Uploader.deleteImage(url);
        return Response.success(fileName);
    }


    @GetMapping("/test")
    public Response<String> test(){
        return Response.success("헛다리");
    }
}
