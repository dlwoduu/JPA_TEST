package com.example.jpatest.repository;

import com.example.jpatest.entity.GrandParent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GrandParentRepository extends JpaRepository<GrandParent, Long> {

    public GrandParent findByAge(int age);

}
