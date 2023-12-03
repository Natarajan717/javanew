package com.project.sample.java.Repository;

import com.project.sample.java.Entity.User1;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface repo extends JpaRepository<User1, String> {

}
