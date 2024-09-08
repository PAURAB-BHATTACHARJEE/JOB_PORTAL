package com.resume_project.joblisting.repository;

import com.resume_project.joblisting.model.Post;

import java.util.List;

public interface SearchRepository {

    List<Post> findByText(String text);

}