package com.barclays.controller;

import com.barclays.model.Dog;
import com.barclays.service.DogService;
import io.micrometer.common.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
public class DogController {
    DogService dogService;

    public DogController(DogService dogService) {
        this.dogService = dogService;
    }

    @GetMapping("/api/dogs")
    public List<Dog> getAllDogs(@RequestParam(name = "name", required = false) String name){
        List<Dog> dog = Collections.emptyList();
        if(StringUtils.isNotBlank(name)){
            dog = dogService.findDogByName(name);
        }
        else{
            dog = dogService.findAll();
        }
        return dog;
    }
}
