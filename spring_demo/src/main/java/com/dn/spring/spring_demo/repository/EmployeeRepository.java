package com.dn.spring.spring_demo.repository;

import org.springframework.stereotype.Repository;

import com.dn.spring.spring_demo.entity.EmployeeEntity;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Long> {

}
