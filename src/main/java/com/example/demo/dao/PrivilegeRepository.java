package com.example.demo.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Privilege;

@Repository
public interface PrivilegeRepository extends CrudRepository<Privilege, Long> {

	public Privilege findByName(String name);
}