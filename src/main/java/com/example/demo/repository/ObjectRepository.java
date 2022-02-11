package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.entity.Object;


public interface ObjectRepository   extends JpaRepository<Object,Integer>{

}
