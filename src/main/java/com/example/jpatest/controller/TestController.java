package com.example.jpatest.controller;

import com.example.jpatest.service.TestService;
import org.hibernate.annotations.Parent;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping(path = "/")
public class TestController {

    private final TestService testService;
    @PostMapping(path="/setTestData")
    public boolean setTestData(){
        return testService.setTestData();
    }

    @PutMapping(path = "/grand-parent/{from}/{to}")
    public boolean deleteGrandParent(@PathVariable("from") Long from, @PathVariable("to") Long to){
        return testService.updateGrandParent(from, to);
    }
    @DeleteMapping(path = "/grand-parent/{id}")
    public boolean deleteGrandParent(@PathVariable("id") Long id){
        return testService.deleteGrandParent(id);
    }

    TestController(TestService testService){
        this.testService = testService;
    }

}
