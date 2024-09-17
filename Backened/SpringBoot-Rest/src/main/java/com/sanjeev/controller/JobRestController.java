package com.sanjeev.controller;


import com.sanjeev.model.JobPost;
import com.sanjeev.service.JobService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class JobRestController {

    private JobService jobService;


    @GetMapping("jobposts")
    public List<JobPost> getAllJobs() {

        return jobService.getAllJobs();
    }

    @GetMapping("jobPost/{postId}")
    public Optional<JobPost> getJob(@PathVariable int postId) {
        return jobService.getJob(postId);

    }

    @PutMapping("jobPost")
    public Optional<JobPost> addJob(@RequestBody JobPost jobPost) {
        jobService.addJobPost(jobPost);
        return jobService.getJob(jobPost.getPostId());
    }




    @PatchMapping("jobPost")
    public Optional<JobPost> updateJob(@RequestBody JobPost jobPost) {
        jobService.updateJob(jobPost);
        return  jobService.getJob(jobPost.getPostId());

    }

    @DeleteMapping()
    public String deleteJob(@PathVariable int postId) {
        jobService.deleteJob(postId);
        return "Job deleted";


    }

@GetMapping("jobPosts/keyword/{keyword}")
    public List<JobPost> searchByKeyword(@PathVariable("keyword") String keyword) {
        return jobService.getAllJobs();


    }

}
