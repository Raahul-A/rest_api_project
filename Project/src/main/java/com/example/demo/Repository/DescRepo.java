package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entity.Description;

public interface DescRepo extends JpaRepository<Description, Integer>{

}
