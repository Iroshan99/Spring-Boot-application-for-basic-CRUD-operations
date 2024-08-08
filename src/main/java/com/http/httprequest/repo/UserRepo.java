package com.http.httprequest.repo;

import com.http.httprequest.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User,Integer> {



}
