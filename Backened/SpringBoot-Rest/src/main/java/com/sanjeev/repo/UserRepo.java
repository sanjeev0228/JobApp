package com.sanjeev.repo;


import com.sanjeev.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepo extends  JpaRepository<User,Integer> {

    User findByUsername(String username) ;


}
