package com.example.jpatest.test;

import com.example.jpatest.controller.TestController;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ApiTest {

    @Autowired
    private TestController testController;

    @Test
    public void addGrandParent(){

        //boolean res = testController.addGrandParent("grandpapa_1", 90);

    }

}
