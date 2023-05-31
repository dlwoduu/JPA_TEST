package com.example.jpatest.service;

import com.example.jpatest.entity.GrandParent;
import com.example.jpatest.repository.ChildRepository;
import com.example.jpatest.repository.GrandParentRepository;
import com.example.jpatest.repository.ParentRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class TestService {

    private final GrandParentRepository grandParentRepo;
    private final ParentRepository parentRepo;
    private final ChildRepository childRepo;

    @Transactional
    public boolean addGrandParent(GrandParent grandParent){

        grandParentRepo.save(grandParent);

        return true;
    };

    TestService(GrandParentRepository grandParent, ParentRepository parent, ChildRepository child){
        this.grandParentRepo = grandParent;
        this.parentRepo = parent;
        this.childRepo = child;
    }


}
