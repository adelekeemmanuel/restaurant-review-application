package com.emmycode.restaurant.controllers;

import com.emmycode.restaurant.domain.dtos.PhotoDto;
import com.emmycode.restaurant.domain.entities.Photo;
import com.emmycode.restaurant.mappers.PhotoMapper;
import com.emmycode.restaurant.services.PhotoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequiredArgsConstructor
@RequestMapping(path =  "/api/uploads")
public class PhotoController {
    private final PhotoService photoService;
    private final PhotoMapper photoMapper;

    @PostMapping
    public PhotoDto upload(@RequestParam("file") MultipartFile file){
        Photo savedPhoto = photoService.uploadPhoto(file);
        return photoMapper.toDto(savedPhoto);
    }
}
