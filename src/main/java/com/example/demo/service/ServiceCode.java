package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repo.RepositoryCode;
import com.example.demo.Entities.*;
import java.util.*;

@Service
public class ServiceCode {
	
	@Autowired
	RepositoryCode repositoryCode;
	
	public List<DemoTable> getAllData() {
		return repositoryCode.findAll();
	}
	
}
