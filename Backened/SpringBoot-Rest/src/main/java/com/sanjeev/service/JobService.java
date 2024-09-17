package com.sanjeev.service;

import com.sanjeev.model.JobPost;
import com.sanjeev.repo.JobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JobService {
    @Autowired
    public JobRepo repo;

    //log
    //sec
    //validation
    //exception





    //method to return all JobPosts
    public List<JobPost> getAllJobs() {
        return repo.findAll();


    }

    // method to add a jobPost
    public void addJobPost(JobPost jobPost) {
        repo.save(jobPost);

    }

    public Optional<JobPost> getJob(int postId) {
        return Optional.of(repo.findById(postId).orElse(new JobPost()));

    }


    public void updateJob(JobPost jobPost) {
        repo.save(jobPost);
    }

    public void deleteJob(int postId) {
        repo.deleteById(postId);
    }

//    public List<JobPost> search() {
//
//       return repo.findJobPostProfileContainingPostDescContaining(keyword);
//
//
//    }


}
