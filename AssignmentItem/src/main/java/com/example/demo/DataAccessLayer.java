package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface DataAccessLayer extends JpaRepository<DataModel, Integer> {

}
