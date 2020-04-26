package com.ptech.socialMediaApi.repository;

import org.springframework.data.repository.CrudRepository;

import com.ptech.socialMediaApi.entity.Comment;

public interface CommentRepository extends CrudRepository<Comment, Long> {

}
