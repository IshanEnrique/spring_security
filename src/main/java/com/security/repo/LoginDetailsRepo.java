package com.security.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.security.entity.Login_Details;

@Repository
public interface LoginDetailsRepo extends CrudRepository<Login_Details, Long> {

	List<Login_Details> findByUserName(String username);
}
