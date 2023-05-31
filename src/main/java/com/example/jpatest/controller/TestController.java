package com.example.jpatest.controller;

import com.example.jpatest.entity.GrandParent;
import com.example.jpatest.service.TestService;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.lang.reflect.Member;

@RestController
@RequestMapping(path = "/add")
public class TestController {

    private final TestService testService;
    @PostMapping(path="/grand-parent")
    public boolean addGrandParent(@RequestBody GrandParent grandParent){

        testService.addGrandParent(grandParent);

        return true;
    }

    TestController(TestService testService){
        this.testService = testService;
    }

}
