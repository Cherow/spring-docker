package com.kcbgroup.apiprojectuno.controller;

import com.kcbgroup.apiprojectuno.domain.Cat;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CatController {


    private Logger logger = LoggerFactory.getLogger(CatController.class);
    @PostMapping(consumes = "application/json")
    public Cat createCat(@RequestBody Cat cat){
        logger.debug("Received cat : {}" , cat);


        return cat;
    }
}
