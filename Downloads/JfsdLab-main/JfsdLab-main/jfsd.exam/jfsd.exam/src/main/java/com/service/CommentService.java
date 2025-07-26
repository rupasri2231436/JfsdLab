package com.service;

import com.model.Comment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Service
public class CommentService {
    @Autowired
    private RestTemplate restTemplate; // Injected RestTemplate bean

    public List<Comment> fetchAllComments() {
        String url = "https://jsonplaceholder.typicode.com/comments"; // External API URL
        Comment[] commentsArray = restTemplate.getForObject(url, Comment[].class); // Fetch data
        return Arrays.asList(commentsArray); // Convert array to list
    }
}
