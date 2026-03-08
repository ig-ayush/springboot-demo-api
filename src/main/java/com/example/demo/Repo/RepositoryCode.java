package com.example.demo.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Entities.DemoTable;

@Repository
public interface RepositoryCode extends JpaRepository<DemoTable, Integer>{
	
}
