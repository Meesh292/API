package com.ptech.socialMediaApi.repository;

import org.springframework.data.repository.CrudRepository;

import com.ptech.socialMediaApi.entity.User;

public interface UserRepository extends CrudRepository<User, Long> {
		
		public User findByUsername(String username);

}
