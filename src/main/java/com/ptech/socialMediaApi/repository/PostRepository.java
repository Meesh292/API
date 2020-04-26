package com.ptech.socialMediaApi.repository;

import org.springframework.data.repository.CrudRepository;

import com.ptech.socialMediaApi.entity.Post;

public interface PostRepository extends CrudRepository<Post, Long>{
	
}

