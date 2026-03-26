package com.emmycode.restaurant.services;


import org.springframework.core.io.Resource;
import org.springframework.web.multipart.MultipartFile;

import java.util.Optional;
//Stores file on disk
public interface StorageService {
    String store(MultipartFile file, String filename);
    Optional<Resource> loadAsResource(String filename);
}
