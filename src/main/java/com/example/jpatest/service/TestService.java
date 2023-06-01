package com.example.jpatest.service;

import com.example.jpatest.entity.Child;
import com.example.jpatest.entity.GrandParent;
import com.example.jpatest.entity.Parent;
import com.example.jpatest.repository.ChildRepository;
import com.example.jpatest.repository.GrandParentRepository;
import com.example.jpatest.repository.ParentRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class TestService {

    private final GrandParentRepository grandParentRepo;
    private final ParentRepository parentRepo;
    private final ChildRepository childRepo;

    @Transactional
    public boolean updateGrandParent(Long from, Long to){

        GrandParent grandParent = grandParentRepo.findByAge(from.intValue());

        grandParent.setAge(to.intValue());

        return true;
    }

    @Transactional
    public boolean deleteGrandParent(Long id){
        GrandParent grandParent = GrandParent.builder()
                .id(id)
                .build();
        grandParentRepo.delete(grandParent);

        return true;
    }

    @Transactional
    public boolean setTestData(){

        for(int i = 0; i < 5 ; i ++){
            GrandParent grandParent = GrandParent.builder()
                    .name("grandParent_" + i)
                    .age(80+i)
                    .build();
        grandParentRepo.save(grandParent);
        }

        for(int i = 0; i < 3 ; i ++){
            Parent parent = Parent.builder()
                    .name("parent_" + i)
                    .age(50 + i)

                    .build();
            parentRepo.save(parent);
        }

        for(int i = 0; i < 5 ; i ++){
            Child child = Child.builder()
                    .name("parent_" + i)
                    .age(50 + i)
                    //.parent(Parent.builder().id(1L).build())
                    .build();
            childRepo.save(child);
        }

        for(int i = 5; i < 8 ; i ++){
            Child child = Child.builder()
                    .name("parent_" + i)
                    .age(50 + i)
                    .build();
            childRepo.save(child);
        }

        return true;
    };

    TestService(GrandParentRepository grandParent, ParentRepository parent, ChildRepository child){
        this.grandParentRepo = grandParent;
        this.parentRepo = parent;
        this.childRepo = child;
    }


}
